# LocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findNearbyLocations**](LocationsApi.md#findNearbyLocations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
[**retrieveLocation**](LocationsApi.md#retrieveLocation) | **GET** /locations/{location_id} | Location
[**retrieveLocationServices**](LocationsApi.md#retrieveLocationServices) | **GET** /locations/{location_id}/services | Services
[**retrieveLocations**](LocationsApi.md#retrieveLocations) | **GET** /locations | Locations


<a name="findNearbyLocations"></a>
# **findNearbyLocations**
> List&lt;Location&gt; findNearbyLocations(accept, locationId, radius, page, perPage)

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String locationId = "locationId_example"; // String | 
String radius = "radius_example"; // String | Default in miles is 0.5, minimum is 0.1.
String page = "page_example"; // String | The particular page of results. Default is 1.
String perPage = "perPage_example"; // String | Amount of locations to return per page.
try {
    List<Location> result = apiInstance.findNearbyLocations(accept, locationId, radius, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#findNearbyLocations");
    e.printStackTrace();
}
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

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLocation"></a>
# **retrieveLocation**
> List&lt;Location&gt; retrieveLocation(accept, locationId)

Location

Retrieve all of the locations available in this database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String locationId = "locationId_example"; // String | 
try {
    List<Location> result = apiInstance.retrieveLocation(accept, locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#retrieveLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **String**|  |

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLocationServices"></a>
# **retrieveLocationServices**
> List&lt;Service&gt; retrieveLocationServices(accept, locationId)

Services

Retrieve all services for this location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String locationId = "locationId_example"; // String | 
try {
    List<Service> result = apiInstance.retrieveLocationServices(accept, locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#retrieveLocationServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **String**|  |

### Return type

[**List&lt;Service&gt;**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLocations"></a>
# **retrieveLocations**
> List&lt;Location&gt; retrieveLocations(accept, page, perPage)

Locations

Retrieve all of the locations available.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String page = "page_example"; // String | 
String perPage = "perPage_example"; // String | 
try {
    List<Location> result = apiInstance.retrieveLocations(accept, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#retrieveLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **String**|  | [optional]
 **perPage** | **String**|  | [optional]

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

