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
        container.registerComponentImplementation(SOS.GetObservationByIdPropertyType,GetObservationByIdPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationByIdResponsePropertyType,GetObservationByIdResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationByIdResponseType,GetObservationByIdResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationByIdType,GetObservationByIdTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationByIdResponseType_observation,GetObservationByIdResponseType_observationBinding.class);
        container.registerComponentImplementation(SOS.CapabilitiesPropertyType,CapabilitiesPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.CapabilitiesType,CapabilitiesTypeBinding.class);
        container.registerComponentImplementation(SOS.GetCapabilitiesPropertyType,GetCapabilitiesPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetCapabilitiesType,GetCapabilitiesTypeBinding.class);
        container.registerComponentImplementation(SOS.CapabilitiesType_filterCapabilities,CapabilitiesType_filterCapabilitiesBinding.class);
        container.registerComponentImplementation(SOS.CapabilitiesType_contents,CapabilitiesType_contentsBinding.class);
        container.registerComponentImplementation(SOS.ContentsPropertyType,ContentsPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.ContentsType,ContentsTypeBinding.class);
        container.registerComponentImplementation(SOS.ObservationOfferingPropertyType,ObservationOfferingPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.ObservationOfferingType,ObservationOfferingTypeBinding.class);
        container.registerComponentImplementation(SOS.ObservationOfferingType_observedArea,ObservationOfferingType_observedAreaBinding.class);
        container.registerComponentImplementation(SOS.ObservationOfferingType_phenomenonTime,ObservationOfferingType_phenomenonTimeBinding.class);        
        container.registerComponentImplementation(SOS.ObservationOfferingType_resultTime,ObservationOfferingType_resultTimeBinding.class);
        container.registerComponentImplementation(SOS.GetFeatureOfInterestPropertyType,GetFeatureOfInterestPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetFeatureOfInterestResponsePropertyType,GetFeatureOfInterestResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetFeatureOfInterestResponseType,GetFeatureOfInterestResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.GetFeatureOfInterestType,GetFeatureOfInterestTypeBinding.class);
        container.registerComponentImplementation(SOS.GetFeatureOfInterestType_spatialFilter,GetFeatureOfInterestType_spatialFilterBinding.class);
        container.registerComponentImplementation(SOS.GetObservationPropertyType,GetObservationPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationResponsePropertyType,GetObservationResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationResponseType,GetObservationResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationType,GetObservationTypeBinding.class);
        container.registerComponentImplementation(SOS.GetObservationResponseType_observationData,GetObservationResponseType_observationDataBinding.class);
        container.registerComponentImplementation(SOS.GetObservationType_temporalFilter,GetObservationType_temporalFilterBinding.class);
        container.registerComponentImplementation(SOS.GetObservationType_spatialFilter,GetObservationType_spatialFilterBinding.class);
        container.registerComponentImplementation(SOS.GetResultPropertyType,GetResultPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultResponsePropertyType,GetResultResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultResponseType,GetResultResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultType,GetResultTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultType_temporalFilter,GetResultType_temporalFilterBinding.class);
        container.registerComponentImplementation(SOS.GetResultType_spatialFilter,GetResultType_spatialFilterBinding.class);
        container.registerComponentImplementation(SOS.GetResultTemplatePropertyType,GetResultTemplatePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultTemplateResponsePropertyType,GetResultTemplateResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultTemplateResponseType,GetResultTemplateResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultTemplateType,GetResultTemplateTypeBinding.class);
        container.registerComponentImplementation(SOS.GetResultTemplateResponseType_resultStructure,GetResultTemplateResponseType_resultStructureBinding.class);
        container.registerComponentImplementation(SOS.GetResultTemplateResponseType_resultEncoding,GetResultTemplateResponseType_resultEncodingBinding.class);
        container.registerComponentImplementation(SOS.InsertionCapabilitiesPropertyType,InsertionCapabilitiesPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertionCapabilitiesType,InsertionCapabilitiesTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertObservationPropertyType,InsertObservationPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertObservationResponsePropertyType,InsertObservationResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertObservationResponseType,InsertObservationResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertObservationType,InsertObservationTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertObservationType_observation,InsertObservationType_observationBinding.class);
        container.registerComponentImplementation(SOS.InsertResultPropertyType,InsertResultPropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultResponsePropertyType,InsertResultResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultResponseType,InsertResultResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultType,InsertResultTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultTemplatePropertyType,InsertResultTemplatePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultTemplateResponsePropertyType,InsertResultTemplateResponsePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultTemplateResponseType,InsertResultTemplateResponseTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultTemplateType,InsertResultTemplateTypeBinding.class);
        container.registerComponentImplementation(SOS.ResultTemplatePropertyType,ResultTemplatePropertyTypeBinding.class);
        container.registerComponentImplementation(SOS.ResultTemplateType,ResultTemplateTypeBinding.class);
        container.registerComponentImplementation(SOS.InsertResultTemplateType_proposedTemplate,InsertResultTemplateType_proposedTemplateBinding.class);
        container.registerComponentImplementation(SOS.ResultTemplateType_observationTemplate,ResultTemplateType_observationTemplateBinding.class);
        container.registerComponentImplementation(SOS.ResultTemplateType_resultStructure,ResultTemplateType_resultStructureBinding.class);
        container.registerComponentImplementation(SOS.ResultTemplateType_resultEncoding,ResultTemplateType_resultEncodingBinding.class);

        
        
    }
} 