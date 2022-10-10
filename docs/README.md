## Overview

A certificate can be uploaded to the IONOS CLOUD infrastructure and can be used to manage IONOS resources

## Getting Started

### Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ionoscloud.certmanager</groupId>
  <artifactId>ionos-cloud-sdk-certmanager</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ionoscloud.certmanager:ionos-cloud-sdk-certmanager:1.0.0"
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ionos-cloud-sdk-certmanager-1.0.0.jar`
* `target/lib/*.jar`


### Usage


## FAQ

 - How can I open a bug/feature request?
	Bugs & feature requests can be open on the repository issues: https://github.com/ionos-cloud/ionos-cloud-sdk-certmanager/issues/new

 - Can I contribute to the CertManager Java SDK?
    Pur SDKs are automatically generated using OpenAPI Generator and don’t support manual changes. If you need changes please open an issue and we’ll try to take care of it.
