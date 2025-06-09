# ProjectTestPlansApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdTestPlansAnalyticsGet**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansAnalyticsGet) | **GET** /api/v2/projects/{projectId}/testPlans/analytics | Get TestPlans analytics |
| [**apiV2ProjectsProjectIdTestPlansDeleteBulkPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansDeleteBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/delete/bulk | Delete multiple test plans |
| [**apiV2ProjectsProjectIdTestPlansNameExistsGet**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansNameExistsGet) | **GET** /api/v2/projects/{projectId}/testPlans/{name}/exists | Checks if TestPlan exists with the specified name exists for the project |
| [**apiV2ProjectsProjectIdTestPlansPurgeBulkPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansPurgeBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/purge/bulk | Permanently delete multiple archived test plans |
| [**apiV2ProjectsProjectIdTestPlansRestoreBulkPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansRestoreBulkPost) | **POST** /api/v2/projects/{projectId}/testPlans/restore/bulk | Restore multiple test plans |
| [**apiV2ProjectsProjectIdTestPlansSearchPost**](ProjectTestPlansApi.md#apiV2ProjectsProjectIdTestPlansSearchPost) | **POST** /api/v2/projects/{projectId}/testPlans/search | Get Project TestPlans with analytics |


<a id="apiV2ProjectsProjectIdTestPlansAnalyticsGet"></a>
# **apiV2ProjectsProjectIdTestPlansAnalyticsGet**
> kotlin.collections.List&lt;TestPlanWithAnalyticModel&gt; apiV2ProjectsProjectIdTestPlansAnalyticsGet(projectId, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue)

Get TestPlans analytics

 Use case  User sets project internal identifier  User sets query params  User runs method execution  System return analytics

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlansApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project internal (UUID) identifier
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val mustUpdateCache : kotlin.Boolean = true // kotlin.Boolean | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TestPlanWithAnalyticModel> = apiInstance.apiV2ProjectsProjectIdTestPlansAnalyticsGet(projectId, isDeleted, mustUpdateCache, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansAnalyticsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansAnalyticsGet")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**| Project internal (UUID) identifier | |
| **isDeleted** | **kotlin.Boolean**|  | [optional] |
| **mustUpdateCache** | **kotlin.Boolean**|  | [optional] [default to false] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPlanWithAnalyticModel&gt;**](TestPlanWithAnalyticModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansDeleteBulkPost"></a>
# **apiV2ProjectsProjectIdTestPlansDeleteBulkPost**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2ProjectsProjectIdTestPlansDeleteBulkPost(projectId, testPlanSelectModel)

Delete multiple test plans

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlansApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global ID of the project
val testPlanSelectModel : TestPlanSelectModel =  // TestPlanSelectModel | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2ProjectsProjectIdTestPlansDeleteBulkPost(projectId, testPlanSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansDeleteBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansDeleteBulkPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global ID of the project | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanSelectModel** | [**TestPlanSelectModel**](TestPlanSelectModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansNameExistsGet"></a>
# **apiV2ProjectsProjectIdTestPlansNameExistsGet**
> kotlin.Boolean apiV2ProjectsProjectIdTestPlansNameExistsGet(projectId, name)

Checks if TestPlan exists with the specified name exists for the project

 Use case  User sets project internal or global identifier  User runs method execution  System purge delete project workitems

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlansApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project internal (UUID) or global (integer) identifier
val name : kotlin.String = name_example // kotlin.String | TestPlan name to check
try {
    val result : kotlin.Boolean = apiInstance.apiV2ProjectsProjectIdTestPlansNameExistsGet(projectId, name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansNameExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansNameExistsGet")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| TestPlan name to check | |

### Return type

**kotlin.Boolean**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansPurgeBulkPost"></a>
# **apiV2ProjectsProjectIdTestPlansPurgeBulkPost**
> apiV2ProjectsProjectIdTestPlansPurgeBulkPost(projectId, testPlanSelectModel)

Permanently delete multiple archived test plans

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlansApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global ID of the project
val testPlanSelectModel : TestPlanSelectModel =  // TestPlanSelectModel | 
try {
    apiInstance.apiV2ProjectsProjectIdTestPlansPurgeBulkPost(projectId, testPlanSelectModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansPurgeBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansPurgeBulkPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global ID of the project | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanSelectModel** | [**TestPlanSelectModel**](TestPlanSelectModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansRestoreBulkPost"></a>
# **apiV2ProjectsProjectIdTestPlansRestoreBulkPost**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2ProjectsProjectIdTestPlansRestoreBulkPost(projectId, testPlanSelectModel)

Restore multiple test plans

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlansApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global ID of the project
val testPlanSelectModel : TestPlanSelectModel =  // TestPlanSelectModel | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2ProjectsProjectIdTestPlansRestoreBulkPost(projectId, testPlanSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansRestoreBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansRestoreBulkPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global ID of the project | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanSelectModel** | [**TestPlanSelectModel**](TestPlanSelectModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansSearchPost"></a>
# **apiV2ProjectsProjectIdTestPlansSearchPost**
> kotlin.collections.List&lt;TestPlanWithAnalyticModel&gt; apiV2ProjectsProjectIdTestPlansSearchPost(projectId, mustUpdateCache, skip, take, orderBy, searchField, searchValue, projectTestPlansFilterModel)

Get Project TestPlans with analytics

 Use case  User sets project internal or global identifier  User sets request body  User runs method execution  System returns project testplans with analytics

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlansApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val mustUpdateCache : kotlin.Boolean = true // kotlin.Boolean | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val projectTestPlansFilterModel : ProjectTestPlansFilterModel =  // ProjectTestPlansFilterModel | 
try {
    val result : kotlin.collections.List<TestPlanWithAnalyticModel> = apiInstance.apiV2ProjectsProjectIdTestPlansSearchPost(projectId, mustUpdateCache, skip, take, orderBy, searchField, searchValue, projectTestPlansFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlansApi#apiV2ProjectsProjectIdTestPlansSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| **mustUpdateCache** | **kotlin.Boolean**|  | [optional] [default to false] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTestPlansFilterModel** | [**ProjectTestPlansFilterModel**](ProjectTestPlansFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPlanWithAnalyticModel&gt;**](TestPlanWithAnalyticModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

