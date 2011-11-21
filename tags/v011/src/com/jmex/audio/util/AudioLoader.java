/*
 * Copyright (c) 2003-2007 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors 
 *   may be used to endorse or promote products derived from this software 
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.jmex.audio.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

import com.jme.util.geom.BufferUtils;
import com.jme.util.LoggingSystem;
import com.jmex.audio.AudioBuffer;
import com.jmex.audio.AudioTrack.Format;
import com.jmex.audio.stream.AudioInputStream;
import com.jmex.audio.stream.OggInputStream;
import com.jmex.audio.stream.WavInputStream;

/**
 * Utility class for loading audio files.  For use by the underlying AudioSystem code.
 * @author Joshua Slack
 * @version $Id: AudioLoader.java,v 1.2 2007-04-17 20:41:42 rherlitz Exp $
 */
public class AudioLoader {

    public static void fillBuffer(AudioBuffer buffer, URL file) throws IOException {
        if (file == null) return;
        Format type = AudioInputStream.sniffFormat(file.openStream());
        if (Format.WAV.equals(type)) {
            loadWAV(buffer, file);
        } else if (Format.OGG.equals(type)) {
            loadOGG(buffer, file);
        } else {
            throw new IllegalArgumentException("Given url is not a recognized audio type. Must be OGG or RIFF/WAV: "+file);
        }
    }

    private static void loadOGG(AudioBuffer buffer, URL file) throws IOException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream(1024 * 256);
        byteOut.reset();
        byte copyBuffer[] = new byte[1024 * 4];

        OggInputStream oggInput = new OggInputStream(file, -1);
        LoggingSystem.getLogger().info(oggInput.toString());
        boolean done = false;
        int bytesRead = -1;
        while (!done) {
            bytesRead = oggInput.read(copyBuffer, 0, copyBuffer.length);

            byteOut.write(copyBuffer, 0, bytesRead);
            done = (bytesRead != copyBuffer.length || bytesRead < 0);
        }
        ByteBuffer data = BufferUtils.createByteBuffer(byteOut.size());
        data.put(byteOut.toByteArray());
        data.rewind();
        
        int channels = oggInput.getChannelCount();
        int bitRate = oggInput.getBitRate();
        int depth = oggInput.getDepth();
        float time = byteOut.size() / (bitRate * channels * depth * .125f);
        buffer.setup(data, channels, bitRate, time, depth);
        LoggingSystem.getLogger().info("ogg loaded - time: " + time + "  channels: "
                + channels + "  rate: " + bitRate + " depth: "+depth);

        // cleanup
        data.clear();
        data = null;
        oggInput.close();
    }

    private static void loadWAV(AudioBuffer buffer, URL file) throws IOException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream(1024 * 256);
        byteOut.reset();
        byte copyBuffer[] = new byte[1024 * 4];

        WavInputStream wavInput = new WavInputStream(file);
        boolean done = false;
        int bytesRead = -1;
        while (!done) {
            bytesRead = wavInput.read(copyBuffer, 0, copyBuffer.length);
            byteOut.write(copyBuffer, 0, bytesRead);
            done = (bytesRead != copyBuffer.length || bytesRead < 0);
        }
        ByteBuffer data = BufferUtils.createByteBuffer(byteOut.size());
        data.put(byteOut.toByteArray());
        data.rewind();
        
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            ShortBuffer tmp2 = data.duplicate().order(
                    ByteOrder.LITTLE_ENDIAN).asShortBuffer();
            while (tmp2.hasRemaining())
                data.putShort(tmp2.get());
            data.rewind();
        }
        int channels = wavInput.getChannelCount();
        int bitRate = wavInput.getBitRate();
        int depth = wavInput.getDepth();
        float time = byteOut.size() / (bitRate * channels * depth * .125f);
        buffer.setup(data, channels, bitRate, time, depth);
        LoggingSystem.getLogger().info("wav loaded - time: " + time + "  channels: "
                + channels + "  rate: " + bitRate + " depth: "+depth);
        
        // cleanup
        data.clear();
        data = null;
        wavInput.close();
    }

}