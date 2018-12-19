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
    instance = new SkilClient.CreateJobRequest();
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

  describe('CreateJobRequest', function() {
    it('should create an instance of CreateJobRequest', function() {
      // uncomment below and update the code to test CreateJobRequest
      //var instance = new SkilClient.CreateJobRequest();
      //expect(instance).to.be.a(SkilClient.CreateJobRequest);
    });

    it('should have the property computeResourceId (base name: "computeResourceId")', function() {
      // uncomment below and update the code to test the property computeResourceId
      //var instance = new SkilClient.CreateJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property storageResourceId (base name: "storageResourceId")', function() {
      // uncomment below and update the code to test the property storageResourceId
      //var instance = new SkilClient.CreateJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property jobArgs (base name: "jobArgs")', function() {
      // uncomment below and update the code to test the property jobArgs
      //var instance = new SkilClient.CreateJobRequest();
      //expect(instance).to.be();
    });

    it('should have the property outputFileName (base name: "outputFileName")', function() {
      // uncomment below and update the code to test the property outputFileName
      //var instance = new SkilClient.CreateJobRequest();
      //expect(instance).to.be();
    });

  });

}));
