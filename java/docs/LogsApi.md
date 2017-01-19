# LogsApi

All URIs are relative to *http://localhost/v1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadLogs**](LogsApi.md#downloadLogs) | **GET** /logs | Downloads logs files


<a name="downloadLogs"></a>
# **downloadLogs**
> String downloadLogs(fromDate, toDate)

Downloads logs files

Download encrypted mongodb logging entries within date range

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogsApi;


LogsApi apiInstance = new LogsApi();
DateTime fromDate = new DateTime(); // DateTime | 
DateTime toDate = new DateTime(); // DateTime | 
try {
    String result = apiInstance.downloadLogs(fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsApi#downloadLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromDate** | **DateTime**|  |
 **toDate** | **DateTime**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

