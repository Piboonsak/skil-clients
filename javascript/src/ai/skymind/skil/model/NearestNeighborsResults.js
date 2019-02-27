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
    define(['ApiClient', 'ai/skymind/skil/model/NearestNeighborsResult'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./NearestNeighborsResult'));
  } else {
    // Browser globals (root is window)
    if (!root.SkilClient) {
      root.SkilClient = {};
    }
    root.SkilClient.NearestNeighborsResults = factory(root.SkilClient.ApiClient, root.SkilClient.NearestNeighborsResult);
  }
}(this, function(ApiClient, NearestNeighborsResult) {
  'use strict';




  /**
   * The NearestNeighborsResults model module.
   * @module ai/skymind/skil/model/NearestNeighborsResults
   * @version 1.2.1.3
   */

  /**
   * Constructs a new <code>NearestNeighborsResults</code>.
   * @alias module:ai/skymind/skil/model/NearestNeighborsResults
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>NearestNeighborsResults</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/NearestNeighborsResults} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/NearestNeighborsResults} The populated <code>NearestNeighborsResults</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('results')) {
        obj['results'] = ApiClient.convertToType(data['results'], [NearestNeighborsResult]);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:ai/skymind/skil/model/NearestNeighborsResult>} results
   */
  exports.prototype['results'] = undefined;



  return exports;
}));


