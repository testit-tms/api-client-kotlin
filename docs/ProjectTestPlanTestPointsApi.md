# ProjectTestPlanTestPointsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRerunPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/rerun | Rerun autotests. |
| [**apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost**](ProjectTestPlanTestPointsApi.md#apiV2ProjectsProjectIdTestPlansTestPlanIdTestPointsAutotestsRunPost) | **POST** /api/v2/projects/{projectId}/test-plans/{testPlanId}/test-points/autotests/run | Run autotests. |


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
val projectId : kotlin.String = projectId_example // kotlin.String | 
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
| **projectId** | **kotlin.String**|  | |
| **testPlanId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanTestPointsAutoTestsRerunApiModel** | [**TestPlanTestPointsAutoTestsRerunApiModel**](TestPlanTestPointsAutoTestsRerunApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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
val projectId : kotlin.String = projectId_example // kotlin.String | 
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
| **projectId** | **kotlin.String**|  | |
| **testPlanId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testPlanTestPointsAutoTestsRunApiModel** | [**TestPlanTestPointsAutoTestsRunApiModel**](TestPlanTestPointsAutoTestsRunApiModel.md)|  | [optional] |

### Return type

[**TestRunNameApiResult**](TestRunNameApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

