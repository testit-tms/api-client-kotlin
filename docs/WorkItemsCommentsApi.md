# WorkItemsCommentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2WorkItemsCommentsCommentIdDelete**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsCommentIdDelete) | **DELETE** /api/v2/workItems/comments/{commentId} | Delete WorkItem comment |
| [**apiV2WorkItemsCommentsPost**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPost) | **POST** /api/v2/workItems/comments | Create WorkItem comment |
| [**apiV2WorkItemsCommentsPut**](WorkItemsCommentsApi.md#apiV2WorkItemsCommentsPut) | **PUT** /api/v2/workItems/comments | Update work item comment |
| [**apiV2WorkItemsIdCommentsGet**](WorkItemsCommentsApi.md#apiV2WorkItemsIdCommentsGet) | **GET** /api/v2/workItems/{id}/comments | Get work item comments |


<a id="apiV2WorkItemsCommentsCommentIdDelete"></a>
# **apiV2WorkItemsCommentsCommentIdDelete**
> apiV2WorkItemsCommentsCommentIdDelete(commentId)

Delete WorkItem comment

 Use case   User sets comment identifier   User runs method execution   System delete comment    System returns success status code

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

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
> WorkItemCommentModel apiV2WorkItemsCommentsPost(workItemCommentPostModel)

Create WorkItem comment

 Use case   User sets comment properties (listed in request parameters)   User runs method execution   System creates comment    System returns comment model (listed in response parameters)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkItemsCommentsApi()
val workItemCommentPostModel : WorkItemCommentPostModel =  // WorkItemCommentPostModel | 
try {
    val result : WorkItemCommentModel = apiInstance.apiV2WorkItemsCommentsPost(workItemCommentPostModel)
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
| **workItemCommentPostModel** | [**WorkItemCommentPostModel**](WorkItemCommentPostModel.md)|  | [optional] |

### Return type

[**WorkItemCommentModel**](WorkItemCommentModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsCommentsPut"></a>
# **apiV2WorkItemsCommentsPut**
> apiV2WorkItemsCommentsPut(workItemCommentPutModel)

Update work item comment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkItemsCommentsApi()
val workItemCommentPutModel : WorkItemCommentPutModel =  // WorkItemCommentPutModel | 
try {
    apiInstance.apiV2WorkItemsCommentsPut(workItemCommentPutModel)
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
| **workItemCommentPutModel** | [**WorkItemCommentPutModel**](WorkItemCommentPutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WorkItemsIdCommentsGet"></a>
# **apiV2WorkItemsIdCommentsGet**
> kotlin.collections.List&lt;WorkItemCommentModel&gt; apiV2WorkItemsIdCommentsGet(id)

Get work item comments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkItemsCommentsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
try {
    val result : kotlin.collections.List<WorkItemCommentModel> = apiInstance.apiV2WorkItemsIdCommentsGet(id)
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

[**kotlin.collections.List&lt;WorkItemCommentModel&gt;**](WorkItemCommentModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

