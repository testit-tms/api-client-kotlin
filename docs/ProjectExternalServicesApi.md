# ProjectExternalServicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsIdExternalServicesExternalServiceIdDelete**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdDelete) | **DELETE** /api/v2/projects/{id}/external-services/{externalServiceId} | Disable an external service |
| [**apiV2ProjectsIdExternalServicesExternalServiceIdGet**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdGet) | **GET** /api/v2/projects/{id}/external-services/{externalServiceId} | Retrieves settings of an external service |
| [**apiV2ProjectsIdExternalServicesExternalServiceIdPatch**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdPatch) | **PATCH** /api/v2/projects/{id}/external-services/{externalServiceId} | Replaces one active external service with another |
| [**apiV2ProjectsIdExternalServicesExternalServiceIdPut**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesExternalServiceIdPut) | **PUT** /api/v2/projects/{id}/external-services/{externalServiceId} | Enable an external service |
| [**apiV2ProjectsIdExternalServicesGet**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesGet) | **GET** /api/v2/projects/{id}/external-services | Retrieves information about external services, including their integration status (enabled or not) |
| [**apiV2ProjectsIdExternalServicesIssuesSearchPost**](ProjectExternalServicesApi.md#apiV2ProjectsIdExternalServicesIssuesSearchPost) | **POST** /api/v2/projects/{id}/external-services/issues/search | Searches for external issues using enabled external services in project |


<a id="apiV2ProjectsIdExternalServicesExternalServiceIdDelete"></a>
# **apiV2ProjectsIdExternalServicesExternalServiceIdDelete**
> apiV2ProjectsIdExternalServicesExternalServiceIdDelete(id, externalServiceId)

Disable an external service

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectExternalServicesApi()
val id : kotlin.String = id_example // kotlin.String | Project ID
val externalServiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | External service ID
try {
    apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdDelete(id, externalServiceId)
} catch (e: ClientException) {
    println("4xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalServiceId** | **java.util.UUID**| External service ID | |

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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdExternalServicesExternalServiceIdGet"></a>
# **apiV2ProjectsIdExternalServicesExternalServiceIdGet**
> ProjectExternalServiceSettingsApiResult apiV2ProjectsIdExternalServicesExternalServiceIdGet(id, externalServiceId)

Retrieves settings of an external service

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectExternalServicesApi()
val id : kotlin.String = id_example // kotlin.String | Project ID
val externalServiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | External service ID
try {
    val result : ProjectExternalServiceSettingsApiResult = apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdGet(id, externalServiceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalServiceId** | **java.util.UUID**| External service ID | |

### Return type

[**ProjectExternalServiceSettingsApiResult**](ProjectExternalServiceSettingsApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdExternalServicesExternalServiceIdPatch"></a>
# **apiV2ProjectsIdExternalServicesExternalServiceIdPatch**
> apiV2ProjectsIdExternalServicesExternalServiceIdPatch(id, externalServiceId, replaceProjectExternalServiceApiModel)

Replaces one active external service with another

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectExternalServicesApi()
val id : kotlin.String = id_example // kotlin.String | Project ID
val externalServiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | External service ID
val replaceProjectExternalServiceApiModel : ReplaceProjectExternalServiceApiModel =  // ReplaceProjectExternalServiceApiModel | 
try {
    apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdPatch(id, externalServiceId, replaceProjectExternalServiceApiModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project ID | |
| **externalServiceId** | **java.util.UUID**| External service ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **replaceProjectExternalServiceApiModel** | [**ReplaceProjectExternalServiceApiModel**](ReplaceProjectExternalServiceApiModel.md)|  | [optional] |

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

<a id="apiV2ProjectsIdExternalServicesExternalServiceIdPut"></a>
# **apiV2ProjectsIdExternalServicesExternalServiceIdPut**
> apiV2ProjectsIdExternalServicesExternalServiceIdPut(id, externalServiceId, enableProjectExternalServiceApiModel)

Enable an external service

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectExternalServicesApi()
val id : kotlin.String = id_example // kotlin.String | Project ID
val externalServiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | External service ID
val enableProjectExternalServiceApiModel : EnableProjectExternalServiceApiModel =  // EnableProjectExternalServiceApiModel | 
try {
    apiInstance.apiV2ProjectsIdExternalServicesExternalServiceIdPut(id, externalServiceId, enableProjectExternalServiceApiModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesExternalServiceIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project ID | |
| **externalServiceId** | **java.util.UUID**| External service ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **enableProjectExternalServiceApiModel** | [**EnableProjectExternalServiceApiModel**](EnableProjectExternalServiceApiModel.md)|  | [optional] |

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

<a id="apiV2ProjectsIdExternalServicesGet"></a>
# **apiV2ProjectsIdExternalServicesGet**
> ProjectExternalServicesApiResult apiV2ProjectsIdExternalServicesGet(id, category)

Retrieves information about external services, including their integration status (enabled or not)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectExternalServicesApi()
val id : kotlin.String = id_example // kotlin.String | Project ID
val category : ApiExternalServiceCategory =  // ApiExternalServiceCategory | 
try {
    val result : ProjectExternalServicesApiResult = apiInstance.apiV2ProjectsIdExternalServicesGet(id, category)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **category** | [**ApiExternalServiceCategory**](.md)|  | [optional] [enum: AI, IssueTracker] |

### Return type

[**ProjectExternalServicesApiResult**](ProjectExternalServicesApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdExternalServicesIssuesSearchPost"></a>
# **apiV2ProjectsIdExternalServicesIssuesSearchPost**
> kotlin.collections.List&lt;ExternalIssueApiResult&gt; apiV2ProjectsIdExternalServicesIssuesSearchPost(id, searchExternalIssuesApiModel)

Searches for external issues using enabled external services in project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectExternalServicesApi()
val id : kotlin.String = id_example // kotlin.String | Internal (UUID) or global (integer) identifier
val searchExternalIssuesApiModel : SearchExternalIssuesApiModel =  // SearchExternalIssuesApiModel | 
try {
    val result : kotlin.collections.List<ExternalIssueApiResult> = apiInstance.apiV2ProjectsIdExternalServicesIssuesSearchPost(id, searchExternalIssuesApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesIssuesSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectExternalServicesApi#apiV2ProjectsIdExternalServicesIssuesSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchExternalIssuesApiModel** | [**SearchExternalIssuesApiModel**](SearchExternalIssuesApiModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ExternalIssueApiResult&gt;**](ExternalIssueApiResult.md)

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

