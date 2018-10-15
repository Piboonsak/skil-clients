//
// DownloadOutputFileRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class DownloadOutputFileRequest: JSONEncodable {

    /** Local path where the file is to be downloaded */
    public var localDownloadPath: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["localDownloadPath"] = self.localDownloadPath

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

