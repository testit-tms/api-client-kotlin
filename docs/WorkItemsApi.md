# WorkItemsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2WorkItemsIdAttachmentsPost**](WorkItemsApi.md#apiV2WorkItemsIdAttachmentsPost) | **POST** /api/v2/workItems/{id}/attachments | Upload and link attachment to WorkItem |
| [**apiV2WorkItemsIdCheckListTransformToTestCasePost**](WorkItemsApi.md#apiV2WorkItemsIdCheckListTransformToTestCasePost) | **POST** /api/v2/workItems/{id}/checkList/transformTo/testCase | Transform CheckList to TestCase |
| [**apiV2WorkItemsIdHistoryGet**](WorkItemsApi.md#apiV2WorkItemsIdHistoryGet) | **GET** /api/v2/workItems/{id}/history | Get change history of WorkItem |
| [**apiV2WorkItemsIdLikeDelete**](WorkItemsApi.md#apiV2WorkItemsIdLikeDelete) | **DELETE** /api/v2/workItems/{id}/like | Delete like from WorkItem |
| [**apiV2WorkItemsIdLikePost**](WorkItemsApi.md#apiV2WorkItemsIdLikePost) | **POST** /api/v2/workItems/{id}/like | Set like to WorkItem |
| [**apiV2WorkItemsIdLikesCountGet**](WorkItemsApi.md#apiV2WorkItemsIdLikesCountGet) | **GET** /api/v2/workItems/{id}/likes/count | Get likes count of WorkItem |
| [**apiV2WorkItemsIdLikesGet**](WorkItemsApi.md#apiV2WorkItemsIdLikesGet) | **GET** /api/v2/workItems/{id}/likes | Get likes of WorkItem |
| [**apiV2WorkItemsIdTestResultsHistoryGet**](WorkItemsApi.md#apiV2WorkItemsIdTestResultsHistoryGet) | **GET** /api/v2/workItems/{id}/testResults/history | Get test results history of WorkItem |
| [**apiV2WorkItemsIdVersionVersionIdActualPost**](WorkItemsApi.md#apiV2WorkItemsIdVersionVersionIdActualPost) | **POST** /api/v2/workItems/{id}/version/{versionId}/actual | Set WorkItem as actual |
| [**apiV2WorkItemsLinksUrlsSearchPost**](WorkItemsApi.md#apiV2WorkItemsLinksUrlsSearchPost) | **POST** /api/v2/workItems/links/urls/search |  |
| [**apiV2WorkItemsMovePost**](WorkItemsApi.md#apiV2WorkItemsMovePost) | **POST** /api/v2/workItems/move | Move WorkItem to another section |
| [**apiV2WorkItemsPost**](WorkItemsApi.md#apiV2WorkItemsPost) | **POST** /api/v2/workItems | Creates work item |
| [**apiV2WorkItemsSearchPost**](WorkItemsApi.md#apiV2WorkItemsSearchPost) | **POST** /api/v2/workItems/search | Search for work items |
| [**apiV2WorkItemsSharedStepIdReferencesSectionsPost**](WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesSectionsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/sections | Get SharedStep references in sections |
| [**apiV2WorkItemsSharedStepIdReferencesWorkItemsPost**](WorkItemsApi.md#apiV2WorkItemsSharedStepIdReferencesWorkItemsPost) | **POST** /api/v2/workItems/{sharedStepId}/references/workItems | Get SharedStep references in work items |
| [**apiV2WorkItemsSharedStepsSharedStepIdReferencesGet**](WorkItemsApi.md#apiV2WorkItemsSharedStepsSharedStepIdReferencesGet) | **GET** /api/v2/workItems/sharedSteps/{sharedStepId}/references | Get SharedStep references |
| [**deleteAllWorkItemsFromAutoTest**](WorkItemsApi.md#deleteAllWorkItemsFromAutoTest) | **DELETE** /api/v2/workItems/{id}/autoTests | Delete all links AutoTests from WorkItem by Id or GlobalId |
| [**deleteWorkItem**](WorkItemsApi.md#deleteWorkItem) | **DELETE** /api/v2/workItems/{id} | Delete Test Case, Checklist or Shared Step by Id or GlobalId |
| [**getAutoTestsForWorkItem**](WorkItemsApi.md#getAutoTestsForWorkItem) | **GET** /api/v2/workItems/{id}/autoTests | Get all AutoTests linked to WorkItem by Id or GlobalId |
| [**getIterations**](WorkItemsApi.md#getIterations) | **GET** /api/v2/workItems/{id}/iterations | Get iterations by work item Id or GlobalId |
| [**getWorkItemById**](WorkItemsApi.md#getWorkItemById) | **GET** /api/v2/workItems/{id} | Get Test Case, Checklist or Shared Step by Id or GlobalId |
| [**getWorkItemChronology**](WorkItemsApi.md#getWorkItemChronology) | **GET** /api/v2/workItems/{id}/chronology | Get WorkItem chronology by Id or GlobalId |
| [**getWorkItemVersions**](WorkItemsApi.md#getWorkItemVersions) | **GET** /api/v2/workItems/{id}/versions | Get WorkItem versions |
| [**purgeWorkItem**](WorkItemsApi.md#purgeWorkItem) | **POST** /api/v2/workItems/{id}/purge | Permanently delete test case, checklist or shared steps from archive |
| [**restoreWorkItem**](WorkItemsApi.md#restoreWorkItem) | **POST** /api/v2/workItems/{id}/restore | Restore test case, checklist or shared steps from archive |
| [**updateWorkItem**](WorkItemsApi.md#updateWorkItem) | **PUT** /api/v2/workItems | Update Test Case, Checklist or Shared Step |


<a id="apiV2WorkItemsIdAttachmentsPost"></a>
# **apiV2WorkItemsIdAttachmentsPost**
> apiV2WorkItemsIdAttachmentsPost(id, file)

Upload and link attachment to WorkItem

  Use case    User sets workItemId    User attaches a file    System creates attachment and links it to the work item    System returns attachment identifier

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Work item internal identifier (guid format)
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Select file
try {
    apiInstance.apiV2WorkItemsIdAttachmentsPost(id, file)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdAttachmentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdAttachmentsPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Work item internal identifier (guid format) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| Select file | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="apiV2WorkItemsIdCheckListTransformToTestCasePost"></a>
# **apiV2WorkItemsIdCheckListTransformToTestCasePost**
> WorkItemModel apiV2WorkItemsIdCheckListTransformToTestCasePost(id)

Transform CheckList to TestCase

  Use case    User sets checklist identifier    User runs method execution    System transform CheckList to TestCase

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : WorkItemModel = apiInstance.apiV2WorkItemsIdCheckListTransformToTestCasePost(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdCheckListTransformToTestCasePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdCheckListTransformToTestCasePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsIdHistoryGet"></a>
# **apiV2WorkItemsIdHistoryGet**
> kotlin.collections.List&lt;WorkItemChangeModel&gt; apiV2WorkItemsIdHistoryGet(id, skip, take, orderBy, searchField, searchValue)

Get change history of WorkItem

  Use case    User sets work item identifier    User runs method execution    System return change history of WorkItem

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<WorkItemChangeModel> = apiInstance.apiV2WorkItemsIdHistoryGet(id, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdHistoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdHistoryGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;WorkItemChangeModel&gt;**](WorkItemChangeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsIdLikeDelete"></a>
# **apiV2WorkItemsIdLikeDelete**
> apiV2WorkItemsIdLikeDelete(id)

Delete like from WorkItem

  Use case    User sets WorkItem identifier    User runs method execution    System delete like from WorkItem

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2WorkItemsIdLikeDelete(id)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdLikeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdLikeDelete")
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

<a id="apiV2WorkItemsIdLikePost"></a>
# **apiV2WorkItemsIdLikePost**
> apiV2WorkItemsIdLikePost(id)

Set like to WorkItem

  Use case    User sets WorkItem identifier    User runs method execution    System set like to WorkItem

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2WorkItemsIdLikePost(id)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdLikePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdLikePost")
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

<a id="apiV2WorkItemsIdLikesCountGet"></a>
# **apiV2WorkItemsIdLikesCountGet**
> kotlin.Int apiV2WorkItemsIdLikesCountGet(id)

Get likes count of WorkItem

  Use case    User sets WorkItem identifier    User runs method execution    System return likes count of WorkItem

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.Int = apiInstance.apiV2WorkItemsIdLikesCountGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdLikesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdLikesCountGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsIdLikesGet"></a>
# **apiV2WorkItemsIdLikesGet**
> kotlin.collections.List&lt;WorkItemLikeModel&gt; apiV2WorkItemsIdLikesGet(id)

Get likes of WorkItem

  Use case    User sets WorkItem identifier    User runs method execution    System return likes of WorkItem

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<WorkItemLikeModel> = apiInstance.apiV2WorkItemsIdLikesGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdLikesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdLikesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**kotlin.collections.List&lt;WorkItemLikeModel&gt;**](WorkItemLikeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsIdTestResultsHistoryGet"></a>
# **apiV2WorkItemsIdTestResultsHistoryGet**
> kotlin.collections.List&lt;TestResultHistoryReportApiResult&gt; apiV2WorkItemsIdTestResultsHistoryGet(id, from, to, configurationIds, testPlanIds, userIds, outcomes, statusCodes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue)

Get test results history of WorkItem

  Use case    User sets WorkItem identifier    User runs method execution    System return test results history of WorkItem

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val from : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Take results from this date
val to : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Take results until this date
val configurationIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of test result configurations
val testPlanIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of test plans which contain test results
val userIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of users who set test results
val outcomes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of outcomes of test results
val statusCodes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of status codes of test results
val isAutomated : kotlin.Boolean = true // kotlin.Boolean | OBSOLETE: Use `Automated` instead
val automated : kotlin.Boolean = true // kotlin.Boolean | If result must consist of only manual/automated test results
val testRunIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of test runs which contain test results
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TestResultHistoryReportApiResult> = apiInstance.apiV2WorkItemsIdTestResultsHistoryGet(id, from, to, configurationIds, testPlanIds, userIds, outcomes, statusCodes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdTestResultsHistoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdTestResultsHistoryGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **from** | **java.time.OffsetDateTime**| Take results from this date | [optional] |
| **to** | **java.time.OffsetDateTime**| Take results until this date | [optional] |
| **configurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)| Identifiers of test result configurations | [optional] |
| **testPlanIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)| Identifiers of test plans which contain test results | [optional] |
| **userIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)| Identifiers of users who set test results | [optional] |
| **outcomes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of outcomes of test results | [optional] |
| **statusCodes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of status codes of test results | [optional] |
| **isAutomated** | **kotlin.Boolean**| OBSOLETE: Use &#x60;Automated&#x60; instead | [optional] |
| **automated** | **kotlin.Boolean**| If result must consist of only manual/automated test results | [optional] |
| **testRunIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)| Identifiers of test runs which contain test results | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TestResultHistoryReportApiResult&gt;**](TestResultHistoryReportApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsIdVersionVersionIdActualPost"></a>
# **apiV2WorkItemsIdVersionVersionIdActualPost**
> WorkItemModel apiV2WorkItemsIdVersionVersionIdActualPost(id, versionId)

Set WorkItem as actual

  Use case    User sets work item identifier    User runs method execution    System set WorkItem as actual

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val versionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : WorkItemModel = apiInstance.apiV2WorkItemsIdVersionVersionIdActualPost(id, versionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsIdVersionVersionIdActualPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsIdVersionVersionIdActualPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **versionId** | **java.util.UUID**|  | |

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsLinksUrlsSearchPost"></a>
# **apiV2WorkItemsLinksUrlsSearchPost**
> SearchWorkItemLinkUrlsApiResult apiV2WorkItemsLinksUrlsSearchPost(skip, take, orderBy, searchField, searchValue, workItemLinkUrlApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val workItemLinkUrlApiModel : WorkItemLinkUrlApiModel =  // WorkItemLinkUrlApiModel | 
try {
    val result : SearchWorkItemLinkUrlsApiResult = apiInstance.apiV2WorkItemsLinksUrlsSearchPost(skip, take, orderBy, searchField, searchValue, workItemLinkUrlApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsLinksUrlsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsLinksUrlsSearchPost")
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
| **workItemLinkUrlApiModel** | [**WorkItemLinkUrlApiModel**](WorkItemLinkUrlApiModel.md)|  | [optional] |

### Return type

[**SearchWorkItemLinkUrlsApiResult**](SearchWorkItemLinkUrlsApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsMovePost"></a>
# **apiV2WorkItemsMovePost**
> WorkItemShortModel apiV2WorkItemsMovePost(workItemMovePostModel)

Move WorkItem to another section

  Use case    User sets WorkItem identifier    User runs method execution    System move WorkItem to another section

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val workItemMovePostModel : WorkItemMovePostModel =  // WorkItemMovePostModel | 
try {
    val result : WorkItemShortModel = apiInstance.apiV2WorkItemsMovePost(workItemMovePostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsMovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsMovePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemMovePostModel** | [**WorkItemMovePostModel**](WorkItemMovePostModel.md)|  | [optional] |

### Return type

[**WorkItemShortModel**](WorkItemShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsPost"></a>
# **apiV2WorkItemsPost**
> WorkItemApiResult apiV2WorkItemsPost(createWorkItemApiModel)

Creates work item

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val createWorkItemApiModel : CreateWorkItemApiModel =  // CreateWorkItemApiModel | 
try {
    val result : WorkItemApiResult = apiInstance.apiV2WorkItemsPost(createWorkItemApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createWorkItemApiModel** | [**CreateWorkItemApiModel**](CreateWorkItemApiModel.md)|  | [optional] |

### Return type

[**WorkItemApiResult**](WorkItemApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsSearchPost"></a>
# **apiV2WorkItemsSearchPost**
> kotlin.collections.List&lt;WorkItemShortApiResult&gt; apiV2WorkItemsSearchPost(skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)

Search for work items

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val workItemSelectApiModel : WorkItemSelectApiModel =  // WorkItemSelectApiModel | 
try {
    val result : kotlin.collections.List<WorkItemShortApiResult> = apiInstance.apiV2WorkItemsSearchPost(skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsSearchPost")
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
| **workItemSelectApiModel** | [**WorkItemSelectApiModel**](WorkItemSelectApiModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;WorkItemShortApiResult&gt;**](WorkItemShortApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsSharedStepIdReferencesSectionsPost"></a>
# **apiV2WorkItemsSharedStepIdReferencesSectionsPost**
> kotlin.collections.List&lt;SharedStepReferenceSectionModel&gt; apiV2WorkItemsSharedStepIdReferencesSectionsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferenceSectionsQueryFilterModel)

Get SharedStep references in sections

  Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val sharedStepId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val sharedStepReferenceSectionsQueryFilterModel : SharedStepReferenceSectionsQueryFilterModel =  // SharedStepReferenceSectionsQueryFilterModel | 
try {
    val result : kotlin.collections.List<SharedStepReferenceSectionModel> = apiInstance.apiV2WorkItemsSharedStepIdReferencesSectionsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferenceSectionsQueryFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsSharedStepIdReferencesSectionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsSharedStepIdReferencesSectionsPost")
    e.printStackTrace()
}
```

### Parameters
| **sharedStepId** | **java.util.UUID**|  | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sharedStepReferenceSectionsQueryFilterModel** | [**SharedStepReferenceSectionsQueryFilterModel**](SharedStepReferenceSectionsQueryFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;SharedStepReferenceSectionModel&gt;**](SharedStepReferenceSectionModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsSharedStepIdReferencesWorkItemsPost"></a>
# **apiV2WorkItemsSharedStepIdReferencesWorkItemsPost**
> kotlin.collections.List&lt;SharedStepReferenceModel&gt; apiV2WorkItemsSharedStepIdReferencesWorkItemsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferencesQueryFilterModel)

Get SharedStep references in work items

  Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val sharedStepId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val sharedStepReferencesQueryFilterModel : SharedStepReferencesQueryFilterModel =  // SharedStepReferencesQueryFilterModel | 
try {
    val result : kotlin.collections.List<SharedStepReferenceModel> = apiInstance.apiV2WorkItemsSharedStepIdReferencesWorkItemsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferencesQueryFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsSharedStepIdReferencesWorkItemsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsSharedStepIdReferencesWorkItemsPost")
    e.printStackTrace()
}
```

### Parameters
| **sharedStepId** | **java.util.UUID**|  | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sharedStepReferencesQueryFilterModel** | [**SharedStepReferencesQueryFilterModel**](SharedStepReferencesQueryFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;SharedStepReferenceModel&gt;**](SharedStepReferenceModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsSharedStepsSharedStepIdReferencesGet"></a>
# **apiV2WorkItemsSharedStepsSharedStepIdReferencesGet**
> kotlin.collections.List&lt;SharedStepReferenceModel&gt; apiV2WorkItemsSharedStepsSharedStepIdReferencesGet(sharedStepId)

Get SharedStep references

  Use case    User sets SharedStep identifier    User runs method execution    System return SharedStep references

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val sharedStepId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<SharedStepReferenceModel> = apiInstance.apiV2WorkItemsSharedStepsSharedStepIdReferencesGet(sharedStepId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#apiV2WorkItemsSharedStepsSharedStepIdReferencesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#apiV2WorkItemsSharedStepsSharedStepIdReferencesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sharedStepId** | **java.util.UUID**|  | |

### Return type

[**kotlin.collections.List&lt;SharedStepReferenceModel&gt;**](SharedStepReferenceModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteAllWorkItemsFromAutoTest"></a>
# **deleteAllWorkItemsFromAutoTest**
> deleteAllWorkItemsFromAutoTest(id)

Delete all links AutoTests from WorkItem by Id or GlobalId

  Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search and delete all autotests, related to found work item    System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
try {
    apiInstance.deleteAllWorkItemsFromAutoTest(id)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#deleteAllWorkItemsFromAutoTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#deleteAllWorkItemsFromAutoTest")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteWorkItem"></a>
# **deleteWorkItem**
> deleteWorkItem(id)

Delete Test Case, Checklist or Shared Step by Id or GlobalId

  Use case    User sets work item identifier    User runs method execution    System deletes work item    System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
try {
    apiInstance.deleteWorkItem(id)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#deleteWorkItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#deleteWorkItem")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAutoTestsForWorkItem"></a>
# **getAutoTestsForWorkItem**
> kotlin.collections.List&lt;AutoTestModel&gt; getAutoTestsForWorkItem(id)

Get all AutoTests linked to WorkItem by Id or GlobalId

  Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search all autotests, related to found work item    System returns list of found autotests

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
try {
    val result : kotlin.collections.List<AutoTestModel> = apiInstance.getAutoTestsForWorkItem(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#getAutoTestsForWorkItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#getAutoTestsForWorkItem")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |

### Return type

[**kotlin.collections.List&lt;AutoTestModel&gt;**](AutoTestModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIterations"></a>
# **getIterations**
> kotlin.collections.List&lt;IterationModel&gt; getIterations(id, versionId, versionNumber)

Get iterations by work item Id or GlobalId

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
val versionId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | WorkItem version (guid format) identifier
val versionNumber : kotlin.Int = 0 // kotlin.Int | WorkItem version number (0 is the last version)\"
try {
    val result : kotlin.collections.List<IterationModel> = apiInstance.getIterations(id, versionId, versionNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#getIterations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#getIterations")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |
| **versionId** | **java.util.UUID**| WorkItem version (guid format) identifier | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **versionNumber** | **kotlin.Int**| WorkItem version number (0 is the last version)\&quot; | [optional] |

### Return type

[**kotlin.collections.List&lt;IterationModel&gt;**](IterationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkItemById"></a>
# **getWorkItemById**
> WorkItemModel getWorkItemById(id, versionId, versionNumber)

Get Test Case, Checklist or Shared Step by Id or GlobalId

  Use case    User sets work item identifier    [Optional] User sets work item version identifier    [Optional] User sets work item version number    User runs method execution    System search work item by identifier    [Optional] if User sets work item version identifier, system search work item version by identifier.    [Optional] if user sets work item version number, system search work item version by number    Otherwise, system search last work item version    System returns work item

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
val versionId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | WorkItem version (guid format) identifier\"
val versionNumber : kotlin.Int = 0 // kotlin.Int | WorkItem version number (0 is the last version)\"
try {
    val result : WorkItemModel = apiInstance.getWorkItemById(id, versionId, versionNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#getWorkItemById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#getWorkItemById")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |
| **versionId** | **java.util.UUID**| WorkItem version (guid format) identifier\&quot; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **versionNumber** | **kotlin.Int**| WorkItem version number (0 is the last version)\&quot; | [optional] |

### Return type

[**WorkItemModel**](WorkItemModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkItemChronology"></a>
# **getWorkItemChronology**
> kotlin.collections.List&lt;TestResultChronologyModel&gt; getWorkItemChronology(id)

Get WorkItem chronology by Id or GlobalId

  Use case    User sets work item identifier    User runs method execution    System search work item by identifier    System search test results of all autotests, related to found work item    System sort results by CompletedOn ascending, then by CreatedDate ascending    System returns sorted collection of test results

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = id_example // kotlin.String | Internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<TestResultChronologyModel> = apiInstance.getWorkItemChronology(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#getWorkItemChronology")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#getWorkItemChronology")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;TestResultChronologyModel&gt;**](TestResultChronologyModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkItemVersions"></a>
# **getWorkItemVersions**
> kotlin.collections.List&lt;WorkItemVersionModel&gt; getWorkItemVersions(id, workItemVersionId, versionNumber)

Get WorkItem versions

  Use case    User sets work item identifier    [Optional] User sets work item version identifier    User runs method execution    System search work item by identifier    [Optional] If User set work item version identifier, System search work item version by version identifier                      Otherwise, system search all version of work item    System returns array of work item version models (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
val workItemVersionId : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | WorkItem version (guid format)  identifier\"
val versionNumber : kotlin.Int = 1 // kotlin.Int | WorkItem version (integer format)  number\"
try {
    val result : kotlin.collections.List<WorkItemVersionModel> = apiInstance.getWorkItemVersions(id, workItemVersionId, versionNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#getWorkItemVersions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#getWorkItemVersions")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| WorkItem internal (guid format) or  global(integer format) identifier\&quot; | |
| **workItemVersionId** | **java.util.UUID**| WorkItem version (guid format)  identifier\&quot; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **versionNumber** | **kotlin.Int**| WorkItem version (integer format)  number\&quot; | [optional] |

### Return type

[**kotlin.collections.List&lt;WorkItemVersionModel&gt;**](WorkItemVersionModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purgeWorkItem"></a>
# **purgeWorkItem**
> purgeWorkItem(id)

Permanently delete test case, checklist or shared steps from archive

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
try {
    apiInstance.purgeWorkItem(id)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#purgeWorkItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#purgeWorkItem")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the work item | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="restoreWorkItem"></a>
# **restoreWorkItem**
> restoreWorkItem(id)

Restore test case, checklist or shared steps from archive

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
try {
    apiInstance.restoreWorkItem(id)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#restoreWorkItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#restoreWorkItem")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the work item | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateWorkItem"></a>
# **updateWorkItem**
> updateWorkItem(updateWorkItemApiModel)

Update Test Case, Checklist or Shared Step

  Use case    User sets work item properties (listed in request parameters)    User runs method execution    System updates work item by identifier    System returns updated work item model (listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsApi()
val updateWorkItemApiModel : UpdateWorkItemApiModel =  // UpdateWorkItemApiModel | 
try {
    apiInstance.updateWorkItem(updateWorkItemApiModel)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsApi#updateWorkItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsApi#updateWorkItem")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateWorkItemApiModel** | [**UpdateWorkItemApiModel**](UpdateWorkItemApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

