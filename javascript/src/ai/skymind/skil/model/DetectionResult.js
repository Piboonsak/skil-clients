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
    define(['ApiClient', 'ai/skymind/skil/model/DetectedObject'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DetectedObject'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.DetectionResult = factory(root.SkilClient.ApiClient, root.SkilClient.DetectedObject);
  }
}(this, function(ApiClient, DetectedObject) {
  'use strict';




  /**
   * The DetectionResult model module.
   * @module ai/skymind/skil/model/DetectionResult
   * @version 1.1.2
   */

  /**
   * Constructs a new <code>DetectionResult</code>.
   * @alias module:ai/skymind/skil/model/DetectionResult
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>DetectionResult</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/DetectionResult} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/DetectionResult} The populated <code>DetectionResult</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('objects')) {
        obj['objects'] = ApiClient.convertToType(data['objects'], [DetectedObject]);
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Array.<module:ai/skymind/skil/model/DetectedObject>} objects
   */
  exports.prototype['objects'] = undefined;



  return exports;
}));


