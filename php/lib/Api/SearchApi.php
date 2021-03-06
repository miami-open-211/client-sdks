<?php
/**
 * SearchApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Miami Open 211 API
 *
 * This is a developer area for the Miami Open211 API, providing access to the raw data behind the Switchboard of Miami website. The purpose of this API is to allow anyone to develop web, mobile, or other types of applications that serve the mission of Miami Open211.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use \Swagger\Client\Configuration;
use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\ObjectSerializer;

/**
 * SearchApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SearchApi
{

    /**
     * API Client
     *
     * @var \Swagger\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;

    /**
     * Constructor
     *
     * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
     */
    public function __construct(\Swagger\Client\ApiClient $apiClient = null)
    {
        if ($apiClient == null) {
            $apiClient = new ApiClient();
            $apiClient->getConfig()->setHost('https://miamiopen211-api.herokuapp.com/api');
        }

        $this->apiClient = $apiClient;
    }

    /**
     * Get API client
     *
     * @return \Swagger\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }

    /**
     * Set the API client
     *
     * @param \Swagger\Client\ApiClient $apiClient set the API client
     *
     * @return SearchApi
     */
    public function setApiClient(\Swagger\Client\ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }

    /**
     * Operation searchLocations
     *
     * Search
     *
     * @param string $accept  (required)
     * @param string $category  (optional)
     * @param string $email  (optional)
     * @param string $keyword  (optional)
     * @param string $language  (optional)
     * @param string $lat_lng  (optional)
     * @param string $location  (optional)
     * @param string $org_name  (optional)
     * @param string $radius  (optional)
     * @param string $service_area  (optional)
     * @param string $status  (optional)
     * @param string $page  (optional)
     * @param string $per_page  (optional)
     * @return \Swagger\Client\Model\Location[]
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchLocations($accept, $category = null, $email = null, $keyword = null, $language = null, $lat_lng = null, $location = null, $org_name = null, $radius = null, $service_area = null, $status = null, $page = null, $per_page = null)
    {
        list($response) = $this->searchLocationsWithHttpInfo($accept, $category, $email, $keyword, $language, $lat_lng, $location, $org_name, $radius, $service_area, $status, $page, $per_page);
        return $response;
    }

    /**
     * Operation searchLocationsWithHttpInfo
     *
     * Search
     *
     * @param string $accept  (required)
     * @param string $category  (optional)
     * @param string $email  (optional)
     * @param string $keyword  (optional)
     * @param string $language  (optional)
     * @param string $lat_lng  (optional)
     * @param string $location  (optional)
     * @param string $org_name  (optional)
     * @param string $radius  (optional)
     * @param string $service_area  (optional)
     * @param string $status  (optional)
     * @param string $page  (optional)
     * @param string $per_page  (optional)
     * @return Array of \Swagger\Client\Model\Location[], HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchLocationsWithHttpInfo($accept, $category = null, $email = null, $keyword = null, $language = null, $lat_lng = null, $location = null, $org_name = null, $radius = null, $service_area = null, $status = null, $page = null, $per_page = null)
    {
        // verify the required parameter 'accept' is set
        if ($accept === null) {
            throw new \InvalidArgumentException('Missing the required parameter $accept when calling searchLocations');
        }
        // parse inputs
        $resourcePath = "/search";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());

        // query params
        if ($category !== null) {
            $queryParams['category'] = $this->apiClient->getSerializer()->toQueryValue($category);
        }
        // query params
        if ($email !== null) {
            $queryParams['email'] = $this->apiClient->getSerializer()->toQueryValue($email);
        }
        // query params
        if ($keyword !== null) {
            $queryParams['keyword'] = $this->apiClient->getSerializer()->toQueryValue($keyword);
        }
        // query params
        if ($language !== null) {
            $queryParams['language'] = $this->apiClient->getSerializer()->toQueryValue($language);
        }
        // query params
        if ($lat_lng !== null) {
            $queryParams['lat_lng'] = $this->apiClient->getSerializer()->toQueryValue($lat_lng);
        }
        // query params
        if ($location !== null) {
            $queryParams['location'] = $this->apiClient->getSerializer()->toQueryValue($location);
        }
        // query params
        if ($org_name !== null) {
            $queryParams['org_name'] = $this->apiClient->getSerializer()->toQueryValue($org_name);
        }
        // query params
        if ($radius !== null) {
            $queryParams['radius'] = $this->apiClient->getSerializer()->toQueryValue($radius);
        }
        // query params
        if ($service_area !== null) {
            $queryParams['service_area'] = $this->apiClient->getSerializer()->toQueryValue($service_area);
        }
        // query params
        if ($status !== null) {
            $queryParams['status'] = $this->apiClient->getSerializer()->toQueryValue($status);
        }
        // query params
        if ($page !== null) {
            $queryParams['page'] = $this->apiClient->getSerializer()->toQueryValue($page);
        }
        // query params
        if ($per_page !== null) {
            $queryParams['per_page'] = $this->apiClient->getSerializer()->toQueryValue($per_page);
        }
        // header params
        if ($accept !== null) {
            $headerParams['Accept'] = $this->apiClient->getSerializer()->toHeaderValue($accept);
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\Location[]',
                '/search'
            );

            return array($this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\Location[]', $httpHeader), $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Location[]', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
    }

}
