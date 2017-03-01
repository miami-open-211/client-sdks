#import "SWGOrganization.h"

@implementation SWGOrganization

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
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"id": @"_id", @"name": @"name", @"alternate_name": @"alternateName", @"description": @"_description", @"email": @"email", @"url": @"url", @"tax_status": @"taxStatus", @"tax_id": @"taxId", @"year_incorporated": @"yearIncorporated", @"legal_status": @"legalStatus" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"name", @"alternateName", @"_description", @"email", @"url", @"taxStatus", @"taxId", @"yearIncorporated", @"legalStatus"];
  return [optionalProperties containsObject:propertyName];
}

@end
