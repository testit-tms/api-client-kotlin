# ExternalServicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ExternalServicesMetadataGet**](ExternalServicesApi.md#apiV2ExternalServicesMetadataGet) | **GET** /api/v2/external-services/metadata | Retrieves the metadata for all available external services |


<a id="apiV2ExternalServicesMetadataGet"></a>
# **apiV2ExternalServicesMetadataGet**
> ExternalServicesMetadataApiResult apiV2ExternalServicesMetadataGet()

Retrieves the metadata for all available external services

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ExternalServicesApi()
try {
    val result : ExternalServicesMetadataApiResult = apiInstance.apiV2ExternalServicesMetadataGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalServicesApi#apiV2ExternalServicesMetadataGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalServicesApi#apiV2ExternalServicesMetadataGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExternalServicesMetadataApiResult**](ExternalServicesMetadataApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

