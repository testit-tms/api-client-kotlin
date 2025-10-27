# ProjectSettingsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdSettingsAutotestsPost**](ProjectSettingsApi.md#apiV2ProjectsProjectIdSettingsAutotestsPost) | **POST** /api/v2/projects/{projectId}/settings/autotests | Set autotest project settings. |
| [**getAutotestProjectSettings**](ProjectSettingsApi.md#getAutotestProjectSettings) | **GET** /api/v2/projects/{projectId}/settings/autotests | Get autotest project settings. |


<a id="apiV2ProjectsProjectIdSettingsAutotestsPost"></a>
# **apiV2ProjectsProjectIdSettingsAutotestsPost**
> apiV2ProjectsProjectIdSettingsAutotestsPost(projectId, autoTestProjectSettingsApiModel)

Set autotest project settings.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectSettingsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val autoTestProjectSettingsApiModel : AutoTestProjectSettingsApiModel =  // AutoTestProjectSettingsApiModel | 
try {
    apiInstance.apiV2ProjectsProjectIdSettingsAutotestsPost(projectId, autoTestProjectSettingsApiModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectSettingsApi#apiV2ProjectsProjectIdSettingsAutotestsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectSettingsApi#apiV2ProjectsProjectIdSettingsAutotestsPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestProjectSettingsApiModel** | [**AutoTestProjectSettingsApiModel**](AutoTestProjectSettingsApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getAutotestProjectSettings"></a>
# **getAutotestProjectSettings**
> AutoTestProjectSettingsApiResult getAutotestProjectSettings(projectId)

Get autotest project settings.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectSettingsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
try {
    val result : AutoTestProjectSettingsApiResult = apiInstance.getAutotestProjectSettings(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectSettingsApi#getAutotestProjectSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectSettingsApi#getAutotestProjectSettings")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |

### Return type

[**AutoTestProjectSettingsApiResult**](AutoTestProjectSettingsApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

