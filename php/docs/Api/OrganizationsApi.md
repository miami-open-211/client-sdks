# Swagger\Client\OrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveLOrganization**](OrganizationsApi.md#retrieveLOrganization) | **GET** /organizations/{organization_id} | Organizations
[**retrieveLOrganizationLocations**](OrganizationsApi.md#retrieveLOrganizationLocations) | **GET** /organizations/{organization_id}/locations | Organization Locations
[**retrieveLOrganizations**](OrganizationsApi.md#retrieveLOrganizations) | **GET** /organizations | Organizations


# **retrieveLOrganization**
> \Swagger\Client\Model\Organization[] retrieveLOrganization($accept, $organization_id)

Organizations

Retrieve all of the organizations available in this database.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrganizationsApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$organization_id = "organization_id_example"; // string | 

try {
    $result = $api_instance->retrieveLOrganization($accept, $organization_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrganizationsApi->retrieveLOrganization: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organization_id** | **string**|  |

### Return type

[**\Swagger\Client\Model\Organization[]**](../Model/Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retrieveLOrganizationLocations**
> \Swagger\Client\Model\Location[] retrieveLOrganizationLocations($accept, $organization_id)

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrganizationsApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$organization_id = "organization_id_example"; // string | 

try {
    $result = $api_instance->retrieveLOrganizationLocations($accept, $organization_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrganizationsApi->retrieveLOrganizationLocations: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organization_id** | **string**|  |

### Return type

[**\Swagger\Client\Model\Location[]**](../Model/Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **retrieveLOrganizations**
> \Swagger\Client\Model\Organization[] retrieveLOrganizations($accept, $page, $per_page)

Organizations

Retrieve all of the organizations available in this database.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrganizationsApi();
$accept = "application/vnd.ohanapi+json; version=1"; // string | 
$page = "page_example"; // string | 
$per_page = "per_page_example"; // string | 

try {
    $result = $api_instance->retrieveLOrganizations($accept, $page, $per_page);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrganizationsApi->retrieveLOrganizations: ', $e->getMessage(), PHP_EOL;
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

[**\Swagger\Client\Model\Organization[]**](../Model/Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

