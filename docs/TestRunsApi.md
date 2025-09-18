# TestRunsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2TestRunsDelete**](TestRunsApi.md#apiV2TestRunsDelete) | **DELETE** /api/v2/testRuns | Delete multiple test runs |
| [**apiV2TestRunsIdAutoTestsNamespacesGet**](TestRunsApi.md#apiV2TestRunsIdAutoTestsNamespacesGet) | **GET** /api/v2/testRuns/{id}/autoTestsNamespaces | Get autotest classes and namespaces in test run |
| [**apiV2TestRunsIdDelete**](TestRunsApi.md#apiV2TestRunsIdDelete) | **DELETE** /api/v2/testRuns/{id} | Delete test run |
| [**apiV2TestRunsIdPurgePost**](TestRunsApi.md#apiV2TestRunsIdPurgePost) | **POST** /api/v2/testRuns/{id}/purge | Permanently delete test run from archive |
| [**apiV2TestRunsIdRerunsPost**](TestRunsApi.md#apiV2TestRunsIdRerunsPost) | **POST** /api/v2/testRuns/{id}/reruns | Manual autotests rerun in test run |
| [**apiV2TestRunsIdRestorePost**](TestRunsApi.md#apiV2TestRunsIdRestorePost) | **POST** /api/v2/testRuns/{id}/restore | Restore test run from the archive |
| [**apiV2TestRunsIdStatisticsFilterPost**](TestRunsApi.md#apiV2TestRunsIdStatisticsFilterPost) | **POST** /api/v2/testRuns/{id}/statistics/filter | Search for the test run test results and build statistics |
| [**apiV2TestRunsIdTestPointsResultsGet**](TestRunsApi.md#apiV2TestRunsIdTestPointsResultsGet) | **GET** /api/v2/testRuns/{id}/testPoints/results | Get test results from the test run grouped by test points |
| [**apiV2TestRunsIdTestResultsBulkPut**](TestRunsApi.md#apiV2TestRunsIdTestResultsBulkPut) | **PUT** /api/v2/testRuns/{id}/testResults/bulk | Partial edit of multiple test results in the test run |
| [**apiV2TestRunsIdTestResultsLastModifiedModificationDateGet**](TestRunsApi.md#apiV2TestRunsIdTestResultsLastModifiedModificationDateGet) | **GET** /api/v2/testRuns/{id}/testResults/lastModified/modificationDate | Get modification date of last test result of the test run |
| [**apiV2TestRunsPurgeBulkPost**](TestRunsApi.md#apiV2TestRunsPurgeBulkPost) | **POST** /api/v2/testRuns/purge/bulk | Permanently delete multiple test runs from archive |
| [**apiV2TestRunsRestoreBulkPost**](TestRunsApi.md#apiV2TestRunsRestoreBulkPost) | **POST** /api/v2/testRuns/restore/bulk | Restore multiple test runs from the archive |
| [**apiV2TestRunsSearchPost**](TestRunsApi.md#apiV2TestRunsSearchPost) | **POST** /api/v2/testRuns/search | Search for test runs |
| [**apiV2TestRunsUpdateMultiplePost**](TestRunsApi.md#apiV2TestRunsUpdateMultiplePost) | **POST** /api/v2/testRuns/updateMultiple | Update multiple test runs |
| [**completeTestRun**](TestRunsApi.md#completeTestRun) | **POST** /api/v2/testRuns/{id}/complete | Complete TestRun |
| [**createAndFillByAutoTests**](TestRunsApi.md#createAndFillByAutoTests) | **POST** /api/v2/testRuns/byAutoTests | Create test runs based on autotests and configurations |
| [**createAndFillByConfigurations**](TestRunsApi.md#createAndFillByConfigurations) | **POST** /api/v2/testRuns/byConfigurations | Create test runs picking the needed test points |
| [**createAndFillByWorkItems**](TestRunsApi.md#createAndFillByWorkItems) | **POST** /api/v2/testRuns/byWorkItems | Create test run based on configurations and work items |
| [**createEmpty**](TestRunsApi.md#createEmpty) | **POST** /api/v2/testRuns | Create empty TestRun |
| [**getTestRunById**](TestRunsApi.md#getTestRunById) | **GET** /api/v2/testRuns/{id} | Get TestRun by Id |
| [**setAutoTestResultsForTestRun**](TestRunsApi.md#setAutoTestResultsForTestRun) | **POST** /api/v2/testRuns/{id}/testResults | Send test results to the test runs in the system |
| [**startTestRun**](TestRunsApi.md#startTestRun) | **POST** /api/v2/testRuns/{id}/start | Start TestRun |
| [**stopTestRun**](TestRunsApi.md#stopTestRun) | **POST** /api/v2/testRuns/{id}/stop | Stop TestRun |
| [**updateEmpty**](TestRunsApi.md#updateEmpty) | **PUT** /api/v2/testRuns | Update empty TestRun |


<a id="apiV2TestRunsDelete"></a>
# **apiV2TestRunsDelete**
> kotlin.Int apiV2TestRunsDelete(testRunSelectApiModel)

Delete multiple test runs

  Use case    User sets selection parameters of test runs    System search and delete collection of test runs    System returns the number of deleted test runs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val testRunSelectApiModel : TestRunSelectApiModel =  // TestRunSelectApiModel | 
try {
    val result : kotlin.Int = apiInstance.apiV2TestRunsDelete(testRunSelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testRunSelectApiModel** | [**TestRunSelectApiModel**](TestRunSelectApiModel.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestRunsIdAutoTestsNamespacesGet"></a>
# **apiV2TestRunsIdAutoTestsNamespacesGet**
> AutoTestNamespacesCountResponse apiV2TestRunsIdAutoTestsNamespacesGet(id)

Get autotest classes and namespaces in test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AutoTestNamespacesCountResponse = apiInstance.apiV2TestRunsIdAutoTestsNamespacesGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdAutoTestsNamespacesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdAutoTestsNamespacesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**AutoTestNamespacesCountResponse**](AutoTestNamespacesCountResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestRunsIdDelete"></a>
# **apiV2TestRunsIdDelete**
> apiV2TestRunsIdDelete(id)

Delete test run

  Use case    User sets test run internal (guid format) identifier    System search and delete test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run internal (UUID) identifier
try {
    apiInstance.apiV2TestRunsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test run internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestRunsIdPurgePost"></a>
# **apiV2TestRunsIdPurgePost**
> apiV2TestRunsIdPurgePost(id)

Permanently delete test run from archive

  Use case    User sets archived test run internal (guid format) identifier    System search and purge archived test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run internal (UUID) identifier
try {
    apiInstance.apiV2TestRunsIdPurgePost(id)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdPurgePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdPurgePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test run internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestRunsIdRerunsPost"></a>
# **apiV2TestRunsIdRerunsPost**
> ManualRerunApiResult apiV2TestRunsIdRerunsPost(id, manualRerunSelectTestResultsApiModel)

Manual autotests rerun in test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val manualRerunSelectTestResultsApiModel : ManualRerunSelectTestResultsApiModel =  // ManualRerunSelectTestResultsApiModel | 
try {
    val result : ManualRerunApiResult = apiInstance.apiV2TestRunsIdRerunsPost(id, manualRerunSelectTestResultsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdRerunsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdRerunsPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **manualRerunSelectTestResultsApiModel** | [**ManualRerunSelectTestResultsApiModel**](ManualRerunSelectTestResultsApiModel.md)|  | [optional] |

### Return type

[**ManualRerunApiResult**](ManualRerunApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestRunsIdRestorePost"></a>
# **apiV2TestRunsIdRestorePost**
> apiV2TestRunsIdRestorePost(id)

Restore test run from the archive

  Use case    User sets archived test run internal (guid format) identifier    System search and restore test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the test run
try {
    apiInstance.apiV2TestRunsIdRestorePost(id)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdRestorePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdRestorePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique ID of the test run | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestRunsIdStatisticsFilterPost"></a>
# **apiV2TestRunsIdStatisticsFilterPost**
> TestResultsStatisticsApiResult apiV2TestRunsIdStatisticsFilterPost(id, testRunStatisticsFilterApiModel)

Search for the test run test results and build statistics

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
val testRunStatisticsFilterApiModel : TestRunStatisticsFilterApiModel =  // TestRunStatisticsFilterApiModel | 
try {
    val result : TestResultsStatisticsApiResult = apiInstance.apiV2TestRunsIdStatisticsFilterPost(id, testRunStatisticsFilterApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdStatisticsFilterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdStatisticsFilterPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test run unique ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testRunStatisticsFilterApiModel** | [**TestRunStatisticsFilterApiModel**](TestRunStatisticsFilterApiModel.md)|  | [optional] |

### Return type

[**TestResultsStatisticsApiResult**](TestResultsStatisticsApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestRunsIdTestPointsResultsGet"></a>
# **apiV2TestRunsIdTestPointsResultsGet**
> kotlin.collections.List&lt;TestPointResultApiResult&gt; apiV2TestRunsIdTestPointsResultsGet(id)

Get test results from the test run grouped by test points

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
try {
    val result : kotlin.collections.List<TestPointResultApiResult> = apiInstance.apiV2TestRunsIdTestPointsResultsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdTestPointsResultsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdTestPointsResultsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test run unique ID | |

### Return type

[**kotlin.collections.List&lt;TestPointResultApiResult&gt;**](TestPointResultApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestRunsIdTestResultsBulkPut"></a>
# **apiV2TestRunsIdTestResultsBulkPut**
> apiV2TestRunsIdTestResultsBulkPut(id, testRunTestResultsPartialBulkSetModel)

Partial edit of multiple test results in the test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
val testRunTestResultsPartialBulkSetModel : TestRunTestResultsPartialBulkSetModel =  // TestRunTestResultsPartialBulkSetModel | 
try {
    apiInstance.apiV2TestRunsIdTestResultsBulkPut(id, testRunTestResultsPartialBulkSetModel)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdTestResultsBulkPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdTestResultsBulkPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test run unique ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testRunTestResultsPartialBulkSetModel** | [**TestRunTestResultsPartialBulkSetModel**](TestRunTestResultsPartialBulkSetModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestRunsIdTestResultsLastModifiedModificationDateGet"></a>
# **apiV2TestRunsIdTestResultsLastModifiedModificationDateGet**
> java.time.OffsetDateTime apiV2TestRunsIdTestResultsLastModifiedModificationDateGet(id)

Get modification date of last test result of the test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
try {
    val result : java.time.OffsetDateTime = apiInstance.apiV2TestRunsIdTestResultsLastModifiedModificationDateGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsIdTestResultsLastModifiedModificationDateGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsIdTestResultsLastModifiedModificationDateGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test run unique ID | |

### Return type

[**java.time.OffsetDateTime**](java.time.OffsetDateTime.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestRunsPurgeBulkPost"></a>
# **apiV2TestRunsPurgeBulkPost**
> kotlin.Int apiV2TestRunsPurgeBulkPost(testRunSelectApiModel)

Permanently delete multiple test runs from archive

  Use case    User sets selection parameters of archived test runs    System search and delete collection of archived test runs    System returns the number of deleted archived test runs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val testRunSelectApiModel : TestRunSelectApiModel =  // TestRunSelectApiModel | 
try {
    val result : kotlin.Int = apiInstance.apiV2TestRunsPurgeBulkPost(testRunSelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsPurgeBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsPurgeBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testRunSelectApiModel** | [**TestRunSelectApiModel**](TestRunSelectApiModel.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestRunsRestoreBulkPost"></a>
# **apiV2TestRunsRestoreBulkPost**
> kotlin.Int apiV2TestRunsRestoreBulkPost(testRunSelectApiModel)

Restore multiple test runs from the archive

  Use case    User sets selection parameters of archived test runs    System search and restore collection of archived test runs    System returns the number of restored test runs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val testRunSelectApiModel : TestRunSelectApiModel =  // TestRunSelectApiModel | 
try {
    val result : kotlin.Int = apiInstance.apiV2TestRunsRestoreBulkPost(testRunSelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsRestoreBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsRestoreBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testRunSelectApiModel** | [**TestRunSelectApiModel**](TestRunSelectApiModel.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestRunsSearchPost"></a>
# **apiV2TestRunsSearchPost**
> kotlin.collections.List&lt;TestRunShortApiResult&gt; apiV2TestRunsSearchPost(skip, take, orderBy, searchField, searchValue, testRunFilterApiModel)

Search for test runs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val testRunFilterApiModel : TestRunFilterApiModel =  // TestRunFilterApiModel | 
try {
    val result : kotlin.collections.List<TestRunShortApiResult> = apiInstance.apiV2TestRunsSearchPost(skip, take, orderBy, searchField, searchValue, testRunFilterApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsSearchPost")
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
| **testRunFilterApiModel** | [**TestRunFilterApiModel**](TestRunFilterApiModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TestRunShortApiResult&gt;**](TestRunShortApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestRunsUpdateMultiplePost"></a>
# **apiV2TestRunsUpdateMultiplePost**
> apiV2TestRunsUpdateMultiplePost(updateMultipleTestRunsApiModel)

Update multiple test runs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val updateMultipleTestRunsApiModel : UpdateMultipleTestRunsApiModel =  // UpdateMultipleTestRunsApiModel | 
try {
    apiInstance.apiV2TestRunsUpdateMultiplePost(updateMultipleTestRunsApiModel)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#apiV2TestRunsUpdateMultiplePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#apiV2TestRunsUpdateMultiplePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateMultipleTestRunsApiModel** | [**UpdateMultipleTestRunsApiModel**](UpdateMultipleTestRunsApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="completeTestRun"></a>
# **completeTestRun**
> completeTestRun(id)

Complete TestRun

  Use case    User sets test run identifier    User runs method execution    System completes test run    System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
try {
    apiInstance.completeTestRun(id)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#completeTestRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#completeTestRun")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test Run internal identifier (GUID format) | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createAndFillByAutoTests"></a>
# **createAndFillByAutoTests**
> TestRunV2ApiResult createAndFillByAutoTests(createTestRunAndFillByAutoTestsApiModel)

Create test runs based on autotests and configurations

This method creates a test run based on an autotest and a configuration.  The difference between the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; and &#x60;POST /api/v2/testRuns/byConfigurations&#x60; methods is  that in this method there is no need to create a test plan and work items (test cases and checklists).

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val createTestRunAndFillByAutoTestsApiModel : CreateTestRunAndFillByAutoTestsApiModel =  // CreateTestRunAndFillByAutoTestsApiModel | 
try {
    val result : TestRunV2ApiResult = apiInstance.createAndFillByAutoTests(createTestRunAndFillByAutoTestsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#createAndFillByAutoTests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#createAndFillByAutoTests")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTestRunAndFillByAutoTestsApiModel** | [**CreateTestRunAndFillByAutoTestsApiModel**](CreateTestRunAndFillByAutoTestsApiModel.md)|  | [optional] |

### Return type

[**TestRunV2ApiResult**](TestRunV2ApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAndFillByConfigurations"></a>
# **createAndFillByConfigurations**
> TestRunV2ApiResult createAndFillByConfigurations(createTestRunAndFillByConfigurationsApiModel)

Create test runs picking the needed test points

This method creates a test run based on a combination of a configuration and a work item(test case or checklist).  Before you create a test run using this method, make sure to create a test plan. Work items must be automated.  This method is different from the &#x60;POST /api/v2/testRuns/byWorkItems&#x60; method because of the ability to send a  jagged array within the \&quot;&lt;b&gt;testPointSelectors&lt;/b&gt;\&quot; parameter.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val createTestRunAndFillByConfigurationsApiModel : CreateTestRunAndFillByConfigurationsApiModel =  // CreateTestRunAndFillByConfigurationsApiModel | 
try {
    val result : TestRunV2ApiResult = apiInstance.createAndFillByConfigurations(createTestRunAndFillByConfigurationsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#createAndFillByConfigurations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#createAndFillByConfigurations")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTestRunAndFillByConfigurationsApiModel** | [**CreateTestRunAndFillByConfigurationsApiModel**](CreateTestRunAndFillByConfigurationsApiModel.md)|  | [optional] |

### Return type

[**TestRunV2ApiResult**](TestRunV2ApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAndFillByWorkItems"></a>
# **createAndFillByWorkItems**
> TestRunV2ApiResult createAndFillByWorkItems(createTestRunAndFillByWorkItemsApiModel)

Create test run based on configurations and work items

This method creates a test run based on a combination of configuration and work item (test case or checklist).  Before you create a test run using this method, make sure to create a test plan.  Work items must be automated.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val createTestRunAndFillByWorkItemsApiModel : CreateTestRunAndFillByWorkItemsApiModel =  // CreateTestRunAndFillByWorkItemsApiModel | 
try {
    val result : TestRunV2ApiResult = apiInstance.createAndFillByWorkItems(createTestRunAndFillByWorkItemsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#createAndFillByWorkItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#createAndFillByWorkItems")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTestRunAndFillByWorkItemsApiModel** | [**CreateTestRunAndFillByWorkItemsApiModel**](CreateTestRunAndFillByWorkItemsApiModel.md)|  | [optional] |

### Return type

[**TestRunV2ApiResult**](TestRunV2ApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createEmpty"></a>
# **createEmpty**
> TestRunV2ApiResult createEmpty(createEmptyTestRunApiModel)

Create empty TestRun

  Use case    User sets test run model (listed in the request example)    User runs method execution    System creates test run    System returns test run model

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val createEmptyTestRunApiModel : CreateEmptyTestRunApiModel =  // CreateEmptyTestRunApiModel | 
try {
    val result : TestRunV2ApiResult = apiInstance.createEmpty(createEmptyTestRunApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#createEmpty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#createEmpty")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createEmptyTestRunApiModel** | [**CreateEmptyTestRunApiModel**](CreateEmptyTestRunApiModel.md)|  | [optional] |

### Return type

[**TestRunV2ApiResult**](TestRunV2ApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getTestRunById"></a>
# **getTestRunById**
> TestRunV2ApiResult getTestRunById(id)

Get TestRun by Id

  Use case    User sets test run identifier    User runs method execution    System finds test run    System returns test run

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
try {
    val result : TestRunV2ApiResult = apiInstance.getTestRunById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#getTestRunById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#getTestRunById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test Run internal identifier (GUID format) | |

### Return type

[**TestRunV2ApiResult**](TestRunV2ApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="setAutoTestResultsForTestRun"></a>
# **setAutoTestResultsForTestRun**
> kotlin.collections.List&lt;java.util.UUID&gt; setAutoTestResultsForTestRun(id, autoTestResultsForTestRunModel)

Send test results to the test runs in the system

This method sends test results to the test management system.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test Run internal identifier (GUID format)
val autoTestResultsForTestRunModel : kotlin.collections.List<AutoTestResultsForTestRunModel> =  // kotlin.collections.List<AutoTestResultsForTestRunModel> | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.setAutoTestResultsForTestRun(id, autoTestResultsForTestRunModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#setAutoTestResultsForTestRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#setAutoTestResultsForTestRun")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test Run internal identifier (GUID format) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestResultsForTestRunModel** | [**kotlin.collections.List&lt;AutoTestResultsForTestRunModel&gt;**](AutoTestResultsForTestRunModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="startTestRun"></a>
# **startTestRun**
> startTestRun(id)

Start TestRun

  Use case    User sets test run identifier    User runs method execution    System starts test run    System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
try {
    apiInstance.startTestRun(id)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#startTestRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#startTestRun")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test Run internal identifier (GUID format) | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="stopTestRun"></a>
# **stopTestRun**
> stopTestRun(id)

Stop TestRun

  Use case    User sets test run identifier    User runs method execution    System stops test run    System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
try {
    apiInstance.stopTestRun(id)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#stopTestRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#stopTestRun")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test Run internal identifier (GUID format) | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateEmpty"></a>
# **updateEmpty**
> updateEmpty(updateEmptyTestRunApiModel)

Update empty TestRun

  Use case    User sets test run properties (listed in the request example)    User runs method execution    System updates test run    System returns returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestRunsApi()
val updateEmptyTestRunApiModel : UpdateEmptyTestRunApiModel =  // UpdateEmptyTestRunApiModel | 
try {
    apiInstance.updateEmpty(updateEmptyTestRunApiModel)
} catch (e: ClientException) {
    println("4xx response calling TestRunsApi#updateEmpty")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestRunsApi#updateEmpty")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateEmptyTestRunApiModel** | [**UpdateEmptyTestRunApiModel**](UpdateEmptyTestRunApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

