# AutoTestsProjectApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdAutoTestsImportPost**](AutoTestsProjectApi.md#apiV2ProjectsProjectIdAutoTestsImportPost) | **POST** /api/v2/projects/{projectId}/auto-tests/import | Schedules import of auto tests JUnit XML report. |


<a id="apiV2ProjectsProjectIdAutoTestsImportPost"></a>
# **apiV2ProjectsProjectIdAutoTestsImportPost**
> apiV2ProjectsProjectIdAutoTestsImportPost(projectId, scheduleAutoTestsReportImportsApiModel)

Schedules import of auto tests JUnit XML report.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AutoTestsProjectApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project ID
val scheduleAutoTestsReportImportsApiModel : ScheduleAutoTestsReportImportsApiModel =  // ScheduleAutoTestsReportImportsApiModel | The request model with collection of reports to import.
try {
    apiInstance.apiV2ProjectsProjectIdAutoTestsImportPost(projectId, scheduleAutoTestsReportImportsApiModel)
} catch (e: ClientException) {
    println("4xx response calling AutoTestsProjectApi#apiV2ProjectsProjectIdAutoTestsImportPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AutoTestsProjectApi#apiV2ProjectsProjectIdAutoTestsImportPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleAutoTestsReportImportsApiModel** | [**ScheduleAutoTestsReportImportsApiModel**](ScheduleAutoTestsReportImportsApiModel.md)| The request model with collection of reports to import. | [optional] |

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

