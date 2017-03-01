# MiamiOpen211Api.CategoriesApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /categories | Categories


<a name="getCategories"></a>
# **getCategories**
> [Categories] getCategories(accept)

Categories

This endpoint retrieves all categories.

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.CategoriesApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCategories(accept, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]

### Return type

[**[Categories]**](Categories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

