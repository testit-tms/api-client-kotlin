# BackgroundJobsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2BackgroundJobsCompletedDelete**](BackgroundJobsApi.md#apiV2BackgroundJobsCompletedDelete) | **DELETE** /api/v2/backgroundJobs/completed | Delete all completed background jobs |
| [**apiV2BackgroundJobsGet**](BackgroundJobsApi.md#apiV2BackgroundJobsGet) | **GET** /api/v2/backgroundJobs |  |
| [**apiV2BackgroundJobsIdCancelPost**](BackgroundJobsApi.md#apiV2BackgroundJobsIdCancelPost) | **POST** /api/v2/backgroundJobs/{id}/cancel | Cancel current user background job |
| [**apiV2BackgroundJobsIdGet**](BackgroundJobsApi.md#apiV2BackgroundJobsIdGet) | **GET** /api/v2/backgroundJobs/{id} | Get background job by ID |
| [**apiV2BackgroundJobsIdStatusGet**](BackgroundJobsApi.md#apiV2BackgroundJobsIdStatusGet) | **GET** /api/v2/backgroundJobs/{id}/status | Get background job status by job ID |
| [**apiV2BackgroundJobsSearchPost**](BackgroundJobsApi.md#apiV2BackgroundJobsSearchPost) | **POST** /api/v2/backgroundJobs/search | Search for user background jobs |


<a id="apiV2BackgroundJobsCompletedDelete"></a>
# **apiV2BackgroundJobsCompletedDelete**
> apiV2BackgroundJobsCompletedDelete()

Delete all completed background jobs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = BackgroundJobsApi()
try {
    apiInstance.apiV2BackgroundJobsCompletedDelete()
} catch (e: ClientException) {
    println("4xx response calling BackgroundJobsApi#apiV2BackgroundJobsCompletedDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackgroundJobsApi#apiV2BackgroundJobsCompletedDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2BackgroundJobsGet"></a>
# **apiV2BackgroundJobsGet**
> kotlin.collections.List&lt;BackgroundJobGetModel&gt; apiV2BackgroundJobsGet(skip, take, orderBy, searchField, searchValue)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = BackgroundJobsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<BackgroundJobGetModel> = apiInstance.apiV2BackgroundJobsGet(skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackgroundJobsApi#apiV2BackgroundJobsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackgroundJobsApi#apiV2BackgroundJobsGet")
    e.printStackTrace()
}
```

### Parameters
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;BackgroundJobGetModel&gt;**](BackgroundJobGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2BackgroundJobsIdCancelPost"></a>
# **apiV2BackgroundJobsIdCancelPost**
> apiV2BackgroundJobsIdCancelPost(id)

Cancel current user background job

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = BackgroundJobsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2BackgroundJobsIdCancelPost(id)
} catch (e: ClientException) {
    println("4xx response calling BackgroundJobsApi#apiV2BackgroundJobsIdCancelPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackgroundJobsApi#apiV2BackgroundJobsIdCancelPost")
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

<a id="apiV2BackgroundJobsIdGet"></a>
# **apiV2BackgroundJobsIdGet**
> BackgroundJobGetModel apiV2BackgroundJobsIdGet(id)

Get background job by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = BackgroundJobsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the background job
try {
    val result : BackgroundJobGetModel = apiInstance.apiV2BackgroundJobsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackgroundJobsApi#apiV2BackgroundJobsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackgroundJobsApi#apiV2BackgroundJobsIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique ID of the background job | |

### Return type

[**BackgroundJobGetModel**](BackgroundJobGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2BackgroundJobsIdStatusGet"></a>
# **apiV2BackgroundJobsIdStatusGet**
> BackgroundJobState apiV2BackgroundJobsIdStatusGet(id)

Get background job status by job ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = BackgroundJobsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the background job
try {
    val result : BackgroundJobState = apiInstance.apiV2BackgroundJobsIdStatusGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackgroundJobsApi#apiV2BackgroundJobsIdStatusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackgroundJobsApi#apiV2BackgroundJobsIdStatusGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique ID of the background job | |

### Return type

[**BackgroundJobState**](BackgroundJobState.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2BackgroundJobsSearchPost"></a>
# **apiV2BackgroundJobsSearchPost**
> kotlin.collections.List&lt;BackgroundJobGetModel&gt; apiV2BackgroundJobsSearchPost(skip, take, orderBy, searchField, searchValue, backgroundJobFilterModel)

Search for user background jobs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = BackgroundJobsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val backgroundJobFilterModel : BackgroundJobFilterModel =  // BackgroundJobFilterModel | 
try {
    val result : kotlin.collections.List<BackgroundJobGetModel> = apiInstance.apiV2BackgroundJobsSearchPost(skip, take, orderBy, searchField, searchValue, backgroundJobFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BackgroundJobsApi#apiV2BackgroundJobsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BackgroundJobsApi#apiV2BackgroundJobsSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **backgroundJobFilterModel** | [**BackgroundJobFilterModel**](BackgroundJobFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;BackgroundJobGetModel&gt;**](BackgroundJobGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

