# CategoriesApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /categories | Categories


<a name="getCategories"></a>
# **getCategories**
> List&lt;Categories&gt; getCategories(accept)

Categories

This endpoint retrieves all categories.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CategoriesApi;


CategoriesApi apiInstance = new CategoriesApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
try {
    List<Categories> result = apiInstance.getCategories(accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]

### Return type

[**List&lt;Categories&gt;**](Categories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

