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
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Location', 'model/Service'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Location'), require('../model/Service'));
  } else {
    // Browser globals (root is window)
    if (!root.MiamiOpen211Api) {
      root.MiamiOpen211Api = {};
    }
    root.MiamiOpen211Api.LocationsApi = factory(root.MiamiOpen211Api.ApiClient, root.MiamiOpen211Api.Location, root.MiamiOpen211Api.Service);
  }
}(this, function(ApiClient, Location, Service) {
  'use strict';

  /**
   * Locations service.
   * @module api/LocationsApi
   * @version 1.0.0
   */

  /**
   * Constructs a new LocationsApi. 
   * @alias module:api/LocationsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the findNearbyLocations operation.
     * @callback module:api/LocationsApi~findNearbyLocationsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Location>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Find Nearby Locations
     * This endpoint retrieves all locations that are near the specified location.
     * @param {String} accept 
     * @param {String} locationId 
     * @param {Object} opts Optional parameters
     * @param {String} opts.radius Default in miles is 0.5, minimum is 0.1.
     * @param {String} opts.page The particular page of results. Default is 1.
     * @param {String} opts.perPage Amount of locations to return per page.
     * @param {module:api/LocationsApi~findNearbyLocationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Location>}
     */
    this.findNearbyLocations = function(accept, locationId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'accept' is set
      if (accept == undefined || accept == null) {
        throw "Missing the required parameter 'accept' when calling findNearbyLocations";
      }

      // verify the required parameter 'locationId' is set
      if (locationId == undefined || locationId == null) {
        throw "Missing the required parameter 'locationId' when calling findNearbyLocations";
      }


      var pathParams = {
        'location_id': locationId
      };
      var queryParams = {
        'radius': opts['radius'],
        'page': opts['page'],
        'per_page': opts['perPage']
      };
      var headerParams = {
        'Accept': accept
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Location];

      return this.apiClient.callApi(
        '/locations/{location_id}/nearby', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the retrieveLocation operation.
     * @callback module:api/LocationsApi~retrieveLocationCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Location>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Location
     * Retrieve all of the locations available in this database.
     * @param {String} accept 
     * @param {String} locationId 
     * @param {module:api/LocationsApi~retrieveLocationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Location>}
     */
    this.retrieveLocation = function(accept, locationId, callback) {
      var postBody = null;

      // verify the required parameter 'accept' is set
      if (accept == undefined || accept == null) {
        throw "Missing the required parameter 'accept' when calling retrieveLocation";
      }

      // verify the required parameter 'locationId' is set
      if (locationId == undefined || locationId == null) {
        throw "Missing the required parameter 'locationId' when calling retrieveLocation";
      }


      var pathParams = {
        'location_id': locationId
      };
      var queryParams = {
      };
      var headerParams = {
        'Accept': accept
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Location];

      return this.apiClient.callApi(
        '/locations/{location_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the retrieveLocationServices operation.
     * @callback module:api/LocationsApi~retrieveLocationServicesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Service>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Services
     * Retrieve all services for this location
     * @param {String} accept 
     * @param {String} locationId 
     * @param {module:api/LocationsApi~retrieveLocationServicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Service>}
     */
    this.retrieveLocationServices = function(accept, locationId, callback) {
      var postBody = null;

      // verify the required parameter 'accept' is set
      if (accept == undefined || accept == null) {
        throw "Missing the required parameter 'accept' when calling retrieveLocationServices";
      }

      // verify the required parameter 'locationId' is set
      if (locationId == undefined || locationId == null) {
        throw "Missing the required parameter 'locationId' when calling retrieveLocationServices";
      }


      var pathParams = {
        'location_id': locationId
      };
      var queryParams = {
      };
      var headerParams = {
        'Accept': accept
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Service];

      return this.apiClient.callApi(
        '/locations/{location_id}/services', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the retrieveLocations operation.
     * @callback module:api/LocationsApi~retrieveLocationsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Location>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Locations
     * Retrieve all of the locations available.
     * @param {String} accept 
     * @param {Object} opts Optional parameters
     * @param {String} opts.page 
     * @param {String} opts.perPage 
     * @param {module:api/LocationsApi~retrieveLocationsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Location>}
     */
    this.retrieveLocations = function(accept, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'accept' is set
      if (accept == undefined || accept == null) {
        throw "Missing the required parameter 'accept' when calling retrieveLocations";
      }


      var pathParams = {
      };
      var queryParams = {
        'page': opts['page'],
        'per_page': opts['perPage']
      };
      var headerParams = {
        'Accept': accept
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Location];

      return this.apiClient.callApi(
        '/locations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
