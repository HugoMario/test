# LoginApi

All URIs are relative to *http://localhost/v1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](LoginApi.md#login) | **POST** /login | verify user credentials


<a name="login"></a>
# **login**
> login(body)

verify user credentials



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LoginApi;


LoginApi apiInstance = new LoginApi();
User body = new User(); // User | 
try {
    apiInstance.login(body);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

