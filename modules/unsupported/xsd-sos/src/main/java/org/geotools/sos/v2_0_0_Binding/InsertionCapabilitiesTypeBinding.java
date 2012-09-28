package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:InsertionCapabilitiesType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="InsertionCapabilitiesType"&gt;
 *      &lt;sequence&gt;
 *          &lt;element maxOccurs="unbounded" name="procedureDescriptionFormat" type="anyURI"&gt;
 *              &lt;annotation&gt;
 *                  &lt;documentation&gt;identifier of a procedure description format that is supported by the service Listed procedure descriptions can be used when inserting a new sensor or when inserting an observation (or result template with an observation) that references a procedure encoded in a given description format.&lt;/documentation&gt;
 *              &lt;/annotation&gt;
 *          &lt;/element&gt;
 *          &lt;element maxOccurs="unbounded" name="featureOfInterestType" type="anyURI"&gt;
 *              &lt;annotation&gt;
 *                  &lt;appinfo&gt;
 *                      &lt;gml:targetElement&gt;sos:ValueCode&lt;/gml:targetElement&gt;
 *                  &lt;/appinfo&gt;
 *                  &lt;documentation&gt;identifier of the feature type supported by the service Listed feature types can be used when adding a new feature of interest which is associated with an observation inserted through InsertObservation or InsertResultTemplate.&lt;/documentation&gt;
 *              &lt;/annotation&gt;
 *          &lt;/element&gt;
 *          &lt;element maxOccurs="unbounded" name="observationType" type="anyURI"&gt;
 *              &lt;annotation&gt;
 *                  &lt;appinfo&gt;
 *                      &lt;gml:targetElement&gt;sos:ValueCode&lt;/gml:targetElement&gt;
 *                  &lt;/appinfo&gt;
 *                  &lt;documentation&gt;identifier of the observation type (with unique result type) supported by the service Listed observation types can be used when adding new observations through InsertObservation or InsertResultTemplate.&lt;/documentation&gt;
 *              &lt;/annotation&gt;
 *          &lt;/element&gt;
 *          &lt;element maxOccurs="unbounded" minOccurs="0"
 *              name="supportedEncoding" type="anyURI"&gt;
 *              &lt;annotation&gt;
 *                  &lt;documentation&gt;identifier of the result encoding supported by the service Listed result encodings can be used for new results of observations which are added to the SOS.&lt;/documentation&gt;
 *              &lt;/annotation&gt;
 *          &lt;/element&gt;
 *      &lt;/sequence&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class InsertionCapabilitiesTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public InsertionCapabilitiesTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.InsertionCapabilitiesType;
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