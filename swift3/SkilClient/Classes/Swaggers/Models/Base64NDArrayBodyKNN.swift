//
// Base64NDArrayBodyKNN.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class Base64NDArrayBodyKNN: JSONEncodable {

    /** the array to run the search on. Note that this must be a row vector */
    public var ndarray: String?
    /** the number of results to retrieve */
    public var k: Int32?
    /** If &#39;True&#39; it will brute force search for running search relative to a target but forced to fill the result list until the desired k is matched. */
    public var forceFillK: Bool?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["ndarray"] = self.ndarray
        nillableDictionary["k"] = self.k?.encodeToJSON()
        nillableDictionary["forceFillK"] = self.forceFillK

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

