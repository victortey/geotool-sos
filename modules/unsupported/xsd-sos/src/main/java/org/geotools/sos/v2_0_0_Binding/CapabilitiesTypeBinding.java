package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:CapabilitiesType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="CapabilitiesType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="ows:CapabilitiesBaseType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element maxOccurs="unbounded" minOccurs="0"
 *                      name="extension" type="anyType"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;container for elements defined by extension specifications&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element minOccurs="0" name="filterCapabilities"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;metadata about the supported filter functionality&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="CapabilitiesType_filterCapabilities"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="fes:Filter_Capabilities"/&gt;
 *                          &lt;/sequence&gt;
 *                      &lt;/complexType&gt;
 *                  &lt;/element&gt;
 *                  &lt;element minOccurs="0" name="contents"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;metadata about the observations and procedures hosted by the service&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                      &lt;complexType name="CapabilitiesType_contents"&gt;
 *                          &lt;sequence&gt;
 *                              &lt;element ref="sos:Contents"/&gt;
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
public class CapabilitiesTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public CapabilitiesTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.CapabilitiesType;
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