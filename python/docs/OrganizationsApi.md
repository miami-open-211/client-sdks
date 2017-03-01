# swagger_client.OrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve_l_organization**](OrganizationsApi.md#retrieve_l_organization) | **GET** /organizations/{organization_id} | Organizations
[**retrieve_l_organization_locations**](OrganizationsApi.md#retrieve_l_organization_locations) | **GET** /organizations/{organization_id}/locations | Organization Locations
[**retrieve_l_organizations**](OrganizationsApi.md#retrieve_l_organizations) | **GET** /organizations | Organizations


# **retrieve_l_organization**
> list[Organization] retrieve_l_organization(accept, organization_id)

Organizations

Retrieve all of the organizations available in this database.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrganizationsApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
organization_id = 'organization_id_example' # str | 

try: 
    # Organizations
    api_response = api_instance.retrieve_l_organization(accept, organization_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrganizationsApi->retrieve_l_organization: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organization_id** | **str**|  | 

### Return type

[**list[Organization]**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_l_organization_locations**
> list[Location] retrieve_l_organization_locations(accept, organization_id)

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrganizationsApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
organization_id = 'organization_id_example' # str | 

try: 
    # Organization Locations
    api_response = api_instance.retrieve_l_organization_locations(accept, organization_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrganizationsApi->retrieve_l_organization_locations: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organization_id** | **str**|  | 

### Return type

[**list[Location]**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_l_organizations**
> list[Organization] retrieve_l_organizations(accept, page=page, per_page=per_page)

Organizations

Retrieve all of the organizations available in this database.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrganizationsApi()
accept = 'application/vnd.ohanapi+json; version=1' # str |  (default to application/vnd.ohanapi+json; version=1)
page = 'page_example' # str |  (optional)
per_page = 'per_page_example' # str |  (optional)

try: 
    # Organizations
    api_response = api_instance.retrieve_l_organizations(accept, page=page, per_page=per_page)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrganizationsApi->retrieve_l_organizations: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **str**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **str**|  | [optional] 
 **per_page** | **str**|  | [optional] 

### Return type

[**list[Organization]**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

