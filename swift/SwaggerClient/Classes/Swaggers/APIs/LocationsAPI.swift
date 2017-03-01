//
// LocationsAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class LocationsAPI: APIBase {
    /**
     Find Nearby Locations
     
     - parameter locationId: (path)  
     - parameter radius: (query) Default in miles is 0.5, minimum is 0.1. (optional)
     - parameter page: (query) The particular page of results. Default is 1. (optional)
     - parameter perPage: (query) Amount of locations to return per page. (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func findNearbyLocations(locationId locationId: String, radius: String? = nil, page: String? = nil, perPage: String? = nil, completion: ((data: [Location]?, error: ErrorType?) -> Void)) {
        findNearbyLocationsWithRequestBuilder(locationId: locationId, radius: radius, page: page, perPage: perPage).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Find Nearby Locations
     - GET /locations/{locationId}/nearby
     - This endpoint retrieves all locations that are near the specified location.
     - examples: [{contentType=application/json, example=[ {
  "alternate_name" : "aeiou",
  "organization_id" : "aeiou",
  "latitude" : "aeiou",
  "name" : "aeiou",
  "description" : "aeiou",
  "id" : "aeiou",
  "transportation" : "aeiou",
  "longitude" : "aeiou"
} ]}]
     
     - parameter locationId: (path)  
     - parameter radius: (query) Default in miles is 0.5, minimum is 0.1. (optional)
     - parameter page: (query) The particular page of results. Default is 1. (optional)
     - parameter perPage: (query) Amount of locations to return per page. (optional)

     - returns: RequestBuilder<[Location]> 
     */
    public class func findNearbyLocationsWithRequestBuilder(locationId locationId: String, radius: String? = nil, page: String? = nil, perPage: String? = nil) -> RequestBuilder<[Location]> {
        var path = "/locations/{locationId}/nearby"
        path = path.stringByReplacingOccurrencesOfString("{locationId}", withString: "\(locationId)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "radius": radius,
            "page": page,
            "per_page": perPage
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[Location]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     Location
     
     - parameter locationId: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func retrieveLocation(locationId locationId: String, completion: ((data: [Location]?, error: ErrorType?) -> Void)) {
        retrieveLocationWithRequestBuilder(locationId: locationId).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Location
     - GET /locations/{locationId}
     - Retrieve all of the locations available in this database.
     - examples: [{contentType=application/json, example=[ {
  "alternate_name" : "aeiou",
  "organization_id" : "aeiou",
  "latitude" : "aeiou",
  "name" : "aeiou",
  "description" : "aeiou",
  "id" : "aeiou",
  "transportation" : "aeiou",
  "longitude" : "aeiou"
} ]}]
     
     - parameter locationId: (path)  

     - returns: RequestBuilder<[Location]> 
     */
    public class func retrieveLocationWithRequestBuilder(locationId locationId: String) -> RequestBuilder<[Location]> {
        var path = "/locations/{locationId}"
        path = path.stringByReplacingOccurrencesOfString("{locationId}", withString: "\(locationId)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[Location]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Services
     
     - parameter locationId: (path)  
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func retrieveLocationServices(locationId locationId: String, completion: ((data: [Service]?, error: ErrorType?) -> Void)) {
        retrieveLocationServicesWithRequestBuilder(locationId: locationId).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Services
     - GET /locations/{locationId}/services
     - Retrieve all services for this location
     - examples: [{contentType=application/json, example=[ {
  "taxonomy_ids" : "aeiou",
  "alternate_name" : "aeiou",
  "wait_time" : "aeiou",
  "program_id" : "aeiou",
  "description" : "aeiou",
  "location_id" : "aeiou",
  "url" : "aeiou",
  "application_process" : "aeiou",
  "organization_id" : "aeiou",
  "name" : "aeiou",
  "id" : "aeiou",
  "email" : "aeiou",
  "status" : "aeiou"
} ]}]
     
     - parameter locationId: (path)  

     - returns: RequestBuilder<[Service]> 
     */
    public class func retrieveLocationServicesWithRequestBuilder(locationId locationId: String) -> RequestBuilder<[Service]> {
        var path = "/locations/{locationId}/services"
        path = path.stringByReplacingOccurrencesOfString("{locationId}", withString: "\(locationId)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[Service]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Locations
     
     - parameter page: (query)  (optional)
     - parameter perPage: (query)  (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func retrieveLocations(page page: String? = nil, perPage: String? = nil, completion: ((data: [Location]?, error: ErrorType?) -> Void)) {
        retrieveLocationsWithRequestBuilder(page: page, perPage: perPage).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Locations
     - GET /locations
     - Retrieve all of the locations available.
     - examples: [{contentType=application/json, example=[ {
  "alternate_name" : "aeiou",
  "organization_id" : "aeiou",
  "latitude" : "aeiou",
  "name" : "aeiou",
  "description" : "aeiou",
  "id" : "aeiou",
  "transportation" : "aeiou",
  "longitude" : "aeiou"
} ]}]
     
     - parameter page: (query)  (optional)
     - parameter perPage: (query)  (optional)

     - returns: RequestBuilder<[Location]> 
     */
    public class func retrieveLocationsWithRequestBuilder(page page: String? = nil, perPage: String? = nil) -> RequestBuilder<[Location]> {
        let path = "/locations"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "page": page,
            "per_page": perPage
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[Location]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
