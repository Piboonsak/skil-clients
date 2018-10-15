/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SkilClient);
  }
}(this, function(expect, SkilClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SkilClient.ModelHistoryEntity();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ModelHistoryEntity', function() {
    it('should create an instance of ModelHistoryEntity', function() {
      // uncomment below and update the code to test ModelHistoryEntity
      //var instance = new SkilClient.ModelHistoryEntity();
      //expect(instance).to.be.a(SkilClient.ModelHistoryEntity);
    });

    it('should have the property created (base name: "created")', function() {
      // uncomment below and update the code to test the property created
      //var instance = new SkilClient.ModelHistoryEntity();
      //expect(instance).to.be();
    });

    it('should have the property modelHistoryId (base name: "modelHistoryId")', function() {
      // uncomment below and update the code to test the property modelHistoryId
      //var instance = new SkilClient.ModelHistoryEntity();
      //expect(instance).to.be();
    });

    it('should have the property modelName (base name: "modelName")', function() {
      // uncomment below and update the code to test the property modelName
      //var instance = new SkilClient.ModelHistoryEntity();
      //expect(instance).to.be();
    });

    it('should have the property modelLabels (base name: "modelLabels")', function() {
      // uncomment below and update the code to test the property modelLabels
      //var instance = new SkilClient.ModelHistoryEntity();
      //expect(instance).to.be();
    });

  });

}));
