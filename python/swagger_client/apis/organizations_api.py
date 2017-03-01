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

from __future__ import absolute_import

import sys
import os
import re

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class OrganizationsApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def retrieve_l_organization(self, accept, organization_id, **kwargs):
        """
        Organizations
        Retrieve all of the organizations available in this database.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.retrieve_l_organization(accept, organization_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str accept:  (required)
        :param str organization_id:  (required)
        :return: list[Organization]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.retrieve_l_organization_with_http_info(accept, organization_id, **kwargs)
        else:
            (data) = self.retrieve_l_organization_with_http_info(accept, organization_id, **kwargs)
            return data

    def retrieve_l_organization_with_http_info(self, accept, organization_id, **kwargs):
        """
        Organizations
        Retrieve all of the organizations available in this database.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.retrieve_l_organization_with_http_info(accept, organization_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str accept:  (required)
        :param str organization_id:  (required)
        :return: list[Organization]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['accept', 'organization_id']
        all_params.append('callback')
        all_params.append('_return_http_data_only')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method retrieve_l_organization" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'accept' is set
        if ('accept' not in params) or (params['accept'] is None):
            raise ValueError("Missing the required parameter `accept` when calling `retrieve_l_organization`")
        # verify the required parameter 'organization_id' is set
        if ('organization_id' not in params) or (params['organization_id'] is None):
            raise ValueError("Missing the required parameter `organization_id` when calling `retrieve_l_organization`")

        resource_path = '/organizations/{organization_id}'.replace('{format}', 'json')
        path_params = {}
        if 'organization_id' in params:
            path_params['organization_id'] = params['organization_id']

        query_params = {}

        header_params = {}
        if 'accept' in params:
            header_params['Accept'] = params['accept']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type='list[Organization]',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'),
                                            _return_http_data_only=params.get('_return_http_data_only'))

    def retrieve_l_organization_locations(self, accept, organization_id, **kwargs):
        """
        Organization Locations
        This endpoint retrieves all locations that belong to a particular organization.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.retrieve_l_organization_locations(accept, organization_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str accept:  (required)
        :param str organization_id:  (required)
        :return: list[Location]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.retrieve_l_organization_locations_with_http_info(accept, organization_id, **kwargs)
        else:
            (data) = self.retrieve_l_organization_locations_with_http_info(accept, organization_id, **kwargs)
            return data

    def retrieve_l_organization_locations_with_http_info(self, accept, organization_id, **kwargs):
        """
        Organization Locations
        This endpoint retrieves all locations that belong to a particular organization.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.retrieve_l_organization_locations_with_http_info(accept, organization_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str accept:  (required)
        :param str organization_id:  (required)
        :return: list[Location]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['accept', 'organization_id']
        all_params.append('callback')
        all_params.append('_return_http_data_only')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method retrieve_l_organization_locations" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'accept' is set
        if ('accept' not in params) or (params['accept'] is None):
            raise ValueError("Missing the required parameter `accept` when calling `retrieve_l_organization_locations`")
        # verify the required parameter 'organization_id' is set
        if ('organization_id' not in params) or (params['organization_id'] is None):
            raise ValueError("Missing the required parameter `organization_id` when calling `retrieve_l_organization_locations`")

        resource_path = '/organizations/{organization_id}/locations'.replace('{format}', 'json')
        path_params = {}
        if 'organization_id' in params:
            path_params['organization_id'] = params['organization_id']

        query_params = {}

        header_params = {}
        if 'accept' in params:
            header_params['Accept'] = params['accept']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type='list[Location]',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'),
                                            _return_http_data_only=params.get('_return_http_data_only'))

    def retrieve_l_organizations(self, accept, **kwargs):
        """
        Organizations
        Retrieve all of the organizations available in this database.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.retrieve_l_organizations(accept, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str accept:  (required)
        :param str page: 
        :param str per_page: 
        :return: list[Organization]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.retrieve_l_organizations_with_http_info(accept, **kwargs)
        else:
            (data) = self.retrieve_l_organizations_with_http_info(accept, **kwargs)
            return data

    def retrieve_l_organizations_with_http_info(self, accept, **kwargs):
        """
        Organizations
        Retrieve all of the organizations available in this database.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.retrieve_l_organizations_with_http_info(accept, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str accept:  (required)
        :param str page: 
        :param str per_page: 
        :return: list[Organization]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['accept', 'page', 'per_page']
        all_params.append('callback')
        all_params.append('_return_http_data_only')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method retrieve_l_organizations" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'accept' is set
        if ('accept' not in params) or (params['accept'] is None):
            raise ValueError("Missing the required parameter `accept` when calling `retrieve_l_organizations`")

        resource_path = '/organizations'.replace('{format}', 'json')
        path_params = {}

        query_params = {}
        if 'page' in params:
            query_params['page'] = params['page']
        if 'per_page' in params:
            query_params['per_page'] = params['per_page']

        header_params = {}
        if 'accept' in params:
            header_params['Accept'] = params['accept']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type='list[Organization]',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'),
                                            _return_http_data_only=params.get('_return_http_data_only'))
