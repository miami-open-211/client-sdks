# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.CategoriesApi;

public class CategoriesApiExample {

    public static void main(String[] args) {
        CategoriesApi apiInstance = new CategoriesApi();
        String accept = "application/vnd.ohanapi+json; version=1"; // String | 
        try {
            List<Categories> result = apiInstance.getCategories(accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#getCategories");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://miamiopen211-api.herokuapp.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CategoriesApi* | [**getCategories**](docs/CategoriesApi.md#getCategories) | **GET** /categories | Categories
*LocationsApi* | [**findNearbyLocations**](docs/LocationsApi.md#findNearbyLocations) | **GET** /locations/{location_id}/nearby | Find Nearby Locations
*LocationsApi* | [**retrieveLocation**](docs/LocationsApi.md#retrieveLocation) | **GET** /locations/{location_id} | Location
*LocationsApi* | [**retrieveLocationServices**](docs/LocationsApi.md#retrieveLocationServices) | **GET** /locations/{location_id}/services | Services
*LocationsApi* | [**retrieveLocations**](docs/LocationsApi.md#retrieveLocations) | **GET** /locations | Locations
*OrganizationsApi* | [**retrieveLOrganization**](docs/OrganizationsApi.md#retrieveLOrganization) | **GET** /organizations/{organization_id} | Organizations
*OrganizationsApi* | [**retrieveLOrganizationLocations**](docs/OrganizationsApi.md#retrieveLOrganizationLocations) | **GET** /organizations/{organization_id}/locations | Organization Locations
*OrganizationsApi* | [**retrieveLOrganizations**](docs/OrganizationsApi.md#retrieveLOrganizations) | **GET** /organizations | Organizations
*SearchApi* | [**searchLocations**](docs/SearchApi.md#searchLocations) | **GET** /search | Search


## Documentation for Models

 - [Categories](docs/Categories.md)
 - [Location](docs/Location.md)
 - [Organization](docs/Organization.md)
 - [Phone](docs/Phone.md)
 - [Service](docs/Service.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



