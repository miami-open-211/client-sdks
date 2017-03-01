# SWGOrganizationsApi

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveLOrganization**](SWGOrganizationsApi.md#retrievelorganization) | **GET** /organizations/{organization_id} | Organizations
[**retrieveLOrganizationLocations**](SWGOrganizationsApi.md#retrievelorganizationlocations) | **GET** /organizations/{organization_id}/locations | Organization Locations
[**retrieveLOrganizations**](SWGOrganizationsApi.md#retrievelorganizations) | **GET** /organizations | Organizations


# **retrieveLOrganization**
```objc
-(NSNumber*) retrieveLOrganizationWithAccept: (NSString*) accept
    organizationId: (NSString*) organizationId
        completionHandler: (void (^)(NSArray<SWGOrganization>* output, NSError* error)) handler;
```

Organizations

Retrieve all of the organizations available in this database.

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* organizationId = @"organizationId_example"; // 

SWGOrganizationsApi*apiInstance = [[SWGOrganizationsApi alloc] init];

// Organizations
[apiInstance retrieveLOrganizationWithAccept:accept
              organizationId:organizationId
          completionHandler: ^(NSArray<SWGOrganization>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGOrganizationsApi->retrieveLOrganization: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **NSString***|  | 

### Return type

[**NSArray<SWGOrganization>***](SWGOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveLOrganizationLocations**
```objc
-(NSNumber*) retrieveLOrganizationLocationsWithAccept: (NSString*) accept
    organizationId: (NSString*) organizationId
        completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;
```

Organization Locations

This endpoint retrieves all locations that belong to a particular organization.

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* organizationId = @"organizationId_example"; // 

SWGOrganizationsApi*apiInstance = [[SWGOrganizationsApi alloc] init];

// Organization Locations
[apiInstance retrieveLOrganizationLocationsWithAccept:accept
              organizationId:organizationId
          completionHandler: ^(NSArray<SWGLocation>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGOrganizationsApi->retrieveLOrganizationLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **NSString***|  | [default to application/vnd.ohanapi+json; version&#x3D;1]
 **organizationId** | **NSString***|  | 

### Return type

[**NSArray<SWGLocation>***](SWGLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveLOrganizations**
```objc
-(NSNumber*) retrieveLOrganizationsWithAccept: (NSString*) accept
    page: (NSString*) page
    perPage: (NSString*) perPage
        completionHandler: (void (^)(NSArray<SWGOrganization>* output, NSError* error)) handler;
```

Organizations

Retrieve all of the organizations available in this database.

### Example 
```objc

NSString* accept = @"application/vnd.ohanapi+json; version=1"; //  (default to application/vnd.ohanapi+json; version=1)
NSString* page = @"page_example"; //  (optional)
NSString* perPage = @"perPage_example"; //  (optional)

SWGOrganizationsApi*apiInstance = [[SWGOrganizationsApi alloc] init];

// Organizations
[apiInstance retrieveLOrganizationsWithAccept:accept
              page:page
              perPage:perPage
          completionHandler: ^(NSArray<SWGOrganization>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGOrganizationsApi->retrieveLOrganizations: %@", error);
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

[**NSArray<SWGOrganization>***](SWGOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

