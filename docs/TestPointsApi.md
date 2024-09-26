# TestPointsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2TestPointsIdTestRunsGet**](TestPointsApi.md#apiV2TestPointsIdTestRunsGet) | **GET** /api/v2/testPoints/{id}/testRuns | Get all test runs which use test point |
| [**apiV2TestPointsIdWorkItemGet**](TestPointsApi.md#apiV2TestPointsIdWorkItemGet) | **GET** /api/v2/testPoints/{id}/workItem | Get work item represented by test point |
| [**apiV2TestPointsSearchIdPost**](TestPointsApi.md#apiV2TestPointsSearchIdPost) | **POST** /api/v2/testPoints/search/id | Search for test points and extract IDs only |
| [**apiV2TestPointsSearchPost**](TestPointsApi.md#apiV2TestPointsSearchPost) | **POST** /api/v2/testPoints/search | Search for test points |


<a id="apiV2TestPointsIdTestRunsGet"></a>
# **apiV2TestPointsIdTestRunsGet**
> kotlin.collections.List&lt;TestRunModel&gt; apiV2TestPointsIdTestRunsGet(id)

Get all test runs which use test point

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPointsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test point unique ID
try {
    val result : kotlin.collections.List<TestRunModel> = apiInstance.apiV2TestPointsIdTestRunsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPointsApi#apiV2TestPointsIdTestRunsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPointsApi#apiV2TestPointsIdTestRunsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test point unique ID | |

### Return type

[**kotlin.collections.List&lt;TestRunModel&gt;**](TestRunModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPointsIdWorkItemGet"></a>
# **apiV2TestPointsIdWorkItemGet**
> WorkItemModel apiV2TestPointsIdWorkItemGet(id)

Get work item represented by test point

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPointsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test point unique ID
try {
    val result : WorkItemModel = apiInstance.apiV2TestPointsIdWorkItemGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPointsApi#apiV2TestPointsIdWorkItemGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPointsApi#apiV2TestPointsIdWorkItemGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test point unique ID | |

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPointsSearchIdPost"></a>
# **apiV2TestPointsSearchIdPost**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2TestPointsSearchIdPost(skip, take, orderBy, searchField, searchValue, testPointFilterModel)

Search for test points and extract IDs only

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPointsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val testPointFilterModel : TestPointFilterModel =  // TestPointFilterModel | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2TestPointsSearchIdPost(skip, take, orderBy, searchField, searchValue, testPointFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPointsApi#apiV2TestPointsSearchIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPointsApi#apiV2TestPointsSearchIdPost")
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
| **testPointFilterModel** | [**TestPointFilterModel**](TestPointFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestPointsSearchPost"></a>
# **apiV2TestPointsSearchPost**
> kotlin.collections.List&lt;TestPointShortGetModel&gt; apiV2TestPointsSearchPost(skip, take, orderBy, searchField, searchValue, testPointFilterModel)

Search for test points

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPointsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val testPointFilterModel : TestPointFilterModel =  // TestPointFilterModel | 
try {
    val result : kotlin.collections.List<TestPointShortGetModel> = apiInstance.apiV2TestPointsSearchPost(skip, take, orderBy, searchField, searchValue, testPointFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPointsApi#apiV2TestPointsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPointsApi#apiV2TestPointsSearchPost")
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
| **testPointFilterModel** | [**TestPointFilterModel**](TestPointFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPointShortGetModel&gt;**](TestPointShortGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

