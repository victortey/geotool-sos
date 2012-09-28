package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetObservationType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetObservationType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleRequestType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="procedure" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;om:OM_Process&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to a procedure for which observations are requested. It defines a filter for the procedure property of the observations&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="offering" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ObservationOffering&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to an ObservationOffering advertised in the Capabilities document for which observations are requested&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="observedProperty" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;pointer to an observedProperty for which observations are requested&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0" name="temporalFilter"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;specifies a filter for a time property of requested observations. The supported time range for the phenomenonTime property of observations is listed in the selected ObservationOffering. The supported temporal operands and operators are listed in the FilterCapabilities section of the Capabilities document.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="GetObservationType_temporalFilter"&gt;
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
 *                          &lt;documentation&gt;pointer to a feature of interest for which observations are requested&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element minOccurs="0" name="spatialFilter"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;specifies a filter which applies to a spatial property of an observation. This property is defined in the valueReference element of the SpatialOperator.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="GetObservationType_spatialFilter"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="fes:spatialOps"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element minOccurs="0" name="responseFormat" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;identifier of desired responseFormat for the requested observations. The supported responseFormats are listed in the ObservationOffering.&lt;/documentation&gt;
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
public class GetObservationTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetObservationTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetObservationType;
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