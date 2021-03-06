/**
 * Miami Open 211 API
 * This is a developer area for the Miami Open211 API, providing access to the raw data behind the Switchboard of Miami website. The purpose of this API is to allow anyone to develop web, mobile, or other types of applications that serve the mission of Miami Open211.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
    factory(root.expect, root.MiamiOpen211Api);
  }
}(this, function(expect, MiamiOpen211Api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new MiamiOpen211Api.Service();
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

  describe('Service', function() {
    it('should create an instance of Service', function() {
      // uncomment below and update the code to test Service
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be.a(MiamiOpen211Api.Service);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property organizationId (base name: "organization_id")', function() {
      // uncomment below and update the code to test the property organizationId
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property locationId (base name: "location_id")', function() {
      // uncomment below and update the code to test the property locationId
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property programId (base name: "program_id")', function() {
      // uncomment below and update the code to test the property programId
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property alternateName (base name: "alternate_name")', function() {
      // uncomment below and update the code to test the property alternateName
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property applicationProcess (base name: "application_process")', function() {
      // uncomment below and update the code to test the property applicationProcess
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property waitTime (base name: "wait_time")', function() {
      // uncomment below and update the code to test the property waitTime
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

    it('should have the property taxonomyIds (base name: "taxonomy_ids")', function() {
      // uncomment below and update the code to test the property taxonomyIds
      //var instane = new MiamiOpen211Api.Service();
      //expect(instance).to.be();
    });

  });

}));
