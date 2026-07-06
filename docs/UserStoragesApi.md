# UserStoragesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2UserStoragesResourceGet**](UserStoragesApi.md#apiV2UserStoragesResourceGet) | **GET** /api/v2/user-storages/{resource} |  |
| [**apiV2UserStoragesResourcePost**](UserStoragesApi.md#apiV2UserStoragesResourcePost) | **POST** /api/v2/user-storages/{resource} |  |


<a id="apiV2UserStoragesResourceGet"></a>
# **apiV2UserStoragesResourceGet**
> apiV2UserStoragesResourceGet(resource)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UserStoragesApi()
val resource : kotlin.String = resource_example // kotlin.String | 
try {
    apiInstance.apiV2UserStoragesResourceGet(resource)
} catch (e: ClientException) {
    println("4xx response calling UserStoragesApi#apiV2UserStoragesResourceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserStoragesApi#apiV2UserStoragesResourceGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resource** | **kotlin.String**|  | |

### Return type

null (empty response body)

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

<a id="apiV2UserStoragesResourcePost"></a>
# **apiV2UserStoragesResourcePost**
> apiV2UserStoragesResourcePost(resource)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UserStoragesApi()
val resource : kotlin.String = resource_example // kotlin.String | 
try {
    apiInstance.apiV2UserStoragesResourcePost(resource)
} catch (e: ClientException) {
    println("4xx response calling UserStoragesApi#apiV2UserStoragesResourcePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserStoragesApi#apiV2UserStoragesResourcePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resource** | **kotlin.String**|  | |

### Return type

null (empty response body)

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

