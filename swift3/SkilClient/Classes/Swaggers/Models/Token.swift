//
// Token.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class Token: JSONEncodable {

    public var tokenId: Int64?
    public var issued: Int64?
    public var expire: Int64?
    public var token: String?
    public var userId: String?
    public var isRevoked: Int32?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["tokenId"] = self.tokenId?.encodeToJSON()
        nillableDictionary["issued"] = self.issued?.encodeToJSON()
        nillableDictionary["expire"] = self.expire?.encodeToJSON()
        nillableDictionary["token"] = self.token
        nillableDictionary["userId"] = self.userId
        nillableDictionary["isRevoked"] = self.isRevoked?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

