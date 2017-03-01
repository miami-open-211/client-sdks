# OrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveLOrganization**](OrganizationsApi.md#retrieveLOrganization) | **GET** /organizations/{organization_id} | Organizations
[**retrieveLOrganizationLocations**](OrganizationsApi.md#retrieveLOrganizationLocations) | **GET** /organizations/{organization_id}/locations | Organization Locations
[**retrieveLOrganizations**](OrganizationsApi.md#retrieveLOrganizations) | **GET** /organizations | Organizations


<a name="retrieveLOrganization"></a>
# **retrieveLOrganization**
> List&lt;Organization&gt; retrieveLOrganization(accept, organizationId)

Organizations

Retrieve all of the organizations available in this database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    List<Organization> result = apiInstance.retrieveLOrganization(accept, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#retrieveLOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **String**|  |

### Return type

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLOrganizationLocations"></a>
# **retrieveLOrganizationLocations**
> List&lt;Location&gt; retrieveLOrganizationLocations(accept, organizationId)

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String organizationId = "organizationId_example"; // String | 
try {
    List<Location> result = apiInstance.retrieveLOrganizationLocations(accept, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#retrieveLOrganizationLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **String**|  |

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLOrganizations"></a>
# **retrieveLOrganizations**
> List&lt;Organization&gt; retrieveLOrganizations(accept, page, perPage)

Organizations

Retrieve all of the organizations available in this database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
String accept = "application/vnd.ohanapi+json; version=1"; // String | 
String page = "page_example"; // String | 
String perPage = "perPage_example"; // String | 
try {
    List<Organization> result = apiInstance.retrieveLOrganizations(accept, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#retrieveLOrganizations");
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

[**List&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

