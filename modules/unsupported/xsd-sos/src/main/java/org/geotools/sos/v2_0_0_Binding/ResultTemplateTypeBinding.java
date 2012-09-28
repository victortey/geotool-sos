package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:ResultTemplateType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="ResultTemplateType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:AbstractSWESType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element name="offering" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ObservationOffering&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to ObservationOffering to which the results and corresponding observations shall be added&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element name="observationTemplate"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;template which contains observation metadata that is used to form complete observation together with result values that are inserted later on&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="ResultTemplateType_observationTemplate"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="om:OM_Observation"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element name="resultStructure"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;specifies the structure of the results which will be inserted in subsequent InsertResult calls for the observationTemplate&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="ResultTemplateType_resultStructure"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="swe:AbstractDataComponent"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element name="resultEncoding"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;specifies the encoding of the results which will be inserted in subsequent InsertResult calls for the observationTemplate&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="ResultTemplateType_resultEncoding"&gt;
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
public class ResultTemplateTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public ResultTemplateTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.ResultTemplateType;
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