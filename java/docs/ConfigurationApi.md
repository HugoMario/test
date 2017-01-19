# ConfigurationApi

All URIs are relative to *http://localhost/v1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfigurationSchema**](ConfigurationApi.md#getConfigurationSchema) | **GET** /configuration/definition | 
[**getConfigurationValues**](ConfigurationApi.md#getConfigurationValues) | **GET** /configuration | 
[**hasAdminAccount**](ConfigurationApi.md#hasAdminAccount) | **GET** /configuration/hasAdminAccount | 
[**isConfigured**](ConfigurationApi.md#isConfigured) | **GET** /configuration/isConfigured | 
[**setConfiguration**](ConfigurationApi.md#setConfiguration) | **PUT** /configuration | 


<a name="getConfigurationSchema"></a>
# **getConfigurationSchema**
> Object getConfigurationSchema()



returns the configuration schema

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationApi;


ConfigurationApi apiInstance = new ConfigurationApi();
try {
    Object result = apiInstance.getConfigurationSchema();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getConfigurationSchema");
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

<a name="getConfigurationValues"></a>
# **getConfigurationValues**
> ConfigurationResponse getConfigurationValues()



returns the configuration values

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationApi;


ConfigurationApi apiInstance = new ConfigurationApi();
try {
    ConfigurationResponse result = apiInstance.getConfigurationValues();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getConfigurationValues");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="hasAdminAccount"></a>
# **hasAdminAccount**
> ConfigurationState hasAdminAccount()



returns whether or not the system has an admin account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationApi;


ConfigurationApi apiInstance = new ConfigurationApi();
try {
    ConfigurationState result = apiInstance.hasAdminAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#hasAdminAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="isConfigured"></a>
# **isConfigured**
> ConfigurationState isConfigured()



returns whether or not the system is configured

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationApi;


ConfigurationApi apiInstance = new ConfigurationApi();
try {
    ConfigurationState result = apiInstance.isConfigured();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#isConfigured");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigurationState**](ConfigurationState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setConfiguration"></a>
# **setConfiguration**
> ConfigurationResponse setConfiguration(configurationValues)



sets the configuration based on the &#x60;configuration definition&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationApi;


ConfigurationApi apiInstance = new ConfigurationApi();
Object configurationValues = null; // Object | 
try {
    ConfigurationResponse result = apiInstance.setConfiguration(configurationValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#setConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configurationValues** | **Object**|  |

### Return type

[**ConfigurationResponse**](ConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

