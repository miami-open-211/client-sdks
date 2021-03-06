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
 * Location
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-01T12:42:49.217-08:00")
public class Location   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("organization_id")
  private String organizationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("alternate_name")
  private String alternateName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("transportation")
  private String transportation = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  public Location id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Each location must have a unique identifier
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Each location must have a unique identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Location organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Each location must belong to a single organization. The identifier of the organization should be given here.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "Each location must belong to a single organization. The identifier of the organization should be given here.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public Location name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the location
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the location")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * An alternative name for the location
   * @return alternateName
  **/
  @ApiModelProperty(example = "null", value = "An alternative name for the location")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  public Location description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of this location.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description of this location.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Location transportation(String transportation) {
    this.transportation = transportation;
    return this;
  }

   /**
   * A description of the access to public or private transportation to and from the location.
   * @return transportation
  **/
  @ApiModelProperty(example = "null", value = "A description of the access to public or private transportation to and from the location.")
  public String getTransportation() {
    return transportation;
  }

  public void setTransportation(String transportation) {
    this.transportation = transportation;
  }

  public Location latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Y coordinate of location expressed in decimal degrees in WGS84 datum.
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "Y coordinate of location expressed in decimal degrees in WGS84 datum.")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Location longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * X coordinate of location expressed in decimal degrees in WGS84 datum.
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "X coordinate of location expressed in decimal degrees in WGS84 datum.")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.organizationId, location.organizationId) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.alternateName, location.alternateName) &&
        Objects.equals(this.description, location.description) &&
        Objects.equals(this.transportation, location.transportation) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, name, alternateName, description, transportation, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transportation: ").append(toIndentedString(transportation)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

