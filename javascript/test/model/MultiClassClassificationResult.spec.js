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
    instance = new SkilClient.MultiClassClassificationResult();
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

  describe('MultiClassClassificationResult', function() {
    it('should create an instance of MultiClassClassificationResult', function() {
      // uncomment below and update the code to test MultiClassClassificationResult
      //var instance = new SkilClient.MultiClassClassificationResult();
      //expect(instance).to.be.a(SkilClient.MultiClassClassificationResult);
    });

    it('should have the property rankedOutcomes (base name: "rankedOutcomes")', function() {
      // uncomment below and update the code to test the property rankedOutcomes
      //var instance = new SkilClient.MultiClassClassificationResult();
      //expect(instance).to.be();
    });

    it('should have the property maxOutcomes (base name: "maxOutcomes")', function() {
      // uncomment below and update the code to test the property maxOutcomes
      //var instance = new SkilClient.MultiClassClassificationResult();
      //expect(instance).to.be();
    });

    it('should have the property probabilities (base name: "probabilities")', function() {
      // uncomment below and update the code to test the property probabilities
      //var instance = new SkilClient.MultiClassClassificationResult();
      //expect(instance).to.be();
    });

  });

}));
