# SwaggerClient::OrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve_l_organization**](OrganizationsApi.md#retrieve_l_organization) | **GET** /organizations/{organization_id} | Organizations
[**retrieve_l_organization_locations**](OrganizationsApi.md#retrieve_l_organization_locations) | **GET** /organizations/{organization_id}/locations | Organization Locations
[**retrieve_l_organizations**](OrganizationsApi.md#retrieve_l_organizations) | **GET** /organizations | Organizations


# **retrieve_l_organization**
> Array&lt;Organization&gt; retrieve_l_organization(accept, organization_id)

Organizations

Retrieve all of the organizations available in this database.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::OrganizationsApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

organization_id = "organization_id_example" # String | 


begin
  #Organizations
  result = api_instance.retrieve_l_organization(accept, organization_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrganizationsApi->retrieve_l_organization: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organization_id** | **String**|  | 

### Return type

[**Array&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **retrieve_l_organization_locations**
> Array&lt;Location&gt; retrieve_l_organization_locations(accept, organization_id)

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::OrganizationsApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

organization_id = "organization_id_example" # String | 


begin
  #Organization Locations
  result = api_instance.retrieve_l_organization_locations(accept, organization_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrganizationsApi->retrieve_l_organization_locations: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organization_id** | **String**|  | 

### Return type

[**Array&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **retrieve_l_organizations**
> Array&lt;Organization&gt; retrieve_l_organizations(accept, opts)

Organizations

Retrieve all of the organizations available in this database.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::OrganizationsApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

opts = { 
  page: "page_example", # String | 
  per_page: "per_page_example" # String | 
}

begin
  #Organizations
  result = api_instance.retrieve_l_organizations(accept, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrganizationsApi->retrieve_l_organizations: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **String**|  | [optional] 
 **per_page** | **String**|  | [optional] 

### Return type

[**Array&lt;Organization&gt;**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



