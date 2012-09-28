package org.geotools.sos.v2_0_0_Binding;

import java.util.Set;
import javax.xml.namespace.QName;
import org.geotools.xml.XSD;

/**
 * This interface contains the qualified names of all the types,elements, and 
 * attributes in the http://www.opengis.net/sos/2.0 schema.
 *
 * @generated
 */
public final class SOS extends XSD {

    /** singleton instance */
    private static final SOS instance = new SOS();
    
    /**
     * Returns the singleton instance.
     */
    public static final SOS getInstance() {
       return instance;
    }
    
    /**
     * private constructor
     */
    private SOS() {
    }
    
    protected void addDependencies(Set dependencies) {
       //TODO: add dependencies here
    }
    
    /**
     * Returns 'http://www.opengis.net/sos/2.0'.
     */
    public String getNamespaceURI() {
       return NAMESPACE;
    }
    
    /**
     * Returns the location of 'sosInsertSensor.xsd.'.
     */
    public String getSchemaLocation() {
       return getClass().getResource("sosInsertSensor.xsd").toString();
    }
    
    /** @generated */
    public static final String NAMESPACE = "http://www.opengis.net/sos/2.0";
    
    /* Type Definitions */
    /** @generated */
    public static final QName SosInsertionMetadataPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","SosInsertionMetadataPropertyType");
    /** @generated */
    public static final QName SosInsertionMetadataType = 
        new QName("http://www.opengis.net/sos/2.0","SosInsertionMetadataType");

    /* Elements */
    /** @generated */
    public static final QName SosInsertionMetadata = 
        new QName("http://www.opengis.net/sos/2.0","SosInsertionMetadata");

    /* Attributes */

}
    