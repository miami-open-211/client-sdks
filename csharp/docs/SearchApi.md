# IO.Swagger.Api.SearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchLocations**](SearchApi.md#searchlocations) | **GET** /search | Search


<a name="searchlocations"></a>
# **SearchLocations**
> List<Location> SearchLocations (string accept, string category = null, string email = null, string keyword = null, string language = null, string latLng = null, string location = null, string orgName = null, string radius = null, string serviceArea = null, string status = null, string page = null, string perPage = null)

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&).

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SearchLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new SearchApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var category = category_example;  // string |  (optional) 
            var email = email_example;  // string |  (optional) 
            var keyword = keyword_example;  // string |  (optional) 
            var language = language_example;  // string |  (optional) 
            var latLng = latLng_example;  // string |  (optional) 
            var location = location_example;  // string |  (optional) 
            var orgName = orgName_example;  // string |  (optional) 
            var radius = radius_example;  // string |  (optional) 
            var serviceArea = serviceArea_example;  // string |  (optional) 
            var status = status_example;  // string |  (optional) 
            var page = page_example;  // string |  (optional) 
            var perPage = perPage_example;  // string |  (optional) 

            try
            {
                // Search
                List&lt;Location&gt; result = apiInstance.SearchLocations(accept, category, email, keyword, language, latLng, location, orgName, radius, serviceArea, status, page, perPage);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SearchApi.SearchLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **category** | **string**|  | [optional] 
 **email** | **string**|  | [optional] 
 **keyword** | **string**|  | [optional] 
 **language** | **string**|  | [optional] 
 **latLng** | **string**|  | [optional] 
 **location** | **string**|  | [optional] 
 **orgName** | **string**|  | [optional] 
 **radius** | **string**|  | [optional] 
 **serviceArea** | **string**|  | [optional] 
 **status** | **string**|  | [optional] 
 **page** | **string**|  | [optional] 
 **perPage** | **string**|  | [optional] 

### Return type

[**List<Location>**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

