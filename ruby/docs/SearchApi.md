# SwaggerClient::SearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_locations**](SearchApi.md#search_locations) | **GET** /search | Search


# **search_locations**
> Array&lt;Location&gt; search_locations(accept, opts)

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&).

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SearchApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 

opts = { 
  category: "category_example", # String | 
  email: "email_example", # String | 
  keyword: "keyword_example", # String | 
  language: "language_example", # String | 
  lat_lng: "lat_lng_example", # String | 
  location: "location_example", # String | 
  org_name: "org_name_example", # String | 
  radius: "radius_example", # String | 
  service_area: "service_area_example", # String | 
  status: "status_example", # String | 
  page: "page_example", # String | 
  per_page: "per_page_example" # String | 
}

begin
  #Search
  result = api_instance.search_locations(accept, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SearchApi->search_locations: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **category** | **String**|  | [optional] 
 **email** | **String**|  | [optional] 
 **keyword** | **String**|  | [optional] 
 **language** | **String**|  | [optional] 
 **lat_lng** | **String**|  | [optional] 
 **location** | **String**|  | [optional] 
 **org_name** | **String**|  | [optional] 
 **radius** | **String**|  | [optional] 
 **service_area** | **String**|  | [optional] 
 **status** | **String**|  | [optional] 
 **page** | **String**|  | [optional] 
 **per_page** | **String**|  | [optional] 

### Return type

[**Array&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



