# IO.Swagger.Api.CategoriesApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCategories**](CategoriesApi.md#getcategories) | **GET** /categories | Categories


<a name="getcategories"></a>
# **GetCategories**
> List<Categories> GetCategories (string accept)

Categories

This endpoint retrieves all categories.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCategoriesExample
    {
        public void main()
        {
            
            var apiInstance = new CategoriesApi();
            var accept = accept_example;  // string |  (default to application/vnd.ohanapi+json; version=1)

            try
            {
                // Categories
                List&lt;Categories&gt; result = apiInstance.GetCategories(accept);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CategoriesApi.GetCategories: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **string**|  | [default to application/vnd.ohanapi+json; version&#x3D;1]

### Return type

[**List<Categories>**](Categories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

