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
 * CertificatePostPropertiesDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-05T11:15:43.234Z[Etc/UTC]")

public class CertificatePostPropertiesDto {
  
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;


  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificateChain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  private String certificateChain;


  public static final String SERIALIZED_NAME_PRIVATE_KEY = "privateKey";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  

  public CertificatePostPropertiesDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The certificate name.
   * @return name
  **/
  @ApiModelProperty(example = "My Certificate", required = true, value = "The certificate name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  public CertificatePostPropertiesDto certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * The certificate body.
   * @return certificate
  **/
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE-----MIIE5TCCAs2gAwIBAgIBATANBgkqhkiG9w0BAQsFADA2MQswCQYDVQQGEwJSTzEK-----END CERTIFICATE-----", required = true, value = "The certificate body.")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }



  public CertificatePostPropertiesDto certificateChain(String certificateChain) {
    
    this.certificateChain = certificateChain;
    return this;
  }

   /**
   * The certificate chain.
   * @return certificateChain
  **/
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE-----MIIDoTCCAokCFDrAUWffdxWJVz2Axl9lp/4xiUteMA0GCSqGSIb3DQEBCwUAMIGG-----END CERTIFICATE-----", required = true, value = "The certificate chain.")

  public String getCertificateChain() {
    return certificateChain;
  }


  public void setCertificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
  }



  public CertificatePostPropertiesDto privateKey(String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * The RSA private key is used for authentication and symmetric key exchange when establishing an SSL session. It is a part of the public key infrastructure generally used with SSL certificates.
   * @return privateKey
  **/
  @ApiModelProperty(example = "-----BEGIN RSA PRIVATE KEY-----MIIJKQIBAAKCAgEAzDehfqWBr+9q0pxwCDDRph7QSPiMbkDGaGKc+Fd2h3doT8Li-----END RSA PRIVATE KEY-----", required = true, value = "The RSA private key is used for authentication and symmetric key exchange when establishing an SSL session. It is a part of the public key infrastructure generally used with SSL certificates.")

  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificatePostPropertiesDto certificatePostPropertiesDto = (CertificatePostPropertiesDto) o;
    return Objects.equals(this.name, certificatePostPropertiesDto.name) && Objects.equals(this.certificate, certificatePostPropertiesDto.certificate) && Objects.equals(this.certificateChain, certificatePostPropertiesDto.certificateChain) && Objects.equals(this.privateKey, certificatePostPropertiesDto.privateKey);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificatePostPropertiesDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");

    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");

    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");

    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
