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

type Organization struct {

	// Each organization must have a unique identifier.
	Id string `json:"id,omitempty"`

	// The official or public name of the organization.
	Name string `json:"name,omitempty"`

	// Alternative or commonly used name for the organization.
	AlternateName string `json:"alternate_name,omitempty"`

	// A brief summary about the organization. It can contain markup such as HTML or Markdown.
	Description string `json:"description,omitempty"`

	// The contact e-mail address for the organization.
	Email string `json:"email,omitempty"`

	// The UR of the organization.
	Url string `json:"url,omitempty"`

	// Government assigned tax designation for for tax-exempt organizations.
	TaxStatus string `json:"tax_status,omitempty"`

	// A government issued identifier used for the purpose of tax administration.
	TaxId string `json:"tax_id,omitempty"`

	// The year in which the organization was legally formed.
	YearIncorporated string `json:"year_incorporated,omitempty"`

	// The legal status defines the conditions that an organization is operating under.
	LegalStatus string `json:"legal_status,omitempty"`
}
