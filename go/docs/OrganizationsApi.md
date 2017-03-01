# \OrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RetrieveLOrganization**](OrganizationsApi.md#RetrieveLOrganization) | **Get** /organizations/{organization_id} | Organizations
[**RetrieveLOrganizationLocations**](OrganizationsApi.md#RetrieveLOrganizationLocations) | **Get** /organizations/{organization_id}/locations | Organization Locations
[**RetrieveLOrganizations**](OrganizationsApi.md#RetrieveLOrganizations) | **Get** /organizations | Organizations


# **RetrieveLOrganization**
> []Organization RetrieveLOrganization($accept, $organizationId)

Organizations

Retrieve all of the organizations available in this database.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **string**|  | 

### Return type

[**[]Organization**](organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RetrieveLOrganizationLocations**
> []Location RetrieveLOrganizationLocations($accept, $organizationId)

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **string**|  | 

### Return type

[**[]Location**](location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RetrieveLOrganizations**
> []Organization RetrieveLOrganizations($accept, $page, $perPage)

Organizations

Retrieve all of the organizations available in this database.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **string**|  | [optional] 
 **perPage** | **string**|  | [optional] 

### Return type

[**[]Organization**](organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

