package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetResultTemplateResponseType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetResultTemplateResponseType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleResponseType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element name="resultStructure"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;the structure of the results which may be requested in subsequent GetResult calls&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="GetResultTemplateResponseType_resultStructure"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="swe:AbstractDataComponent"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element name="resultEncoding"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;the encoding of the results which may be requested in subsequent GetResult calls&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="GetResultTemplateResponseType_resultEncoding"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="swe:AbstractEncoding"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
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
public class GetResultTemplateResponseTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetResultTemplateResponseTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetResultTemplateResponseType;
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