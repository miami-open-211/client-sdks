# SWGSearchApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchLocations**](SWGSearchApi.md#searchlocations) | **GET** /search | Search


# **searchLocations**
```objc
-(NSNumber*) searchLocationsWithAccept: (NSString*) accept
    category: (NSString*) category
    email: (NSString*) email
    keyword: (NSString*) keyword
    language: (NSString*) language
    latLng: (NSString*) latLng
    location: (NSString*) location
    orgName: (NSString*) orgName
    radius: (NSString*) radius
    serviceArea: (NSString*) serviceArea
    status: (NSString*) status
    page: (NSString*) page
    perPage: (NSString*) perPage
        completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;
```

Search

This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&).

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* category = @"category_example"; //  (optional)
NSString* email = @"email_example"; //  (optional)
NSString* keyword = @"keyword_example"; //  (optional)
NSString* language = @"language_example"; //  (optional)
NSString* latLng = @"latLng_example"; //  (optional)
NSString* location = @"location_example"; //  (optional)
NSString* orgName = @"orgName_example"; //  (optional)
NSString* radius = @"radius_example"; //  (optional)
NSString* serviceArea = @"serviceArea_example"; //  (optional)
NSString* status = @"status_example"; //  (optional)
NSString* page = @"page_example"; //  (optional)
NSString* perPage = @"perPage_example"; //  (optional)

SWGSearchApi*apiInstance = [[SWGSearchApi alloc] init];

// Search
[apiInstance searchLocationsWithAccept:accept
              category:category
              email:email
              keyword:keyword
              language:language
              latLng:latLng
              location:location
              orgName:orgName
              radius:radius
              serviceArea:serviceArea
              status:status
              page:page
              perPage:perPage
          completionHandler: ^(NSArray<SWGLocation>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSearchApi->searchLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **category** | **NSString***|  | [optional] 
 **email** | **NSString***|  | [optional] 
 **keyword** | **NSString***|  | [optional] 
 **language** | **NSString***|  | [optional] 
 **latLng** | **NSString***|  | [optional] 
 **location** | **NSString***|  | [optional] 
 **orgName** | **NSString***|  | [optional] 
 **radius** | **NSString***|  | [optional] 
 **serviceArea** | **NSString***|  | [optional] 
 **status** | **NSString***|  | [optional] 
 **page** | **NSString***|  | [optional] 
 **perPage** | **NSString***|  | [optional] 

### Return type

[**NSArray<SWGLocation>***](SWGLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

