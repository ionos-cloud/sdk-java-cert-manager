# InformationApi

All URIs are relative to *https://api.ionos.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getInfo**](InformationApi.md#getinfo) | **GET** /certificatemanager | Get the Service API Information |
| [**getJsonOpenApiSpec**](InformationApi.md#getjsonopenapispec) | **GET** /certificatemanager/openapi.json | Get the Open API Documentation JSON |
| [**getYamlOpenApiSpec**](InformationApi.md#getyamlopenapispec) | **GET** /certificatemanager/openapi.yaml | Get the Open API Documentation YAML |


<a name="getInfo"></a>
# **getInfo**
> ApiInfoDto getInfo()

Get the Service API Information

Retrieves the service API information.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.InformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    InformationApi apiInstance = new InformationApi(defaultClient);
    try {
      ApiInfoDto result = apiInstance.getInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiInfoDto**](../models/ApiInfoDto.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getJsonOpenApiSpec"></a>
# **getJsonOpenApiSpec**
> File getJsonOpenApiSpec()

Get the Open API Documentation JSON

Displays the Open API documentation in the JSON format.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.InformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    InformationApi apiInstance = new InformationApi(defaultClient);
    try {
      File result = apiInstance.getJsonOpenApiSpec();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getJsonOpenApiSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](../models/File.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getYamlOpenApiSpec"></a>
# **getYamlOpenApiSpec**
> File getYamlOpenApiSpec()

Get the Open API Documentation YAML

Displays the Open API documentation in the YAML format.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.InformationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    InformationApi apiInstance = new InformationApi(defaultClient);
    try {
      File result = apiInstance.getYamlOpenApiSpec();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getYamlOpenApiSpec");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](../models/File.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/yaml

