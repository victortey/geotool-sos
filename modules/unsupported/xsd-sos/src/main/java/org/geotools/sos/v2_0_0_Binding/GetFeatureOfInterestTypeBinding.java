package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetFeatureOfInterestType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetFeatureOfInterestType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleRequestType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="procedure" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;om:OM_Process&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to a procedure which is observing the feature of interest&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="observedProperty" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;pointer to a property that was observed regarding the feature of interest&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="featureOfInterest" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;gml:AbstractFeature&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to a specific feature of interest (used to restrict the set of all possibly returned features of interest to a specific set)&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0" name="spatialFilter"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;specifies a filter which applies to a spatial property of the requested features. This property is defined in the valueReference element of the SpatialOperator.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="GetFeatureOfInterestType_spatialFilter"&gt;
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
public class GetFeatureOfInterestTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetFeatureOfInterestTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetFeatureOfInterestType;
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