# SWGCategoriesApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](SWGCategoriesApi.md#getcategories) | **GET** /categories | Categories


# **getCategories**
```objc
-(NSNumber*) getCategoriesWithAccept: (NSString*) accept
        completionHandler: (void (^)(NSArray<SWGCategories>* output, NSError* error)) handler;
```

Categories

This endpoint retrieves all categories.

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)

SWGCategoriesApi*apiInstance = [[SWGCategoriesApi alloc] init];

// Categories
[apiInstance getCategoriesWithAccept:accept
          completionHandler: ^(NSArray<SWGCategories>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCategoriesApi->getCategories: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]

### Return type

[**NSArray<SWGCategories>***](SWGCategories.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

