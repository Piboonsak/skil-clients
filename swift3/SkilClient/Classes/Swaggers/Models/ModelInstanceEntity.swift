//
// ModelInstanceEntity.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ModelInstanceEntity: JSONEncodable {

    /** The model URI */
    public var uri: String?
    /** The json string for the ETL (Extract, Transform and Load) */
    public var etlJson: String?
    /** GUID of the model. */
    public var modelId: String?
    /** Comma-separated labels string for the model */
    public var modelLabels: String?
    /** Format for the model input */
    public var inputFormats: String?
    /** When the model was created */
    public var created: Int64?
    /** JSON string of the associated Zeppelin Notebook */
    public var notebookJson: String?
    /** GUID for the model evaluation */
    public var evalId: String?
    /** Model&#39;s name */
    public var modelName: String?
    /** Original GUID of the model (used for maintaining revisions of a particular model) */
    public var originalModelId: String?
    /** Model version */
    public var modelVersion: String?
    /** GUID of the Experiment which is associated with the model. */
    public var experimentId: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["uri"] = self.uri
        nillableDictionary["etlJson"] = self.etlJson
        nillableDictionary["modelId"] = self.modelId
        nillableDictionary["modelLabels"] = self.modelLabels
        nillableDictionary["inputFormats"] = self.inputFormats
        nillableDictionary["created"] = self.created?.encodeToJSON()
        nillableDictionary["notebookJson"] = self.notebookJson
        nillableDictionary["evalId"] = self.evalId
        nillableDictionary["modelName"] = self.modelName
        nillableDictionary["originalModelId"] = self.originalModelId
        nillableDictionary["modelVersion"] = self.modelVersion
        nillableDictionary["experimentId"] = self.experimentId

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

