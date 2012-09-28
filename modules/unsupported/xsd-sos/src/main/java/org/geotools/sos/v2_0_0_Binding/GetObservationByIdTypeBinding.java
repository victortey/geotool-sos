package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetObservationByIdType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetObservationByIdType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleRequestType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element maxOccurs="unbounded" name="observation" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;om:OM_Observation&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to the observation which shall be returned&lt;/documentation&gt;
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
public class GetObservationByIdTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetObservationByIdTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetObservationByIdType;
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