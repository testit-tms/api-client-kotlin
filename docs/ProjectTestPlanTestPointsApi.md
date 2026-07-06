# ProjectTestPlanTestPointsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/analytics | Get test points analytics. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/rerun | Rerun autotests. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/run | Run autotests. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/grouping-search | Search test points in test plan. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/testers | Distribute test points between the users. |


<a id="apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost"></a>
# **apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost**
> TestPlanTestPointsAnalyticsApiResult apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost(projectId, testPlanId, testPlanTestPointsAnalyticsApiModel)

Get test points analytics.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlanTestPointsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val testPlanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val testPlanTestPointsAnalyticsApiModel : TestPlanTestPointsAnalyticsApiModel =  // TestPlanTestPointsAnalyticsApiModel | 
try {
    val result : TestPlanTestPointsAnalyticsApiResult = apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost(projectId, testPlanId, testPlanTestPointsAnalyticsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAnalyticsPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| **testPlanId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanTestPointsAnalyticsApiModel** | [**TestPlanTestPointsAnalyticsApiModel**](TestPlanTestPointsAnalyticsApiModel.md)|  | [optional] |

### Return type

[**TestPlanTestPointsAnalyticsApiResult**](TestPlanTestPointsAnalyticsApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost"></a>
# **apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost**
> apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRerunApiModel)

Rerun autotests.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlanTestPointsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val testPlanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val testPlanTestPointsAutoTestsRerunApiModel : TestPlanTestPointsAutoTestsRerunApiModel =  // TestPlanTestPointsAutoTestsRerunApiModel | 
try {
    apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRerunApiModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| **testPlanId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanTestPointsAutoTestsRerunApiModel** | [**TestPlanTestPointsAutoTestsRerunApiModel**](TestPlanTestPointsAutoTestsRerunApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost"></a>
# **apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost**
> TestRunNameApiResult apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRunApiModel)

Run autotests.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlanTestPointsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val testPlanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val testPlanTestPointsAutoTestsRunApiModel : TestPlanTestPointsAutoTestsRunApiModel =  // TestPlanTestPointsAutoTestsRunApiModel | 
try {
    val result : TestRunNameApiResult = apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost(projectId, testPlanId, testPlanTestPointsAutoTestsRunApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| **testPlanId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanTestPointsAutoTestsRunApiModel** | [**TestPlanTestPointsAutoTestsRunApiModel**](TestPlanTestPointsAutoTestsRunApiModel.md)|  | [optional] |

### Return type

[**TestRunNameApiResult**](TestRunNameApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost"></a>
# **apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost**
> TestPlanTestPointsGroupSearchApiResult apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost(projectId, testPlanId, testPlanTestPointsApiModel)

Search test points in test plan.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlanTestPointsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val testPlanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val testPlanTestPointsApiModel : TestPlanTestPointsApiModel =  // TestPlanTestPointsApiModel | 
try {
    val result : TestPlanTestPointsGroupSearchApiResult = apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost(projectId, testPlanId, testPlanTestPointsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsGroupingSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| **testPlanId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanTestPointsApiModel** | [**TestPlanTestPointsApiModel**](TestPlanTestPointsApiModel.md)|  | [optional] |

### Return type

[**TestPlanTestPointsGroupSearchApiResult**](TestPlanTestPointsGroupSearchApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost"></a>
# **apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost**
> apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost(projectId, testPlanId, testPlanTestPointsSetTestersApiModel)

Distribute test points between the users.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectTestPlanTestPointsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val testPlanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val testPlanTestPointsSetTestersApiModel : TestPlanTestPointsSetTestersApiModel =  // TestPlanTestPointsSetTestersApiModel | 
try {
    apiInstance.apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost(projectId, testPlanId, testPlanTestPointsSetTestersApiModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanTestPointsApi#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsTestersPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| **testPlanId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanTestPointsSetTestersApiModel** | [**TestPlanTestPointsSetTestersApiModel**](TestPlanTestPointsSetTestersApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

