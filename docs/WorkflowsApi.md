# WorkflowsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2WorkflowsIdDelete**](WorkflowsApi.md#apiV2WorkflowsIdDelete) | **DELETE** /api/v2/workflows/{id} |  |
| [**apiV2WorkflowsIdGet**](WorkflowsApi.md#apiV2WorkflowsIdGet) | **GET** /api/v2/workflows/{id} |  |
| [**apiV2WorkflowsIdPatch**](WorkflowsApi.md#apiV2WorkflowsIdPatch) | **PATCH** /api/v2/workflows/{id} |  |
| [**apiV2WorkflowsIdProjectsSearchPost**](WorkflowsApi.md#apiV2WorkflowsIdProjectsSearchPost) | **POST** /api/v2/workflows/{id}/projects/search |  |
| [**apiV2WorkflowsIdPut**](WorkflowsApi.md#apiV2WorkflowsIdPut) | **PUT** /api/v2/workflows/{id} |  |
| [**apiV2WorkflowsNameNameExistsGet**](WorkflowsApi.md#apiV2WorkflowsNameNameExistsGet) | **GET** /api/v2/workflows/name/{name}/exists |  |
| [**apiV2WorkflowsPost**](WorkflowsApi.md#apiV2WorkflowsPost) | **POST** /api/v2/workflows |  |
| [**apiV2WorkflowsSearchPost**](WorkflowsApi.md#apiV2WorkflowsSearchPost) | **POST** /api/v2/workflows/search |  |


<a id="apiV2WorkflowsIdDelete"></a>
# **apiV2WorkflowsIdDelete**
> apiV2WorkflowsIdDelete(id)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2WorkflowsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkflowsIdGet"></a>
# **apiV2WorkflowsIdGet**
> WorkflowApiResult apiV2WorkflowsIdGet(id)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : WorkflowApiResult = apiInstance.apiV2WorkflowsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**WorkflowApiResult**](WorkflowApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a id="apiV2WorkflowsIdPatch"></a>
# **apiV2WorkflowsIdPatch**
> apiV2WorkflowsIdPatch(id, operation)



See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.apiV2WorkflowsIdPatch(id, operation)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a id="apiV2WorkflowsIdProjectsSearchPost"></a>
# **apiV2WorkflowsIdProjectsSearchPost**
> WorkflowProjectApiResultReply apiV2WorkflowsIdProjectsSearchPost(id, searchWorkflowProjectsApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val searchWorkflowProjectsApiModel : SearchWorkflowProjectsApiModel =  // SearchWorkflowProjectsApiModel | 
try {
    val result : WorkflowProjectApiResultReply = apiInstance.apiV2WorkflowsIdProjectsSearchPost(id, searchWorkflowProjectsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsIdProjectsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsIdProjectsSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchWorkflowProjectsApiModel** | [**SearchWorkflowProjectsApiModel**](SearchWorkflowProjectsApiModel.md)|  | [optional] |

### Return type

[**WorkflowProjectApiResultReply**](WorkflowProjectApiResultReply.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: text/plain, application/json

<a id="apiV2WorkflowsIdPut"></a>
# **apiV2WorkflowsIdPut**
> apiV2WorkflowsIdPut(id, updateWorkflowApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateWorkflowApiModel : UpdateWorkflowApiModel =  // UpdateWorkflowApiModel | 
try {
    apiInstance.apiV2WorkflowsIdPut(id, updateWorkflowApiModel)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateWorkflowApiModel** | [**UpdateWorkflowApiModel**](UpdateWorkflowApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a id="apiV2WorkflowsNameNameExistsGet"></a>
# **apiV2WorkflowsNameNameExistsGet**
> WorkflowExistsByNameApiResult apiV2WorkflowsNameNameExistsGet(name)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : WorkflowExistsByNameApiResult = apiInstance.apiV2WorkflowsNameNameExistsGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsNameNameExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsNameNameExistsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**|  | |

### Return type

[**WorkflowExistsByNameApiResult**](WorkflowExistsByNameApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a id="apiV2WorkflowsPost"></a>
# **apiV2WorkflowsPost**
> WorkflowApiResult apiV2WorkflowsPost(createWorkflowApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val createWorkflowApiModel : CreateWorkflowApiModel =  // CreateWorkflowApiModel | 
try {
    val result : WorkflowApiResult = apiInstance.apiV2WorkflowsPost(createWorkflowApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createWorkflowApiModel** | [**CreateWorkflowApiModel**](CreateWorkflowApiModel.md)|  | [optional] |

### Return type

[**WorkflowApiResult**](WorkflowApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: text/plain, application/json

<a id="apiV2WorkflowsSearchPost"></a>
# **apiV2WorkflowsSearchPost**
> WorkflowShortApiResultReply apiV2WorkflowsSearchPost(searchWorkflowsApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkflowsApi()
val searchWorkflowsApiModel : SearchWorkflowsApiModel =  // SearchWorkflowsApiModel | 
try {
    val result : WorkflowShortApiResultReply = apiInstance.apiV2WorkflowsSearchPost(searchWorkflowsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkflowsApi#apiV2WorkflowsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkflowsApi#apiV2WorkflowsSearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchWorkflowsApiModel** | [**SearchWorkflowsApiModel**](SearchWorkflowsApiModel.md)|  | [optional] |

### Return type

[**WorkflowShortApiResultReply**](WorkflowShortApiResultReply.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: text/plain, application/json

