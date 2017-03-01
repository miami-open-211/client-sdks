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
    root.MiamiOpen211Api.Location = factory(root.MiamiOpen211Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Location model module.
   * @module model/Location
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Location</code>.
   * @alias module:model/Location
   * @class
   */
  var exports = function() {
    var _this = this;









  };

  /**
   * Constructs a <code>Location</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Location} obj Optional instance to populate.
   * @return {module:model/Location} The populated <code>Location</code> instance.
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
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('alternate_name')) {
        obj['alternate_name'] = ApiClient.convertToType(data['alternate_name'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('transportation')) {
        obj['transportation'] = ApiClient.convertToType(data['transportation'], 'String');
      }
      if (data.hasOwnProperty('latitude')) {
        obj['latitude'] = ApiClient.convertToType(data['latitude'], 'String');
      }
      if (data.hasOwnProperty('longitude')) {
        obj['longitude'] = ApiClient.convertToType(data['longitude'], 'String');
      }
    }
    return obj;
  }

  /**
   * Each location must have a unique identifier
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Each location must belong to a single organization. The identifier of the organization should be given here.
   * @member {String} organization_id
   */
  exports.prototype['organization_id'] = undefined;
  /**
   * The name of the location
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * An alternative name for the location
   * @member {String} alternate_name
   */
  exports.prototype['alternate_name'] = undefined;
  /**
   * A description of this location.
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * A description of the access to public or private transportation to and from the location.
   * @member {String} transportation
   */
  exports.prototype['transportation'] = undefined;
  /**
   * Y coordinate of location expressed in decimal degrees in WGS84 datum.
   * @member {String} latitude
   */
  exports.prototype['latitude'] = undefined;
  /**
   * X coordinate of location expressed in decimal degrees in WGS84 datum.
   * @member {String} longitude
   */
  exports.prototype['longitude'] = undefined;



  return exports;
}));

