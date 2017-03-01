# MiamiOpen211Api.SearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchLocations**](SearchApi.md#searchLocations) | **GET** /search | Search


<a name="searchLocations"></a>
# **searchLocations**
> [Location] searchLocations(accept, opts)

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&amp;).

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.SearchApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 

var opts = { 
  'category': "category_example", // String | 
  'email': "email_example", // String | 
  'keyword': "keyword_example", // String | 
  'language': "language_example", // String | 
  'latLng': "latLng_example", // String | 
  'location': "location_example", // String | 
  'orgName': "orgName_example", // String | 
  'radius': "radius_example", // String | 
  'serviceArea': "serviceArea_example", // String | 
  'status': "status_example", // String | 
  'page': "page_example", // String | 
  'perPage': "perPage_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.searchLocations(accept, opts, callback);
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

[**[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

