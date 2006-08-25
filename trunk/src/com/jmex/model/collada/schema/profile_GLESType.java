/**
 * profile_GLESType.java This file was generated by XMLSpy 2006sp2 Enterprise
 * Edition. YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE OVERWRITTEN WHEN
 * YOU RE-RUN CODE GENERATION. Refer to the XMLSpy Documentation for further
 * details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.schema;

public class profile_GLESType extends com.jmex.model.collada.xml.Node {

    private static final long serialVersionUID = 1L;

    public profile_GLESType(profile_GLESType node) {
        super(node);
    }

    public profile_GLESType(org.w3c.dom.Node node) {
        super(node);
    }

    public profile_GLESType(org.w3c.dom.Document doc) {
        super(doc);
    }

    public profile_GLESType(com.jmex.model.collada.xml.Document doc,
            String namespaceURI, String prefix, String name) {
        super(doc, namespaceURI, prefix, name);
    }

    public void adjustPrefix() {
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "image"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "image", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
            new imageType(tmpNode).adjustPrefix();
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "newparam"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "newparam", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
            new gles_newparam(tmpNode).adjustPrefix();
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "technique", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
            new techniqueType3(tmpNode).adjustPrefix();
        }
    }

    public static int getimageMinCount() {
        return 1;
    }

    public static int getimageMaxCount() {
        return 1;
    }

    public int getimageCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "image");
    }

    public boolean hasimage() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "image");
    }

    public imageType newimage() {
        return new imageType(domNode.getOwnerDocument().createElementNS(
                "http://www.collada.org/2005/11/COLLADASchema", "image"));
    }

    public imageType getimageAt(int index) throws Exception {
        return new imageType(
                dereference(getDomChildAt(Element,
                        "http://www.collada.org/2005/11/COLLADASchema",
                        "image", index)));
    }

    public org.w3c.dom.Node getStartingimageCursor() throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "image");
    }

    public org.w3c.dom.Node getAdvancedimageCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "image",
                curNode);
    }

    public imageType getimageValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new imageType(dereference(curNode));
    }

    public imageType getimage() throws Exception {
        return getimageAt(0);
    }

    public void removeimageAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "image", index);
    }

    public void removeimage() {
        while (hasimage())
            removeimageAt(0);
    }

    public void addimage(imageType value) {
        appendDomElement("http://www.collada.org/2005/11/COLLADASchema",
                "image", value);
    }

    public void insertimageAt(imageType value, int index) {
        insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "image", index, value);
    }

    public void replaceimageAt(imageType value, int index) {
        replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "image", index, value);
    }

    public static int getnewparamMinCount() {
        return 1;
    }

    public static int getnewparamMaxCount() {
        return 1;
    }

    public int getnewparamCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "newparam");
    }

    public boolean hasnewparam() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "newparam");
    }

    public gles_newparam newnewparam() {
        return new gles_newparam(domNode.getOwnerDocument().createElementNS(
                "http://www.collada.org/2005/11/COLLADASchema", "newparam"));
    }

    public gles_newparam getnewparamAt(int index) throws Exception {
        return new gles_newparam(dereference(getDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "newparam",
                index)));
    }

    public org.w3c.dom.Node getStartingnewparamCursor() throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "newparam");
    }

    public org.w3c.dom.Node getAdvancednewparamCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "newparam",
                curNode);
    }

    public gles_newparam getnewparamValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new gles_newparam(dereference(curNode));
    }

    public gles_newparam getnewparam() throws Exception {
        return getnewparamAt(0);
    }

    public void removenewparamAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "newparam",
                index);
    }

    public void removenewparam() {
        while (hasnewparam())
            removenewparamAt(0);
    }

    public void addnewparam(gles_newparam value) {
        appendDomElement("http://www.collada.org/2005/11/COLLADASchema",
                "newparam", value);
    }

    public void insertnewparamAt(gles_newparam value, int index) {
        insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "newparam", index, value);
    }

    public void replacenewparamAt(gles_newparam value, int index) {
        replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "newparam", index, value);
    }

    public static int gettechniqueMinCount() {
        return 1;
    }

    public static int gettechniqueMaxCount() {
        return Integer.MAX_VALUE;
    }

    public int gettechniqueCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique");
    }

    public boolean hastechnique() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique");
    }

    public techniqueType3 newtechnique() {
        return new techniqueType3(domNode.getOwnerDocument().createElementNS(
                "http://www.collada.org/2005/11/COLLADASchema", "technique"));
    }

    public techniqueType3 gettechniqueAt(int index) throws Exception {
        return new techniqueType3(dereference(getDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique",
                index)));
    }

    public org.w3c.dom.Node getStartingtechniqueCursor() throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique");
    }

    public org.w3c.dom.Node getAdvancedtechniqueCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique",
                curNode);
    }

    public techniqueType3 gettechniqueValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new techniqueType3(dereference(curNode));
    }

    public techniqueType3 gettechnique() throws Exception {
        return gettechniqueAt(0);
    }

    public void removetechniqueAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique",
                index);
    }

    public void removetechnique() {
        while (hastechnique())
            removetechniqueAt(0);
    }

    public void addtechnique(techniqueType3 value) {
        appendDomElement("http://www.collada.org/2005/11/COLLADASchema",
                "technique", value);
    }

    public void inserttechniqueAt(techniqueType3 value, int index) {
        insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "technique", index, value);
    }

    public void replacetechniqueAt(techniqueType3 value, int index) {
        replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "technique", index, value);
    }

    private org.w3c.dom.Node dereference(org.w3c.dom.Node node) {
        return node;
    }
}
