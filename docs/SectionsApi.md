# SectionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SectionsIdPatch**](SectionsApi.md#apiV2SectionsIdPatch) | **PATCH** /api/v2/sections/{id} | Patch section |
| [**createSection**](SectionsApi.md#createSection) | **POST** /api/v2/sections | Create section |
| [**deleteSection**](SectionsApi.md#deleteSection) | **DELETE** /api/v2/sections/{id} | Delete section |
| [**getSectionById**](SectionsApi.md#getSectionById) | **GET** /api/v2/sections/{id} | Get section |
| [**getWorkItemsBySectionId**](SectionsApi.md#getWorkItemsBySectionId) | **GET** /api/v2/sections/{id}/workItems | Get section work items |
| [**move**](SectionsApi.md#move) | **POST** /api/v2/sections/move | Move section with all work items into another section |
| [**rename**](SectionsApi.md#rename) | **POST** /api/v2/sections/rename | Rename section |
| [**updateSection**](SectionsApi.md#updateSection) | **PUT** /api/v2/sections | Update section |


<a id="apiV2SectionsIdPatch"></a>
# **apiV2SectionsIdPatch**
> apiV2SectionsIdPatch(id, operation)

Patch section

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Section internal (UUID) identifier
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.apiV2SectionsIdPatch(id, operation)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#apiV2SectionsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#apiV2SectionsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Section internal (UUID) identifier | |
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createSection"></a>
# **createSection**
> SectionWithStepsModel createSection(sectionPostModel)

Create section

 Use case   User sets section properties (listed in request example)   User runs method execution   System creates section property values   System returns section (listed in response example)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val sectionPostModel : SectionPostModel =  // SectionPostModel | 
try {
    val result : SectionWithStepsModel = apiInstance.createSection(sectionPostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#createSection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#createSection")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sectionPostModel** | [**SectionPostModel**](SectionPostModel.md)|  | [optional] |

### Return type

[**SectionWithStepsModel**](SectionWithStepsModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSection"></a>
# **deleteSection**
> deleteSection(id)

Delete section

 Use case   User sets section identifier   User runs method execution   System search section by the identifier   System search and delete nested sections of the found section   System search and delete workitems related to the found nested sections   System deletes initial section and related workitem   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Section internal (UUID) identifier
try {
    apiInstance.deleteSection(id)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#deleteSection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#deleteSection")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Section internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSectionById"></a>
# **getSectionById**
> SectionWithStepsModel getSectionById(id, isDeleted)

Get section

 Use case   User sets section internal (guid format) identifier   User runs method execution   System search section by the section identifier                 [Optional] If isDeleted flag equals false, deleted work items are not being searched.              If true, deleted work items are also being searched, null for all work items.                 System returns section

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Section internal (UUID) identifier
val isDeleted : DeletionState =  // DeletionState | 
try {
    val result : SectionWithStepsModel = apiInstance.getSectionById(id, isDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#getSectionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#getSectionById")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Section internal (UUID) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDeleted** | [**DeletionState**](.md)|  | [optional] [enum: Any, Deleted, NotDeleted] |

### Return type

[**SectionWithStepsModel**](SectionWithStepsModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkItemsBySectionId"></a>
# **getWorkItemsBySectionId**
> kotlin.collections.List&lt;WorkItemShortModel&gt; getWorkItemsBySectionId(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)

Get section work items

 Use case   User sets section identifier   User runs method execution   System search section by the identifier   System search work items related to the section                 [Optional] If isDeleted flag equals false, deleted work items are not being searched.              If true, deleted work items are also being searched, null for all work items.                 System returns work item collection

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Section internal (UUID) identifier
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | Requested section is deleted
val tagNames : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of work item tags
val includeIterations : kotlin.Boolean = true // kotlin.Boolean | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<WorkItemShortModel> = apiInstance.getWorkItemsBySectionId(id, isDeleted, tagNames, includeIterations, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#getWorkItemsBySectionId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#getWorkItemsBySectionId")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Section internal (UUID) identifier | |
| **isDeleted** | **kotlin.Boolean**| Requested section is deleted | [optional] [default to false] |
| **tagNames** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of work item tags | [optional] |
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

<a id="move"></a>
# **move**
> move(sectionMoveModel)

Move section with all work items into another section

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val sectionMoveModel : SectionMoveModel =  // SectionMoveModel | 
try {
    apiInstance.move(sectionMoveModel)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#move")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#move")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sectionMoveModel** | [**SectionMoveModel**](SectionMoveModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rename"></a>
# **rename**
> rename(sectionRenameModel)

Rename section

 Use case   User sets section identifier and new name (listed in request example)   User runs method execution   System search section by the identifier   System updates section name using the new name   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val sectionRenameModel : SectionRenameModel =  // SectionRenameModel | 
try {
    apiInstance.rename(sectionRenameModel)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#rename")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#rename")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sectionRenameModel** | [**SectionRenameModel**](SectionRenameModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSection"></a>
# **updateSection**
> updateSection(sectionPutModel)

Update section

 Use case   User sets section properties (listed in request example)   User runs method execution   System search section by the identifier   System updates section using the property values   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SectionsApi()
val sectionPutModel : SectionPutModel =  // SectionPutModel | 
try {
    apiInstance.updateSection(sectionPutModel)
} catch (e: ClientException) {
    println("4xx response calling SectionsApi#updateSection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectionsApi#updateSection")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sectionPutModel** | [**SectionPutModel**](SectionPutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

