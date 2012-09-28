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
       return getClass().getResource("sos.xsd").toString();
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
    /** @generated */
    public static final QName GetObservationByIdPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationByIdPropertyType");
    /** @generated */
    public static final QName GetObservationByIdResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationByIdResponsePropertyType");
    /** @generated */
    public static final QName GetObservationByIdResponseType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationByIdResponseType");
    /** @generated */
    public static final QName GetObservationByIdType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationByIdType");
    /** @generated */
    public static final QName GetObservationByIdResponseType_observation = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationByIdResponseType_observation");
    /** @generated */
    public static final QName CapabilitiesPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","CapabilitiesPropertyType");
    /** @generated */
    public static final QName CapabilitiesType = 
        new QName("http://www.opengis.net/sos/2.0","CapabilitiesType");
    /** @generated */
    public static final QName GetCapabilitiesPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetCapabilitiesPropertyType");
    /** @generated */
    public static final QName GetCapabilitiesType = 
        new QName("http://www.opengis.net/sos/2.0","GetCapabilitiesType");
    /** @generated */
    public static final QName CapabilitiesType_filterCapabilities = 
        new QName("http://www.opengis.net/sos/2.0","CapabilitiesType_filterCapabilities");
    /** @generated */
    public static final QName CapabilitiesType_contents = 
        new QName("http://www.opengis.net/sos/2.0","CapabilitiesType_contents");
    /** @generated */
    public static final QName ContentsPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","ContentsPropertyType");
    /** @generated */
    public static final QName ContentsType = 
        new QName("http://www.opengis.net/sos/2.0","ContentsType");
    /** @generated */
    public static final QName ObservationOfferingPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","ObservationOfferingPropertyType");
    /** @generated */
    public static final QName ObservationOfferingType = 
        new QName("http://www.opengis.net/sos/2.0","ObservationOfferingType");
    /** @generated */
    public static final QName ObservationOfferingType_observedArea = 
        new QName("http://www.opengis.net/sos/2.0","ObservationOfferingType_observedArea");
    /** @generated */
    public static final QName ObservationOfferingType_phenomenonTime = 
        new QName("http://www.opengis.net/sos/2.0","ObservationOfferingType_phenomenonTime");
    /** @generated */
    public static final QName ObservationOfferingType_resultTime = 
        new QName("http://www.opengis.net/sos/2.0","ObservationOfferingType_resultTime");
    /** @generated */
    public static final QName GetFeatureOfInterestPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetFeatureOfInterestPropertyType");
    /** @generated */
    public static final QName GetFeatureOfInterestResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetFeatureOfInterestResponsePropertyType");
    /** @generated */
    public static final QName GetFeatureOfInterestResponseType = 
        new QName("http://www.opengis.net/sos/2.0","GetFeatureOfInterestResponseType");
    /** @generated */
    public static final QName GetFeatureOfInterestType = 
        new QName("http://www.opengis.net/sos/2.0","GetFeatureOfInterestType");
    /** @generated */
    public static final QName GetFeatureOfInterestType_spatialFilter = 
        new QName("http://www.opengis.net/sos/2.0","GetFeatureOfInterestType_spatialFilter");
    /** @generated */
    public static final QName GetObservationPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationPropertyType");
    /** @generated */
    public static final QName GetObservationResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationResponsePropertyType");
    /** @generated */
    public static final QName GetObservationResponseType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationResponseType");
    /** @generated */
    public static final QName GetObservationType = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationType");
    /** @generated */
    public static final QName GetObservationResponseType_observationData = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationResponseType_observationData");
    /** @generated */
    public static final QName GetObservationType_temporalFilter = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationType_temporalFilter");
    /** @generated */
    public static final QName GetObservationType_spatialFilter = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationType_spatialFilter");
    /** @generated */
    public static final QName GetResultPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultPropertyType");
    /** @generated */
    public static final QName GetResultResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultResponsePropertyType");
    /** @generated */
    public static final QName GetResultResponseType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultResponseType");
    /** @generated */
    public static final QName GetResultType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultType");
    /** @generated */
    public static final QName GetResultType_temporalFilter = 
        new QName("http://www.opengis.net/sos/2.0","GetResultType_temporalFilter");
    /** @generated */
    public static final QName GetResultType_spatialFilter = 
        new QName("http://www.opengis.net/sos/2.0","GetResultType_spatialFilter");
    /** @generated */
    public static final QName GetResultTemplatePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplatePropertyType");
    /** @generated */
    public static final QName GetResultTemplateResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplateResponsePropertyType");
    /** @generated */
    public static final QName GetResultTemplateResponseType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplateResponseType");
    /** @generated */
    public static final QName GetResultTemplateType = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplateType");
    /** @generated */
    public static final QName GetResultTemplateResponseType_resultStructure = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplateResponseType_resultStructure");
    /** @generated */
    public static final QName GetResultTemplateResponseType_resultEncoding = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplateResponseType_resultEncoding");
    /** @generated */
    public static final QName InsertionCapabilitiesPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","InsertionCapabilitiesPropertyType");
    /** @generated */
    public static final QName InsertionCapabilitiesType = 
        new QName("http://www.opengis.net/sos/2.0","InsertionCapabilitiesType");
    /** @generated */
    public static final QName InsertObservationPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","InsertObservationPropertyType");
    /** @generated */
    public static final QName InsertObservationResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","InsertObservationResponsePropertyType");
    /** @generated */
    public static final QName InsertObservationResponseType = 
        new QName("http://www.opengis.net/sos/2.0","InsertObservationResponseType");
    /** @generated */
    public static final QName InsertObservationType = 
        new QName("http://www.opengis.net/sos/2.0","InsertObservationType");
    /** @generated */
    public static final QName InsertObservationType_observation = 
        new QName("http://www.opengis.net/sos/2.0","InsertObservationType_observation");
    /** @generated */
    public static final QName InsertResultPropertyType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultPropertyType");
    /** @generated */
    public static final QName InsertResultResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultResponsePropertyType");
    /** @generated */
    public static final QName InsertResultResponseType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultResponseType");
    /** @generated */
    public static final QName InsertResultType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultType");
    /** @generated */
    public static final QName InsertResultTemplatePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultTemplatePropertyType");
    /** @generated */
    public static final QName InsertResultTemplateResponsePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultTemplateResponsePropertyType");
    /** @generated */
    public static final QName InsertResultTemplateResponseType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultTemplateResponseType");
    /** @generated */
    public static final QName InsertResultTemplateType = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultTemplateType");
    /** @generated */
    public static final QName ResultTemplatePropertyType = 
        new QName("http://www.opengis.net/sos/2.0","ResultTemplatePropertyType");
    /** @generated */
    public static final QName ResultTemplateType = 
        new QName("http://www.opengis.net/sos/2.0","ResultTemplateType");
    /** @generated */
    public static final QName InsertResultTemplateType_proposedTemplate = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultTemplateType_proposedTemplate");
    /** @generated */
    public static final QName ResultTemplateType_observationTemplate = 
        new QName("http://www.opengis.net/sos/2.0","ResultTemplateType_observationTemplate");
    /** @generated */
    public static final QName ResultTemplateType_resultStructure = 
        new QName("http://www.opengis.net/sos/2.0","ResultTemplateType_resultStructure");
    /** @generated */
    public static final QName ResultTemplateType_resultEncoding = 
        new QName("http://www.opengis.net/sos/2.0","ResultTemplateType_resultEncoding");

    /* Elements */
    /** @generated */
    public static final QName SosInsertionMetadata = 
        new QName("http://www.opengis.net/sos/2.0","SosInsertionMetadata");
    /** @generated */
    public static final QName GetObservationById = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationById");
    /** @generated */
    public static final QName GetObservationByIdResponse = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationByIdResponse");
    /** @generated */
    public static final QName Capabilities = 
        new QName("http://www.opengis.net/sos/2.0","Capabilities");
    /** @generated */
    public static final QName GetCapabilities = 
        new QName("http://www.opengis.net/sos/2.0","GetCapabilities");
    /** @generated */
    public static final QName Contents = 
        new QName("http://www.opengis.net/sos/2.0","Contents");
    /** @generated */
    public static final QName ObservationOffering = 
        new QName("http://www.opengis.net/sos/2.0","ObservationOffering");
    /** @generated */
    public static final QName GetFeatureOfInterest = 
        new QName("http://www.opengis.net/sos/2.0","GetFeatureOfInterest");
    /** @generated */
    public static final QName GetFeatureOfInterestResponse = 
        new QName("http://www.opengis.net/sos/2.0","GetFeatureOfInterestResponse");
    /** @generated */
    public static final QName GetObservation = 
        new QName("http://www.opengis.net/sos/2.0","GetObservation");
    /** @generated */
    public static final QName GetObservationResponse = 
        new QName("http://www.opengis.net/sos/2.0","GetObservationResponse");
    /** @generated */
    public static final QName GetResult = 
        new QName("http://www.opengis.net/sos/2.0","GetResult");
    /** @generated */
    public static final QName GetResultResponse = 
        new QName("http://www.opengis.net/sos/2.0","GetResultResponse");
    /** @generated */
    public static final QName GetResultTemplate = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplate");
    /** @generated */
    public static final QName GetResultTemplateResponse = 
        new QName("http://www.opengis.net/sos/2.0","GetResultTemplateResponse");
    /** @generated */
    public static final QName InsertionCapabilities = 
        new QName("http://www.opengis.net/sos/2.0","InsertionCapabilities");
    /** @generated */
    public static final QName InsertObservation = 
        new QName("http://www.opengis.net/sos/2.0","InsertObservation");
    /** @generated */
    public static final QName InsertObservationResponse = 
        new QName("http://www.opengis.net/sos/2.0","InsertObservationResponse");
    /** @generated */
    public static final QName InsertResult = 
        new QName("http://www.opengis.net/sos/2.0","InsertResult");
    /** @generated */
    public static final QName InsertResultResponse = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultResponse");
    /** @generated */
    public static final QName InsertResultTemplate = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultTemplate");
    /** @generated */
    public static final QName InsertResultTemplateResponse = 
        new QName("http://www.opengis.net/sos/2.0","InsertResultTemplateResponse");
    /** @generated */
    public static final QName ResultTemplate = 
        new QName("http://www.opengis.net/sos/2.0","ResultTemplate");

    
    /* Attributes */

}
    