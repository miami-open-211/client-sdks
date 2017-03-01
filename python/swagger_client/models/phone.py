# coding: utf-8

"""
    Miami Open 211 API

    This is a developer area for the Miami Open211 API, providing access to the raw data behind the Switchboard of Miami website. The purpose of this API is to allow anyone to develop web, mobile, or other types of applications that serve the mission of Miami Open211.

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from pprint import pformat
from six import iteritems
import re


class Phone(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, location_id=None, service_id=None, organization_id=None, contact_id=None, number=None, extension=None, type=None, department=None):
        """
        Phone - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'str',
            'location_id': 'str',
            'service_id': 'str',
            'organization_id': 'str',
            'contact_id': 'str',
            'number': 'str',
            'extension': 'str',
            'type': 'str',
            'department': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'location_id': 'location_id',
            'service_id': 'service_id',
            'organization_id': 'organization_id',
            'contact_id': 'contact_id',
            'number': 'number',
            'extension': 'extension',
            'type': 'type',
            'department': 'department'
        }

        self._id = id
        self._location_id = location_id
        self._service_id = service_id
        self._organization_id = organization_id
        self._contact_id = contact_id
        self._number = number
        self._extension = extension
        self._type = type
        self._department = department

    @property
    def id(self):
        """
        Gets the id of this Phone.
        Each entry must have a unique identifier

        :return: The id of this Phone.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Phone.
        Each entry must have a unique identifier

        :param id: The id of this Phone.
        :type: str
        """

        self._id = id

    @property
    def location_id(self):
        """
        Gets the location_id of this Phone.
        The identifier of the location where this phone number is located

        :return: The location_id of this Phone.
        :rtype: str
        """
        return self._location_id

    @location_id.setter
    def location_id(self, location_id):
        """
        Sets the location_id of this Phone.
        The identifier of the location where this phone number is located

        :param location_id: The location_id of this Phone.
        :type: str
        """

        self._location_id = location_id

    @property
    def service_id(self):
        """
        Gets the service_id of this Phone.
        The identifier of the service for which this is the phone number

        :return: The service_id of this Phone.
        :rtype: str
        """
        return self._service_id

    @service_id.setter
    def service_id(self, service_id):
        """
        Sets the service_id of this Phone.
        The identifier of the service for which this is the phone number

        :param service_id: The service_id of this Phone.
        :type: str
        """

        self._service_id = service_id

    @property
    def organization_id(self):
        """
        Gets the organization_id of this Phone.
        The identifier of the organisation for which this is the phone number

        :return: The organization_id of this Phone.
        :rtype: str
        """
        return self._organization_id

    @organization_id.setter
    def organization_id(self, organization_id):
        """
        Sets the organization_id of this Phone.
        The identifier of the organisation for which this is the phone number

        :param organization_id: The organization_id of this Phone.
        :type: str
        """

        self._organization_id = organization_id

    @property
    def contact_id(self):
        """
        Gets the contact_id of this Phone.
        The identifier of the contact for which this is the phone number

        :return: The contact_id of this Phone.
        :rtype: str
        """
        return self._contact_id

    @contact_id.setter
    def contact_id(self, contact_id):
        """
        Sets the contact_id of this Phone.
        The identifier of the contact for which this is the phone number

        :param contact_id: The contact_id of this Phone.
        :type: str
        """

        self._contact_id = contact_id

    @property
    def number(self):
        """
        Gets the number of this Phone.
        The phone number

        :return: The number of this Phone.
        :rtype: str
        """
        return self._number

    @number.setter
    def number(self, number):
        """
        Sets the number of this Phone.
        The phone number

        :param number: The number of this Phone.
        :type: str
        """

        self._number = number

    @property
    def extension(self):
        """
        Gets the extension of this Phone.
        The extension of the phone number

        :return: The extension of this Phone.
        :rtype: str
        """
        return self._extension

    @extension.setter
    def extension(self, extension):
        """
        Sets the extension of this Phone.
        The extension of the phone number

        :param extension: The extension of this Phone.
        :type: str
        """

        self._extension = extension

    @property
    def type(self):
        """
        Gets the type of this Phone.
        Whether the phone number relates to a fixed or cellular phone

        :return: The type of this Phone.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Phone.
        Whether the phone number relates to a fixed or cellular phone

        :param type: The type of this Phone.
        :type: str
        """

        self._type = type

    @property
    def department(self):
        """
        Gets the department of this Phone.
        The department for which this is the phone number

        :return: The department of this Phone.
        :rtype: str
        """
        return self._department

    @department.setter
    def department(self, department):
        """
        Sets the department of this Phone.
        The department for which this is the phone number

        :param department: The department of this Phone.
        :type: str
        """

        self._department = department

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
