package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetFeatureOfInterestResponseType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetFeatureOfInterestResponseType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleResponseType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="featureMember" type="gml:FeaturePropertyType"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;feature of interest matching the request parameters specified by the client&lt;/documentation&gt;
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
public class GetFeatureOfInterestResponseTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetFeatureOfInterestResponseTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetFeatureOfInterestResponseType;
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