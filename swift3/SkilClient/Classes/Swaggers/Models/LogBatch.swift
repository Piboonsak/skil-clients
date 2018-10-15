//
// LogBatch.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class LogBatch: JSONEncodable {

    public var offset: Int32?
    public var rowCount: Int32?
    public var logs: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["offset"] = self.offset?.encodeToJSON()
        nillableDictionary["rowCount"] = self.rowCount?.encodeToJSON()
        nillableDictionary["logs"] = self.logs

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

