package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:InsertResultTemplateType_proposedTemplate.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="InsertResultTemplateType_proposedTemplate"&gt;
 *      &lt;sequence&gt;
 *          &lt;element ref="sos:ResultTemplate"/&gt;
 *      &lt;/sequence&gt;
 *  &lt;/complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class InsertResultTemplateType_proposedTemplateBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public InsertResultTemplateType_proposedTemplateBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.InsertResultTemplateType_proposedTemplate;
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