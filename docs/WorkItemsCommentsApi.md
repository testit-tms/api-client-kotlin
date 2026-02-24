# WorkItemsCommentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2WorkItemsCommentsCommentIdDelete**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsCommentIdDelete) | **DELETE** /api/v2/workItems/comments/{commentId} | Delete WorkItem comment |
| [**apiV2WorkItemsCommentsPost**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPost) | **POST** /api/v2/workItems/comments | Create WorkItem comment |
| [**apiV2WorkItemsCommentsPut**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPut) | **PUT** /api/v2/workItems/comments | Update work item comment |
| [**apiV2WorkItemsIdCommentsCountGet**](WorkItemsCommentsApi.md#apiV2WorkItemsIdCommentsCountGet) | **GET** /api/v2/workItems/{id}/comments/count | Get work item comments count |
| [**apiV2WorkItemsIdCommentsGet**](WorkItemsCommentsApi.md#apiV2WorkItemsIdCommentsGet) | **GET** /api/v2/workItems/{id}/comments | Get work item comments |


<a id="apiV2WorkItemsCommentsCommentIdDelete"></a>
# **apiV2WorkItemsCommentsCommentIdDelete**
> apiV2WorkItemsCommentsCommentIdDelete(commentId)

Delete WorkItem comment

 Use case  User sets comment identifier  User runs method execution  System delete comment  System returns success status code

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsCommentsApi()
val commentId : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Comment internal (guid format) identifier
try {
    apiInstance.apiV2WorkItemsCommentsCommentIdDelete(commentId)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsCommentsApi#apiV2WorkItemsCommentsCommentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsCommentsApi#apiV2WorkItemsCommentsCommentIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **commentId** | **java.util.UUID**| Comment internal (guid format) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsCommentsPost"></a>
# **apiV2WorkItemsCommentsPost**
> WorkItemCommentApiResult apiV2WorkItemsCommentsPost(createWorkItemCommentApiModel)

Create WorkItem comment

 Use case  User sets comment properties (listed in request parameters)  User runs method execution  System creates comment  System returns comment model (listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsCommentsApi()
val createWorkItemCommentApiModel : CreateWorkItemCommentApiModel =  // CreateWorkItemCommentApiModel | 
try {
    val result : WorkItemCommentApiResult = apiInstance.apiV2WorkItemsCommentsPost(createWorkItemCommentApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsCommentsApi#apiV2WorkItemsCommentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsCommentsApi#apiV2WorkItemsCommentsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createWorkItemCommentApiModel** | [**CreateWorkItemCommentApiModel**](CreateWorkItemCommentApiModel.md)|  | [optional] |

### Return type

[**WorkItemCommentApiResult**](WorkItemCommentApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsCommentsPut"></a>
# **apiV2WorkItemsCommentsPut**
> apiV2WorkItemsCommentsPut(updateWorkItemCommentApiModel)

Update work item comment

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsCommentsApi()
val updateWorkItemCommentApiModel : UpdateWorkItemCommentApiModel =  // UpdateWorkItemCommentApiModel | 
try {
    apiInstance.apiV2WorkItemsCommentsPut(updateWorkItemCommentApiModel)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsCommentsApi#apiV2WorkItemsCommentsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsCommentsApi#apiV2WorkItemsCommentsPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateWorkItemCommentApiModel** | [**UpdateWorkItemCommentApiModel**](UpdateWorkItemCommentApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsIdCommentsCountGet"></a>
# **apiV2WorkItemsIdCommentsCountGet**
> kotlin.Int apiV2WorkItemsIdCommentsCountGet(id)

Get work item comments count

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsCommentsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
try {
    val result : kotlin.Int = apiInstance.apiV2WorkItemsIdCommentsCountGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsCommentsApi#apiV2WorkItemsIdCommentsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsCommentsApi#apiV2WorkItemsIdCommentsCountGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the work item | |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WorkItemsIdCommentsGet"></a>
# **apiV2WorkItemsIdCommentsGet**
> kotlin.collections.List&lt;WorkItemCommentApiResult&gt; apiV2WorkItemsIdCommentsGet(id)

Get work item comments

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WorkItemsCommentsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
try {
    val result : kotlin.collections.List<WorkItemCommentApiResult> = apiInstance.apiV2WorkItemsIdCommentsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkItemsCommentsApi#apiV2WorkItemsIdCommentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkItemsCommentsApi#apiV2WorkItemsIdCommentsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the work item | |

### Return type

[**kotlin.collections.List&lt;WorkItemCommentApiResult&gt;**](WorkItemCommentApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

