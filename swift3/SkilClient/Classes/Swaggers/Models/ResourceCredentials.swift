//
// ResourceCredentials.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ResourceCredentials: JSONEncodable {

    public enum ModelType: String { 
        case aws = "AWS"
        case azure = "Azure"
        case googleCloud = "GoogleCloud"
        case hadoop = "Hadoop"
    }
    /** ID of the credentials */
    public var credentialId: Int64?
    /** Type of the credentials */
    public var type: ModelType?
    /** Name of the credentials */
    public var name: String?
    /** URI of the credentials */
    public var uri: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["credentialId"] = self.credentialId?.encodeToJSON()
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["name"] = self.name
        nillableDictionary["uri"] = self.uri

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

