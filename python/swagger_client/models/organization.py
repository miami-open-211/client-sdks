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


class Organization(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, name=None, alternate_name=None, description=None, email=None, url=None, tax_status=None, tax_id=None, year_incorporated=None, legal_status=None):
        """
        Organization - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'str',
            'name': 'str',
            'alternate_name': 'str',
            'description': 'str',
            'email': 'str',
            'url': 'str',
            'tax_status': 'str',
            'tax_id': 'str',
            'year_incorporated': 'str',
            'legal_status': 'str'
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name',
            'alternate_name': 'alternate_name',
            'description': 'description',
            'email': 'email',
            'url': 'url',
            'tax_status': 'tax_status',
            'tax_id': 'tax_id',
            'year_incorporated': 'year_incorporated',
            'legal_status': 'legal_status'
        }

        self._id = id
        self._name = name
        self._alternate_name = alternate_name
        self._description = description
        self._email = email
        self._url = url
        self._tax_status = tax_status
        self._tax_id = tax_id
        self._year_incorporated = year_incorporated
        self._legal_status = legal_status

    @property
    def id(self):
        """
        Gets the id of this Organization.
        Each organization must have a unique identifier.

        :return: The id of this Organization.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Organization.
        Each organization must have a unique identifier.

        :param id: The id of this Organization.
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """
        Gets the name of this Organization.
        The official or public name of the organization.

        :return: The name of this Organization.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Organization.
        The official or public name of the organization.

        :param name: The name of this Organization.
        :type: str
        """

        self._name = name

    @property
    def alternate_name(self):
        """
        Gets the alternate_name of this Organization.
        Alternative or commonly used name for the organization.

        :return: The alternate_name of this Organization.
        :rtype: str
        """
        return self._alternate_name

    @alternate_name.setter
    def alternate_name(self, alternate_name):
        """
        Sets the alternate_name of this Organization.
        Alternative or commonly used name for the organization.

        :param alternate_name: The alternate_name of this Organization.
        :type: str
        """

        self._alternate_name = alternate_name

    @property
    def description(self):
        """
        Gets the description of this Organization.
        A brief summary about the organization. It can contain markup such as HTML or Markdown.

        :return: The description of this Organization.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this Organization.
        A brief summary about the organization. It can contain markup such as HTML or Markdown.

        :param description: The description of this Organization.
        :type: str
        """

        self._description = description

    @property
    def email(self):
        """
        Gets the email of this Organization.
        The contact e-mail address for the organization.

        :return: The email of this Organization.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """
        Sets the email of this Organization.
        The contact e-mail address for the organization.

        :param email: The email of this Organization.
        :type: str
        """

        self._email = email

    @property
    def url(self):
        """
        Gets the url of this Organization.
        The UR of the organization.

        :return: The url of this Organization.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """
        Sets the url of this Organization.
        The UR of the organization.

        :param url: The url of this Organization.
        :type: str
        """

        self._url = url

    @property
    def tax_status(self):
        """
        Gets the tax_status of this Organization.
        Government assigned tax designation for for tax-exempt organizations.

        :return: The tax_status of this Organization.
        :rtype: str
        """
        return self._tax_status

    @tax_status.setter
    def tax_status(self, tax_status):
        """
        Sets the tax_status of this Organization.
        Government assigned tax designation for for tax-exempt organizations.

        :param tax_status: The tax_status of this Organization.
        :type: str
        """

        self._tax_status = tax_status

    @property
    def tax_id(self):
        """
        Gets the tax_id of this Organization.
        A government issued identifier used for the purpose of tax administration.

        :return: The tax_id of this Organization.
        :rtype: str
        """
        return self._tax_id

    @tax_id.setter
    def tax_id(self, tax_id):
        """
        Sets the tax_id of this Organization.
        A government issued identifier used for the purpose of tax administration.

        :param tax_id: The tax_id of this Organization.
        :type: str
        """

        self._tax_id = tax_id

    @property
    def year_incorporated(self):
        """
        Gets the year_incorporated of this Organization.
        The year in which the organization was legally formed.

        :return: The year_incorporated of this Organization.
        :rtype: str
        """
        return self._year_incorporated

    @year_incorporated.setter
    def year_incorporated(self, year_incorporated):
        """
        Sets the year_incorporated of this Organization.
        The year in which the organization was legally formed.

        :param year_incorporated: The year_incorporated of this Organization.
        :type: str
        """

        self._year_incorporated = year_incorporated

    @property
    def legal_status(self):
        """
        Gets the legal_status of this Organization.
        The legal status defines the conditions that an organization is operating under.

        :return: The legal_status of this Organization.
        :rtype: str
        """
        return self._legal_status

    @legal_status.setter
    def legal_status(self, legal_status):
        """
        Sets the legal_status of this Organization.
        The legal status defines the conditions that an organization is operating under.

        :param legal_status: The legal_status of this Organization.
        :type: str
        """

        self._legal_status = legal_status

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
