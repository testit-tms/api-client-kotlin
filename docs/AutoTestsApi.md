# AutoTestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2AutoTestsDelete**](AutoTestsApi.md#apiV2AutoTestsDelete) | **DELETE** /api/v2/autoTests | Delete autotests |
| [**apiV2AutoTestsFlakyBulkPost**](AutoTestsApi.md#apiV2AutoTestsFlakyBulkPost) | **POST** /api/v2/autoTests/flaky/bulk | Set \&quot;Flaky\&quot; status for multiple autotests |
| [**apiV2AutoTestsIdPatch**](AutoTestsApi.md#apiV2AutoTestsIdPatch) | **PATCH** /api/v2/autoTests/{id} | Patch auto test |
| [**apiV2AutoTestsIdTestResultsSearchPost**](AutoTestsApi.md#apiV2AutoTestsIdTestResultsSearchPost) | **POST** /api/v2/autoTests/{id}/testResults/search | Get test results history for autotest |
| [**apiV2AutoTestsIdWorkItemsChangedIdGet**](AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedIdGet) | **GET** /api/v2/autoTests/{id}/workItems/changed/id | Get identifiers of changed linked work items |
| [**apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost**](AutoTestsApi.md#apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost) | **POST** /api/v2/autoTests/{id}/workItems/changed/{workItemId}/approve | Approve changes to work items linked to autotest |
| [**apiV2AutoTestsSearchPost**](AutoTestsApi.md#apiV2AutoTestsSearchPost) | **POST** /api/v2/autoTests/search | Search for autotests |
| [**createAutoTest**](AutoTestsApi.md#createAutoTest) | **POST** /api/v2/autoTests | Create autotest |
| [**createMultiple**](AutoTestsApi.md#createMultiple) | **POST** /api/v2/autoTests/bulk | Create multiple autotests |
| [**deleteAutoTest**](AutoTestsApi.md#deleteAutoTest) | **DELETE** /api/v2/autoTests/{id} | Delete autotest |
| [**deleteAutoTestLinkFromWorkItem**](AutoTestsApi.md#deleteAutoTestLinkFromWorkItem) | **DELETE** /api/v2/autoTests/{id}/workItems | Unlink autotest from work item |
| [**getAllAutoTests**](AutoTestsApi.md#getAllAutoTests) | **GET** /api/v2/autoTests |  |
| [**getAutoTestAverageDuration**](AutoTestsApi.md#getAutoTestAverageDuration) | **GET** /api/v2/autoTests/{id}/averageDuration | Get average autotest duration |
| [**getAutoTestById**](AutoTestsApi.md#getAutoTestById) | **GET** /api/v2/autoTests/{id} | Get autotest by internal or global ID |
| [**getAutoTestChronology**](AutoTestsApi.md#getAutoTestChronology) | **GET** /api/v2/autoTests/{id}/chronology | Get autotest chronology |
| [**getTestRuns**](AutoTestsApi.md#getTestRuns) | **GET** /api/v2/autoTests/{id}/testRuns | Get completed tests runs for autotests |
| [**getWorkItemsLinkedToAutoTest**](AutoTestsApi.md#getWorkItemsLinkedToAutoTest) | **GET** /api/v2/autoTests/{id}/workItems | Get work items linked to autotest |
| [**linkAutoTestToWorkItem**](AutoTestsApi.md#linkAutoTestToWorkItem) | **POST** /api/v2/autoTests/{id}/workItems | Link autotest with work items |
| [**updateAutoTest**](AutoTestsApi.md#updateAutoTest) | **PUT** /api/v2/autoTests | Update autotest |
| [**updateMultiple**](AutoTestsApi.md#updateMultiple) | **PUT** /api/v2/autoTests/bulk | Update multiple autotests |


<a id="apiV2AutoTestsDelete"></a>
# **apiV2AutoTestsDelete**
> AutoTestBulkDeleteApiResult apiV2AutoTestsDelete(autoTestBulkDeleteApiModel)

Delete autotests

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val autoTestBulkDeleteApiModel : AutoTestBulkDeleteApiModel =  // AutoTestBulkDeleteApiModel | 
try {
    val result : AutoTestBulkDeleteApiResult = apiInstance.apiV2AutoTestsDelete(autoTestBulkDeleteApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#apiV2AutoTestsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#apiV2AutoTestsDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestBulkDeleteApiModel** | [**AutoTestBulkDeleteApiModel**](AutoTestBulkDeleteApiModel.md)|  | [optional] |

### Return type

[**AutoTestBulkDeleteApiResult**](AutoTestBulkDeleteApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2AutoTestsFlakyBulkPost"></a>
# **apiV2AutoTestsFlakyBulkPost**
> apiV2AutoTestsFlakyBulkPost(skip, take, orderBy, searchField, searchValue, autoTestFlakyBulkApiModel)

Set \&quot;Flaky\&quot; status for multiple autotests

User permissions for project: - Read only - Execute - Write - Full control

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val autoTestFlakyBulkApiModel : AutoTestFlakyBulkApiModel =  // AutoTestFlakyBulkApiModel | 
try {
    apiInstance.apiV2AutoTestsFlakyBulkPost(skip, take, orderBy, searchField, searchValue, autoTestFlakyBulkApiModel)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#apiV2AutoTestsFlakyBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#apiV2AutoTestsFlakyBulkPost")
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
| **autoTestFlakyBulkApiModel** | [**AutoTestFlakyBulkApiModel**](AutoTestFlakyBulkApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2AutoTestsIdPatch"></a>
# **apiV2AutoTestsIdPatch**
> apiV2AutoTestsIdPatch(id, operation)

Patch auto test

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Global Id of auto test
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.apiV2AutoTestsIdPatch(id, operation)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#apiV2AutoTestsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#apiV2AutoTestsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Global Id of auto test | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2AutoTestsIdTestResultsSearchPost"></a>
# **apiV2AutoTestsIdTestResultsSearchPost**
> kotlin.collections.List&lt;AutoTestResultHistoryApiResult&gt; apiV2AutoTestsIdTestResultsSearchPost(id, skip, take, orderBy, searchField, searchValue, autoTestResultHistorySelectApiModel)

Get test results history for autotest

 Use case  User sets autotest internal (guid format) or global (integer format) identifier  User sets getTestResultHistoryReportQuery (listed in the example)  User runs method execution  System search for test results using filters set by user in getTestResultHistoryReportQuery and id  System returns the enumeration of test results

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest identifier
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val autoTestResultHistorySelectApiModel : AutoTestResultHistorySelectApiModel =  // AutoTestResultHistorySelectApiModel | 
try {
    val result : kotlin.collections.List<AutoTestResultHistoryApiResult> = apiInstance.apiV2AutoTestsIdTestResultsSearchPost(id, skip, take, orderBy, searchField, searchValue, autoTestResultHistorySelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#apiV2AutoTestsIdTestResultsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#apiV2AutoTestsIdTestResultsSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Autotest identifier | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestResultHistorySelectApiModel** | [**AutoTestResultHistorySelectApiModel**](AutoTestResultHistorySelectApiModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;AutoTestResultHistoryApiResult&gt;**](AutoTestResultHistoryApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2AutoTestsIdWorkItemsChangedIdGet"></a>
# **apiV2AutoTestsIdWorkItemsChangedIdGet**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2AutoTestsIdWorkItemsChangedIdGet(id)

Get identifiers of changed linked work items

User permissions for project: - Read only - Execute - Write - Full control

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2AutoTestsIdWorkItemsChangedIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#apiV2AutoTestsIdWorkItemsChangedIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#apiV2AutoTestsIdWorkItemsChangedIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost"></a>
# **apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost**
> apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost(id, workItemId)

Approve changes to work items linked to autotest

User permissions for project: - Read only - Execute - Write - Full control

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val workItemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost(id, workItemId)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#apiV2AutoTestsIdWorkItemsChangedWorkItemIdApprovePost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemId** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2AutoTestsSearchPost"></a>
# **apiV2AutoTestsSearchPost**
> kotlin.collections.List&lt;AutoTestApiResult&gt; apiV2AutoTestsSearchPost(skip, take, orderBy, searchField, searchValue, autoTestSearchApiModel)

Search for autotests

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val autoTestSearchApiModel : AutoTestSearchApiModel =  // AutoTestSearchApiModel | 
try {
    val result : kotlin.collections.List<AutoTestApiResult> = apiInstance.apiV2AutoTestsSearchPost(skip, take, orderBy, searchField, searchValue, autoTestSearchApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#apiV2AutoTestsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#apiV2AutoTestsSearchPost")
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
| **autoTestSearchApiModel** | [**AutoTestSearchApiModel**](AutoTestSearchApiModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;AutoTestApiResult&gt;**](AutoTestApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAutoTest"></a>
# **createAutoTest**
> AutoTestApiResult createAutoTest(autoTestCreateApiModel)

Create autotest

 This method creates a new autotest.  To add an autotest to the test plan, link it to a work item using the &#x60;POST /api/v2/autoTests/{autoTestId}/workItems&#x60; method.  Use the &#x60;POST /api/v2/testRuns/byAutoTests&#x60; method to run autotest outside the test plan.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val autoTestCreateApiModel : AutoTestCreateApiModel =  // AutoTestCreateApiModel | 
try {
    val result : AutoTestApiResult = apiInstance.createAutoTest(autoTestCreateApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#createAutoTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#createAutoTest")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestCreateApiModel** | [**AutoTestCreateApiModel**](AutoTestCreateApiModel.md)|  | [optional] |

### Return type

[**AutoTestApiResult**](AutoTestApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createMultiple"></a>
# **createMultiple**
> kotlin.collections.List&lt;AutoTestApiResult&gt; createMultiple(autoTestCreateApiModel)

Create multiple autotests

 Use case  User sets autotest parameters (listed in the example) and runs method execution  System creates autotest  [Optional] If steps enumeration is set, system creates step items and relates them to autotest  [Optional] If setup enumeration is set, system creates setup items and relates them to autotest  [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest  [Optional] If label enumeration is set, system creates labels and relates them to autotest  [Optional] If link enumeration is set, system creates links and relates them to autotest  System returns autotest model (example listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val autoTestCreateApiModel : kotlin.collections.List<AutoTestCreateApiModel> =  // kotlin.collections.List<AutoTestCreateApiModel> | 
try {
    val result : kotlin.collections.List<AutoTestApiResult> = apiInstance.createMultiple(autoTestCreateApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#createMultiple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#createMultiple")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestCreateApiModel** | [**kotlin.collections.List&lt;AutoTestCreateApiModel&gt;**](AutoTestCreateApiModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;AutoTestApiResult&gt;**](AutoTestApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAutoTest"></a>
# **deleteAutoTest**
> deleteAutoTest(id)

Delete autotest

 Use case  User sets autotest internal (guid format) or global (integer format) identifier and runs method execution  System finds the autotest by the identifier  System deletes autotest and returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest internal (UUID) or global (integer) identifier
try {
    apiInstance.deleteAutoTest(id)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#deleteAutoTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#deleteAutoTest")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteAutoTestLinkFromWorkItem"></a>
# **deleteAutoTestLinkFromWorkItem**
> deleteAutoTestLinkFromWorkItem(id, workItemId)

Unlink autotest from work item

 Use case  User sets autotest internal (guid format) or global (integer format) identifier  [Optional] User sets workitem internal (guid format) or global (integer format) identifier  User runs method execution  System finds the autotest by the autotest identifier  [Optional] if workitem id is set by User, System finds the workitem by the workitem identifier and unlinks it             from autotest.  [Optional] Otherwise, if workitem id is not specified, System unlinks all workitems linked to autotest.  System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest internal (UUID) or global (integer) identifier
val workItemId : kotlin.String = workItemId_example // kotlin.String | Work item internal (UUID) or global (integer) identifier
try {
    apiInstance.deleteAutoTestLinkFromWorkItem(id, workItemId)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#deleteAutoTestLinkFromWorkItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#deleteAutoTestLinkFromWorkItem")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Autotest internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemId** | **kotlin.String**| Work item internal (UUID) or global (integer) identifier | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAllAutoTests"></a>
# **getAllAutoTests**
> kotlin.collections.List&lt;AutoTestModel&gt; getAllAutoTests(projectId, externalId, globalId, namespace, isNamespaceNull, includeEmptyNamespaces, className, isClassnameNull, includeEmptyClassNames, isDeleted, deleted, labels, stabilityMinimal, minStability, stabilityMaximal, maxStability, isFlaky, flaky, includeSteps, includeLabels, externalKey, skip, take, orderBy, searchField, searchValue)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project internal ID
val externalId : kotlin.String = externalId_example // kotlin.String | Autotest external ID
val globalId : kotlin.Long = 789 // kotlin.Long | Autotest global ID
val namespace : kotlin.String = namespace_example // kotlin.String | Namespace in which autotest is located
val isNamespaceNull : kotlin.Boolean = true // kotlin.Boolean | OBSOLETE: Use `includeEmptyNamespaces` instead
val includeEmptyNamespaces : kotlin.Boolean = true // kotlin.Boolean | If result must contain autotests without namespace
val className : kotlin.String = className_example // kotlin.String | Name of class in which autotest is located
val isClassnameNull : kotlin.Boolean = true // kotlin.Boolean | OBSOLETE: Use `includeEmptyClassNames` instead
val includeEmptyClassNames : kotlin.Boolean = true // kotlin.Boolean | If result must contain autotests without class
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | OBSOLETE: Use `deleted` instead
val deleted : kotlin.Boolean = true // kotlin.Boolean | Is autotest deleted
val labels : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Include only autotests with provided labels
val stabilityMinimal : kotlin.Int = 56 // kotlin.Int | OBSOLETE: Use `minStability` instead
val minStability : kotlin.Int = 56 // kotlin.Int | Minimum stability value of autotest
val stabilityMaximal : kotlin.Int = 56 // kotlin.Int | OBSOLETE: Use `maxStability` instead
val maxStability : kotlin.Int = 56 // kotlin.Int | Maximum stability value of autotest
val isFlaky : kotlin.Boolean = true // kotlin.Boolean | OBSOLETE: Use `flaky` instead
val flaky : kotlin.Boolean = true // kotlin.Boolean | Is autotest marked as \"Flaky\"
val includeSteps : kotlin.Boolean = true // kotlin.Boolean | If result must also include autotest steps
val includeLabels : kotlin.Boolean = true // kotlin.Boolean | If result must also include autotest labels
val externalKey : kotlin.String = externalKey_example // kotlin.String | External key of autotest
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<AutoTestModel> = apiInstance.getAllAutoTests(projectId, externalId, globalId, namespace, isNamespaceNull, includeEmptyNamespaces, className, isClassnameNull, includeEmptyClassNames, isDeleted, deleted, labels, stabilityMinimal, minStability, stabilityMaximal, maxStability, isFlaky, flaky, includeSteps, includeLabels, externalKey, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#getAllAutoTests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#getAllAutoTests")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**| Project internal ID | [optional] |
| **externalId** | **kotlin.String**| Autotest external ID | [optional] |
| **globalId** | **kotlin.Long**| Autotest global ID | [optional] |
| **namespace** | **kotlin.String**| Namespace in which autotest is located | [optional] |
| **isNamespaceNull** | **kotlin.Boolean**| OBSOLETE: Use &#x60;includeEmptyNamespaces&#x60; instead | [optional] |
| **includeEmptyNamespaces** | **kotlin.Boolean**| If result must contain autotests without namespace | [optional] |
| **className** | **kotlin.String**| Name of class in which autotest is located | [optional] |
| **isClassnameNull** | **kotlin.Boolean**| OBSOLETE: Use &#x60;includeEmptyClassNames&#x60; instead | [optional] |
| **includeEmptyClassNames** | **kotlin.Boolean**| If result must contain autotests without class | [optional] |
| **isDeleted** | **kotlin.Boolean**| OBSOLETE: Use &#x60;deleted&#x60; instead | [optional] |
| **deleted** | **kotlin.Boolean**| Is autotest deleted | [optional] |
| **labels** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Include only autotests with provided labels | [optional] |
| **stabilityMinimal** | **kotlin.Int**| OBSOLETE: Use &#x60;minStability&#x60; instead | [optional] |
| **minStability** | **kotlin.Int**| Minimum stability value of autotest | [optional] |
| **stabilityMaximal** | **kotlin.Int**| OBSOLETE: Use &#x60;maxStability&#x60; instead | [optional] |
| **maxStability** | **kotlin.Int**| Maximum stability value of autotest | [optional] |
| **isFlaky** | **kotlin.Boolean**| OBSOLETE: Use &#x60;flaky&#x60; instead | [optional] |
| **flaky** | **kotlin.Boolean**| Is autotest marked as \&quot;Flaky\&quot; | [optional] |
| **includeSteps** | **kotlin.Boolean**| If result must also include autotest steps | [optional] |
| **includeLabels** | **kotlin.Boolean**| If result must also include autotest labels | [optional] |
| **externalKey** | **kotlin.String**| External key of autotest | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;AutoTestModel&gt;**](AutoTestModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAutoTestAverageDuration"></a>
# **getAutoTestAverageDuration**
> AutoTestAverageDurationApiResult getAutoTestAverageDuration(id)

Get average autotest duration

 Use case  User sets autotest internal (guid format) or global (integer format) identifier  User runs method execution  System calculates pass average duration and fail average duration of autotest from all related test results  System returns pass average duration and fail average duration for autotest

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest internal (UUID) or global (integer) identifier
try {
    val result : AutoTestAverageDurationApiResult = apiInstance.getAutoTestAverageDuration(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#getAutoTestAverageDuration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#getAutoTestAverageDuration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

[**AutoTestAverageDurationApiResult**](AutoTestAverageDurationApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAutoTestById"></a>
# **getAutoTestById**
> AutoTestApiResult getAutoTestById(id)

Get autotest by internal or global ID

 Use case  User sets autotest internal or global identifier and runs method execution  System returns autotest, which internal or global identifier equals the identifier value set in the previous action

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest internal (UUID) or global (integer) identifier
try {
    val result : AutoTestApiResult = apiInstance.getAutoTestById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#getAutoTestById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#getAutoTestById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

[**AutoTestApiResult**](AutoTestApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAutoTestChronology"></a>
# **getAutoTestChronology**
> kotlin.collections.List&lt;TestResultChronologyModel&gt; getAutoTestChronology(id)

Get autotest chronology

 Use case  User sets autotest internal (guid format) or global (integer format) identifier  User runs method execution  System search all test results related to autotest (with default limit equal 100)  System orders the test results by CompletedOn property descending and then orders by CreatedDate property descending  System returns test result chronology for autotest

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<TestResultChronologyModel> = apiInstance.getAutoTestChronology(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#getAutoTestChronology")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#getAutoTestChronology")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;TestResultChronologyModel&gt;**](TestResultChronologyModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestRuns"></a>
# **getTestRuns**
> kotlin.collections.List&lt;TestRunByAutoTestApiResult&gt; getTestRuns(id)

Get completed tests runs for autotests

 Use case  User sets autotest internal (guid format) or global (integer format) identifier  User runs method execution  System search for all test runs related to the autotest  System returns the enumeration of test runs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<TestRunByAutoTestApiResult> = apiInstance.getTestRuns(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#getTestRuns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#getTestRuns")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Autotest internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;TestRunByAutoTestApiResult&gt;**](TestRunByAutoTestApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkItemsLinkedToAutoTest"></a>
# **getWorkItemsLinkedToAutoTest**
> kotlin.collections.List&lt;AutoTestWorkItemIdentifierApiResult&gt; getWorkItemsLinkedToAutoTest(id, isDeleted, isWorkItemDeleted)

Get work items linked to autotest

 This method links an autotest to a test case or a checklist.             A manual test case with a linked automated work item is marked in the test management system as an autotest.             You can run it from graphical user interface (GUI). To do that:  1. Open the project in GUI.              2. Go to &lt;b&gt;Test plans&lt;/b&gt; section and switch to the &lt;b&gt;Execution&lt;/b&gt; tab.              3. Select the autotest(s) you want to run using checkboxes.              4. In the toolbar above the test list, click &lt;b&gt;Run autotests&lt;/b&gt;.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Specifies the autotest entity ID.  You can copy it from the address bar in your web browser or use autotest GUID.
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | Specifies that a test is deleted or still relevant.
val isWorkItemDeleted : kotlin.Boolean = true // kotlin.Boolean | OBSOLETE: Use `isDeleted` instead
try {
    val result : kotlin.collections.List<AutoTestWorkItemIdentifierApiResult> = apiInstance.getWorkItemsLinkedToAutoTest(id, isDeleted, isWorkItemDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#getWorkItemsLinkedToAutoTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#getWorkItemsLinkedToAutoTest")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Specifies the autotest entity ID.  You can copy it from the address bar in your web browser or use autotest GUID. | |
| **isDeleted** | **kotlin.Boolean**| Specifies that a test is deleted or still relevant. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isWorkItemDeleted** | **kotlin.Boolean**| OBSOLETE: Use &#x60;isDeleted&#x60; instead | [optional] [default to false] |

### Return type

[**kotlin.collections.List&lt;AutoTestWorkItemIdentifierApiResult&gt;**](AutoTestWorkItemIdentifierApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="linkAutoTestToWorkItem"></a>
# **linkAutoTestToWorkItem**
> linkAutoTestToWorkItem(id, workItemIdApiModel)

Link autotest with work items

 Use case  User sets autotest internal (guid format) or global (integer format) identifier  User sets work item internal (guid format) or global (integer format) identifier  User runs method execution  System finds the autotest by the autotest identifier  System finds the work item by the work item identifier  System relates the work item with the autotest and returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val id : kotlin.String = id_example // kotlin.String | Autotest internal (UUID) or global (integer) identifier
val workItemIdApiModel : WorkItemIdApiModel =  // WorkItemIdApiModel | 
try {
    apiInstance.linkAutoTestToWorkItem(id, workItemIdApiModel)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#linkAutoTestToWorkItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#linkAutoTestToWorkItem")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Autotest internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemIdApiModel** | [**WorkItemIdApiModel**](WorkItemIdApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAutoTest"></a>
# **updateAutoTest**
> updateAutoTest(autoTestUpdateApiModel)

Update autotest

 Use case  User sets autotest updated parameters values (listed in the example) and runs method execution  System finds the autotest by the identifier  System updates autotest parameters  [Optional] If steps enumeration is set, system creates step items, relates them to autotest             and deletes relations with current steps( if exist)  [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest             and deletes relations with current Setup items (if exist)  [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest             and deletes relations with current teardown items (if exist)  [Optional] If label enumeration is set, system creates labels and relates them to autotest             and deletes relations with current Labels (if exist)  [Optional] If link enumeration is set, system creates links and relates them to autotest             and deletes relations with current Links (if exist)  System updates autotest and returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val autoTestUpdateApiModel : AutoTestUpdateApiModel =  // AutoTestUpdateApiModel | 
try {
    apiInstance.updateAutoTest(autoTestUpdateApiModel)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#updateAutoTest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#updateAutoTest")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestUpdateApiModel** | [**AutoTestUpdateApiModel**](AutoTestUpdateApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateMultiple"></a>
# **updateMultiple**
> updateMultiple(autoTestUpdateApiModel)

Update multiple autotests

 Use case  User sets autotest updated parameters values (listed in the example) and runs method execution  System finds the autotest by the identifier  System updates autotest parameters  [Optional] If steps enumeration is set, system creates step items, relates them to autotest             and deletes relations with current steps( if exist)  [Optional] If Setup enumeration is set, system creates setup items and relates them to autotest             and deletes relations with current Setup items (if exist)  [Optional] If teardown enumeration is set, system creates teardown items and relates them to autotest             and deletes relations with current teardown items (if exist)  [Optional] If label enumeration is set, system creates labels and relates them to autotest             and deletes relations with current Labels (if exist)  [Optional] If link enumeration is set, system creates links and relates them to autotest             and deletes relations with current Links (if exist)  System updates autotest and returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsApi()
val autoTestUpdateApiModel : kotlin.collections.List<AutoTestUpdateApiModel> =  // kotlin.collections.List<AutoTestUpdateApiModel> | 
try {
    apiInstance.updateMultiple(autoTestUpdateApiModel)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsApi#updateMultiple")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsApi#updateMultiple")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestUpdateApiModel** | [**kotlin.collections.List&lt;AutoTestUpdateApiModel&gt;**](AutoTestUpdateApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

