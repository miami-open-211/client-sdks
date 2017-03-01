# SearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchLocations**](SearchApi.md#searchLocations) | **GET** /search | Search


<a name="searchLocations"></a>
# **searchLocations**
> List&lt;Location&gt; searchLocations(accept, category, email, keyword, language, latLng, location, orgName, radius, serviceArea, status, page, perPage)

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&amp;).

### Example
```java
// Import classes:
//import io.swagger.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String category = "category_example"; // String | 
String email = "email_example"; // String | 
String keyword = "keyword_example"; // String | 
String language = "language_example"; // String | 
String latLng = "latLng_example"; // String | 
String location = "location_example"; // String | 
String orgName = "orgName_example"; // String | 
String radius = "radius_example"; // String | 
String serviceArea = "serviceArea_example"; // String | 
String status = "status_example"; // String | 
String page = "page_example"; // String | 
String perPage = "perPage_example"; // String | 
try {
    List<Location> result = apiInstance.searchLocations(accept, category, email, keyword, language, latLng, location, orgName, radius, serviceArea, status, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **category** | **String**|  | [optional]
 **email** | **String**|  | [optional]
 **keyword** | **String**|  | [optional]
 **language** | **String**|  | [optional]
 **latLng** | **String**|  | [optional]
 **location** | **String**|  | [optional]
 **orgName** | **String**|  | [optional]
 **radius** | **String**|  | [optional]
 **serviceArea** | **String**|  | [optional]
 **status** | **String**|  | [optional]
 **page** | **String**|  | [optional]
 **perPage** | **String**|  | [optional]

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

