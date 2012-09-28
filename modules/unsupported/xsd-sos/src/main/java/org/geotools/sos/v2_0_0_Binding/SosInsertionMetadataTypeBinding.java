package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:SosInsertionMetadataType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="SosInsertionMetadataType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:InsertionMetadataType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element maxOccurs="unbounded" name="observationType" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ValueCode&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;identifier of observation type (with unique result type) which is produced by the sensor&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element maxOccurs="unbounded"
 *                      name="featureOfInterestType" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ValueCode&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;identifier of feature of interest type associated with observation produced by the sensor&lt;/documentation&gt;
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
public class SosInsertionMetadataTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public SosInsertionMetadataTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.SosInsertionMetadataType;
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