/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.AddResourceRequest = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AddResourceRequest model module.
   * @module ai/skymind/skil/model/AddResourceRequest
   * @version 1.1.2
   */

  /**
   * Constructs a new <code>AddResourceRequest</code>.
   * @alias module:ai/skymind/skil/model/AddResourceRequest
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>AddResourceRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/AddResourceRequest} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/AddResourceRequest} The populated <code>AddResourceRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('resourceName')) {
        obj['resourceName'] = ApiClient.convertToType(data['resourceName'], 'String');
      }
      if (data.hasOwnProperty('resourceDetails')) {
        obj['resourceDetails'] = ApiClient.convertToType(data['resourceDetails'], Object);
      }
      if (data.hasOwnProperty('credentialUri')) {
        obj['credentialUri'] = ApiClient.convertToType(data['credentialUri'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('subType')) {
        obj['subType'] = ApiClient.convertToType(data['subType'], 'String');
      }
      if (data.hasOwnProperty('credentialId')) {
        obj['credentialId'] = ApiClient.convertToType(data['credentialId'], 'Number');
      }
    }
    return obj;
  }

  /**
   * Name of the new resource
   * @member {String} resourceName
   */
  exports.prototype['resourceName'] = undefined;
  /**
   * One of the resource details object
   * @member {Object} resourceDetails
   */
  exports.prototype['resourceDetails'] = undefined;
  /**
   * URI of the credentials. If this is present, you can leave out the 'credentialId'
   * @member {String} credentialUri
   */
  exports.prototype['credentialUri'] = undefined;
  /**
   * Resource type (whether COMPUTE or STORAGE)
   * @member {module:ai/skymind/skil/model/AddResourceRequest.TypeEnum} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])
   * @member {module:ai/skymind/skil/model/AddResourceRequest.SubTypeEnum} subType
   */
  exports.prototype['subType'] = undefined;
  /**
   * ID of the credentials. If this is given then you can leave out the 'credentialsUri'
   * @member {Number} credentialId
   */
  exports.prototype['credentialId'] = undefined;


  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "COMPUTE"
     * @const
     */
    "COMPUTE": "COMPUTE",
    /**
     * value: "STORAGE"
     * @const
     */
    "STORAGE": "STORAGE"  };

  /**
   * Allowed values for the <code>subType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.SubTypeEnum = {
    /**
     * value: "EMR"
     * @const
     */
    "EMR": "EMR",
    /**
     * value: "S3"
     * @const
     */
    "S3": "S3",
    /**
     * value: "GoogleStorage"
     * @const
     */
    "GoogleStorage": "GoogleStorage",
    /**
     * value: "DataProc"
     * @const
     */
    "DataProc": "DataProc",
    /**
     * value: "HDInsight"
     * @const
     */
    "HDInsight": "HDInsight",
    /**
     * value: "AzureStorage"
     * @const
     */
    "AzureStorage": "AzureStorage",
    /**
     * value: "HDFS"
     * @const
     */
    "HDFS": "HDFS",
    /**
     * value: "YARN"
     * @const
     */
    "YARN": "YARN"  };


  return exports;
}));


