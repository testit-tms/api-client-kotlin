# ProjectWorkItemsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdWorkItemsSearchGroupedPost**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchGroupedPost) | **POST** /api/v2/projects/{projectId}/workItems/search/grouped | Search for work items and group results by attribute |
| [**apiV2ProjectsProjectIdWorkItemsSearchIdPost**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchIdPost) | **POST** /api/v2/projects/{projectId}/workItems/search/id | Search for work items and extract IDs only |
| [**apiV2ProjectsProjectIdWorkItemsSearchPost**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchPost) | **POST** /api/v2/projects/{projectId}/workItems/search | Search for work items |
| [**apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost) | **POST** /api/v2/projects/{projectId}/workItems/search/{workItemId}/index | Get work item index (position) in a collection by its id. |
| [**apiV2ProjectsProjectIdWorkItemsTagsGet**](ProjectWorkItemsApi.md#apiV2ProjectsProjectIdWorkItemsTagsGet) | **GET** /api/v2/projects/{projectId}/workItems/tags | Get WorkItems Tags |
| [**getWorkItemsByProjectId**](ProjectWorkItemsApi.md#getWorkItemsByProjectId) | **GET** /api/v2/projects/{projectId}/workItems | Get project work items |


<a id="apiV2ProjectsProjectIdWorkItemsSearchGroupedPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchGroupedPost**
> kotlin.collections.List&lt;WorkItemGroupModel&gt; apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(projectId, skip, take, orderBy, searchField, searchValue, workItemGroupGetModel)

Search for work items and group results by attribute

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectWorkItemsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global ID of the project
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val workItemGroupGetModel : WorkItemGroupGetModel =  // WorkItemGroupGetModel | 
try {
    val result : kotlin.collections.List<WorkItemGroupModel> = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(projectId, skip, take, orderBy, searchField, searchValue, workItemGroupGetModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchGroupedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchGroupedPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global ID of the project | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemGroupGetModel** | [**WorkItemGroupGetModel**](WorkItemGroupGetModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;WorkItemGroupModel&gt;**](WorkItemGroupModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdWorkItemsSearchIdPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchIdPost**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2ProjectsProjectIdWorkItemsSearchIdPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectModel)

Search for work items and extract IDs only

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectWorkItemsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global ID of the project
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val workItemSelectModel : WorkItemSelectModel =  // WorkItemSelectModel | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchIdPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchIdPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global ID of the project | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemSelectModel** | [**WorkItemSelectModel**](WorkItemSelectModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdWorkItemsSearchPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchPost**
> kotlin.collections.List&lt;WorkItemShortApiResult&gt; apiV2ProjectsProjectIdWorkItemsSearchPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)

Search for work items

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectWorkItemsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global ID of the project
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val workItemSelectApiModel : WorkItemSelectApiModel =  // WorkItemSelectApiModel | 
try {
    val result : kotlin.collections.List<WorkItemShortApiResult> = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchPost(projectId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global ID of the project | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemSelectApiModel** | [**WorkItemSelectApiModel**](WorkItemSelectApiModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;WorkItemShortApiResult&gt;**](WorkItemShortApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost"></a>
# **apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost**
> WorkItemIndexApiResult apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost(projectId, workItemId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)

Get work item index (position) in a collection by its id.

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectWorkItemsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | 
val workItemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val workItemSelectApiModel : WorkItemSelectApiModel =  // WorkItemSelectApiModel | 
try {
    val result : WorkItemIndexApiResult = apiInstance.apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost(projectId, workItemId, skip, take, orderBy, searchField, searchValue, workItemSelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsSearchWorkItemIdIndexPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**|  | |
| **workItemId** | **java.util.UUID**|  | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemSelectApiModel** | [**WorkItemSelectApiModel**](WorkItemSelectApiModel.md)|  | [optional] |

### Return type

[**WorkItemIndexApiResult**](WorkItemIndexApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdWorkItemsTagsGet"></a>
# **apiV2ProjectsProjectIdWorkItemsTagsGet**
> kotlin.collections.List&lt;TagShortApiResult&gt; apiV2ProjectsProjectIdWorkItemsTagsGet(projectId, isDeleted)

Get WorkItems Tags

 Use case  User sets project internal identifier  User runs method execution  System returns work items tags

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectWorkItemsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project internal (UUID) identifier
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.collections.List<TagShortApiResult> = apiInstance.apiV2ProjectsProjectIdWorkItemsTagsGet(projectId, isDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectWorkItemsApi#apiV2ProjectsProjectIdWorkItemsTagsGet")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**| Project internal (UUID) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDeleted** | **kotlin.Boolean**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TagShortApiResult&gt;**](TagShortApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkItemsByProjectId"></a>
# **getWorkItemsByProjectId**
> kotlin.collections.List&lt;WorkItemShortModel&gt; getWorkItemsByProjectId(projectId, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)

Get project work items

 Use case  User sets project internal or global identifier  [Optional] User sets isDeleted field value  User runs method execution  System search project  [Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project  [Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted  If User did not set isDeleted field value, System search all  workitems related to project  System returns array of found workitems (listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectWorkItemsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | If result must consist of only actual/deleted work items
val tagNames : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of tags to filter by
val includeIterations : kotlin.Boolean = true // kotlin.Boolean | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<WorkItemShortModel> = apiInstance.getWorkItemsByProjectId(projectId, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectWorkItemsApi#getWorkItemsByProjectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectWorkItemsApi#getWorkItemsByProjectId")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| **isDeleted** | **kotlin.Boolean**| If result must consist of only actual/deleted work items | [optional] [default to false] |
| **tagNames** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of tags to filter by | [optional] |
| **includeIterations** | **kotlin.Boolean**|  | [optional] [default to true] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

