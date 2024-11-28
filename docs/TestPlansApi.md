# TestPlansApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addTestPointsWithSections**](TestPlansApi.md#addTestPointsWithSections) | **POST** /api/v2/testPlans/{id}/test-points/withSections | Add test-points to TestPlan with sections |
| [**addWorkItemsWithSections**](TestPlansApi.md#addWorkItemsWithSections) | **POST** /api/v2/testPlans/{id}/workItems/withSections | Add WorkItems to TestPlan with Sections as TestSuites |
| [**apiV2TestPlansIdAnalyticsGet**](TestPlansApi.md#apiV2TestPlansIdAnalyticsGet) | **GET** /api/v2/testPlans/{id}/analytics | Get analytics by TestPlan |
| [**apiV2TestPlansIdAutobalancePost**](TestPlansApi.md#apiV2TestPlansIdAutobalancePost) | **POST** /api/v2/testPlans/{id}/autobalance | Distribute test points between the users |
| [**apiV2TestPlansIdConfigurationsGet**](TestPlansApi.md#apiV2TestPlansIdConfigurationsGet) | **GET** /api/v2/testPlans/{id}/configurations | Get TestPlan configurations |
| [**apiV2TestPlansIdExportTestPointsXlsxPost**](TestPlansApi.md#apiV2TestPlansIdExportTestPointsXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testPoints/xlsx | Export TestPoints from TestPlan in xls format |
| [**apiV2TestPlansIdExportTestResultHistoryXlsxPost**](TestPlansApi.md#apiV2TestPlansIdExportTestResultHistoryXlsxPost) | **POST** /api/v2/testPlans/{id}/export/testResultHistory/xlsx | Export TestResults history from TestPlan in xls format |
| [**apiV2TestPlansIdHistoryGet**](TestPlansApi.md#apiV2TestPlansIdHistoryGet) | **GET** /api/v2/testPlans/{id}/history | Get TestPlan history |
| [**apiV2TestPlansIdLinksGet**](TestPlansApi.md#apiV2TestPlansIdLinksGet) | **GET** /api/v2/testPlans/{id}/links | Get Links of TestPlan |
| [**apiV2TestPlansIdPatch**](TestPlansApi.md#apiV2TestPlansIdPatch) | **PATCH** /api/v2/testPlans/{id} | Patch test plan |
| [**apiV2TestPlansIdSummariesGet**](TestPlansApi.md#apiV2TestPlansIdSummariesGet) | **GET** /api/v2/testPlans/{id}/summaries | Get summary by TestPlan |
| [**apiV2TestPlansIdTestPointsLastResultsGet**](TestPlansApi.md#apiV2TestPlansIdTestPointsLastResultsGet) | **GET** /api/v2/testPlans/{id}/testPoints/lastResults | Get TestPoints with last result from TestPlan |
| [**apiV2TestPlansIdTestPointsResetPost**](TestPlansApi.md#apiV2TestPlansIdTestPointsResetPost) | **POST** /api/v2/testPlans/{id}/testPoints/reset | Reset TestPoints status of TestPlan |
| [**apiV2TestPlansIdTestPointsTesterDelete**](TestPlansApi.md#apiV2TestPlansIdTestPointsTesterDelete) | **DELETE** /api/v2/testPlans/{id}/testPoints/tester | Unassign users from multiple test points |
| [**apiV2TestPlansIdTestPointsTesterUserIdPost**](TestPlansApi.md#apiV2TestPlansIdTestPointsTesterUserIdPost) | **POST** /api/v2/testPlans/{id}/testPoints/tester/{userId} | Assign user as a tester to multiple test points |
| [**apiV2TestPlansIdTestRunsGet**](TestPlansApi.md#apiV2TestPlansIdTestRunsGet) | **GET** /api/v2/testPlans/{id}/testRuns | Get TestRuns of TestPlan |
| [**apiV2TestPlansIdTestRunsSearchPost**](TestPlansApi.md#apiV2TestPlansIdTestRunsSearchPost) | **POST** /api/v2/testPlans/{id}/testRuns/search | Search TestRuns of TestPlan |
| [**apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet**](TestPlansApi.md#apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet) | **GET** /api/v2/testPlans/{id}/testRuns/testResults/lastModified/modifiedDate | Get last modification date of test plan&#39;s test results |
| [**apiV2TestPlansIdUnlockRequestPost**](TestPlansApi.md#apiV2TestPlansIdUnlockRequestPost) | **POST** /api/v2/testPlans/{id}/unlock/request | Send unlock TestPlan notification |
| [**apiV2TestPlansShortsPost**](TestPlansApi.md#apiV2TestPlansShortsPost) | **POST** /api/v2/testPlans/shorts | Get TestPlans short models by Project identifiers |
| [**clone**](TestPlansApi.md#clone) | **POST** /api/v2/testPlans/{id}/clone | Clone TestPlan |
| [**complete**](TestPlansApi.md#complete) | **POST** /api/v2/testPlans/{id}/complete | Complete TestPlan |
| [**createTestPlan**](TestPlansApi.md#createTestPlan) | **POST** /api/v2/testPlans | Create TestPlan |
| [**deleteTestPlan**](TestPlansApi.md#deleteTestPlan) | **DELETE** /api/v2/testPlans/{id} | Delete TestPlan |
| [**getTestPlanById**](TestPlansApi.md#getTestPlanById) | **GET** /api/v2/testPlans/{id} | Get TestPlan by Id |
| [**getTestSuitesById**](TestPlansApi.md#getTestSuitesById) | **GET** /api/v2/testPlans/{id}/testSuites | Get TestSuites Tree By Id |
| [**pause**](TestPlansApi.md#pause) | **POST** /api/v2/testPlans/{id}/pause | Pause TestPlan |
| [**purgeTestPlan**](TestPlansApi.md#purgeTestPlan) | **POST** /api/v2/testPlans/{id}/purge | Permanently delete test plan from archive |
| [**restoreTestPlan**](TestPlansApi.md#restoreTestPlan) | **POST** /api/v2/testPlans/{id}/restore | Restore TestPlan |
| [**start**](TestPlansApi.md#start) | **POST** /api/v2/testPlans/{id}/start | Start TestPlan |
| [**updateTestPlan**](TestPlansApi.md#updateTestPlan) | **PUT** /api/v2/testPlans | Update TestPlan |


<a id="addTestPointsWithSections"></a>
# **addTestPointsWithSections**
> addTestPointsWithSections(id, workItemSelectModel)

Add test-points to TestPlan with sections

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val workItemSelectModel : WorkItemSelectModel =  // WorkItemSelectModel | Filter object to retrieve work items for test-suite's project
try {
    apiInstance.addTestPointsWithSections(id, workItemSelectModel)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#addTestPointsWithSections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#addTestPointsWithSections")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemSelectModel** | [**WorkItemSelectModel**](WorkItemSelectModel.md)| Filter object to retrieve work items for test-suite&#39;s project | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="addWorkItemsWithSections"></a>
# **addWorkItemsWithSections**
> addWorkItemsWithSections(id, javaUtilUUID)

Add WorkItems to TestPlan with Sections as TestSuites

 Use case   User sets TestPlan identifier   User sets WorkItem identifiers (listed in request example)   User runs method execution   System added WorkItems and Sections to TestPlan   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    apiInstance.addWorkItemsWithSections(id, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#addWorkItemsWithSections")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#addWorkItemsWithSections")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **javaUtilUUID** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestPlansIdAnalyticsGet"></a>
# **apiV2TestPlansIdAnalyticsGet**
> TestPointAnalyticResult apiV2TestPlansIdAnalyticsGet(id)

Get analytics by TestPlan

 Use case   User sets test plan identifier   User runs method execution   System returns analytics by test plan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    val result : TestPointAnalyticResult = apiInstance.apiV2TestPlansIdAnalyticsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdAnalyticsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdAnalyticsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**TestPointAnalyticResult**](TestPointAnalyticResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdAutobalancePost"></a>
# **apiV2TestPlansIdAutobalancePost**
> TestPlanWithTestSuiteTreeModel apiV2TestPlansIdAutobalancePost(id, testers)

Distribute test points between the users

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = id_example // kotlin.String | Test plan unique or global ID
val testers : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | Specifies a project user IDs to distribute
try {
    val result : TestPlanWithTestSuiteTreeModel = apiInstance.apiV2TestPlansIdAutobalancePost(id, testers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdAutobalancePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdAutobalancePost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan unique or global ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testers** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md)| Specifies a project user IDs to distribute | [optional] |

### Return type

[**TestPlanWithTestSuiteTreeModel**](TestPlanWithTestSuiteTreeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdConfigurationsGet"></a>
# **apiV2TestPlansIdConfigurationsGet**
> kotlin.collections.List&lt;ConfigurationModel&gt; apiV2TestPlansIdConfigurationsGet(id)

Get TestPlan configurations

 Use case   User sets test plan identifier   User runs method execution   System return test plan configurations

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    val result : kotlin.collections.List<ConfigurationModel> = apiInstance.apiV2TestPlansIdConfigurationsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdConfigurationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdConfigurationsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**kotlin.collections.List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdExportTestPointsXlsxPost"></a>
# **apiV2TestPlansIdExportTestPointsXlsxPost**
> apiV2TestPlansIdExportTestPointsXlsxPost(id, timeZoneOffsetInMinutes, getXlsxTestPointsByTestPlanModel)

Export TestPoints from TestPlan in xls format

 Use case   User sets test plan identifier   User sets filter model (listed in request example)   User runs method execution   System return export xlsx file

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val timeZoneOffsetInMinutes : kotlin.Long = 789 // kotlin.Long | 
val getXlsxTestPointsByTestPlanModel : GetXlsxTestPointsByTestPlanModel =  // GetXlsxTestPointsByTestPlanModel | 
try {
    apiInstance.apiV2TestPlansIdExportTestPointsXlsxPost(id, timeZoneOffsetInMinutes, getXlsxTestPointsByTestPlanModel)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdExportTestPointsXlsxPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdExportTestPointsXlsxPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| **timeZoneOffsetInMinutes** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getXlsxTestPointsByTestPlanModel** | [**GetXlsxTestPointsByTestPlanModel**](GetXlsxTestPointsByTestPlanModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestPlansIdExportTestResultHistoryXlsxPost"></a>
# **apiV2TestPlansIdExportTestResultHistoryXlsxPost**
> apiV2TestPlansIdExportTestResultHistoryXlsxPost(id, mustReturnOnlyLastTestResult, includeSteps, includeDeletedTestSuites, timeZoneOffsetInMinutes)

Export TestResults history from TestPlan in xls format

 Use case   User sets test plan identifier   User sets filter model (listed in request example)   User runs method execution   System return export xlsx file

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val mustReturnOnlyLastTestResult : kotlin.Boolean = true // kotlin.Boolean | 
val includeSteps : kotlin.Boolean = true // kotlin.Boolean | 
val includeDeletedTestSuites : kotlin.Boolean = true // kotlin.Boolean | 
val timeZoneOffsetInMinutes : kotlin.Long = 789 // kotlin.Long | 
try {
    apiInstance.apiV2TestPlansIdExportTestResultHistoryXlsxPost(id, mustReturnOnlyLastTestResult, includeSteps, includeDeletedTestSuites, timeZoneOffsetInMinutes)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdExportTestResultHistoryXlsxPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdExportTestResultHistoryXlsxPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| **mustReturnOnlyLastTestResult** | **kotlin.Boolean**|  | [optional] |
| **includeSteps** | **kotlin.Boolean**|  | [optional] |
| **includeDeletedTestSuites** | **kotlin.Boolean**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timeZoneOffsetInMinutes** | **kotlin.Long**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdHistoryGet"></a>
# **apiV2TestPlansIdHistoryGet**
> kotlin.collections.List&lt;TestPlanChangeModel&gt; apiV2TestPlansIdHistoryGet(id, skip, take, orderBy, searchField, searchValue)

Get TestPlan history

 Use case   User sets test plan identifier   User runs method execution   System return test plan history

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TestPlanChangeModel> = apiInstance.apiV2TestPlansIdHistoryGet(id, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdHistoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdHistoryGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPlanChangeModel&gt;**](TestPlanChangeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdLinksGet"></a>
# **apiV2TestPlansIdLinksGet**
> kotlin.collections.List&lt;TestPlanLink&gt; apiV2TestPlansIdLinksGet(id, skip, take, orderBy)

Get Links of TestPlan

 Use case   User sets test plan identifier   User sets pagination filter (listed in request example)   User runs method execution   System returns links of TestPlan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val skip : kotlin.Int = 56 // kotlin.Int | 
val take : kotlin.Int = 56 // kotlin.Int | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | 
try {
    val result : kotlin.collections.List<TestPlanLink> = apiInstance.apiV2TestPlansIdLinksGet(id, skip, take, orderBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdLinksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdLinksGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| **skip** | **kotlin.Int**|  | [optional] |
| **take** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderBy** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPlanLink&gt;**](TestPlanLink.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdPatch"></a>
# **apiV2TestPlansIdPatch**
> apiV2TestPlansIdPatch(id, operation)

Patch test plan

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the test plan
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.apiV2TestPlansIdPatch(id, operation)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Unique ID of the test plan | |
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

<a id="apiV2TestPlansIdSummariesGet"></a>
# **apiV2TestPlansIdSummariesGet**
> TestPlanSummaryModel apiV2TestPlansIdSummariesGet(id)

Get summary by TestPlan

 Use case   User sets test plan identifier   User runs method execution   System returns summary by test plan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    val result : TestPlanSummaryModel = apiInstance.apiV2TestPlansIdSummariesGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdSummariesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdSummariesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**TestPlanSummaryModel**](TestPlanSummaryModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdTestPointsLastResultsGet"></a>
# **apiV2TestPlansIdTestPointsLastResultsGet**
> kotlin.collections.List&lt;TestPointWithLastResultModel&gt; apiV2TestPlansIdTestPointsLastResultsGet(id, testerId, skip, take, orderBy, searchField, searchValue)

Get TestPoints with last result from TestPlan

 Use case   User sets test plan identifier   User sets filter (listed in request example)   User runs method execution   System return test points with last result from test plan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val testerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TestPointWithLastResultModel> = apiInstance.apiV2TestPlansIdTestPointsLastResultsGet(id, testerId, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdTestPointsLastResultsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdTestPointsLastResultsGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| **testerId** | **java.util.UUID**|  | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPointWithLastResultModel&gt;**](TestPointWithLastResultModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdTestPointsResetPost"></a>
# **apiV2TestPlansIdTestPointsResetPost**
> apiV2TestPlansIdTestPointsResetPost(id, javaUtilUUID)

Reset TestPoints status of TestPlan

 Use case   User sets test plan identifier   User sets test points identifiers   User runs method execution   System reset test points statuses of test plan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    apiInstance.apiV2TestPlansIdTestPointsResetPost(id, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdTestPointsResetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdTestPointsResetPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **javaUtilUUID** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestPlansIdTestPointsTesterDelete"></a>
# **apiV2TestPlansIdTestPointsTesterDelete**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2TestPlansIdTestPointsTesterDelete(id, testPointSelectModel)

Unassign users from multiple test points

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the test plan
val testPointSelectModel : TestPointSelectModel =  // TestPointSelectModel | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2TestPlansIdTestPointsTesterDelete(id, testPointSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdTestPointsTesterDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdTestPointsTesterDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Unique or global ID of the test plan | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPointSelectModel** | [**TestPointSelectModel**](TestPointSelectModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestPlansIdTestPointsTesterUserIdPost"></a>
# **apiV2TestPlansIdTestPointsTesterUserIdPost**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2TestPlansIdTestPointsTesterUserIdPost(id, userId, testPointSelectModel)

Assign user as a tester to multiple test points

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the test plan
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the user
val testPointSelectModel : TestPointSelectModel =  // TestPointSelectModel | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2TestPlansIdTestPointsTesterUserIdPost(id, userId, testPointSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdTestPointsTesterUserIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdTestPointsTesterUserIdPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Unique or global ID of the test plan | |
| **userId** | **java.util.UUID**| Unique ID of the user | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPointSelectModel** | [**TestPointSelectModel**](TestPointSelectModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestPlansIdTestRunsGet"></a>
# **apiV2TestPlansIdTestRunsGet**
> kotlin.collections.List&lt;TestRunModel&gt; apiV2TestPlansIdTestRunsGet(id, notStarted, inProgress, stopped, completed, skip, take, orderBy, searchField, searchValue)

Get TestRuns of TestPlan

 Use case   User sets test plan identifier   User sets TestRun status filter (listed in request example)   User runs method execution   System returns TestRuns for TestPlan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val notStarted : kotlin.Boolean = true // kotlin.Boolean | 
val inProgress : kotlin.Boolean = true // kotlin.Boolean | 
val stopped : kotlin.Boolean = true // kotlin.Boolean | 
val completed : kotlin.Boolean = true // kotlin.Boolean | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TestRunModel> = apiInstance.apiV2TestPlansIdTestRunsGet(id, notStarted, inProgress, stopped, completed, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdTestRunsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdTestRunsGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| **notStarted** | **kotlin.Boolean**|  | [optional] |
| **inProgress** | **kotlin.Boolean**|  | [optional] |
| **stopped** | **kotlin.Boolean**|  | [optional] |
| **completed** | **kotlin.Boolean**|  | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TestRunModel&gt;**](TestRunModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdTestRunsSearchPost"></a>
# **apiV2TestPlansIdTestRunsSearchPost**
> kotlin.collections.List&lt;TestRunModel&gt; apiV2TestPlansIdTestRunsSearchPost(id, skip, take, orderBy, searchField, searchValue, testRunSearchQueryModel)

Search TestRuns of TestPlan

 Use case   User sets test plan identifier   User sets TestRuns filter (listed in request example)   User runs method execution   System returns TestRuns for TestPlan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val testRunSearchQueryModel : TestRunSearchQueryModel =  // TestRunSearchQueryModel | 
try {
    val result : kotlin.collections.List<TestRunModel> = apiInstance.apiV2TestPlansIdTestRunsSearchPost(id, skip, take, orderBy, searchField, searchValue, testRunSearchQueryModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdTestRunsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdTestRunsSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testRunSearchQueryModel** | [**TestRunSearchQueryModel**](TestRunSearchQueryModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TestRunModel&gt;**](TestRunModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet"></a>
# **apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet**
> apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet(id)

Get last modification date of test plan&#39;s test results

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = id_example // kotlin.String | Test plan unique or global ID
try {
    apiInstance.apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdTestRunsTestResultsLastModifiedModifiedDateGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan unique or global ID | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansIdUnlockRequestPost"></a>
# **apiV2TestPlansIdUnlockRequestPost**
> apiV2TestPlansIdUnlockRequestPost(id)

Send unlock TestPlan notification

 Use case   User sets test plan identifier   User runs method execution   System send unlock test plan notification

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.apiV2TestPlansIdUnlockRequestPost(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansIdUnlockRequestPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansIdUnlockRequestPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestPlansShortsPost"></a>
# **apiV2TestPlansShortsPost**
> kotlin.collections.List&lt;TestPlanShortModel&gt; apiV2TestPlansShortsPost(isDeleted, javaUtilUUID)

Get TestPlans short models by Project identifiers

 Use case   User sets projects identifiers   User runs method execution   System return test plans short models (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    val result : kotlin.collections.List<TestPlanShortModel> = apiInstance.apiV2TestPlansShortsPost(isDeleted, javaUtilUUID)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#apiV2TestPlansShortsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#apiV2TestPlansShortsPost")
    e.printStackTrace()
}
```

### Parameters
| **isDeleted** | **kotlin.Boolean**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **javaUtilUUID** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPlanShortModel&gt;**](TestPlanShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="clone"></a>
# **clone**
> TestPlanModel clone(id)

Clone TestPlan

 Use case   User sets test plan identifier   User runs method execution   System clones test plan   System returns test plan (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    val result : TestPlanModel = apiInstance.clone(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#clone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#clone")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="complete"></a>
# **complete**
> complete(id)

Complete TestPlan

 Use case   User sets test plan identifier   User runs method execution   System completes the test plan and updates test plan status   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.complete(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#complete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#complete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createTestPlan"></a>
# **createTestPlan**
> TestPlanModel createTestPlan(testPlanPostModel)

Create TestPlan

 Use case   User sets test plan properties (listed in request example)   User runs method execution   System creates test plan   System returns test plan (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val testPlanPostModel : TestPlanPostModel =  // TestPlanPostModel | 
try {
    val result : TestPlanModel = apiInstance.createTestPlan(testPlanPostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#createTestPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#createTestPlan")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanPostModel** | [**TestPlanPostModel**](TestPlanPostModel.md)|  | [optional] |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTestPlan"></a>
# **deleteTestPlan**
> deleteTestPlan(id)

Delete TestPlan

 Use case   User sets test plan identifier   User runs method execution   System delete test plan   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.deleteTestPlan(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#deleteTestPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#deleteTestPlan")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestPlanById"></a>
# **getTestPlanById**
> TestPlanModel getTestPlanById(id)

Get TestPlan by Id

 Use case   User sets test plan identifier   User runs method execution   System search  test plan by the identifier   System returns test plan

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    val result : TestPlanModel = apiInstance.getTestPlanById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#getTestPlanById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#getTestPlanById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**TestPlanModel**](TestPlanModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestSuitesById"></a>
# **getTestSuitesById**
> kotlin.collections.List&lt;TestSuiteV2TreeModel&gt; getTestSuitesById(id)

Get TestSuites Tree By Id

 Use case   User sets test plan identifier   User runs method execution   System finds test suites related to the test plan   System returns test suites as a tree model (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    val result : kotlin.collections.List<TestSuiteV2TreeModel> = apiInstance.getTestSuitesById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#getTestSuitesById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#getTestSuitesById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

[**kotlin.collections.List&lt;TestSuiteV2TreeModel&gt;**](TestSuiteV2TreeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="pause"></a>
# **pause**
> pause(id)

Pause TestPlan

 Use case   User sets test plan identifier   User runs method execution   System pauses the test plan and updates test plan status   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.pause(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#pause")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#pause")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="purgeTestPlan"></a>
# **purgeTestPlan**
> purgeTestPlan(id)

Permanently delete test plan from archive

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the test plan
try {
    apiInstance.purgeTestPlan(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#purgeTestPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#purgeTestPlan")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the test plan | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="restoreTestPlan"></a>
# **restoreTestPlan**
> restoreTestPlan(id)

Restore TestPlan

 Use case   User sets test plan identifier   User runs method execution   System restores test plan   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.restoreTestPlan(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#restoreTestPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#restoreTestPlan")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="start"></a>
# **start**
> start(id)

Start TestPlan

 Use case   User sets test plan identifier   User runs method execution   System starts the test plan and updates test plan status   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Test plan internal (guid format) or global (int  format) identifier
try {
    apiInstance.start(id)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#start")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#start")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Test plan internal (guid format) or global (int  format) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateTestPlan"></a>
# **updateTestPlan**
> updateTestPlan(testPlanPutModel)

Update TestPlan

 Use case   User sets test plan properties(listed in request example)   User runs method execution   System updates test plan   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestPlansApi()
val testPlanPutModel : TestPlanPutModel =  // TestPlanPutModel | 
try {
    apiInstance.updateTestPlan(testPlanPutModel)
} catch (e: ClientException) {
    println("4xx response calling TestPlansApi#updateTestPlan")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestPlansApi#updateTestPlan")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanPutModel** | [**TestPlanPutModel**](TestPlanPutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

