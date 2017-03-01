#import "SWGSearchApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGLocation.h"


@interface SWGSearchApi ()

@property (nonatomic, strong) NSMutableDictionary *defaultHeaders;

@end

@implementation SWGSearchApi

NSString* kSWGSearchApiErrorDomain = @"SWGSearchApiErrorDomain";
NSInteger kSWGSearchApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    self = [super init];
    if (self) {
        SWGConfiguration *config = [SWGConfiguration sharedConfig];
        if (config.apiClient == nil) {
            config.apiClient = [[SWGApiClient alloc] init];
        }
        _apiClient = config.apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

- (id) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _defaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

+ (instancetype)sharedAPI {
    static SWGSearchApi *sharedAPI;
    static dispatch_once_t once;
    dispatch_once(&once, ^{
        sharedAPI = [[self alloc] init];
    });
    return sharedAPI;
}

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.defaultHeaders[key];
}

-(void) addHeader:(NSString*)value forKey:(NSString*)key {
    [self setDefaultHeaderValue:value forKey:key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.defaultHeaders setValue:value forKey:key];
}

-(NSUInteger) requestQueueSize {
    return [SWGApiClient requestQueueSize];
}

#pragma mark - Api Methods

///
/// Search
/// This endpoint retrieves all locations that match the criteria based on the parameters below. Multiple parameters can be used at the same time, separated by an ampersand (&).
///  @param accept  
///
///  @param category  (optional)
///
///  @param email  (optional)
///
///  @param keyword  (optional)
///
///  @param language  (optional)
///
///  @param latLng  (optional)
///
///  @param location  (optional)
///
///  @param orgName  (optional)
///
///  @param radius  (optional)
///
///  @param serviceArea  (optional)
///
///  @param status  (optional)
///
///  @param page  (optional)
///
///  @param perPage  (optional)
///
///  @returns NSArray<SWGLocation>*
///
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
    completionHandler: (void (^)(NSArray<SWGLocation>* output, NSError* error)) handler {
    // verify the required parameter 'accept' is set
    if (accept == nil) {
        NSParameterAssert(accept);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accept"] };
            NSError* error = [NSError errorWithDomain:kSWGSearchApiErrorDomain code:kSWGSearchApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/search"];

    // remove format in URL if needed
    [resourcePath replaceOccurrencesOfString:@".{format}" withString:@".json" options:0 range:NSMakeRange(0,resourcePath.length)];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (category != nil) {
        queryParams[@"category"] = category;
    }
    if (email != nil) {
        queryParams[@"email"] = email;
    }
    if (keyword != nil) {
        queryParams[@"keyword"] = keyword;
    }
    if (language != nil) {
        queryParams[@"language"] = language;
    }
    if (latLng != nil) {
        queryParams[@"lat_lng"] = latLng;
    }
    if (location != nil) {
        queryParams[@"location"] = location;
    }
    if (orgName != nil) {
        queryParams[@"org_name"] = orgName;
    }
    if (radius != nil) {
        queryParams[@"radius"] = radius;
    }
    if (serviceArea != nil) {
        queryParams[@"service_area"] = serviceArea;
    }
    if (status != nil) {
        queryParams[@"status"] = status;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
    }
    if (perPage != nil) {
        queryParams[@"per_page"] = perPage;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"Accept"] = accept;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<SWGLocation>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<SWGLocation>*)data, error);
                                }
                           }
          ];
}



@end
