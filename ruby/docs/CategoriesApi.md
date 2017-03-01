# SwaggerClient::CategoriesApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_categories**](CategoriesApi.md#get_categories) | **GET** /categories | Categories


# **get_categories**
> Array&lt;Categories&gt; get_categories(accept)

Categories

This endpoint retrieves all categories.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::CategoriesApi.new

accept = "application/vnd.ohanapi+json; version=1" # String | 


begin
  #Categories
  result = api_instance.get_categories(accept)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling CategoriesApi->get_categories: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]

### Return type

[**Array&lt;Categories&gt;**](Categories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



