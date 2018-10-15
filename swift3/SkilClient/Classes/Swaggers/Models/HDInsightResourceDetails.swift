//
// HDInsightResourceDetails.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class HDInsightResourceDetails: JSONEncodable {

    public enum ModelType: String { 
        case compute = "COMPUTE"
    }
    public enum SubType: String { 
        case hdinsight = "HDInsight"
    }
    /** ID of the resource */
    public var resourceId: Int64?
    /** Resource type */
    public var type: ModelType?
    /** Resource subtype */
    public var subType: SubType?
    /** Azure subscription ID */
    public var subscriptionId: String?
    /** name of the resource group */
    public var resourceGroupName: String?
    /** Cluster name */
    public var clusterName: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["resourceId"] = self.resourceId?.encodeToJSON()
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["subType"] = self.subType?.rawValue
        nillableDictionary["subscriptionId"] = self.subscriptionId
        nillableDictionary["resourceGroupName"] = self.resourceGroupName
        nillableDictionary["clusterName"] = self.clusterName

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

