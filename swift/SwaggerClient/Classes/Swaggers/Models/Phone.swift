//
// Phone.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Phone: JSONEncodable {
    /** Each entry must have a unique identifier */
    public var id: String?
    /** The identifier of the location where this phone number is located */
    public var locationId: String?
    /** The identifier of the service for which this is the phone number */
    public var serviceId: String?
    /** The identifier of the organisation for which this is the phone number */
    public var organizationId: String?
    /** The identifier of the contact for which this is the phone number */
    public var contactId: String?
    /** The phone number */
    public var number: String?
    /** The extension of the phone number */
    public var _extension: String?
    /** Whether the phone number relates to a fixed or cellular phone */
    public var type: String?
    /** The department for which this is the phone number */
    public var department: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["location_id"] = self.locationId
        nillableDictionary["service_id"] = self.serviceId
        nillableDictionary["organization_id"] = self.organizationId
        nillableDictionary["contact_id"] = self.contactId
        nillableDictionary["number"] = self.number
        nillableDictionary["extension"] = self._extension
        nillableDictionary["type"] = self.type
        nillableDictionary["department"] = self.department
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
