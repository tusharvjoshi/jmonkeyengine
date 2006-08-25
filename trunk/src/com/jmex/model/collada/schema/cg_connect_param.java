/**
 * cg_connect_param.java This file was generated by XMLSpy 2006sp2 Enterprise
 * Edition. YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE OVERWRITTEN WHEN
 * YOU RE-RUN CODE GENERATION. Refer to the XMLSpy Documentation for further
 * details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.schema;

public class cg_connect_param extends com.jmex.model.collada.xml.Node {

    private static final long serialVersionUID = 1L;

    public cg_connect_param(cg_connect_param node) {
        super(node);
    }

    public cg_connect_param(org.w3c.dom.Node node) {
        super(node);
    }

    public cg_connect_param(org.w3c.dom.Document doc) {
        super(doc);
    }

    public cg_connect_param(com.jmex.model.collada.xml.Document doc,
            String namespaceURI, String prefix, String name) {
        super(doc, namespaceURI, prefix, name);
    }

    public void adjustPrefix() {
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Attribute, null, "ref"); tmpNode != null; tmpNode = getDomNextChild(
                Attribute, null, "ref", tmpNode)) {
            internalAdjustPrefix(tmpNode, false);
        }
    }

    public static int getrefMinCount() {
        return 1;
    }

    public static int getrefMaxCount() {
        return 1;
    }

    public int getrefCount() {
        return getDomChildCount(Attribute, null, "ref");
    }

    public boolean hasref() {
        return hasDomChild(Attribute, null, "ref");
    }

    public cg_identifier newref() {
        return new cg_identifier();
    }

    public cg_identifier getrefAt(int index) throws Exception {
        return new cg_identifier(getDomNodeValue(dereference(getDomChildAt(
                Attribute, null, "ref", index))));
    }

    public org.w3c.dom.Node getStartingrefCursor() throws Exception {
        return getDomFirstChild(Attribute, null, "ref");
    }

    public org.w3c.dom.Node getAdvancedrefCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Attribute, null, "ref", curNode);
    }

    public cg_identifier getrefValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new cg_identifier(getDomNodeValue(dereference(curNode)));
    }

    public cg_identifier getref() throws Exception {
        return getrefAt(0);
    }

    public void removerefAt(int index) {
        removeDomChildAt(Attribute, null, "ref", index);
    }

    public void removeref() {
        while (hasref())
            removerefAt(0);
    }

    public void addref(cg_identifier value) {
        if (value.isNull() == false) {
            appendDomChild(Attribute, null, "ref", value.toString());
        }
    }

    public void addref(String value) throws Exception {
        addref(new cg_identifier(value));
    }

    public void insertrefAt(cg_identifier value, int index) {
        insertDomChildAt(Attribute, null, "ref", index, value.toString());
    }

    public void insertrefAt(String value, int index) throws Exception {
        insertrefAt(new cg_identifier(value), index);
    }

    public void replacerefAt(cg_identifier value, int index) {
        replaceDomChildAt(Attribute, null, "ref", index, value.toString());
    }

    public void replacerefAt(String value, int index) throws Exception {
        replacerefAt(new cg_identifier(value), index);
    }

    private org.w3c.dom.Node dereference(org.w3c.dom.Node node) {
        return node;
    }
}
