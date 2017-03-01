# SWGLocationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findNearbyLocations**](SWGLocationsApi.md#findnearbylocations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
[**retrieveLocation**](SWGLocationsApi.md#retrievelocation) | **GET** /locations/{location_id} | Location
[**retrieveLocationServices**](SWGLocationsApi.md#retrievelocationservices) | **GET** /locations/{location_id}/services | Services
[**retrieveLocations**](SWGLocationsApi.md#retrievelocations) | **GET** /locations | Locations


# **findNearbyLocations**
```objc
-(NSNumber*) findNearbyLocationsWithAccept: (NSString*) accept
    locationId: (NSString*) locationId
    radius: (NSString*) radius
    page: (NSString*) page
    perPage: (NSString*) perPage
        completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;
```

Find Nearby Locations

This endpoint retrieves all locations that are near the specified location.

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* locationId = @"locationId_example"; // 
NSString* radius = @"radius_example"; // Default in miles is 0.5, minimum is 0.1. (optional)
NSString* page = @"page_example"; // The particular page of results. Default is 1. (optional)
NSString* perPage = @"perPage_example"; // Amount of locations to return per page. (optional)

SWGLocationsApi*apiInstance = [[SWGLocationsApi alloc] init];

// Find Nearby Locations
[apiInstance findNearbyLocationsWithAccept:accept
              locationId:locationId
              radius:radius
              page:page
              perPage:perPage
          completionHandler: ^(NSArray<SWGLocation>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLocationsApi->findNearbyLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **NSString***|  | 
 **radius** | **NSString***| Default in miles is 0.5, minimum is 0.1. | [optional] 
 **page** | **NSString***| The particular page of results. Default is 1. | [optional] 
 **perPage** | **NSString***| Amount of locations to return per page. | [optional] 

### Return type

[**NSArray<SWGLocation>***](SWGLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveLocation**
```objc
-(NSNumber*) retrieveLocationWithAccept: (NSString*) accept
    locationId: (NSString*) locationId
        completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;
```

Location

Retrieve all of the locations available in this database.

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* locationId = @"locationId_example"; // 

SWGLocationsApi*apiInstance = [[SWGLocationsApi alloc] init];

// Location
[apiInstance retrieveLocationWithAccept:accept
              locationId:locationId
          completionHandler: ^(NSArray<SWGLocation>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLocationsApi->retrieveLocation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **NSString***|  | 

### Return type

[**NSArray<SWGLocation>***](SWGLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveLocationServices**
```objc
-(NSNumber*) retrieveLocationServicesWithAccept: (NSString*) accept
    locationId: (NSString*) locationId
        completionHandler: (void (^)(NSArray<SWGService>* output, NSError* error)) handler;
```

Services

Retrieve all services for this location

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* locationId = @"locationId_example"; // 

SWGLocationsApi*apiInstance = [[SWGLocationsApi alloc] init];

// Services
[apiInstance retrieveLocationServicesWithAccept:accept
              locationId:locationId
          completionHandler: ^(NSArray<SWGService>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLocationsApi->retrieveLocationServices: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **locationId** | **NSString***|  | 

### Return type

[**NSArray<SWGService>***](SWGService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveLocations**
```objc
-(NSNumber*) retrieveLocationsWithAccept: (NSString*) accept
    page: (NSString*) page
    perPage: (NSString*) perPage
        completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;
```

Locations

Retrieve all of the locations available.

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* page = @"page_example"; //  (optional)
NSString* perPage = @"perPage_example"; //  (optional)

SWGLocationsApi*apiInstance = [[SWGLocationsApi alloc] init];

// Locations
[apiInstance retrieveLocationsWithAccept:accept
              page:page
              perPage:perPage
          completionHandler: ^(NSArray<SWGLocation>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLocationsApi->retrieveLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
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

