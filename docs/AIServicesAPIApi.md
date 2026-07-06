# AIServicesAPIApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ExternalServicesIdAiModelsPost**](AIServicesAPIApi.md#apiV2ExternalServicesIdAiModelsPost) | **POST** /api/v2/external-services/{id}/ai/models | Ask for models with inquiry filter, cached |


<a id="apiV2ExternalServicesIdAiModelsPost"></a>
# **apiV2ExternalServicesIdAiModelsPost**
> AIServiceModelApiResultIReply apiV2ExternalServicesIdAiModelsPost(id, getAIServiceModelsApiModel)

Ask for models with inquiry filter, cached

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = AIServicesAPIApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val getAIServiceModelsApiModel : GetAIServiceModelsApiModel =  // GetAIServiceModelsApiModel | 
try {
    val result : AIServiceModelApiResultIReply = apiInstance.apiV2ExternalServicesIdAiModelsPost(id, getAIServiceModelsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AIServicesAPIApi#apiV2ExternalServicesIdAiModelsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AIServicesAPIApi#apiV2ExternalServicesIdAiModelsPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getAIServiceModelsApiModel** | [**GetAIServiceModelsApiModel**](GetAIServiceModelsApiModel.md)|  | [optional] |

### Return type

[**AIServiceModelApiResultIReply**](AIServiceModelApiResultIReply.md)

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

