# TestStatusesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2TestStatusesCodeCodeExistsGet**](TestStatusesApi.md#apiV2TestStatusesCodeCodeExistsGet) | **GET** /api/v2/testStatuses/code/{code}/exists |  |
| [**apiV2TestStatusesIdDelete**](TestStatusesApi.md#apiV2TestStatusesIdDelete) | **DELETE** /api/v2/testStatuses/{id} |  |
| [**apiV2TestStatusesIdGet**](TestStatusesApi.md#apiV2TestStatusesIdGet) | **GET** /api/v2/testStatuses/{id} |  |
| [**apiV2TestStatusesIdPut**](TestStatusesApi.md#apiV2TestStatusesIdPut) | **PUT** /api/v2/testStatuses/{id} |  |
| [**apiV2TestStatusesNameNameExistsGet**](TestStatusesApi.md#apiV2TestStatusesNameNameExistsGet) | **GET** /api/v2/testStatuses/name/{name}/exists |  |
| [**apiV2TestStatusesPost**](TestStatusesApi.md#apiV2TestStatusesPost) | **POST** /api/v2/testStatuses |  |
| [**apiV2TestStatusesSearchPost**](TestStatusesApi.md#apiV2TestStatusesSearchPost) | **POST** /api/v2/testStatuses/search |  |


<a id="apiV2TestStatusesCodeCodeExistsGet"></a>
# **apiV2TestStatusesCodeCodeExistsGet**
> kotlin.Boolean apiV2TestStatusesCodeCodeExistsGet(code)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestStatusesApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.apiV2TestStatusesCodeCodeExistsGet(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestStatusesApi#apiV2TestStatusesCodeCodeExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestStatusesApi#apiV2TestStatusesCodeCodeExistsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **kotlin.String**|  | |

### Return type

**kotlin.Boolean**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a id="apiV2TestStatusesIdDelete"></a>
# **apiV2TestStatusesIdDelete**
> apiV2TestStatusesIdDelete(id)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestStatusesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2TestStatusesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling TestStatusesApi#apiV2TestStatusesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestStatusesApi#apiV2TestStatusesIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestStatusesIdGet"></a>
# **apiV2TestStatusesIdGet**
> TestStatusApiResult apiV2TestStatusesIdGet(id)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestStatusesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TestStatusApiResult = apiInstance.apiV2TestStatusesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestStatusesApi#apiV2TestStatusesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestStatusesApi#apiV2TestStatusesIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**TestStatusApiResult**](TestStatusApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a id="apiV2TestStatusesIdPut"></a>
# **apiV2TestStatusesIdPut**
> apiV2TestStatusesIdPut(id, updateTestStatusApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestStatusesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateTestStatusApiModel : UpdateTestStatusApiModel =  // UpdateTestStatusApiModel | 
try {
    apiInstance.apiV2TestStatusesIdPut(id, updateTestStatusApiModel)
} catch (e: ClientException) {
    println("4xx response calling TestStatusesApi#apiV2TestStatusesIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestStatusesApi#apiV2TestStatusesIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateTestStatusApiModel** | [**UpdateTestStatusApiModel**](UpdateTestStatusApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a id="apiV2TestStatusesNameNameExistsGet"></a>
# **apiV2TestStatusesNameNameExistsGet**
> kotlin.Boolean apiV2TestStatusesNameNameExistsGet(name)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestStatusesApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.apiV2TestStatusesNameNameExistsGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestStatusesApi#apiV2TestStatusesNameNameExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestStatusesApi#apiV2TestStatusesNameNameExistsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**|  | |

### Return type

**kotlin.Boolean**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a id="apiV2TestStatusesPost"></a>
# **apiV2TestStatusesPost**
> TestStatusApiResult apiV2TestStatusesPost(createTestStatusApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestStatusesApi()
val createTestStatusApiModel : CreateTestStatusApiModel =  // CreateTestStatusApiModel | 
try {
    val result : TestStatusApiResult = apiInstance.apiV2TestStatusesPost(createTestStatusApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestStatusesApi#apiV2TestStatusesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestStatusesApi#apiV2TestStatusesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTestStatusApiModel** | [**CreateTestStatusApiModel**](CreateTestStatusApiModel.md)|  | [optional] |

### Return type

[**TestStatusApiResult**](TestStatusApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: text/plain, application/json

<a id="apiV2TestStatusesSearchPost"></a>
# **apiV2TestStatusesSearchPost**
> TestStatusApiResultReply apiV2TestStatusesSearchPost(searchTestStatusesApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestStatusesApi()
val searchTestStatusesApiModel : SearchTestStatusesApiModel =  // SearchTestStatusesApiModel | 
try {
    val result : TestStatusApiResultReply = apiInstance.apiV2TestStatusesSearchPost(searchTestStatusesApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestStatusesApi#apiV2TestStatusesSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestStatusesApi#apiV2TestStatusesSearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchTestStatusesApiModel** | [**SearchTestStatusesApiModel**](SearchTestStatusesApiModel.md)|  | [optional] |

### Return type

[**TestStatusApiResultReply**](TestStatusApiResultReply.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: text/plain, application/json

