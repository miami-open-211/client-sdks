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
 * Organization
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-01T12:42:49.217-08:00")
public class Organization   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("alternate_name")
  private String alternateName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("tax_status")
  private String taxStatus = null;

  @SerializedName("tax_id")
  private String taxId = null;

  @SerializedName("year_incorporated")
  private String yearIncorporated = null;

  @SerializedName("legal_status")
  private String legalStatus = null;

  public Organization id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Each organization must have a unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Each organization must have a unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Organization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The official or public name of the organization.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The official or public name of the organization.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization alternateName(String alternateName) {
    this.alternateName = alternateName;
    return this;
  }

   /**
   * Alternative or commonly used name for the organization.
   * @return alternateName
  **/
  @ApiModelProperty(example = "null", value = "Alternative or commonly used name for the organization.")
  public String getAlternateName() {
    return alternateName;
  }

  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }

  public Organization description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief summary about the organization. It can contain markup such as HTML or Markdown.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A brief summary about the organization. It can contain markup such as HTML or Markdown.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Organization email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The contact e-mail address for the organization.
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "The contact e-mail address for the organization.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Organization url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The UR of the organization.
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The UR of the organization.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Organization taxStatus(String taxStatus) {
    this.taxStatus = taxStatus;
    return this;
  }

   /**
   * Government assigned tax designation for for tax-exempt organizations.
   * @return taxStatus
  **/
  @ApiModelProperty(example = "null", value = "Government assigned tax designation for for tax-exempt organizations.")
  public String getTaxStatus() {
    return taxStatus;
  }

  public void setTaxStatus(String taxStatus) {
    this.taxStatus = taxStatus;
  }

  public Organization taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * A government issued identifier used for the purpose of tax administration.
   * @return taxId
  **/
  @ApiModelProperty(example = "null", value = "A government issued identifier used for the purpose of tax administration.")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public Organization yearIncorporated(String yearIncorporated) {
    this.yearIncorporated = yearIncorporated;
    return this;
  }

   /**
   * The year in which the organization was legally formed.
   * @return yearIncorporated
  **/
  @ApiModelProperty(example = "null", value = "The year in which the organization was legally formed.")
  public String getYearIncorporated() {
    return yearIncorporated;
  }

  public void setYearIncorporated(String yearIncorporated) {
    this.yearIncorporated = yearIncorporated;
  }

  public Organization legalStatus(String legalStatus) {
    this.legalStatus = legalStatus;
    return this;
  }

   /**
   * The legal status defines the conditions that an organization is operating under.
   * @return legalStatus
  **/
  @ApiModelProperty(example = "null", value = "The legal status defines the conditions that an organization is operating under.")
  public String getLegalStatus() {
    return legalStatus;
  }

  public void setLegalStatus(String legalStatus) {
    this.legalStatus = legalStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.alternateName, organization.alternateName) &&
        Objects.equals(this.description, organization.description) &&
        Objects.equals(this.email, organization.email) &&
        Objects.equals(this.url, organization.url) &&
        Objects.equals(this.taxStatus, organization.taxStatus) &&
        Objects.equals(this.taxId, organization.taxId) &&
        Objects.equals(this.yearIncorporated, organization.yearIncorporated) &&
        Objects.equals(this.legalStatus, organization.legalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, alternateName, description, email, url, taxStatus, taxId, yearIncorporated, legalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    taxStatus: ").append(toIndentedString(taxStatus)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    yearIncorporated: ").append(toIndentedString(yearIncorporated)).append("\n");
    sb.append("    legalStatus: ").append(toIndentedString(legalStatus)).append("\n");
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

