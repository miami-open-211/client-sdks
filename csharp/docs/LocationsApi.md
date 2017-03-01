# IO.Swagger.Api.LocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FindNearbyLocations**](LocationsApi.md#findnearbylocations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
[**RetrieveLocation**](LocationsApi.md#retrievelocation) | **GET** /locations/{location_id} | Location
[**RetrieveLocationServices**](LocationsApi.md#retrievelocationservices) | **GET** /locations/{location_id}/services | Services
[**RetrieveLocations**](LocationsApi.md#retrievelocations) | **GET** /locations | Locations


<a name="findnearbylocations"></a>
# **FindNearbyLocations**
> List<Location> FindNearbyLocations (string accept, string locationId, string radius = null, string page = null, string perPage = null)

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FindNearbyLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new LocationsApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var locationId = locationId_example;  // string | 
            var radius = radius_example;  // string | Default in miles is 0.5, minimum is 0.1. (optional) 
            var page = page_example;  // string | The particular page of results. Default is 1. (optional) 
            var perPage = perPage_example;  // string | Amount of locations to return per page. (optional) 

            try
            {
                // Find Nearby Locations
                List&lt;Location&gt; result = apiInstance.FindNearbyLocations(accept, locationId, radius, page, perPage);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LocationsApi.FindNearbyLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **string**|  | 
 **radius** | **string**| Default in miles is 0.5, minimum is 0.1. | [optional] 
 **page** | **string**| The particular page of results. Default is 1. | [optional] 
 **perPage** | **string**| Amount of locations to return per page. | [optional] 

### Return type

[**List<Location>**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="retrievelocation"></a>
# **RetrieveLocation**
> List<Location> RetrieveLocation (string accept, string locationId)

Location

Retrieve all of the locations available in this database.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RetrieveLocationExample
    {
        public void main()
        {
            
            var apiInstance = new LocationsApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var locationId = locationId_example;  // string | 

            try
            {
                // Location
                List&lt;Location&gt; result = apiInstance.RetrieveLocation(accept, locationId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LocationsApi.RetrieveLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **string**|  | 

### Return type

[**List<Location>**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="retrievelocationservices"></a>
# **RetrieveLocationServices**
> List<Service> RetrieveLocationServices (string accept, string locationId)

Services

Retrieve all services for this location

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RetrieveLocationServicesExample
    {
        public void main()
        {
            
            var apiInstance = new LocationsApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var locationId = locationId_example;  // string | 

            try
            {
                // Services
                List&lt;Service&gt; result = apiInstance.RetrieveLocationServices(accept, locationId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LocationsApi.RetrieveLocationServices: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **string**|  | 

### Return type

[**List<Service>**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="retrievelocations"></a>
# **RetrieveLocations**
> List<Location> RetrieveLocations (string accept, string page = null, string perPage = null)

Locations

Retrieve all of the locations available.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RetrieveLocationsExample
    {
        public void main()
        {
            
            var apiInstance = new LocationsApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)
            var page = page_example;  // string |  (optional) 
            var perPage = perPage_example;  // string |  (optional) 

            try
            {
                // Locations
                List&lt;Location&gt; result = apiInstance.RetrieveLocations(accept, page, perPage);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LocationsApi.RetrieveLocations: " + e.Message );
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

[**List<Location>**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

