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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.MiamiOpen211Api) {
      root.MiamiOpen211Api = {};
    }
    root.MiamiOpen211Api.Service = factory(root.MiamiOpen211Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Service model module.
   * @module model/Service
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Service</code>.
   * @alias module:model/Service
   * @class
   */
  var exports = function() {
    var _this = this;














  };

  /**
   * Constructs a <code>Service</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Service} obj Optional instance to populate.
   * @return {module:model/Service} The populated <code>Service</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('organization_id')) {
        obj['organization_id'] = ApiClient.convertToType(data['organization_id'], 'String');
      }
      if (data.hasOwnProperty('location_id')) {
        obj['location_id'] = ApiClient.convertToType(data['location_id'], 'String');
      }
      if (data.hasOwnProperty('program_id')) {
        obj['program_id'] = ApiClient.convertToType(data['program_id'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('alternate_name')) {
        obj['alternate_name'] = ApiClient.convertToType(data['alternate_name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('url')) {
        obj['url'] = ApiClient.convertToType(data['url'], 'String');
      }
      if (data.hasOwnProperty('email')) {
        obj['email'] = ApiClient.convertToType(data['email'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('application_process')) {
        obj['application_process'] = ApiClient.convertToType(data['application_process'], 'String');
      }
      if (data.hasOwnProperty('wait_time')) {
        obj['wait_time'] = ApiClient.convertToType(data['wait_time'], 'String');
      }
      if (data.hasOwnProperty('taxonomy_ids')) {
        obj['taxonomy_ids'] = ApiClient.convertToType(data['taxonomy_ids'], 'String');
      }
    }
    return obj;
  }

  /**
   * Each service must have a unique identifier.
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * The identifier of the organization that provides this service.
   * @member {String} organization_id
   */
  exports.prototype['organization_id'] = undefined;
  /**
   * The identifier of the location where this service is delivered.
   * @member {String} location_id
   */
  exports.prototype['location_id'] = undefined;
  /**
   * The identifier of the program this service is delivered under.
   * @member {String} program_id
   */
  exports.prototype['program_id'] = undefined;
  /**
   * The official or public name of the service.
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Alternative or commonly used name for a service.
   * @member {String} alternate_name
   */
  exports.prototype['alternate_name'] = undefined;
  /**
   * A description of the service.
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * URL of the service
   * @member {String} url
   */
  exports.prototype['url'] = undefined;
  /**
   * Email address for the service
   * @member {String} email
   */
  exports.prototype['email'] = undefined;
  /**
   * The current status of the service.
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * The steps needed to access the service.
   * @member {String} application_process
   */
  exports.prototype['application_process'] = undefined;
  /**
   * Time a client may expect to wait before receiving a service.
   * @member {String} wait_time
   */
  exports.prototype['wait_time'] = undefined;
  /**
   * A comma separated list of identifiers from the taxonomy table. Advanced users may also include composite categories, using * to combine two taxonomy terms.
   * @member {String} taxonomy_ids
   */
  exports.prototype['taxonomy_ids'] = undefined;



  return exports;
}));


