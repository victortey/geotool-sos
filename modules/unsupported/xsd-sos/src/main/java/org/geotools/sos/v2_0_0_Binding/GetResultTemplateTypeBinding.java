package org.geotools.sos.v2_0_0_Binding;

import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;

import net.opengis.sos.v_2_0_0.ObjectFactory;		

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/sos/2.0:GetResultTemplateType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;complexType name="GetResultTemplateType"&gt;
 *      &lt;complexContent&gt;
 *          &lt;extension base="swes:ExtensibleRequestType"&gt;
 *              &lt;sequence&gt;
 *                  &lt;element name="offering" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;appinfo&gt;
 *                              &lt;gml:targetElement&gt;sos:ObservationOffering&lt;/gml:targetElement&gt;
 *                          &lt;/appinfo&gt;
 *                          &lt;documentation&gt;pointer to an ObservationOffering for which results will be requested in subsequent GetResult calls Since an ObservationOffering is associated with exactly one procedure, this parameter indirectly identifies the procedure for which results will be requested.&lt;/documentation&gt;
 *                      &lt;/annotation&gt;
 *                  &lt;/element&gt;
 *                  &lt;element name="observedProperty" type="anyURI"&gt;
 *                      &lt;annotation&gt;
 *                          &lt;documentation&gt;pointer to an observed property for which the results serve values&lt;/documentation&gt;
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
public class GetResultTemplateTypeBinding extends AbstractComplexBinding {

	ObjectFactory factory;		
	public GetResultTemplateTypeBinding( ObjectFactory factory ) {
		super();
		this.factory = factory;
	}

	/**
	 * @generated
	 */
	public QName getTarget() {
		return SOS.GetResultTemplateType;
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