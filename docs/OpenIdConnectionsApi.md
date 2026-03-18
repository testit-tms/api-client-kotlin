# OpenIdConnectionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2OpenidConnectionsGet**](OpenIdConnectionsApi.md#apiV2OpenidConnectionsGet) | **GET** /api/v2/openid-connections |  |


<a id="apiV2OpenidConnectionsGet"></a>
# **apiV2OpenidConnectionsGet**
> kotlin.collections.List&lt;OpenIdConnectionClientShortModel&gt; apiV2OpenidConnectionsGet()



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = OpenIdConnectionsApi()
try {
    val result : kotlin.collections.List<OpenIdConnectionClientShortModel> = apiInstance.apiV2OpenidConnectionsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OpenIdConnectionsApi#apiV2OpenidConnectionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OpenIdConnectionsApi#apiV2OpenidConnectionsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;OpenIdConnectionClientShortModel&gt;**](OpenIdConnectionClientShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

