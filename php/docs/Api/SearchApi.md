# Swagger\Client\SearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchLocations**](SearchApi.md#searchLocations) | **GET** /search | Search


# **searchLocations**
> \Swagger\Client\Model\Location[] searchLocations($accept, $category, $email, $keyword, $language, $lat_lng, $location, $org_name, $radius, $service_area, $status, $page, $per_page)

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&).

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SearchApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$category = "category_example"; // string | 
$email = "email_example"; // string | 
$keyword = "keyword_example"; // string | 
$language = "language_example"; // string | 
$lat_lng = "lat_lng_example"; // string | 
$location = "location_example"; // string | 
$org_name = "org_name_example"; // string | 
$radius = "radius_example"; // string | 
$service_area = "service_area_example"; // string | 
$status = "status_example"; // string | 
$page = "page_example"; // string | 
$per_page = "per_page_example"; // string | 

try {
    $result = $api_instance->searchLocations($accept, $category, $email, $keyword, $language, $lat_lng, $location, $org_name, $radius, $service_area, $status, $page, $per_page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->searchLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **category** | **string**|  | [optional]
 **email** | **string**|  | [optional]
 **keyword** | **string**|  | [optional]
 **language** | **string**|  | [optional]
 **lat_lng** | **string**|  | [optional]
 **location** | **string**|  | [optional]
 **org_name** | **string**|  | [optional]
 **radius** | **string**|  | [optional]
 **service_area** | **string**|  | [optional]
 **status** | **string**|  | [optional]
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

