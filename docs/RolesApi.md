# RolesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2RolesGet**](RolesApi.md#apiV2RolesGet) | **GET** /api/v2/roles |  |


<a id="apiV2RolesGet"></a>
# **apiV2RolesGet**
> RoleApiModelApiCollection apiV2RolesGet()



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = RolesApi()
try {
    val result : RoleApiModelApiCollection = apiInstance.apiV2RolesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2RolesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2RolesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RoleApiModelApiCollection**](RoleApiModelApiCollection.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

