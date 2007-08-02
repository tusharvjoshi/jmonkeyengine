/**
 * generatorType2.java
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


public class generatorType2 extends com.jmex.xml.xml.Node {

	public generatorType2(generatorType2 node) {
		super(node);
	}

	public generatorType2(org.w3c.dom.Node node) {
		super(node);
	}

	public generatorType2(org.w3c.dom.Document doc) {
		super(doc);
	}

	public generatorType2(com.jmex.xml.xml.Document doc, String namespaceURI, String prefix, String name) {
		super(doc, namespaceURI, prefix, name);
	}
	
	public void adjustPrefix() {
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new fx_annotate_common(tmpNode).adjustPrefix();
		}
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "code" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "code", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new fx_code_profile(tmpNode).adjustPrefix();
		}
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "include" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "include", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new fx_include_common(tmpNode).adjustPrefix();
		}
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "name" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "name", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new nameType2(tmpNode).adjustPrefix();
		}
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new glsl_setparam_simple(tmpNode).adjustPrefix();
		}
	}
	public void setXsiType() {
 		org.w3c.dom.Element el = (org.w3c.dom.Element) domNode;
		el.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "xsi:type", "generator");
	}

	public static int getannotateMinCount() {
		return 0;
	}

	public static int getannotateMaxCount() {
		return Integer.MAX_VALUE;
	}

	public int getannotateCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate");
	}

	public boolean hasannotate() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate");
	}

	public fx_annotate_common newannotate() {
		return new fx_annotate_common(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "annotate"));
	}

	public fx_annotate_common getannotateAt(int index) throws Exception {
		return new fx_annotate_common(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate", index));
	}

	public org.w3c.dom.Node getStartingannotateCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate" );
	}

	public org.w3c.dom.Node getAdvancedannotateCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate", curNode );
	}

	public fx_annotate_common getannotateValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new fx_annotate_common(curNode);
	}

	public fx_annotate_common getannotate() throws Exception 
 {
		return getannotateAt(0);
	}

	public void removeannotateAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "annotate", index);
	}

	public void removeannotate() {
		while (hasannotate())
			removeannotateAt(0);
	}

	public org.w3c.dom.Node addannotate(fx_annotate_common value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "annotate", value);
	}

	public void insertannotateAt(fx_annotate_common value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "annotate", index, value);
	}

	public void replaceannotateAt(fx_annotate_common value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "annotate", index, value);
	}

	public static int getcodeMinCount() {
		return 1;
	}

	public static int getcodeMaxCount() {
		return 1;
	}

	public int getcodeCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "code");
	}

	public boolean hascode() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "code");
	}

	public fx_code_profile newcode() {
		return new fx_code_profile(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "code"));
	}

	public fx_code_profile getcodeAt(int index) throws Exception {
		return new fx_code_profile(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "code", index));
	}

	public org.w3c.dom.Node getStartingcodeCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "code" );
	}

	public org.w3c.dom.Node getAdvancedcodeCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "code", curNode );
	}

	public fx_code_profile getcodeValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new fx_code_profile(curNode);
	}

	public fx_code_profile getcode() throws Exception 
 {
		return getcodeAt(0);
	}

	public void removecodeAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "code", index);
	}

	public void removecode() {
		removecodeAt(0);
	}

	public org.w3c.dom.Node addcode(fx_code_profile value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "code", value);
	}

	public void insertcodeAt(fx_code_profile value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "code", index, value);
	}

	public void replacecodeAt(fx_code_profile value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "code", index, value);
	}

	public static int getincludeMinCount() {
		return 1;
	}

	public static int getincludeMaxCount() {
		return 1;
	}

	public int getincludeCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "include");
	}

	public boolean hasinclude() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "include");
	}

	public fx_include_common newinclude() {
		return new fx_include_common(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "include"));
	}

	public fx_include_common getincludeAt(int index) throws Exception {
		return new fx_include_common(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "include", index));
	}

	public org.w3c.dom.Node getStartingincludeCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "include" );
	}

	public org.w3c.dom.Node getAdvancedincludeCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "include", curNode );
	}

	public fx_include_common getincludeValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new fx_include_common(curNode);
	}

	public fx_include_common getinclude() throws Exception 
 {
		return getincludeAt(0);
	}

	public void removeincludeAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "include", index);
	}

	public void removeinclude() {
		removeincludeAt(0);
	}

	public org.w3c.dom.Node addinclude(fx_include_common value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "include", value);
	}

	public void insertincludeAt(fx_include_common value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "include", index, value);
	}

	public void replaceincludeAt(fx_include_common value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "include", index, value);
	}

	public static int getnameMinCount() {
		return 1;
	}

	public static int getnameMaxCount() {
		return 1;
	}

	public int getnameCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "name");
	}

	public boolean hasname() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "name");
	}

	public nameType2 newname() {
		return new nameType2(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "name"));
	}

	public nameType2 getnameAt(int index) throws Exception {
		return new nameType2(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "name", index));
	}

	public org.w3c.dom.Node getStartingnameCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "name" );
	}

	public org.w3c.dom.Node getAdvancednameCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "name", curNode );
	}

	public nameType2 getnameValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new nameType2(curNode);
	}

	public nameType2 getname() throws Exception 
 {
		return getnameAt(0);
	}

	public void removenameAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "name", index);
	}

	public void removename() {
		removenameAt(0);
	}

	public org.w3c.dom.Node addname(nameType2 value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "name", value);
	}

	public void insertnameAt(nameType2 value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "name", index, value);
	}

	public void replacenameAt(nameType2 value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "name", index, value);
	}

	public static int getsetparamMinCount() {
		return 0;
	}

	public static int getsetparamMaxCount() {
		return Integer.MAX_VALUE;
	}

	public int getsetparamCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam");
	}

	public boolean hassetparam() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam");
	}

	public glsl_setparam_simple newsetparam() {
		return new glsl_setparam_simple(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "setparam"));
	}

	public glsl_setparam_simple getsetparamAt(int index) throws Exception {
		return new glsl_setparam_simple(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam", index));
	}

	public org.w3c.dom.Node getStartingsetparamCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam" );
	}

	public org.w3c.dom.Node getAdvancedsetparamCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam", curNode );
	}

	public glsl_setparam_simple getsetparamValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new glsl_setparam_simple(curNode);
	}

	public glsl_setparam_simple getsetparam() throws Exception 
 {
		return getsetparamAt(0);
	}

	public void removesetparamAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "setparam", index);
	}

	public void removesetparam() {
		while (hassetparam())
			removesetparamAt(0);
	}

	public org.w3c.dom.Node addsetparam(glsl_setparam_simple value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "setparam", value);
	}

	public void insertsetparamAt(glsl_setparam_simple value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "setparam", index, value);
	}

	public void replacesetparamAt(glsl_setparam_simple value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "setparam", index, value);
	}

}
