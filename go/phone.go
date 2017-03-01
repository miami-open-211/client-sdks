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

type Phone struct {

	// Each entry must have a unique identifier
	Id string `json:"id,omitempty"`

	// The identifier of the location where this phone number is located
	LocationId string `json:"location_id,omitempty"`

	// The identifier of the service for which this is the phone number
	ServiceId string `json:"service_id,omitempty"`

	// The identifier of the organisation for which this is the phone number
	OrganizationId string `json:"organization_id,omitempty"`

	// The identifier of the contact for which this is the phone number
	ContactId string `json:"contact_id,omitempty"`

	// The phone number
	Number string `json:"number,omitempty"`

	// The extension of the phone number
	Extension string `json:"extension,omitempty"`

	// Whether the phone number relates to a fixed or cellular phone
	Type_ string `json:"type,omitempty"`

	// The department for which this is the phone number
	Department string `json:"department,omitempty"`
}
