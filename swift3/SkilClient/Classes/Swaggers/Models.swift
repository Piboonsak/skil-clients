// Models.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

protocol JSONEncodable {
    func encodeToJSON() -> Any
}

public enum ErrorResponse : Error {
    case HttpError(statusCode: Int, data: Data?, error: Error)
    case DecodeError(response: Data?, decodeError: DecodeError)
}

open class Response<T> {
    open let statusCode: Int
    open let header: [String: String]
    open let body: T?

    public init(statusCode: Int, header: [String: String], body: T?) {
        self.statusCode = statusCode
        self.header = header
        self.body = body
    }

    public convenience init(response: HTTPURLResponse, body: T?) {
        let rawHeader = response.allHeaderFields
        var header = [String:String]()
        for case let (key, value) as (String, String) in rawHeader {
            header[key] = value
        }
        self.init(statusCode: response.statusCode, header: header, body: body)
    }
}

public enum Decoded<ValueType> {
    case success(ValueType)
    case failure(DecodeError)
}

public extension Decoded {
    var value: ValueType? {
        switch self {
        case let .success(value):
            return value
        case .failure:
            return nil
        }
    }
}

public enum DecodeError {
    case typeMismatch(expected: String, actual: String)
    case missingKey(key: String)
    case parseError(message: String)
}

private var once = Int()
class Decoders {
    static fileprivate var decoders = Dictionary<String, ((AnyObject, AnyObject?) -> AnyObject)>()

    static func addDecoder<T>(clazz: T.Type, decoder: @escaping ((AnyObject, AnyObject?) -> Decoded<T>)) {
        let key = "\(T.self)"
        decoders[key] = { decoder($0, $1) as AnyObject }
    }

