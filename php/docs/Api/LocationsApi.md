# Swagger\Client\LocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findNearbyLocations**](LocationsApi.md#findNearbyLocations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
[**retrieveLocation**](LocationsApi.md#retrieveLocation) | **GET** /locations/{location_id} | Location
[**retrieveLocationServices**](LocationsApi.md#retrieveLocationServices) | **GET** /locations/{location_id}/services | Services
[**retrieveLocations**](LocationsApi.md#retrieveLocations) | **GET** /locations | Locations


# **findNearbyLocations**
> \Swagger\Client\Model\Location[] findNearbyLocations($accept, $location_id, $radius, $page, $per_page)

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LocationsApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$location_id = "location_id_example"; // string | 
$radius = "radius_example"; // string | Default in miles is 0.5, minimum is 0.1.
$page = "page_example"; // string | The particular page of results. Default is 1.
$per_page = "per_page_example"; // string | Amount of locations to return per page.

try {
    $result = $api_instance->findNearbyLocations($accept, $location_id, $radius, $page, $per_page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocationsApi->findNearbyLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **string**|  |
 **radius** | **string**| Default in miles is 0.5, minimum is 0.1. | [optional]
 **page** | **string**| The particular page of results. Default is 1. | [optional]
 **per_page** | **string**| Amount of locations to return per page. | [optional]

### Return type

[**\Swagger\Client\Model\Location[]**](../Model/Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retrieveLocation**
> \Swagger\Client\Model\Location[] retrieveLocation($accept, $location_id)

Location

Retrieve all of the locations available in this database.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LocationsApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$location_id = "location_id_example"; // string | 

try {
    $result = $api_instance->retrieveLocation($accept, $location_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocationsApi->retrieveLocation: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **string**|  |

### Return type

[**\Swagger\Client\Model\Location[]**](../Model/Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retrieveLocationServices**
> \Swagger\Client\Model\Service[] retrieveLocationServices($accept, $location_id)

Services

Retrieve all services for this location

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LocationsApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$location_id = "location_id_example"; // string | 

try {
    $result = $api_instance->retrieveLocationServices($accept, $location_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocationsApi->retrieveLocationServices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **string**|  |

### Return type

[**\Swagger\Client\Model\Service[]**](../Model/Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retrieveLocations**
> \Swagger\Client\Model\Location[] retrieveLocations($accept, $page, $per_page)

Locations

Retrieve all of the locations available.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\LocationsApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$page = "page_example"; // string | 
$per_page = "per_page_example"; // string | 

try {
    $result = $api_instance->retrieveLocations($accept, $page, $per_page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LocationsApi->retrieveLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **string**|  | [optional]
 **per_page** | **string**|  | [optional]

### Return type

[**\Swagger\Client\Model\Location[]**](../Model/Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

