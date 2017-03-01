# \LocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FindNearbyLocations**](LocationsApi.md#FindNearbyLocations) | **Get** /locations/{location_id}/nearby | Find Nearby Locations
[**RetrieveLocation**](LocationsApi.md#RetrieveLocation) | **Get** /locations/{location_id} | Location
[**RetrieveLocationServices**](LocationsApi.md#RetrieveLocationServices) | **Get** /locations/{location_id}/services | Services
[**RetrieveLocations**](LocationsApi.md#RetrieveLocations) | **Get** /locations | Locations


# **FindNearbyLocations**
> []Location FindNearbyLocations($accept, $locationId, $radius, $page, $perPage)

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **string**|  | 
 **radius** | **string**| Default in miles is 0.5, minimum is 0.1. | [optional] 
 **page** | **string**| The particular page of results. Default is 1. | [optional] 
 **perPage** | **string**| Amount of locations to return per page. | [optional] 

### Return type

[**[]Location**](location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RetrieveLocation**
> []Location RetrieveLocation($accept, $locationId)

Location

Retrieve all of the locations available in this database.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **string**|  | 

### Return type

[**[]Location**](location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RetrieveLocationServices**
> []Service RetrieveLocationServices($accept, $locationId)

Services

Retrieve all services for this location


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **string**|  | 

### Return type

[**[]Service**](service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RetrieveLocations**
> []Location RetrieveLocations($accept, $page, $perPage)

Locations

Retrieve all of the locations available.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
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

