/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
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
    root.SkilClient.DetectedObject = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The DetectedObject model module.
   * @module ai/skymind/skil/model/DetectedObject
   * @version 1.2.1.4
   */

  /**
   * Constructs a new <code>DetectedObject</code>.
   * @alias module:ai/skymind/skil/model/DetectedObject
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>DetectedObject</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/DetectedObject} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/DetectedObject} The populated <code>DetectedObject</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('centerX')) {
        obj['centerX'] = ApiClient.convertToType(data['centerX'], 'Number');
      }
      if (data.hasOwnProperty('centerY')) {
        obj['centerY'] = ApiClient.convertToType(data['centerY'], 'Number');
      }
      if (data.hasOwnProperty('width')) {
        obj['width'] = ApiClient.convertToType(data['width'], 'Number');
      }
      if (data.hasOwnProperty('height')) {
        obj['height'] = ApiClient.convertToType(data['height'], 'Number');
      }
      if (data.hasOwnProperty('predictedClasses')) {
        obj['predictedClasses'] = ApiClient.convertToType(data['predictedClasses'], ['String']);
      }
      if (data.hasOwnProperty('confidences')) {
        obj['confidences'] = ApiClient.convertToType(data['confidences'], ['Number']);
      }
    }
    return obj;
  }

  /**
   * @member {Number} centerX
   */
  exports.prototype['centerX'] = undefined;
  /**
   * @member {Number} centerY
   */
  exports.prototype['centerY'] = undefined;
  /**
   * @member {Number} width
   */
  exports.prototype['width'] = undefined;
  /**
   * @member {Number} height
   */
  exports.prototype['height'] = undefined;
  /**
   * @member {Array.<String>} predictedClasses
   */
  exports.prototype['predictedClasses'] = undefined;
  /**
   * @member {Array.<Number>} confidences
   */
  exports.prototype['confidences'] = undefined;



  return exports;
}));


