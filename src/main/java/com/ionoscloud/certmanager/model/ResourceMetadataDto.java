/*
 * Certificate Manager Service API
 * Using the Certificate Manager Service, you can conveniently provision and manage SSL certificates with IONOS services and your internal connected resources. For the [Application Load Balancer](https://api.ionos.com/docs/cloud/v6/#Application-Load-Balancers-get-datacenters-datacenterId-applicationloadbalancers), you usually need a certificate to encrypt your HTTPS traffic.  The service provides the basic functions of uploading and deleting your certificates for this purpose.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.certmanager.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The metadata of the resource.
 */
@ApiModel(description = "The metadata of the resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T11:15:43.234Z[Etc/UTC]")

public class ResourceMetadataDto {
  
  public static final String SERIALIZED_NAME_ETAG = "etag";
  @SerializedName(SERIALIZED_NAME_ETAG)
  private String etag;


  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private String createdDate;


  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;


  public static final String SERIALIZED_NAME_CREATED_BY_USER_ID = "createdByUserId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_USER_ID)
  private String createdByUserId;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;


  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID = "lastModifiedByUserId";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY_USER_ID)
  private String lastModifiedByUserId;


  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  

   /**
   * The entity tag of the resource, as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11. The entity tag is also added as an &#39;ETag&#39; response header to requests that do not use the &#39;depth&#39; parameter.
   * @return etag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45480eb3fbfc31f1d916c1eaa4abdcc3", value = "The entity tag of the resource, as defined in http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.11. The entity tag is also added as an 'ETag' response header to requests that do not use the 'depth' parameter.")

  public String getEtag() {
    return etag;
  }


  public void setEtag(String etag) {
    this.etag = etag;
  }



   /**
   * The date the resource was created.
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.000Z", value = "The date the resource was created.")

  public String getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }



   /**
   * The user who created the resource.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The user who created the resource.")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }



   /**
   * The ID of the user who created the resource.
   * @return createdByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45480eb3fbfc31f1d916c1eaa4abdcc3", value = "The ID of the user who created the resource.")

  public String getCreatedByUserId() {
    return createdByUserId;
  }


  public void setCreatedByUserId(String createdByUserId) {
    this.createdByUserId = createdByUserId;
  }



   /**
   * The date when the resource was last modified.
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-12-04T14:34:09.000Z", value = "The date when the resource was last modified.")

  public String getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }



   /**
   * The user who last modified the resource.
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "The user who last modified the resource.")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }



   /**
   * The ID of the user who last modified the resource.
   * @return lastModifiedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "63cef532-26fe-4a64-a4e0-de7c8a506c90", value = "The ID of the user who last modified the resource.")

  public String getLastModifiedByUserId() {
    return lastModifiedByUserId;
  }


  public void setLastModifiedByUserId(String lastModifiedByUserId) {
    this.lastModifiedByUserId = lastModifiedByUserId;
  }



  public ResourceMetadataDto state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The resource state.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AVAILABLE", value = "The resource state.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceMetadataDto resourceMetadataDto = (ResourceMetadataDto) o;
    return Objects.equals(this.etag, resourceMetadataDto.etag) && Objects.equals(this.createdDate, resourceMetadataDto.createdDate) && Objects.equals(this.createdBy, resourceMetadataDto.createdBy) && Objects.equals(this.createdByUserId, resourceMetadataDto.createdByUserId) && Objects.equals(this.lastModifiedDate, resourceMetadataDto.lastModifiedDate) && Objects.equals(this.lastModifiedBy, resourceMetadataDto.lastModifiedBy) && Objects.equals(this.lastModifiedByUserId, resourceMetadataDto.lastModifiedByUserId) && Objects.equals(this.state, resourceMetadataDto.state);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceMetadataDto {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");

    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");

    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");

    sb.append("    createdByUserId: ").append(toIndentedString(createdByUserId)).append("\n");

    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");

    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");

    sb.append("    lastModifiedByUserId: ").append(toIndentedString(lastModifiedByUserId)).append("\n");

    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
