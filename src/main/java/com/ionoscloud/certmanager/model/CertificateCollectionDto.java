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
import com.ionoscloud.certmanager.model.CertificateCollectionDtoLinks;
import com.ionoscloud.certmanager.model.CertificateDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of certificates.
 */
@ApiModel(description = "A collection of certificates.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T11:15:43.234Z[Etc/UTC]")

public class CertificateCollectionDto {
  
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;


  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CertificateDto> items = null;


  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;


  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;


  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private CertificateCollectionDtoLinks links;

  

   /**
   * The resource ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Certificates", value = "The resource ID.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }



   /**
   * The resource type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "collection", value = "The resource type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



   /**
   * The URL to the object representation (absolute path).
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.ionos.com/certificatemanager/certificates", value = "The URL to the object representation (absolute path).")

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }



   /**
   * The list of certificates.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of certificates.")

  public List<CertificateDto> getItems() {
    return items;
  }


  public void setItems(List<CertificateDto> items) {
    this.items = items;
  }



   /**
   * The pagination offset.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "The pagination offset.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }



   /**
   * The pagination limit.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The pagination limit.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }



  public CertificateCollectionDto links(CertificateCollectionDtoLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CertificateCollectionDtoLinks getLinks() {
    return links;
  }


  public void setLinks(CertificateCollectionDtoLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateCollectionDto certificateCollectionDto = (CertificateCollectionDto) o;
    return Objects.equals(this.id, certificateCollectionDto.id) && Objects.equals(this.type, certificateCollectionDto.type) && Objects.equals(this.href, certificateCollectionDto.href) && Objects.equals(this.items, certificateCollectionDto.items) && Objects.equals(this.offset, certificateCollectionDto.offset) && Objects.equals(this.limit, certificateCollectionDto.limit) && Objects.equals(this.links, certificateCollectionDto.links);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateCollectionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");

    sb.append("    href: ").append(toIndentedString(href)).append("\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");

    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");

    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");

    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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