/* 
 * Miami Open 211 API
 *
 * This is a developer area for the Miami Open211 API, providing access to the raw data behind the Switchboard of Miami website. The purpose of this API is to allow anyone to develop web, mobile, or other types of applications that serve the mission of Miami Open211.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package swagger

type Location struct {

	// Each location must have a unique identifier
	Id string `json:"id,omitempty"`

	// Each location must belong to a single organization. The identifier of the organization should be given here.
	OrganizationId string `json:"organization_id,omitempty"`

	// The name of the location
	Name string `json:"name,omitempty"`

	// An alternative name for the location
	AlternateName string `json:"alternate_name,omitempty"`

	// A description of this location.
	Description string `json:"description,omitempty"`

	// A description of the access to public or private transportation to and from the location.
	Transportation string `json:"transportation,omitempty"`

	// Y coordinate of location expressed in decimal degrees in WGS84 datum.
	Latitude string `json:"latitude,omitempty"`

	// X coordinate of location expressed in decimal degrees in WGS84 datum.
	Longitude string `json:"longitude,omitempty"`
}
