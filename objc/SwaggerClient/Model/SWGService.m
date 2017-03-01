#import "SWGService.h"

@implementation SWGService

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"id": @"_id", @"organization_id": @"organizationId", @"location_id": @"locationId", @"program_id": @"programId", @"name": @"name", @"alternate_name": @"alternateName", @"description": @"_description", @"url": @"url", @"email": @"email", @"status": @"status", @"application_process": @"applicationProcess", @"wait_time": @"waitTime", @"taxonomy_ids": @"taxonomyIds" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"organizationId", @"locationId", @"programId", @"name", @"alternateName", @"_description", @"url", @"email", @"status", @"applicationProcess", @"waitTime", @"taxonomyIds"];
  return [optionalProperties containsObject:propertyName];
}

@end
