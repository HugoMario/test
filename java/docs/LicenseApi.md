# LicenseApi

All URIs are relative to *http://localhost/v1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateLicense**](LicenseApi.md#activateLicense) | **POST** /license/activate | 
[**activationCode**](LicenseApi.md#activationCode) | **PUT** /license/activate | 
[**getActivationConfiguration**](LicenseApi.md#getActivationConfiguration) | **GET** /license/activate | 
[**isLicensed**](LicenseApi.md#isLicensed) | **POST** /license/state | 
[**uploadLicense**](LicenseApi.md#uploadLicense) | **POST** /license | 


<a name="activateLicense"></a>
# **activateLicense**
> ActivationResponse activateLicense(offlineActivation)



performs the license activation (online or offline)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LicenseApi;


LicenseApi apiInstance = new LicenseApi();
ActivationRequest offlineActivation = new ActivationRequest(); // ActivationRequest | activates, for non-internet connected networks
try {
    ActivationResponse result = apiInstance.activateLicense(offlineActivation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#activateLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offlineActivation** | [**ActivationRequest**](ActivationRequest.md)| activates, for non-internet connected networks |

### Return type

[**ActivationResponse**](ActivationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="activationCode"></a>
# **activationCode**
> activationCode(offlineActivationFile)



provide the third activation code in case of an offline activation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LicenseApi;


LicenseApi apiInstance = new LicenseApi();
File offlineActivationFile = new File("/path/to/file.txt"); // File | 
try {
    apiInstance.activationCode(offlineActivationFile);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#activationCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offlineActivationFile** | **File**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="getActivationConfiguration"></a>
# **getActivationConfiguration**
> Object getActivationConfiguration()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LicenseApi;


LicenseApi apiInstance = new LicenseApi();
try {
    Object result = apiInstance.getActivationConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getActivationConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="isLicensed"></a>
# **isLicensed**
> LicenseState isLicensed()



returns true if the server is licensed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LicenseApi;


LicenseApi apiInstance = new LicenseApi();
try {
    LicenseState result = apiInstance.isLicensed();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#isLicensed");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseState**](LicenseState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadLicense"></a>
# **uploadLicense**
> LicenseState uploadLicense(licenseFile)



adds a license to the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LicenseApi;


LicenseApi apiInstance = new LicenseApi();
File licenseFile = new File("/path/to/file.txt"); // File | the license file to apply
try {
    LicenseState result = apiInstance.uploadLicense(licenseFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#uploadLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseFile** | **File**| the license file to apply |

### Return type

[**LicenseState**](LicenseState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

