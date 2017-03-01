<?php
/**
 * Organization
 *
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

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * Organization Class Doc Comment
 *
 * @category    Class */
/** 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Organization implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'organization';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'id' => 'string',
        'name' => 'string',
        'alternate_name' => 'string',
        'description' => 'string',
        'email' => 'string',
        'url' => 'string',
        'tax_status' => 'string',
        'tax_id' => 'string',
        'year_incorporated' => 'string',
        'legal_status' => 'string'
    );

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = array(
        'id' => 'id',
        'name' => 'name',
        'alternate_name' => 'alternate_name',
        'description' => 'description',
        'email' => 'email',
        'url' => 'url',
        'tax_status' => 'tax_status',
        'tax_id' => 'tax_id',
        'year_incorporated' => 'year_incorporated',
        'legal_status' => 'legal_status'
    );

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = array(
        'id' => 'setId',
        'name' => 'setName',
        'alternate_name' => 'setAlternateName',
        'description' => 'setDescription',
        'email' => 'setEmail',
        'url' => 'setUrl',
        'tax_status' => 'setTaxStatus',
        'tax_id' => 'setTaxId',
        'year_incorporated' => 'setYearIncorporated',
        'legal_status' => 'setLegalStatus'
    );

    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = array(
        'id' => 'getId',
        'name' => 'getName',
        'alternate_name' => 'getAlternateName',
        'description' => 'getDescription',
        'email' => 'getEmail',
        'url' => 'getUrl',
        'tax_status' => 'getTaxStatus',
        'tax_id' => 'getTaxId',
        'year_incorporated' => 'getYearIncorporated',
        'legal_status' => 'getLegalStatus'
    );

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array();

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['alternate_name'] = isset($data['alternate_name']) ? $data['alternate_name'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['email'] = isset($data['email']) ? $data['email'] : null;
        $this->container['url'] = isset($data['url']) ? $data['url'] : null;
        $this->container['tax_status'] = isset($data['tax_status']) ? $data['tax_status'] : null;
        $this->container['tax_id'] = isset($data['tax_id']) ? $data['tax_id'] : null;
        $this->container['year_incorporated'] = isset($data['year_incorporated']) ? $data['year_incorporated'] : null;
        $this->container['legal_status'] = isset($data['legal_status']) ? $data['legal_status'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        return true;
    }


    /**
     * Gets id
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     * @param string $id Each organization must have a unique identifier.
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets name
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     * @param string $name The official or public name of the organization.
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets alternate_name
     * @return string
     */
    public function getAlternateName()
    {
        return $this->container['alternate_name'];
    }

    /**
     * Sets alternate_name
     * @param string $alternate_name Alternative or commonly used name for the organization.
     * @return $this
     */
    public function setAlternateName($alternate_name)
    {
        $this->container['alternate_name'] = $alternate_name;

        return $this;
    }

    /**
     * Gets description
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     * @param string $description A brief summary about the organization. It can contain markup such as HTML or Markdown.
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets email
     * @return string
     */
    public function getEmail()
    {
        return $this->container['email'];
    }

    /**
     * Sets email
     * @param string $email The contact e-mail address for the organization.
     * @return $this
     */
    public function setEmail($email)
    {
        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets url
     * @return string
     */
    public function getUrl()
    {
        return $this->container['url'];
    }

    /**
     * Sets url
     * @param string $url The UR of the organization.
     * @return $this
     */
    public function setUrl($url)
    {
        $this->container['url'] = $url;

        return $this;
    }

    /**
     * Gets tax_status
     * @return string
     */
    public function getTaxStatus()
    {
        return $this->container['tax_status'];
    }

    /**
     * Sets tax_status
     * @param string $tax_status Government assigned tax designation for for tax-exempt organizations.
     * @return $this
     */
    public function setTaxStatus($tax_status)
    {
        $this->container['tax_status'] = $tax_status;

        return $this;
    }

    /**
     * Gets tax_id
     * @return string
     */
    public function getTaxId()
    {
        return $this->container['tax_id'];
    }

    /**
     * Sets tax_id
     * @param string $tax_id A government issued identifier used for the purpose of tax administration.
     * @return $this
     */
    public function setTaxId($tax_id)
    {
        $this->container['tax_id'] = $tax_id;

        return $this;
    }

    /**
     * Gets year_incorporated
     * @return string
     */
    public function getYearIncorporated()
    {
        return $this->container['year_incorporated'];
    }

    /**
     * Sets year_incorporated
     * @param string $year_incorporated The year in which the organization was legally formed.
     * @return $this
     */
    public function setYearIncorporated($year_incorporated)
    {
        $this->container['year_incorporated'] = $year_incorporated;

        return $this;
    }

    /**
     * Gets legal_status
     * @return string
     */
    public function getLegalStatus()
    {
        return $this->container['legal_status'];
    }

    /**
     * Sets legal_status
     * @param string $legal_status The legal status defines the conditions that an organization is operating under.
     * @return $this
     */
    public function setLegalStatus($legal_status)
    {
        $this->container['legal_status'] = $legal_status;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


