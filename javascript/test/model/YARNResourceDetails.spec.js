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
    instance = new SkilClient.YARNResourceDetails();
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

  describe('YARNResourceDetails', function() {
    it('should create an instance of YARNResourceDetails', function() {
      // uncomment below and update the code to test YARNResourceDetails
      //var instance = new SkilClient.YARNResourceDetails();
      //expect(instance).to.be.a(SkilClient.YARNResourceDetails);
    });

    it('should have the property _class (base name: "@class")', function() {
      // uncomment below and update the code to test the property _class
      //var instance = new SkilClient.YARNResourceDetails();
      //expect(instance).to.be();
    });

    it('should have the property resourceId (base name: "resourceId")', function() {
      // uncomment below and update the code to test the property resourceId
      //var instance = new SkilClient.YARNResourceDetails();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new SkilClient.YARNResourceDetails();
      //expect(instance).to.be();
    });

    it('should have the property subType (base name: "subType")', function() {
      // uncomment below and update the code to test the property subType
      //var instance = new SkilClient.YARNResourceDetails();
      //expect(instance).to.be();
    });

    it('should have the property localSparkHome (base name: "localSparkHome")', function() {
      // uncomment below and update the code to test the property localSparkHome
      //var instance = new SkilClient.YARNResourceDetails();
      //expect(instance).to.be();
    });

  });

}));
