# \SearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchLocations**](SearchApi.md#SearchLocations) | **Get** /search | Search


# **SearchLocations**
> []Location SearchLocations($accept, $category, $email, $keyword, $language, $latLng, $location, $orgName, $radius, $serviceArea, $status, $page, $perPage)

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **category** | **string**|  | [optional] 
 **email** | **string**|  | [optional] 
 **keyword** | **string**|  | [optional] 
 **language** | **string**|  | [optional] 
 **latLng** | **string**|  | [optional] 
 **location** | **string**|  | [optional] 
 **orgName** | **string**|  | [optional] 
 **radius** | **string**|  | [optional] 
 **serviceArea** | **string**|  | [optional] 
 **status** | **string**|  | [optional] 
 **page** | **string**|  | [optional] 
 **perPage** | **string**|  | [optional] 

### Return type

[**[]Location**](location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

