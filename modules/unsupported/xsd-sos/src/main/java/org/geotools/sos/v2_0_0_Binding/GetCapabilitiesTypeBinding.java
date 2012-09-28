package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetCapabilitiesType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetCapabilitiesType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="ows:GetCapabilitiesType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="extension" type="anyType"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;container for elements defined by extension specifications&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *              &lt;/sequence&gt;
 *              &lt;attribute default="SOS" name="service" type="string" use="optional"&gt;
 *                  &lt;annotation&gt;
 *                      &lt;documentation&gt;service type identifier&lt;/documentation&gt;
 *                  &lt;/annotation&gt;
 *              &lt;/attribute&gt;
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
public class GetCapabilitiesTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetCapabilitiesTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetCapabilitiesType;
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