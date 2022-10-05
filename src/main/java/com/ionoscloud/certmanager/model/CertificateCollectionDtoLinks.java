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
 * CertificateCollectionDtoLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T11:15:43.234Z[Etc/UTC]")

public class CertificateCollectionDtoLinks {
  
  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private String prev;


  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;


  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  

  public CertificateCollectionDtoLinks prev(String prev) {
    
    this.prev = prev;
    return this;
  }

   /**
   * The previous page.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.ionos.com/certificatemanager/certificates?offset=50&limit=10", value = "The previous page.")

  public String getPrev() {
    return prev;
  }


  public void setPrev(String prev) {
    this.prev = prev;
  }



  public CertificateCollectionDtoLinks self(String self) {
    
    this.self = self;
    return this;
  }

   /**
   * The current page.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.ionos.com/certificatemanager/certificates?offset=60&limit=10", value = "The current page.")

  public String getSelf() {
    return self;
  }


  public void setSelf(String self) {
    this.self = self;
  }



  public CertificateCollectionDtoLinks next(String next) {
    
    this.next = next;
    return this;
  }

   /**
   * The next page.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.ionos.com/certificatemanager/certificates?offset=70&limit=10", value = "The next page.")

  public String getNext() {
    return next;
  }


  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateCollectionDtoLinks certificateCollectionDtoLinks = (CertificateCollectionDtoLinks) o;
    return Objects.equals(this.prev, certificateCollectionDtoLinks.prev) && Objects.equals(this.self, certificateCollectionDtoLinks.self) && Objects.equals(this.next, certificateCollectionDtoLinks.next);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateCollectionDtoLinks {\n");
    
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");

    sb.append("    self: ").append(toIndentedString(self)).append("\n");

    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
