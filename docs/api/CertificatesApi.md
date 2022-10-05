# CertificatesApi

All URIs are relative to *https://api.ionos.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**certificatesDelete**](CertificatesApi.md#certificatesdelete) | **DELETE** /certificatemanager/certificates/{certificateId} | Delete a Certificate by ID |
| [**certificatesGet**](CertificatesApi.md#certificatesget) | **GET** /certificatemanager/certificates | Get Certificates |
| [**certificatesGetById**](CertificatesApi.md#certificatesgetbyid) | **GET** /certificatemanager/certificates/{certificateId} | Get a Certificate by ID |
| [**certificatesPatch**](CertificatesApi.md#certificatespatch) | **PATCH** /certificatemanager/certificates/{certificateId} | Update a Certificate Name by ID |
| [**certificatesPost**](CertificatesApi.md#certificatespost) | **POST** /certificatemanager/certificates | Add a New Certificate |


<a name="certificatesDelete"></a>
# **certificatesDelete**
> certificatesDelete(certificateId)

Delete a Certificate by ID

Deletes a certificate specified by its ID.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    try {
      apiInstance.certificatesDelete(certificateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#certificatesDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **certificateId** | **String**|  |

### Return type

null (empty response body)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="certificatesGet"></a>
# **certificatesGet**
> CertificateCollectionDto certificatesGet(offset, limit)

Get Certificates

Retrieves all available certificates.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String offset = "offset_example"; // String | 'Limit' and 'Offset' are optional; you can use these filter parameters to retrieve only part of the results obtained by a request.  Offset is the first element (from the complete list of elements) to be included in the response.
    String limit = "limit_example"; // String | 'Limit' and 'Offset' are optional; you can use these filter parameters to retrieve only part of the results of a query.  If both 'Offset' and 'Limit'are specified, the offset lines are skipped before counting the returned limit lines.
    try {
      CertificateCollectionDto result = apiInstance.certificatesGet(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#certificatesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **String**| &#39;Limit&#39; and &#39;Offset&#39; are optional; you can use these filter parameters to retrieve only part of the results obtained by a request.  Offset is the first element (from the complete list of elements) to be included in the response. | [optional]
| **limit** | **String**| &#39;Limit&#39; and &#39;Offset&#39; are optional; you can use these filter parameters to retrieve only part of the results of a query.  If both &#39;Offset&#39; and &#39;Limit&#39;are specified, the offset lines are skipped before counting the returned limit lines. | [optional]

### Return type

[**CertificateCollectionDto**](../models/CertificateCollectionDto.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="certificatesGetById"></a>
# **certificatesGetById**
> CertificateDto certificatesGetById(certificateId)

Get a Certificate by ID

Retrieves a certificate specified by its ID.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    try {
      CertificateDto result = apiInstance.certificatesGetById(certificateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#certificatesGetById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **certificateId** | **String**|  |

### Return type

[**CertificateDto**](../models/CertificateDto.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="certificatesPatch"></a>
# **certificatesPatch**
> CertificateDto certificatesPatch(certificateId, certificatePatchDto)

Update a Certificate Name by ID

Updates the name of the specified certificate.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    String certificateId = "certificateId_example"; // String | 
    CertificatePatchDto certificatePatchDto = new CertificatePatchDto(); // CertificatePatchDto | 
    try {
      CertificateDto result = apiInstance.certificatesPatch(certificateId, certificatePatchDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#certificatesPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **certificateId** | **String**|  |
| **certificatePatchDto** |  [**CertificatePatchDto**](CertificatePatchDto.md)|  |

### Return type

[**CertificateDto**](../models/CertificateDto.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="certificatesPost"></a>
# **certificatesPost**
> CertificateDto certificatesPost(certificatePostDto)

Add a New Certificate

Adds a new PEM (Privacy Enhanced Mail) file that is used to store SSL certificates and their associated private keys.

### Example
```java
// Import classes:
import com.ionoscloud.certmanager.ApiClient;
import com.ionoscloud.certmanager.ApiException;
import com.ionoscloud.certmanager.Configuration;
import com.ionoscloud.certmanager.auth.*;
import com.ionoscloud.certmanager.model.*;
import com.ionoscloud.certmanager.api.CertificatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    CertificatesApi apiInstance = new CertificatesApi(defaultClient);
    CertificatePostDto certificatePostDto = new CertificatePostDto(); // CertificatePostDto | 
    try {
      CertificateDto result = apiInstance.certificatesPost(certificatePostDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CertificatesApi#certificatesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **certificatePostDto** |  [**CertificatePostDto**](CertificatePostDto.md)|  |

### Return type

[**CertificateDto**](../models/CertificateDto.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

