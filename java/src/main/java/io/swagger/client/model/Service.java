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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Service
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-01T12:42:49.217-08:00")
public class Service   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("organization_id")
  private String organizationId = null;

  @SerializedName("location_id")
  private String locationId = null;

  @SerializedName("program_id")
  private String programId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("alternate_name")
  private String alternateName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("application_process")
  private String applicationProcess = null;

  @SerializedName("wait_time")
  private String waitTime = null;

  @SerializedName("taxonomy_ids")
  private String taxonomyIds = null;

  public Service id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Each service must have a unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Each service must have a unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Service organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The identifier of the organization that provides this service.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the organization that provides this service.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public Service locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The identifier of the location where this service is delivered.
   * @return locationId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the location where this service is delivered.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Service programId(String programId) {
    this.programId = programId;
    return this;
  }

   /**
   * The identifier of the program this service is delivered under.
   * @return programId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the program this service is delivered under.")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public Service name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The official or public name of the service.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The official or public name of the service.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Service alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * Alternative or commonly used name for a service.
   * @return alternateName
  **/
  @ApiModelProperty(example = "null", value = "Alternative or commonly used name for a service.")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  public Service description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the service.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description of the service.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Service url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the service
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "URL of the service")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Service email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address for the service
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Email address for the service")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Service status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the service.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The current status of the service.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Service applicationProcess(String applicationProcess) {
    this.applicationProcess = applicationProcess;
    return this;
  }

   /**
   * The steps needed to access the service.
   * @return applicationProcess
  **/
  @ApiModelProperty(example = "null", value = "The steps needed to access the service.")
  public String getApplicationProcess() {
    return applicationProcess;
  }

  public void setApplicationProcess(String applicationProcess) {
    this.applicationProcess = applicationProcess;
  }

  public Service waitTime(String waitTime) {
    this.waitTime = waitTime;
    return this;
  }

   /**
   * Time a client may expect to wait before receiving a service.
   * @return waitTime
  **/
  @ApiModelProperty(example = "null", value = "Time a client may expect to wait before receiving a service.")
  public String getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(String waitTime) {
    this.waitTime = waitTime;
  }

  public Service taxonomyIds(String taxonomyIds) {
    this.taxonomyIds = taxonomyIds;
    return this;
  }

   /**
   * A comma separated list of identifiers from the taxonomy table. Advanced users may also include composite categories, using * to combine two taxonomy terms.
   * @return taxonomyIds
  **/
  @ApiModelProperty(example = "null", value = "A comma separated list of identifiers from the taxonomy table. Advanced users may also include composite categories, using * to combine two taxonomy terms.")
  public String getTaxonomyIds() {
    return taxonomyIds;
  }

  public void setTaxonomyIds(String taxonomyIds) {
    this.taxonomyIds = taxonomyIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.organizationId, service.organizationId) &&
        Objects.equals(this.locationId, service.locationId) &&
        Objects.equals(this.programId, service.programId) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.alternateName, service.alternateName) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.url, service.url) &&
        Objects.equals(this.email, service.email) &&
        Objects.equals(this.status, service.status) &&
        Objects.equals(this.applicationProcess, service.applicationProcess) &&
        Objects.equals(this.waitTime, service.waitTime) &&
        Objects.equals(this.taxonomyIds, service.taxonomyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, locationId, programId, name, alternateName, description, url, email, status, applicationProcess, waitTime, taxonomyIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    applicationProcess: ").append(toIndentedString(applicationProcess)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    taxonomyIds: ").append(toIndentedString(taxonomyIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
