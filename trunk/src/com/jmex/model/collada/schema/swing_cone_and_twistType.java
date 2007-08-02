/**
 * swing_cone_and_twistType.java
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


public class swing_cone_and_twistType extends com.jmex.xml.xml.Node {

	public swing_cone_and_twistType(swing_cone_and_twistType node) {
		super(node);
	}

	public swing_cone_and_twistType(org.w3c.dom.Node node) {
		super(node);
	}

	public swing_cone_and_twistType(org.w3c.dom.Document doc) {
		super(doc);
	}

	public swing_cone_and_twistType(com.jmex.xml.xml.Document doc, String namespaceURI, String prefix, String name) {
		super(doc, namespaceURI, prefix, name);
	}
	
	public void adjustPrefix() {
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "min" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "min", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new TargetableFloat3(tmpNode).adjustPrefix();
		}
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "max" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "max", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new TargetableFloat3(tmpNode).adjustPrefix();
		}
	}
	public void setXsiType() {
 		org.w3c.dom.Element el = (org.w3c.dom.Element) domNode;
		el.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "xsi:type", "swing_cone_and_twist");
	}

	public static int getminMinCount() {
		return 0;
	}

	public static int getminMaxCount() {
		return 1;
	}

	public int getminCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "min");
	}

	public boolean hasmin() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "min");
	}

	public TargetableFloat3 newmin() {
		return new TargetableFloat3(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "min"));
	}

	public TargetableFloat3 getminAt(int index) throws Exception {
		return new TargetableFloat3(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "min", index));
	}

	public org.w3c.dom.Node getStartingminCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "min" );
	}

	public org.w3c.dom.Node getAdvancedminCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "min", curNode );
	}

	public TargetableFloat3 getminValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new TargetableFloat3(curNode);
	}

	public TargetableFloat3 getmin() throws Exception 
 {
		return getminAt(0);
	}

	public void removeminAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "min", index);
	}

	public void removemin() {
		removeminAt(0);
	}

	public org.w3c.dom.Node addmin(TargetableFloat3 value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "min", value);
	}

	public void insertminAt(TargetableFloat3 value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "min", index, value);
	}

	public void replaceminAt(TargetableFloat3 value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "min", index, value);
	}

	public static int getmaxMinCount() {
		return 0;
	}

	public static int getmaxMaxCount() {
		return 1;
	}

	public int getmaxCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "max");
	}

	public boolean hasmax() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "max");
	}

	public TargetableFloat3 newmax() {
		return new TargetableFloat3(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "max"));
	}

	public TargetableFloat3 getmaxAt(int index) throws Exception {
		return new TargetableFloat3(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "max", index));
	}

	public org.w3c.dom.Node getStartingmaxCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "max" );
	}

	public org.w3c.dom.Node getAdvancedmaxCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "max", curNode );
	}

	public TargetableFloat3 getmaxValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new TargetableFloat3(curNode);
	}

	public TargetableFloat3 getmax() throws Exception 
 {
		return getmaxAt(0);
	}

	public void removemaxAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "max", index);
	}

	public void removemax() {
		removemaxAt(0);
	}

	public org.w3c.dom.Node addmax(TargetableFloat3 value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "max", value);
	}

	public void insertmaxAt(TargetableFloat3 value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "max", index, value);
	}

	public void replacemaxAt(TargetableFloat3 value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "max", index, value);
	}

}
