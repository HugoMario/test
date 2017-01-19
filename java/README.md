# swagger-java-client

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
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ConfigurationApi;

import java.io.File;
import java.util.*;

public class ConfigurationApiExample {

    public static void main(String[] args) {
        
        ConfigurationApi apiInstance = new ConfigurationApi();
        try {
            Object result = apiInstance.getConfigurationSchema();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationApi#getConfigurationSchema");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/v1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigurationApi* | [**getConfigurationSchema**](docs/ConfigurationApi.md#getConfigurationSchema) | **GET** /configuration/definition | 
*ConfigurationApi* | [**getConfigurationValues**](docs/ConfigurationApi.md#getConfigurationValues) | **GET** /configuration | 
*ConfigurationApi* | [**hasAdminAccount**](docs/ConfigurationApi.md#hasAdminAccount) | **GET** /configuration/hasAdminAccount | 
*ConfigurationApi* | [**isConfigured**](docs/ConfigurationApi.md#isConfigured) | **GET** /configuration/isConfigured | 
*ConfigurationApi* | [**setConfiguration**](docs/ConfigurationApi.md#setConfiguration) | **PUT** /configuration | 
*LicenseApi* | [**activateLicense**](docs/LicenseApi.md#activateLicense) | **POST** /license/activate | 
*LicenseApi* | [**activationCode**](docs/LicenseApi.md#activationCode) | **PUT** /license/activate | 
*LicenseApi* | [**getActivationConfiguration**](docs/LicenseApi.md#getActivationConfiguration) | **GET** /license/activate | 
*LicenseApi* | [**isLicensed**](docs/LicenseApi.md#isLicensed) | **POST** /license/state | 
*LicenseApi* | [**uploadLicense**](docs/LicenseApi.md#uploadLicense) | **POST** /license | 
*LoginApi* | [**login**](docs/LoginApi.md#login) | **POST** /login | verify user credentials
*LogsApi* | [**downloadLogs**](docs/LogsApi.md#downloadLogs) | **GET** /logs | Downloads logs files
*SetupApi* | [**checkSystemRequirements**](docs/SetupApi.md#checkSystemRequirements) | **GET** /systemRequirements | 
*SetupApi* | [**getInstallationState**](docs/SetupApi.md#getInstallationState) | **GET** /installationState | Returns the overall status of mandatory installation steps


## Documentation for Models

 - [ActivationRequest](docs/ActivationRequest.md)
 - [ActivationResponse](docs/ActivationResponse.md)
 - [ConfigurationResponse](docs/ConfigurationResponse.md)
 - [ConfigurationState](docs/ConfigurationState.md)
 - [InstallationStatus](docs/InstallationStatus.md)
 - [LicenseState](docs/LicenseState.md)
 - [SystemRequirementsCheckResult](docs/SystemRequirementsCheckResult.md)
 - [User](docs/User.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



