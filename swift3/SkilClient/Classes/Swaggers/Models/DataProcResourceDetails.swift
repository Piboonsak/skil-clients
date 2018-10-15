//
// DataProcResourceDetails.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class DataProcResourceDetails: JSONEncodable {

    public enum ModelType: String { 
        case compute = "COMPUTE"
    }
    public enum SubType: String { 
        case dataProc = "DataProc"
    }
    /** ID of the resource */
    public var resourceId: Int64?
    /** Resource type */
    public var type: ModelType?
    /** Resource subtype */
    public var subType: SubType?
    /** Project ID */
    public var projectId: String?
    /** DataProc region */
    public var region: String?
    /** Name of the spark cluster */
    public var sparkClusterName: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["resourceId"] = self.resourceId?.encodeToJSON()
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["subType"] = self.subType?.rawValue
        nillableDictionary["projectId"] = self.projectId
        nillableDictionary["region"] = self.region
        nillableDictionary["sparkClusterName"] = self.sparkClusterName

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

