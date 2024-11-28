# ProjectSettingsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdSettingsAutotestsPost**](ProjectSettingsApi.md#apiV2ProjectsProjectIdSettingsAutotestsPost) | **POST** /api/v2/projects/{projectId}/settings/autotests | Set autotest project settings. |
| [**getAutotestProjectSettings**](ProjectSettingsApi.md#getAutotestProjectSettings) | **GET** /api/v2/projects/{projectId}/settings/autotests | Get autotest project settings. |


<a id="apiV2ProjectsProjectIdSettingsAutotestsPost"></a>
# **apiV2ProjectsProjectIdSettingsAutotestsPost**
> apiV2ProjectsProjectIdSettingsAutotestsPost(projectId, autoTestProjectSettingsPostModel)

Set autotest project settings.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectSettingsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | 
val autoTestProjectSettingsPostModel : AutoTestProjectSettingsPostModel =  // AutoTestProjectSettingsPostModel | 
try {
    apiInstance.apiV2ProjectsProjectIdSettingsAutotestsPost(projectId, autoTestProjectSettingsPostModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectSettingsApi#apiV2ProjectsProjectIdSettingsAutotestsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectSettingsApi#apiV2ProjectsProjectIdSettingsAutotestsPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **autoTestProjectSettingsPostModel** | [**AutoTestProjectSettingsPostModel**](AutoTestProjectSettingsPostModel.md)|  | [optional] |

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
> AutoTestProjectSettingsGetModel getAutotestProjectSettings(projectId)

Get autotest project settings.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectSettingsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | 
try {
    val result : AutoTestProjectSettingsGetModel = apiInstance.getAutotestProjectSettings(projectId)
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
| **projectId** | **kotlin.String**|  | |

### Return type

[**AutoTestProjectSettingsGetModel**](AutoTestProjectSettingsGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

