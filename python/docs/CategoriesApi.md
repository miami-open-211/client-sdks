# swagger_client.CategoriesApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_categories**](CategoriesApi.md#get_categories) | **GET** /categories | Categories


# **get_categories**
> list[Categories] get_categories(accept)

Categories

This endpoint retrieves all categories.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CategoriesApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)

try: 
    # Categories
    api_response = api_instance.get_categories(accept)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling CategoriesApi->get_categories: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]

### Return type

[**list[Categories]**](Categories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

