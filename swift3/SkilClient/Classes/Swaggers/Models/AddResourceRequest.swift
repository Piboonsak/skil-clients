//
// AddResourceRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class AddResourceRequest: JSONEncodable {

    public enum ModelType: String { 
        case compute = "COMPUTE"
        case storage = "STORAGE"
    }
    public enum SubType: String { 
        case emr = "EMR"
        case s3 = "S3"
        case googleStorage = "GoogleStorage"
        case dataProc = "DataProc"
        case hdinsight = "HDInsight"
        case azureStorage = "AzureStorage"
        case hdfs = "HDFS"
        case yarn = "YARN"
    }
    /** Name of the new resource */
    public var resourceName: String?
    /** One of the resource details object */
    public var resourceDetails: Any?
    /** URI of the credentials. If this is present, you can leave out the &#39;credentialId&#39; */
    public var credentialUri: String?
    /** Resource type (whether COMPUTE or STORAGE) */
    public var type: ModelType?
    /** Resource subtype (COMPUTE -&gt; [EMR, DataProc, HDInsight, YARN] | STORAGE -&gt; [S3, GoogleStorage, AzureStorage, HDFS]) */
    public var subType: SubType?
    /** ID of the credentials. If this is given then you can leave out the &#39;credentialsUri&#39; */
    public var credentialId: Int64?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["resourceName"] = self.resourceName
        nillableDictionary["resourceDetails"] = self.resourceDetails
        nillableDictionary["credentialUri"] = self.credentialUri
        nillableDictionary["type"] = self.type?.rawValue
        nillableDictionary["subType"] = self.subType?.rawValue
        nillableDictionary["credentialId"] = self.credentialId?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