    static func decode<T>(clazz: T.Type, discriminator: String, source: AnyObject) -> Decoded<T> {
        let key = discriminator
        if let decoder = decoders[key], let value = decoder(source, nil) as? Decoded<T> {
            return value
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decode<T>(clazz: [T].Type, source: AnyObject) -> Decoded<[T]> {
        if let sourceArray = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in sourceArray {
                switch Decoders.decode(clazz: T.self, source: sourceValue, instance: nil) {
                case let .success(value):
                    values.append(value)
                case let .failure(error):
                    return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decode<T>(clazz: T.Type, source: AnyObject) -> Decoded<T> {
        switch Decoders.decode(clazz: T.self, source: source, instance: nil) {
    	    case let .success(value):
                return .success(value)
            case let .failure(error):
                return .failure(error)
        }
    }

    static open func decode<T: RawRepresentable>(clazz: T.Type, source: AnyObject) -> Decoded<T> {
        if let value = source as? T.RawValue {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "\(T.RawValue.self) matching a case from the enumeration \(T.self)", actual: String(describing: type(of: source))))
        }
    }

    static func decode<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject) -> Decoded<[Key:T]> {
        if let sourceDictionary = source as? [Key: AnyObject] {
            var dictionary = [Key:T]()
            for (key, value) in sourceDictionary {
                switch Decoders.decode(clazz: T.self, source: value, instance: nil) {
                case let .success(value):
                    dictionary[key] = value
                case let .failure(error):
                    return .failure(error)
                }
            }
            return .success(dictionary)
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    static func decodeOptional<T: RawRepresentable>(clazz: T.Type, source: AnyObject?) -> Decoded<T?> {
        guard !(source is NSNull), source != nil else { return .success(nil) }
        if let value = source as? T.RawValue {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "\(T.RawValue.self) matching a case from the enumeration \(T.self)", actual: String(describing: type(of: source))))
        }
    }

    static func decode<T>(clazz: T.Type, source: AnyObject, instance: AnyObject?) -> Decoded<T> {
        initialize()
        if let sourceNumber = source as? NSNumber, let value = sourceNumber.int32Value as? T, T.self is Int32.Type {
            return .success(value)
        }
        if let sourceNumber = source as? NSNumber, let value = sourceNumber.int32Value as? T, T.self is Int64.Type {
     	    return .success(value)
        }
        if let intermediate = source as? String, let value = UUID(uuidString: intermediate) as? T, source is String, T.self is UUID.Type {
            return .success(value)
        }
        if let value = source as? T {
            return .success(value)
        }
        if let intermediate = source as? String, let value = Data(base64Encoded: intermediate) as? T {
            return .success(value)
        }

        let key = "\(T.self)"
        if let decoder = decoders[key], let value = decoder(source, instance) as? Decoded<T> {
           return value
        } else {
            return .failure(.typeMismatch(expected: String(describing: clazz), actual: String(describing: source)))
        }
    }

    //Convert a Decoded so that its value is optional. DO WE STILL NEED THIS?
    static func toOptional<T>(decoded: Decoded<T>) -> Decoded<T?> {
        return .success(decoded.value)
    }

    static func decodeOptional<T>(clazz: T.Type, source: AnyObject?) -> Decoded<T?> {
        if let source = source, !(source is NSNull) {
            switch Decoders.decode(clazz: clazz, source: source, instance: nil) {
            case let .success(value): return .success(value)
            case let .failure(error): return .failure(error)
            }
        } else {
            return .success(nil)
        }
    }
    
    static func decodeOptional<T>(clazz: [T].Type, source: AnyObject?) -> Decoded<[T]?> where T: RawRepresentable {
        if let source = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in source {
                switch Decoders.decodeOptional(clazz: T.self, source: sourceValue) {
                case let .success(value): if let value = value { values.append(value) }
                case let .failure(error): return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T>(clazz: [T].Type, source: AnyObject?) -> Decoded<[T]?> {
        if let source = source as? [AnyObject] {
            var values = [T]()
            for sourceValue in source {
                switch Decoders.decode(clazz: T.self, source: sourceValue, instance: nil) {
                case let .success(value): values.append(value)
                case let .failure(error): return .failure(error)
                }
            }
            return .success(values)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T, Key: Hashable>(clazz: [Key:T].Type, source: AnyObject?) -> Decoded<[Key:T]?> {
        if let sourceDictionary = source as? [Key: AnyObject] {
            var dictionary = [Key:T]()
            for (key, value) in sourceDictionary {
                switch Decoders.decode(clazz: T.self, source: value, instance: nil) {
                case let .success(value): dictionary[key] = value
                case let .failure(error): return .failure(error)
                }
            }
            return .success(dictionary)
        } else {
            return .success(nil)
        }
    }

    static func decodeOptional<T: RawRepresentable, U: AnyObject>(clazz: T, source: AnyObject) -> Decoded<T?> where T.RawValue == U {
        if let value = source as? U {
            if let enumValue = T.init(rawValue: value) {
                return .success(enumValue)
            } else {
                return .failure(.typeMismatch(expected: "A value from the enumeration \(T.self)", actual: "\(value)"))
            }
        } else {
            return .failure(.typeMismatch(expected: "String", actual: String(describing: type(of: source))))
        }
    }


    private static var __once: () = {
        let formatters = [
            "yyyy-MM-dd",
            "yyyy-MM-dd'T'HH:mm:ssZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ",
            "yyyy-MM-dd'T'HH:mm:ss'Z'",
            "yyyy-MM-dd'T'HH:mm:ss.SSS",
            "yyyy-MM-dd HH:mm:ss"
        ].map { (format: String) -> DateFormatter in
            let formatter = DateFormatter()
            formatter.locale = Locale(identifier: "en_US_POSIX")
            formatter.dateFormat = format
            return formatter
        }
        // Decoder for Date
        Decoders.addDecoder(clazz: Date.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<Date> in
           if let sourceString = source as? String {
                for formatter in formatters {
                    if let date = formatter.date(from: sourceString) {
                        return .success(date)
                    }
                }
            }
            if let sourceInt = source as? Int {
                // treat as a java date
                return .success(Date(timeIntervalSince1970: Double(sourceInt / 1000) ))
            }
            if source is String || source is Int {
                return .failure(.parseError(message: "Could not decode date"))
            } else {
                return .failure(.typeMismatch(expected: "String or Int", actual: "\(source)"))
            }
        }

        // Decoder for ISOFullDate
        Decoders.addDecoder(clazz: ISOFullDate.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<ISOFullDate> in
            if let string = source as? String,
               let isoDate = ISOFullDate.from(string: string) {
                return .success(isoDate)
            } else {
            	return .failure(.typeMismatch(expected: "ISO date", actual: "\(source)"))
            }
        }

        // Decoder for [Base64NDArrayBody]
        Decoders.addDecoder(clazz: [Base64NDArrayBody].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[Base64NDArrayBody]> in
            return Decoders.decode(clazz: [Base64NDArrayBody].self, source: source)
        }

        // Decoder for Base64NDArrayBody
        Decoders.addDecoder(clazz: Base64NDArrayBody.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<Base64NDArrayBody> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? Base64NDArrayBody() : instance as! Base64NDArrayBody
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["ndarray"] as AnyObject?) {
                
                case let .success(value): _result.ndarray = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "Base64NDArrayBody", actual: "\(source)"))
            }
        }
        // Decoder for [ClassificationResult]
        Decoders.addDecoder(clazz: [ClassificationResult].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[ClassificationResult]> in
            return Decoders.decode(clazz: [ClassificationResult].self, source: source)
        }

        // Decoder for ClassificationResult
        Decoders.addDecoder(clazz: ClassificationResult.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<ClassificationResult> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? ClassificationResult() : instance as! ClassificationResult
                switch Decoders.decodeOptional(clazz: [Int32].self, source: sourceDictionary["results"] as AnyObject?) {
                
                case let .success(value): _result.results = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: [Double].self, source: sourceDictionary["probabilities"] as AnyObject?) {
                
                case let .success(value): _result.probabilities = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["minibatchId"] as AnyObject?) {
                
                case let .success(value): _result.minibatchId = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "ClassificationResult", actual: "\(source)"))
            }
        }
        // Decoder for [INDArray]
        Decoders.addDecoder(clazz: [INDArray].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[INDArray]> in
            return Decoders.decode(clazz: [INDArray].self, source: source)
        }

        // Decoder for INDArray
        Decoders.addDecoder(clazz: INDArray.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<INDArray> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? INDArray() : instance as! INDArray
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["array"] as AnyObject?) {
                
                case let .success(value): _result.array = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "INDArray", actual: "\(source)"))
            }
        }
        // Decoder for [JsonArrayResponse]
        Decoders.addDecoder(clazz: [JsonArrayResponse].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[JsonArrayResponse]> in
            return Decoders.decode(clazz: [JsonArrayResponse].self, source: source)
        }

