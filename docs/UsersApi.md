# UsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2UsersExistsGet**](UsersApi.md#apiV2UsersExistsGet) | **GET** /api/v2/users/exists |  |


<a id="apiV2UsersExistsGet"></a>
# **apiV2UsersExistsGet**
> UserCustomNameValidationResponse apiV2UsersExistsGet(userName)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UsersApi()
val userName : kotlin.String = userName_example // kotlin.String | 
try {
    val result : UserCustomNameValidationResponse = apiInstance.apiV2UsersExistsGet(userName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2UsersExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2UsersExistsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userName** | **kotlin.String**|  | [optional] |

### Return type

[**UserCustomNameValidationResponse**](UserCustomNameValidationResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

