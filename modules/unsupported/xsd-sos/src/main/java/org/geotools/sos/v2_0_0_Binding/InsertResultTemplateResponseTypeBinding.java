package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:InsertResultTemplateResponseType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="InsertResultTemplateResponseType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleResponseType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element name="acceptedTemplate" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ResultTemplate&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to the ResultTemplate which has been accepted and registered at the SOS server. This ResultTemplate can be used in subsequent InsertResult requests.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *              &lt;/sequence&gt;
 *          &lt;/extension&gt;
 *      &lt;/complexContent&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class InsertResultTemplateResponseTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public InsertResultTemplateResponseTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.InsertResultTemplateResponseType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(ElementInstance instance, Node node, Object value) 
		throws Exception {
		
		//TODO: implement and remove call to super
		return super.parse(instance,node,value);
	}

}