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
import com.ionoscloud.certmanager.model.CertificatePatchPropertiesDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Used to patch a certificate&#39;s name.
 */
@ApiModel(description = "Used to patch a certificate's name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T11:15:43.234Z[Etc/UTC]")

public class CertificatePatchDto {
  
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private CertificatePatchPropertiesDto properties;

  

  public CertificatePatchDto properties(CertificatePatchPropertiesDto properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(required = true, value = "")

  public CertificatePatchPropertiesDto getProperties() {
    return properties;
  }


  public void setProperties(CertificatePatchPropertiesDto properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificatePatchDto certificatePatchDto = (CertificatePatchDto) o;
    return Objects.equals(this.properties, certificatePatchDto.properties);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificatePatchDto {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
