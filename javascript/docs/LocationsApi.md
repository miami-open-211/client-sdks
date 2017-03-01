# MiamiOpen211Api.LocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findNearbyLocations**](LocationsApi.md#findNearbyLocations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
[**retrieveLocation**](LocationsApi.md#retrieveLocation) | **GET** /locations/{location_id} | Location
[**retrieveLocationServices**](LocationsApi.md#retrieveLocationServices) | **GET** /locations/{location_id}/services | Services
[**retrieveLocations**](LocationsApi.md#retrieveLocations) | **GET** /locations | Locations


<a name="findNearbyLocations"></a>
# **findNearbyLocations**
> [Location] findNearbyLocations(accept, locationId, opts)

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.LocationsApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 

var locationId = "locationId_example"; // String | 

var opts = { 
  'radius': "radius_example", // String | Default in miles is 0.5, minimum is 0.1.
  'page': "page_example", // String | The particular page of results. Default is 1.
  'perPage': "perPage_example" // String | Amount of locations to return per page.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findNearbyLocations(accept, locationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **String**|  | 
 **radius** | **String**| Default in miles is 0.5, minimum is 0.1. | [optional] 
 **page** | **String**| The particular page of results. Default is 1. | [optional] 
 **perPage** | **String**| Amount of locations to return per page. | [optional] 

### Return type

[**[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLocation"></a>
# **retrieveLocation**
> [Location] retrieveLocation(accept, locationId)

Location

Retrieve all of the locations available in this database.

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.LocationsApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 

var locationId = "locationId_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveLocation(accept, locationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **String**|  | 

### Return type

[**[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLocationServices"></a>
# **retrieveLocationServices**
> [Service] retrieveLocationServices(accept, locationId)

Services

Retrieve all services for this location

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.LocationsApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 

var locationId = "locationId_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveLocationServices(accept, locationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **String**|  | 

### Return type

[**[Service]**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLocations"></a>
# **retrieveLocations**
> [Location] retrieveLocations(accept, opts)

Locations

Retrieve all of the locations available.

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.LocationsApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 

var opts = { 
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
apiInstance.retrieveLocations(accept, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **String**|  | [optional] 
 **perPage** | **String**|  | [optional] 

### Return type

[**[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

