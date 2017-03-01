# swagger_client.SearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_locations**](SearchApi.md#search_locations) | **GET** /search | Search


# **search_locations**
> list[Location] search_locations(accept, category=category, email=email, keyword=keyword, language=language, lat_lng=lat_lng, location=location, org_name=org_name, radius=radius, service_area=service_area, status=status, page=page, per_page=per_page)

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&).

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SearchApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
category = 'category_example' # str |  (optional)
email = 'email_example' # str |  (optional)
keyword = 'keyword_example' # str |  (optional)
language = 'language_example' # str |  (optional)
lat_lng = 'lat_lng_example' # str |  (optional)
location = 'location_example' # str |  (optional)
org_name = 'org_name_example' # str |  (optional)
radius = 'radius_example' # str |  (optional)
service_area = 'service_area_example' # str |  (optional)
status = 'status_example' # str |  (optional)
page = 'page_example' # str |  (optional)
per_page = 'per_page_example' # str |  (optional)

try: 
    # Search
    api_response = api_instance.search_locations(accept, category=category, email=email, keyword=keyword, language=language, lat_lng=lat_lng, location=location, org_name=org_name, radius=radius, service_area=service_area, status=status, page=page, per_page=per_page)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling SearchApi->search_locations: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **category** | **str**|  | [optional] 
 **email** | **str**|  | [optional] 
 **keyword** | **str**|  | [optional] 
 **language** | **str**|  | [optional] 
 **lat_lng** | **str**|  | [optional] 
 **location** | **str**|  | [optional] 
 **org_name** | **str**|  | [optional] 
 **radius** | **str**|  | [optional] 
 **service_area** | **str**|  | [optional] 
 **status** | **str**|  | [optional] 
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

