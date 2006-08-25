/**
 * GLES_MAX_CLIP_PLANES_index.java This file was generated by XMLSpy 2006sp2
 * Enterprise Edition. YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION. Refer to the XMLSpy
 * Documentation for further details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.schema;

import com.jmex.model.collada.types.SchemaInteger;

public class GLES_MAX_CLIP_PLANES_index extends SchemaInteger {

    private static final long serialVersionUID = 1L;

    public GLES_MAX_CLIP_PLANES_index() {
        super();
    }

    public GLES_MAX_CLIP_PLANES_index(String newValue) {
        super(newValue);
        validate();
    }

    public GLES_MAX_CLIP_PLANES_index(SchemaInteger newValue) {
        super(newValue);
        validate();
    }

    public void validate() {

        if (compareTo(getMaxExclusive()) >= 0)
            throw new com.jmex.model.collada.xml.XmlException(
                    "Value of GLES_MAX_CLIP_PLANES_index is out of range.");

        if (compareTo(getMinInclusive()) < 0)
            throw new com.jmex.model.collada.xml.XmlException(
                    "Value of GLES_MAX_CLIP_PLANES_index is out of range.");
    }

    public SchemaInteger getMaxExclusive() {
        return new SchemaInteger("5");
    }

    public SchemaInteger getMinInclusive() {
        return new SchemaInteger("0");
    }
}
