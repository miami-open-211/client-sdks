# SwaggerClient::LocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_nearby_locations**](LocationsApi.md#find_nearby_locations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
[**retrieve_location**](LocationsApi.md#retrieve_location) | **GET** /locations/{location_id} | Location
[**retrieve_location_services**](LocationsApi.md#retrieve_location_services) | **GET** /locations/{location_id}/services | Services
[**retrieve_locations**](LocationsApi.md#retrieve_locations) | **GET** /locations | Locations


# **find_nearby_locations**
> Array&lt;Location&gt; find_nearby_locations(accept, location_id, opts)

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LocationsApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

location_id = "location_id_example" # String | 

opts = { 
  radius: "radius_example", # String | Default in miles is 0.5, minimum is 0.1.
  page: "page_example", # String | The particular page of results. Default is 1.
  per_page: "per_page_example" # String | Amount of locations to return per page.
}

begin
  #Find Nearby Locations
  result = api_instance.find_nearby_locations(accept, location_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LocationsApi->find_nearby_locations: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **String**|  | 
 **radius** | **String**| Default in miles is 0.5, minimum is 0.1. | [optional] 
 **page** | **String**| The particular page of results. Default is 1. | [optional] 
 **per_page** | **String**| Amount of locations to return per page. | [optional] 

### Return type

[**Array&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **retrieve_location**
> Array&lt;Location&gt; retrieve_location(accept, location_id)

Location

Retrieve all of the locations available in this database.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LocationsApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

location_id = "location_id_example" # String | 


begin
  #Location
  result = api_instance.retrieve_location(accept, location_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LocationsApi->retrieve_location: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **String**|  | 

### Return type

[**Array&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **retrieve_location_services**
> Array&lt;Service&gt; retrieve_location_services(accept, location_id)

Services

Retrieve all services for this location

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LocationsApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

location_id = "location_id_example" # String | 


begin
  #Services
  result = api_instance.retrieve_location_services(accept, location_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LocationsApi->retrieve_location_services: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **location_id** | **String**|  | 

### Return type

[**Array&lt;Service&gt;**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **retrieve_locations**
> Array&lt;Location&gt; retrieve_locations(accept, opts)

Locations

Retrieve all of the locations available.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::LocationsApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

opts = { 
  page: "page_example", # String | 
  per_page: "per_page_example" # String | 
}

begin
  #Locations
  result = api_instance.retrieve_locations(accept, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling LocationsApi->retrieve_locations: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **page** | **String**|  | [optional] 
 **per_page** | **String**|  | [optional] 

### Return type

[**Array&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



