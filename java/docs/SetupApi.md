# SetupApi

All URIs are relative to *http://localhost/v1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkSystemRequirements**](SetupApi.md#checkSystemRequirements) | **GET** /systemRequirements | 
[**getInstallationState**](SetupApi.md#getInstallationState) | **GET** /installationState | Returns the overall status of mandatory installation steps.


<a name="checkSystemRequirements"></a>
# **checkSystemRequirements**
> SystemRequirementsCheckResult checkSystemRequirements()



Verifies the system requirements

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SetupApi;


SetupApi apiInstance = new SetupApi();
try {
    SystemRequirementsCheckResult result = apiInstance.checkSystemRequirements();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SetupApi#checkSystemRequirements");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemRequirementsCheckResult**](SystemRequirementsCheckResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getInstallationState"></a>
# **getInstallationState**
> InstallationStatus getInstallationState()

Returns the overall status of mandatory installation steps.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SetupApi;


SetupApi apiInstance = new SetupApi();
try {
    InstallationStatus result = apiInstance.getInstallationState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SetupApi#getInstallationState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallationStatus**](InstallationStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

