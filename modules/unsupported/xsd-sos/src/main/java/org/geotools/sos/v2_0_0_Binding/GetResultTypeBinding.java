package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetResultType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetResultType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleRequestType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element name="offering" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ObservationOffering&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to an ObservationOffering advertised in the Capabilities document for which results are requested.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element name="observedProperty" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;pointer to an observedProperty of the observations whose results are requested&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0" name="temporalFilter"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;specifies a filter for a time property of observations whose results are requested&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="GetResultType_temporalFilter"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="fes:temporalOps"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="featureOfInterest" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;gml:AbstractFeature&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to a feature of interest of the observations whose results are requested&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element minOccurs="0" name="spatialFilter"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;specifies a filter which applies to a spatial property of an observation (or one of its properties). This property is defined in the valueReference element of the SpatialOperator.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="GetResultType_spatialFilter"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="fes:spatialOps"/&gt;
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
public class GetResultTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetResultTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetResultType;
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