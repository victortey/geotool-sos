package org.geotools.sos.v2_0_0_Binding;

import javax.xml.namespace.QName;

import net.opengis.sos.v_2_0_0.ObjectFactory;

import org.geotools.xml.AbstractComplexBinding;
import org.geotools.xml.ElementInstance;
import org.geotools.xml.Node;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:CapabilitiesPropertyType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="CapabilitiesPropertyType"&gt;
 *      &lt;sequence minOccurs="0"&gt;
 *          &lt;element ref="sos:Capabilities"/&gt;
 *      &lt;/sequence&gt;
 *      &lt;attributeGroup ref="gml:AssociationAttributeGroup"/&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class CapabilitiesPropertyTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public CapabilitiesPropertyTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.CapabilitiesPropertyType;
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