        // Decoder for JsonArrayResponse
        Decoders.addDecoder(clazz: JsonArrayResponse.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<JsonArrayResponse> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? JsonArrayResponse() : instance as! JsonArrayResponse
                switch Decoders.decodeOptional(clazz: INDArray.self, source: sourceDictionary["array"] as AnyObject?) {
                
                case let .success(value): _result.array = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "JsonArrayResponse", actual: "\(source)"))
            }
        }
        // Decoder for [LogBatch]
        Decoders.addDecoder(clazz: [LogBatch].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[LogBatch]> in
            return Decoders.decode(clazz: [LogBatch].self, source: source)
        }

        // Decoder for LogBatch
        Decoders.addDecoder(clazz: LogBatch.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<LogBatch> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? LogBatch() : instance as! LogBatch
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["offset"] as AnyObject?) {
                
                case let .success(value): _result.offset = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["rowCount"] as AnyObject?) {
                
                case let .success(value): _result.rowCount = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["logs"] as AnyObject?) {
                
                case let .success(value): _result.logs = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "LogBatch", actual: "\(source)"))
            }
        }
        // Decoder for [LogRequest]
        Decoders.addDecoder(clazz: [LogRequest].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[LogRequest]> in
            return Decoders.decode(clazz: [LogRequest].self, source: source)
        }

        // Decoder for LogRequest
        Decoders.addDecoder(clazz: LogRequest.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<LogRequest> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? LogRequest() : instance as! LogRequest
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["offset"] as AnyObject?) {
                
                case let .success(value): _result.offset = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["rowCount"] as AnyObject?) {
                
                case let .success(value): _result.rowCount = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["head"] as AnyObject?) {
                
                case let .success(value): _result.head = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "LogRequest", actual: "\(source)"))
            }
        }
        // Decoder for [ModelStatus]
        Decoders.addDecoder(clazz: [ModelStatus].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[ModelStatus]> in
            return Decoders.decode(clazz: [ModelStatus].self, source: source)
        }

        // Decoder for ModelStatus
        Decoders.addDecoder(clazz: ModelStatus.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<ModelStatus> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? ModelStatus() : instance as! ModelStatus
                switch Decoders.decodeOptional(clazz: Int32.self, source: sourceDictionary["status"] as AnyObject?) {
                
                case let .success(value): _result.status = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "ModelStatus", actual: "\(source)"))
            }
        }
        // Decoder for [MultiClassClassificationResult]
        Decoders.addDecoder(clazz: [MultiClassClassificationResult].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[MultiClassClassificationResult]> in
            return Decoders.decode(clazz: [MultiClassClassificationResult].self, source: source)
        }

        // Decoder for MultiClassClassificationResult
        Decoders.addDecoder(clazz: MultiClassClassificationResult.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<MultiClassClassificationResult> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? MultiClassClassificationResult() : instance as! MultiClassClassificationResult
                switch Decoders.decodeOptional(clazz: [[String]].self, source: sourceDictionary["rankedOutcomes"] as AnyObject?) {
                
                case let .success(value): _result.rankedOutcomes = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: [String].self, source: sourceDictionary["maxOutcomes"] as AnyObject?) {
                
                case let .success(value): _result.maxOutcomes = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: [[Double]].self, source: sourceDictionary["probabilities"] as AnyObject?) {
                
                case let .success(value): _result.probabilities = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "MultiClassClassificationResult", actual: "\(source)"))
            }
        }
        // Decoder for [Prediction]
        Decoders.addDecoder(clazz: [Prediction].self) { (source: AnyObject, instance: AnyObject?) -> Decoded<[Prediction]> in
            return Decoders.decode(clazz: [Prediction].self, source: source)
        }

        // Decoder for Prediction
        Decoders.addDecoder(clazz: Prediction.self) { (source: AnyObject, instance: AnyObject?) -> Decoded<Prediction> in
            if let sourceDictionary = source as? [AnyHashable: Any] {
                let _result = instance == nil ? Prediction() : instance as! Prediction
                switch Decoders.decodeOptional(clazz: String.self, source: sourceDictionary["id"] as AnyObject?) {
                
                case let .success(value): _result.id = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: Bool.self, source: sourceDictionary["needsPreProcessing"] as AnyObject?) {
                
                case let .success(value): _result.needsPreProcessing = value
                case let .failure(error): break
                
                }
                switch Decoders.decodeOptional(clazz: INDArray.self, source: sourceDictionary["prediction"] as AnyObject?) {
                
                case let .success(value): _result.prediction = value
                case let .failure(error): break
                
                }
                return .success(_result)
            } else {
                return .failure(.typeMismatch(expected: "Prediction", actual: "\(source)"))
            }
        }
    }()

    static fileprivate func initialize() {
        _ = Decoders.__once
    }
}