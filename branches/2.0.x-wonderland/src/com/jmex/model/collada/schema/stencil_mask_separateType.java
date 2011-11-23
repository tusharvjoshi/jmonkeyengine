/**
 * stencil_mask_separateType.java
 *
 * This file was generated by XMLSpy 2007sp2 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package com.jmex.model.collada.schema;


public class stencil_mask_separateType extends com.jmex.xml.xml.Node {

	public stencil_mask_separateType(stencil_mask_separateType node) {
		super(node);
	}

	public stencil_mask_separateType(org.w3c.dom.Node node) {
		super(node);
	}

	public stencil_mask_separateType(org.w3c.dom.Document doc) {
		super(doc);
	}

	public stencil_mask_separateType(com.jmex.xml.xml.Document doc, String namespaceURI, String prefix, String name) {
		super(doc, namespaceURI, prefix, name);
	}
	
	public void adjustPrefix() {
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "face" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "face", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new faceType5(tmpNode).adjustPrefix();
		}
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "mask" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "mask", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new maskType3(tmpNode).adjustPrefix();
		}
	}
	public void setXsiType() {
 		org.w3c.dom.Element el = (org.w3c.dom.Element) domNode;
		el.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "xsi:type", "stencil_mask_separate");
	}

	public static int getfaceMinCount() {
		return 1;
	}

	public static int getfaceMaxCount() {
		return 1;
	}

	public int getfaceCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "face");
	}

	public boolean hasface() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "face");
	}

	public faceType5 newface() {
		return new faceType5(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "face"));
	}

	public faceType5 getfaceAt(int index) throws Exception {
		return new faceType5(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "face", index));
	}

	public org.w3c.dom.Node getStartingfaceCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "face" );
	}

	public org.w3c.dom.Node getAdvancedfaceCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "face", curNode );
	}

	public faceType5 getfaceValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new faceType5(curNode);
	}

	public faceType5 getface() throws Exception 
 {
		return getfaceAt(0);
	}

	public void removefaceAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "face", index);
	}

	public void removeface() {
		removefaceAt(0);
	}

	public org.w3c.dom.Node addface(faceType5 value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "face", value);
	}

	public void insertfaceAt(faceType5 value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "face", index, value);
	}

	public void replacefaceAt(faceType5 value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "face", index, value);
	}

	public static int getmaskMinCount() {
		return 1;
	}

	public static int getmaskMaxCount() {
		return 1;
	}

	public int getmaskCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "mask");
	}

	public boolean hasmask() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "mask");
	}

	public maskType3 newmask() {
		return new maskType3(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "mask"));
	}

	public maskType3 getmaskAt(int index) throws Exception {
		return new maskType3(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "mask", index));
	}

	public org.w3c.dom.Node getStartingmaskCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "mask" );
	}

	public org.w3c.dom.Node getAdvancedmaskCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "mask", curNode );
	}

	public maskType3 getmaskValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new maskType3(curNode);
	}

	public maskType3 getmask() throws Exception 
 {
		return getmaskAt(0);
	}

	public void removemaskAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "mask", index);
	}

	public void removemask() {
		removemaskAt(0);
	}

	public org.w3c.dom.Node addmask(maskType3 value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "mask", value);
	}

	public void insertmaskAt(maskType3 value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "mask", index, value);
	}

	public void replacemaskAt(maskType3 value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "mask", index, value);
	}

}