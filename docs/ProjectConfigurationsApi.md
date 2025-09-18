# ProjectConfigurationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getConfigurationsByProjectId**](ProjectConfigurationsApi.md#getConfigurationsByProjectId) | **GET** /api/v2/projects/{projectId}/configurations | Get project configurations |


<a id="getConfigurationsByProjectId"></a>
# **getConfigurationsByProjectId**
> kotlin.collections.List&lt;ConfigurationModel&gt; getConfigurationsByProjectId(projectId)

Get project configurations

  Use case    User sets project internal or global identifier    User runs method execution    System search project    System search all configurations related to project    System returns array of found configurations (listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectConfigurationsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<ConfigurationModel> = apiInstance.getConfigurationsByProjectId(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectConfigurationsApi#getConfigurationsByProjectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectConfigurationsApi#getConfigurationsByProjectId")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

