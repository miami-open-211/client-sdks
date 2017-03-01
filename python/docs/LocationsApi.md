# swagger_client.LocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_nearby_locations**](LocationsApi.md#find_nearby_locations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
[**retrieve_location**](LocationsApi.md#retrieve_location) | **GET** /locations/{location_id} | Location
[**retrieve_location_services**](LocationsApi.md#retrieve_location_services) | **GET** /locations/{location_id}/services | Services
[**retrieve_locations**](LocationsApi.md#retrieve_locations) | **GET** /locations | Locations


# **find_nearby_locations**
> list[Location] find_nearby_locations(accept, location_id, radius=radius, page=page, per_page=per_page)

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LocationsApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
location_id = 'location_id_example' # str | 
radius = 'radius_example' # str | Default in miles is 0.5, minimum is 0.1. (optional)
page = 'page_example' # str | The particular page of results. Default is 1. (optional)
per_page = 'per_page_example' # str | Amount of locations to return per page. (optional)

try: 
    # Find Nearby Locations
    api_response = api_instance.find_nearby_locations(accept, location_id, radius=radius, page=page, per_page=per_page)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling LocationsApi->find_nearby_locations: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **str**|  | 
 **radius** | **str**| Default in miles is 0.5, minimum is 0.1. | [optional] 
 **page** | **str**| The particular page of results. Default is 1. | [optional] 
 **per_page** | **str**| Amount of locations to return per page. | [optional] 

### Return type

[**list[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_location**
> list[Location] retrieve_location(accept, location_id)

Location

Retrieve all of the locations available in this database.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LocationsApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
location_id = 'location_id_example' # str | 

try: 
    # Location
    api_response = api_instance.retrieve_location(accept, location_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling LocationsApi->retrieve_location: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **str**|  | 

### Return type

[**list[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_location_services**
> list[Service] retrieve_location_services(accept, location_id)

Services

Retrieve all services for this location

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LocationsApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
location_id = 'location_id_example' # str | 

try: 
    # Services
    api_response = api_instance.retrieve_location_services(accept, location_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling LocationsApi->retrieve_location_services: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **str**|  | 

### Return type

[**list[Service]**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_locations**
> list[Location] retrieve_locations(accept, page=page, per_page=per_page)

Locations

Retrieve all of the locations available.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LocationsApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
page = 'page_example' # str |  (optional)
per_page = 'per_page_example' # str |  (optional)

try: 
    # Locations
    api_response = api_instance.retrieve_locations(accept, page=page, per_page=per_page)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling LocationsApi->retrieve_locations: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **str**|  | [optional] 
 **per_page** | **str**|  | [optional] 

### Return type

[**list[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

