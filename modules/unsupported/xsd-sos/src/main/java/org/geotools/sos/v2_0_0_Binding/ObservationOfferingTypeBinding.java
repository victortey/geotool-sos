package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:ObservationOfferingType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="ObservationOfferingType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:AbstractOfferingType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element minOccurs="0" name="observedArea"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;spatial bounding box of the spatial extent of all features of interest that belong to observations associated with the offering&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="ObservationOfferingType_observedArea"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="gml:Envelope"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element minOccurs="0" name="phenomenonTime"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;temporal bounding box of the phenomenon times of all observations belonging to the offering&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="ObservationOfferingType_phenomenonTime"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="gml:TimePeriod"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element minOccurs="0" name="resultTime"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;temporal bounding box of the result times of all observations belonging to the offering&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="ObservationOfferingType_resultTime"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="gml:TimePeriod"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="responseFormat" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;identifies the response format supported for observation retrieval&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="observationType" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ValueCode&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;identifies the type of observation (with unique result type) which is used by the service to encode observations&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="featureOfInterestType" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ValueCode&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;identifies the type of features of interest associated with the observations provided by the service&lt;/documentation&gt;
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
public class ObservationOfferingTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public ObservationOfferingTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.ObservationOfferingType;
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