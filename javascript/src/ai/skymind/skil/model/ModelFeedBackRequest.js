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
    root.SkilClient.ModelFeedBackRequest = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ModelFeedBackRequest model module.
   * @module ai/skymind/skil/model/ModelFeedBackRequest
   * @version 1.1.2
   */

  /**
   * Constructs a new <code>ModelFeedBackRequest</code>.
   * @alias module:ai/skymind/skil/model/ModelFeedBackRequest
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>ModelFeedBackRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/ModelFeedBackRequest} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/ModelFeedBackRequest} The populated <code>ModelFeedBackRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('batchId')) {
        obj['batchId'] = ApiClient.convertToType(data['batchId'], 'String');
      }
      if (data.hasOwnProperty('guesses')) {
        obj['guesses'] = ApiClient.convertToType(data['guesses'], ['String']);
      }
      if (data.hasOwnProperty('correct')) {
        obj['correct'] = ApiClient.convertToType(data['correct'], ['String']);
      }
    }
    return obj;
  }

  /**
   * The GUID of the minibatch this feedback corresponds to
   * @member {String} batchId
   */
  exports.prototype['batchId'] = undefined;
  /**
   * The guessed label IDs by the model
   * @member {Array.<String>} guesses
   */
  exports.prototype['guesses'] = undefined;
  /**
   * The actual label IDs
   * @member {Array.<String>} correct
   */
  exports.prototype['correct'] = undefined;



  return exports;
}));


