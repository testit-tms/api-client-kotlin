# TagsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2TagsDelete**](TagsApi.md#apiV2TagsDelete) | **DELETE** /api/v2/tags | Delete tags |
| [**apiV2TagsIdDelete**](TagsApi.md#apiV2TagsIdDelete) | **DELETE** /api/v2/tags/{id} | Delete tag |
| [**apiV2TagsPost**](TagsApi.md#apiV2TagsPost) | **POST** /api/v2/tags | Create tag |
| [**apiV2TagsPut**](TagsApi.md#apiV2TagsPut) | **PUT** /api/v2/tags | Update tag |
| [**apiV2TagsSearchGet**](TagsApi.md#apiV2TagsSearchGet) | **GET** /api/v2/tags/search | Search tags |
| [**apiV2TagsTestPlansTagsGet**](TagsApi.md#apiV2TagsTestPlansTagsGet) | **GET** /api/v2/tags/testPlansTags | Get all Tags that are used in TestPlans |


<a id="apiV2TagsDelete"></a>
# **apiV2TagsDelete**
> apiV2TagsDelete(selectTagsApiModel)

Delete tags

 Use case  User sets collection of tags internal (guid format) identifiers  System searches and deletes a collection of tags

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TagsApi()
val selectTagsApiModel : SelectTagsApiModel =  // SelectTagsApiModel | 
try {
    apiInstance.apiV2TagsDelete(selectTagsApiModel)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#apiV2TagsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#apiV2TagsDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **selectTagsApiModel** | [**SelectTagsApiModel**](SelectTagsApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a id="apiV2TagsIdDelete"></a>
# **apiV2TagsIdDelete**
> apiV2TagsIdDelete(id)

Delete tag

 Use case  User sets tag internal (guid format) identifier  System search and delete tag

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TagsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Tag internal (UUID) identifier
try {
    apiInstance.apiV2TagsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#apiV2TagsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#apiV2TagsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Tag internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TagsPost"></a>
# **apiV2TagsPost**
> TagApiResult apiV2TagsPost(createTagApiModel)

Create tag

 Use case  User sets tag model (listed in the request example)  User runs method execution  System creates tag  System returns tag model (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TagsApi()
val createTagApiModel : CreateTagApiModel =  // CreateTagApiModel | 
try {
    val result : TagApiResult = apiInstance.apiV2TagsPost(createTagApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#apiV2TagsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#apiV2TagsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createTagApiModel** | [**CreateTagApiModel**](CreateTagApiModel.md)|  | [optional] |

### Return type

[**TagApiResult**](TagApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a id="apiV2TagsPut"></a>
# **apiV2TagsPut**
> TagApiResult apiV2TagsPut(id, updateTagApiModel)

Update tag

 Use case  User sets tag ID and model (listed in the request example)  User runs method execution  System updates tag  System returns tag model (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TagsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val updateTagApiModel : UpdateTagApiModel =  // UpdateTagApiModel | 
try {
    val result : TagApiResult = apiInstance.apiV2TagsPut(id, updateTagApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#apiV2TagsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#apiV2TagsPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateTagApiModel** | [**UpdateTagApiModel**](UpdateTagApiModel.md)|  | [optional] |

### Return type

[**TagApiResult**](TagApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

<a id="apiV2TagsSearchGet"></a>
# **apiV2TagsSearchGet**
> kotlin.collections.List&lt;TagApiResult&gt; apiV2TagsSearchGet(skip, take, orderBy, searchField, searchValue)

Search tags

 Use case  User runs method execution  System returns collection of tags (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TagsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TagApiResult> = apiInstance.apiV2TagsSearchGet(skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#apiV2TagsSearchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#apiV2TagsSearchGet")
    e.printStackTrace()
}
```

### Parameters
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TagApiResult&gt;**](TagApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TagsTestPlansTagsGet"></a>
# **apiV2TagsTestPlansTagsGet**
> kotlin.collections.List&lt;TagApiResult&gt; apiV2TagsTestPlansTagsGet(skip, take, orderBy, searchField, searchValue)

Get all Tags that are used in TestPlans

 Use case  User runs method execution  System returns tags (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TagsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TagApiResult> = apiInstance.apiV2TagsTestPlansTagsGet(skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#apiV2TagsTestPlansTagsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#apiV2TagsTestPlansTagsGet")
    e.printStackTrace()
}
```

### Parameters
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TagApiResult&gt;**](TagApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

