#import <Foundation/Foundation.h>
#import "SWGLocation.h"
#import "SWGService.h"
#import "SWGApi.h"

/**
* Miami Open 211 API
* This is a developer area for the Miami Open211 API, providing access to the raw data behind the Switchboard of Miami website. The purpose of this API is to allow anyone to develop web, mobile, or other types of applications that serve the mission of Miami Open211.
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


@interface SWGLocationsApi: NSObject <SWGApi>

extern NSString* kSWGLocationsApiErrorDomain;
extern NSInteger kSWGLocationsApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Find Nearby Locations
/// This endpoint retrieves all locations that are near the specified location.
///
/// @param accept  (default to application/vnd.ohanapi+json; version=1)
/// @param locationId 
/// @param radius Default in miles is 0.5, minimum is 0.1. (optional)
/// @param page The particular page of results. Default is 1. (optional)
/// @param perPage Amount of locations to return per page. (optional)
/// 
///  code:200 message:"Successful response"
///
/// @return NSArray<SWGLocation>*
-(NSNumber*) findNearbyLocationsWithAccept: (NSString*) accept
    locationId: (NSString*) locationId
    radius: (NSString*) radius
    page: (NSString*) page
    perPage: (NSString*) perPage
    completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;


/// Location
/// Retrieve all of the locations available in this database.
///
/// @param accept  (default to application/vnd.ohanapi+json; version=1)
/// @param locationId 
/// 
///  code:200 message:"Successful response"
///
/// @return NSArray<SWGLocation>*
-(NSNumber*) retrieveLocationWithAccept: (NSString*) accept
    locationId: (NSString*) locationId
    completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;


/// Services
/// Retrieve all services for this location
///
/// @param accept  (default to application/vnd.ohanapi+json; version=1)
/// @param locationId 
/// 
///  code:200 message:"Successful response"
///
/// @return NSArray<SWGService>*
-(NSNumber*) retrieveLocationServicesWithAccept: (NSString*) accept
    locationId: (NSString*) locationId
    completionHandler: (void (^)(NSArray<SWGService>* output, NSError* error)) handler;


/// Locations
/// Retrieve all of the locations available.
///
/// @param accept  (default to application/vnd.ohanapi+json; version=1)
/// @param page  (optional)
/// @param perPage  (optional)
/// 
///  code:200 message:"Successful response"
///
/// @return NSArray<SWGLocation>*
-(NSNumber*) retrieveLocationsWithAccept: (NSString*) accept
    page: (NSString*) page
    perPage: (NSString*) perPage
    completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler;



@end
