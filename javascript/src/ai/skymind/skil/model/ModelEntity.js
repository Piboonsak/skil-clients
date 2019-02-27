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
    root.SkilClient.ModelEntity = factory(root.SkilClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ModelEntity model module.
   * @module ai/skymind/skil/model/ModelEntity
   * @version 1.2.1.3
   */

  /**
   * Constructs a new <code>ModelEntity</code>.
   * @alias module:ai/skymind/skil/model/ModelEntity
   * @class
   */
  var exports = function() {
    var _this = this;
















  };

  /**
   * Constructs a <code>ModelEntity</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:ai/skymind/skil/model/ModelEntity} obj Optional instance to populate.
   * @return {module:ai/skymind/skil/model/ModelEntity} The populated <code>ModelEntity</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Number');
      }
      if (data.hasOwnProperty('updated')) {
        obj['updated'] = ApiClient.convertToType(data['updated'], 'Number');
      }
      if (data.hasOwnProperty('modelType')) {
        obj['modelType'] = ApiClient.convertToType(data['modelType'], 'String');
      }
      if (data.hasOwnProperty('deploymentId')) {
        obj['deploymentId'] = ApiClient.convertToType(data['deploymentId'], 'Number');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('scale')) {
        obj['scale'] = ApiClient.convertToType(data['scale'], 'Number');
      }
      if (data.hasOwnProperty('fileLocation')) {
        obj['fileLocation'] = ApiClient.convertToType(data['fileLocation'], 'String');
      }
      if (data.hasOwnProperty('state')) {
        obj['state'] = ApiClient.convertToType(data['state'], 'String');
      }
      if (data.hasOwnProperty('jvmArgs')) {
        obj['jvmArgs'] = ApiClient.convertToType(data['jvmArgs'], 'String');
      }
      if (data.hasOwnProperty('subType')) {
        obj['subType'] = ApiClient.convertToType(data['subType'], 'String');
      }
      if (data.hasOwnProperty('labelsFileLocation')) {
        obj['labelsFileLocation'] = ApiClient.convertToType(data['labelsFileLocation'], 'String');
      }
      if (data.hasOwnProperty('extraArgs')) {
        obj['extraArgs'] = ApiClient.convertToType(data['extraArgs'], 'String');
      }
      if (data.hasOwnProperty('launchPolicy')) {
        obj['launchPolicy'] = ApiClient.convertToType(data['launchPolicy'], Object);
      }
      if (data.hasOwnProperty('modelState')) {
        obj['modelState'] = ApiClient.convertToType(data['modelState'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Number} created
   */
  exports.prototype['created'] = undefined;
  /**
   * @member {Number} updated
   */
  exports.prototype['updated'] = undefined;
  /**
   * @member {module:ai/skymind/skil/model/ModelEntity.ModelTypeEnum} modelType
   */
  exports.prototype['modelType'] = undefined;
  /**
   * @member {Number} deploymentId
   */
  exports.prototype['deploymentId'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {Number} scale
   */
  exports.prototype['scale'] = undefined;
  /**
   * @member {String} fileLocation
   */
  exports.prototype['fileLocation'] = undefined;
  /**
   * @member {module:ai/skymind/skil/model/ModelEntity.StateEnum} state
   */
  exports.prototype['state'] = undefined;
  /**
   * @member {String} jvmArgs
   */
  exports.prototype['jvmArgs'] = undefined;
  /**
   * @member {String} subType
   */
  exports.prototype['subType'] = undefined;
  /**
   * @member {String} labelsFileLocation
   */
  exports.prototype['labelsFileLocation'] = undefined;
  /**
   * @member {String} extraArgs
   */
  exports.prototype['extraArgs'] = undefined;
  /**
   * @member {Object} launchPolicy
   */
  exports.prototype['launchPolicy'] = undefined;
  /**
   * @member {module:ai/skymind/skil/model/ModelEntity.ModelStateEnum} modelState
   */
  exports.prototype['modelState'] = undefined;


  /**
   * Allowed values for the <code>modelType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ModelTypeEnum = {
    /**
     * value: "transform"
     * @const
     */
    "transform": "transform",
    /**
     * value: "model"
     * @const
     */
    "model": "model",
    /**
     * value: "knn"
     * @const
     */
    "knn": "knn"  };

  /**
   * Allowed values for the <code>state</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StateEnum = {
    /**
     * value: "created"
     * @const
     */
    "created": "created",
    /**
     * value: "starting"
     * @const
     */
    "starting": "starting",
    /**
     * value: "started"
     * @const
     */
    "started": "started",
    /**
     * value: "stopping"
     * @const
     */
    "stopping": "stopping",
    /**
     * value: "stopped"
     * @const
     */
    "stopped": "stopped",
    /**
     * value: "unhealthy"
     * @const
     */
    "unhealthy": "unhealthy",
    /**
     * value: "failed"
     * @const
     */
    "failed": "failed"  };

  /**
   * Allowed values for the <code>modelState</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ModelStateEnum = {
    /**
     * value: "CREATED"
     * @const
     */
    "CREATED": "CREATED",
    /**
     * value: "STARTING"
     * @const
     */
    "STARTING": "STARTING",
    /**
     * value: "STARTED"
     * @const
     */
    "STARTED": "STARTED",
    /**
     * value: "STOPPING"
     * @const
     */
    "STOPPING": "STOPPING",
    /**
     * value: "STOPPED"
     * @const
     */
    "STOPPED": "STOPPED",
    /**
     * value: "UNHEALTHY"
     * @const
     */
    "UNHEALTHY": "UNHEALTHY",
    /**
     * value: "FAILED"
     * @const
     */
    "FAILED": "FAILED"  };


  return exports;
}));


