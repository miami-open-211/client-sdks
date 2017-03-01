#import "SWGLocation.h"

@implementation SWGLocation

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"id": @"_id", @"organization_id": @"organizationId", @"name": @"name", @"alternate_name": @"alternateName", @"description": @"_description", @"transportation": @"transportation", @"latitude": @"latitude", @"longitude": @"longitude" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"organizationId", @"name", @"alternateName", @"_description", @"transportation", @"latitude", @"longitude"];
  return [optionalProperties containsObject:propertyName];
}

@end
