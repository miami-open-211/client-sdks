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


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Service  {
  
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

  /**
   * Each service must have a unique identifier.
   **/
  @ApiModelProperty(value = "Each service must have a unique identifier.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The identifier of the organization that provides this service.
   **/
  @ApiModelProperty(value = "The identifier of the organization that provides this service.")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * The identifier of the location where this service is delivered.
   **/
  @ApiModelProperty(value = "The identifier of the location where this service is delivered.")
  public String getLocationId() {
    return locationId;
  }
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The identifier of the program this service is delivered under.
   **/
  @ApiModelProperty(value = "The identifier of the program this service is delivered under.")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }

  /**
   * The official or public name of the service.
   **/
  @ApiModelProperty(value = "The official or public name of the service.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Alternative or commonly used name for a service.
   **/
  @ApiModelProperty(value = "Alternative or commonly used name for a service.")
  public String getAlternateName() {
    return alternateName;
  }
  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  /**
   * A description of the service.
   **/
  @ApiModelProperty(value = "A description of the service.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * URL of the service
   **/
  @ApiModelProperty(value = "URL of the service")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Email address for the service
   **/
  @ApiModelProperty(value = "Email address for the service")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The current status of the service.
   **/
  @ApiModelProperty(value = "The current status of the service.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The steps needed to access the service.
   **/
  @ApiModelProperty(value = "The steps needed to access the service.")
  public String getApplicationProcess() {
    return applicationProcess;
  }
  public void setApplicationProcess(String applicationProcess) {
    this.applicationProcess = applicationProcess;
  }

  /**
   * Time a client may expect to wait before receiving a service.
   **/
  @ApiModelProperty(value = "Time a client may expect to wait before receiving a service.")
  public String getWaitTime() {
    return waitTime;
  }
  public void setWaitTime(String waitTime) {
    this.waitTime = waitTime;
  }

  /**
   * A comma separated list of identifiers from the taxonomy table. Advanced users may also include composite categories, using * to combine two taxonomy terms.
   **/
  @ApiModelProperty(value = "A comma separated list of identifiers from the taxonomy table. Advanced users may also include composite categories, using * to combine two taxonomy terms.")
  public String getTaxonomyIds() {
    return taxonomyIds;
  }
  public void setTaxonomyIds(String taxonomyIds) {
    this.taxonomyIds = taxonomyIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return (id == null ? service.id == null : id.equals(service.id)) &&
        (organizationId == null ? service.organizationId == null : organizationId.equals(service.organizationId)) &&
        (locationId == null ? service.locationId == null : locationId.equals(service.locationId)) &&
        (programId == null ? service.programId == null : programId.equals(service.programId)) &&
        (name == null ? service.name == null : name.equals(service.name)) &&
        (alternateName == null ? service.alternateName == null : alternateName.equals(service.alternateName)) &&
        (description == null ? service.description == null : description.equals(service.description)) &&
        (url == null ? service.url == null : url.equals(service.url)) &&
        (email == null ? service.email == null : email.equals(service.email)) &&
        (status == null ? service.status == null : status.equals(service.status)) &&
        (applicationProcess == null ? service.applicationProcess == null : applicationProcess.equals(service.applicationProcess)) &&
        (waitTime == null ? service.waitTime == null : waitTime.equals(service.waitTime)) &&
        (taxonomyIds == null ? service.taxonomyIds == null : taxonomyIds.equals(service.taxonomyIds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (organizationId == null ? 0: organizationId.hashCode());
    result = 31 * result + (locationId == null ? 0: locationId.hashCode());
    result = 31 * result + (programId == null ? 0: programId.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (alternateName == null ? 0: alternateName.hashCode());
    result = 31 * result + (description == null ? 0: description.hashCode());
    result = 31 * result + (url == null ? 0: url.hashCode());
    result = 31 * result + (email == null ? 0: email.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (applicationProcess == null ? 0: applicationProcess.hashCode());
    result = 31 * result + (waitTime == null ? 0: waitTime.hashCode());
    result = 31 * result + (taxonomyIds == null ? 0: taxonomyIds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  organizationId: ").append(organizationId).append("\n");
    sb.append("  locationId: ").append(locationId).append("\n");
    sb.append("  programId: ").append(programId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  alternateName: ").append(alternateName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  applicationProcess: ").append(applicationProcess).append("\n");
    sb.append("  waitTime: ").append(waitTime).append("\n");
    sb.append("  taxonomyIds: ").append(taxonomyIds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
