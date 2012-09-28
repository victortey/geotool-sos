package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:ResultTemplateType_resultEncoding.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="ResultTemplateType_resultEncoding"&gt;
 *      &lt;sequence&gt;
 *          &lt;element ref="swe:AbstractEncoding"/&gt;
 *      &lt;/sequence&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class ResultTemplateType_resultEncodingBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public ResultTemplateType_resultEncodingBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.ResultTemplateType_resultEncoding;
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