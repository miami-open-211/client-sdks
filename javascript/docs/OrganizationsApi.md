# MiamiOpen211Api.OrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveLOrganization**](OrganizationsApi.md#retrieveLOrganization) | **GET** /organizations/{organization_id} | Organizations
[**retrieveLOrganizationLocations**](OrganizationsApi.md#retrieveLOrganizationLocations) | **GET** /organizations/{organization_id}/locations | Organization Locations
[**retrieveLOrganizations**](OrganizationsApi.md#retrieveLOrganizations) | **GET** /organizations | Organizations


<a name="retrieveLOrganization"></a>
# **retrieveLOrganization**
> [Organization] retrieveLOrganization(accept, organizationId)

Organizations

Retrieve all of the organizations available in this database.

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.OrganizationsApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 

var organizationId = "organizationId_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveLOrganization(accept, organizationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **String**|  | 

### Return type

[**[Organization]**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLOrganizationLocations"></a>
# **retrieveLOrganizationLocations**
> [Location] retrieveLOrganizationLocations(accept, organizationId)

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.OrganizationsApi();

var accept = "application/vnd.ohanapi+json; version=1"; // String | 

var organizationId = "organizationId_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retrieveLOrganizationLocations(accept, organizationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **String**|  | 

### Return type

[**[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLOrganizations"></a>
# **retrieveLOrganizations**
> [Organization] retrieveLOrganizations(accept, opts)

Organizations

Retrieve all of the organizations available in this database.

### Example
```javascript
var MiamiOpen211Api = require('miami_open_211_api');

var apiInstance = new MiamiOpen211Api.OrganizationsApi();

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
apiInstance.retrieveLOrganizations(accept, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **String**|  | [optional] 
 **perPage** | **String**|  | [optional] 

### Return type

[**[Organization]**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

