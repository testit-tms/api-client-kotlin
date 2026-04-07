# UsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2UsersExistsGet**](UsersApi.md#apiV2UsersExistsGet) | **GET** /api/v2/users/exists |  |
| [**apiV2UsersPost**](UsersApi.md#apiV2UsersPost) | **POST** /api/v2/users |  |
| [**apiV2UsersUserIdDelete**](UsersApi.md#apiV2UsersUserIdDelete) | **DELETE** /api/v2/users/{userId} |  |
| [**apiV2UsersUserIdGet**](UsersApi.md#apiV2UsersUserIdGet) | **GET** /api/v2/users/{userId} |  |


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

<a id="apiV2UsersPost"></a>
# **apiV2UsersPost**
> UserApiModel apiV2UsersPost(createUserApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UsersApi()
val createUserApiModel : CreateUserApiModel =  // CreateUserApiModel | 
try {
    val result : UserApiModel = apiInstance.apiV2UsersPost(createUserApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2UsersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2UsersPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createUserApiModel** | [**CreateUserApiModel**](CreateUserApiModel.md)|  | [optional] |

### Return type

[**UserApiModel**](UserApiModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2UsersUserIdDelete"></a>
# **apiV2UsersUserIdDelete**
> apiV2UsersUserIdDelete(userId)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UsersApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2UsersUserIdDelete(userId)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2UsersUserIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2UsersUserIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2UsersUserIdGet"></a>
# **apiV2UsersUserIdGet**
> UserApiModel apiV2UsersUserIdGet(userId)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UsersApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : UserApiModel = apiInstance.apiV2UsersUserIdGet(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2UsersUserIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2UsersUserIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **java.util.UUID**|  | |

### Return type

[**UserApiModel**](UserApiModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

