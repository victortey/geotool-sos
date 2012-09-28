package org.geotools.sos.v2_0_0_Binding;

import org.eclipse.xsd.util.XSDSchemaLocationResolver;	
import org.geotools.xml.Configuration;
import org.picocontainer.MutablePicoContainer;

/**
 * Parser configuration for the http://www.opengis.net/sos/2.0 schema.
 *
 * @generated
 */
public class SOSConfiguration extends Configuration {

    /**
     * Creates a new configuration.
     * 
     * @generated
     */     
    public SOSConfiguration() {
       super(SOS.getInstance());
       
       //TODO: add dependencies here
    }
    
    /**
     * Registers the bindings for the configuration.
     *
     * @generated
     */
    protected final void registerBindings( MutablePicoContainer container ) {
        //Types
        container.registerComponentImplementation(SOS.SosInsertionMetadataPropertyType,SosInsertionMetadataPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.SosInsertionMetadataType,SosInsertionMetadataTypeBinding.class);


    
    }
} 