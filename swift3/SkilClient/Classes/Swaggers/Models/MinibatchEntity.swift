//
// MinibatchEntity.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class MinibatchEntity: JSONEncodable {

    /** GUID of mini batch */
    public var miniBatchId: String?
    /** GUID of the evaluation */
    public var evalId: String?
    /** Eval version */
    public var evalVersion: Int32?
    /** Batch version */
    public var batchVersion: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["miniBatchId"] = self.miniBatchId
        nillableDictionary["evalId"] = self.evalId
        nillableDictionary["evalVersion"] = self.evalVersion?.encodeToJSON()
        nillableDictionary["batchVersion"] = self.batchVersion?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
