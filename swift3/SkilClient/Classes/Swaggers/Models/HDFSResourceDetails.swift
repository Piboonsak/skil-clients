//
// HDFSResourceDetails.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class HDFSResourceDetails: JSONEncodable {

    public enum ModelType: String { 
        case storage = "STORAGE"
    }
    public enum SubType: String { 
        case hdfs = "HDFS"
    }
    /** ID of the resource */
    public var resourceId: Int64?
    /** Resource type */
    public var type: ModelType?
    /** Resource subtype */
    public var subType: SubType?
    /** Host of the node running the NameNode */
    public var nameNodeHost: String?
    /** Port of the node running the NameNode */
    public var nameNodePort: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["resourceId"] = self.resourceId?.encodeToJSON()
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["subType"] = self.subType?.rawValue
        nillableDictionary["nameNodeHost"] = self.nameNodeHost
        nillableDictionary["nameNodePort"] = self.nameNodePort

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

