# IO.Swagger.Api.OrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RetrieveLOrganization**](OrganizationsApi.md#retrievelorganization) | **GET** /organizations/{organization_id} | Organizations
[**RetrieveLOrganizationLocations**](OrganizationsApi.md#retrievelorganizationlocations) | **GET** /organizations/{organization_id}/locations | Organization Locations
[**RetrieveLOrganizations**](OrganizationsApi.md#retrievelorganizations) | **GET** /organizations | Organizations


<a name="retrievelorganization"></a>
# **RetrieveLOrganization**
> List<Organization> RetrieveLOrganization (string accept, string organizationId)

Organizations

Retrieve all of the organizations available in this database.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RetrieveLOrganizationExample
    {
        public void main()
        {
            
            var apiInstance = new OrganizationsApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var organizationId = organizationId_example;  // string | 

            try
            {
                // Organizations
                List&lt;Organization&gt; result = apiInstance.RetrieveLOrganization(accept, organizationId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrganizationsApi.RetrieveLOrganization: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **string**|  | 

### Return type

[**List<Organization>**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="retrievelorganizationlocations"></a>
# **RetrieveLOrganizationLocations**
> List<Location> RetrieveLOrganizationLocations (string accept, string organizationId)

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RetrieveLOrganizationLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new OrganizationsApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var organizationId = organizationId_example;  // string | 

            try
            {
                // Organization Locations
                List&lt;Location&gt; result = apiInstance.RetrieveLOrganizationLocations(accept, organizationId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrganizationsApi.RetrieveLOrganizationLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **string**|  | 

### Return type

[**List<Location>**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="retrievelorganizations"></a>
# **RetrieveLOrganizations**
> List<Organization> RetrieveLOrganizations (string accept, string page = null, string perPage = null)

Organizations

Retrieve all of the organizations available in this database.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RetrieveLOrganizationsExample
    {
        public void main()
        {
            
            var apiInstance = new OrganizationsApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var page = page_example;  // string |  (optional) 
            var perPage = perPage_example;  // string |  (optional) 

            try
            {
                // Organizations
                List&lt;Organization&gt; result = apiInstance.RetrieveLOrganizations(accept, page, perPage);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrganizationsApi.RetrieveLOrganizations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **string**|  | [optional] 
 **perPage** | **string**|  | [optional] 

### Return type

[**List<Organization>**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

