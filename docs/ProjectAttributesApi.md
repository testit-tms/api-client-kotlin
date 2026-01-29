# ProjectAttributesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createProjectsAttribute**](ProjectAttributesApi.md#createProjectsAttribute) | **POST** /api/v2/projects/{projectId}/attributes | Create project attribute |
| [**deleteProjectsAttribute**](ProjectAttributesApi.md#deleteProjectsAttribute) | **DELETE** /api/v2/projects/{projectId}/attributes/{attributeId} | Delete project attribute |
| [**getAttributeByProjectId**](ProjectAttributesApi.md#getAttributeByProjectId) | **GET** /api/v2/projects/{projectId}/attributes/{attributeId} | Get project attribute |
| [**getAttributesByProjectId**](ProjectAttributesApi.md#getAttributesByProjectId) | **GET** /api/v2/projects/{projectId}/attributes | Get project attributes |
| [**searchAttributesInProject**](ProjectAttributesApi.md#searchAttributesInProject) | **POST** /api/v2/projects/{projectId}/attributes/search | Search for attributes used in the project |
| [**updateProjectsAttribute**](ProjectAttributesApi.md#updateProjectsAttribute) | **PUT** /api/v2/projects/{projectId}/attributes | Edit attribute of the project |


<a id="createProjectsAttribute"></a>
# **createProjectsAttribute**
> CustomAttributeModel createProjectsAttribute(projectId, customAttributePostModel)

Create project attribute

 Use case  User sets attribute parameters (listed in request example) and runs method execution  System search project  System creates attribute and relates it to the project  System returns project attribute properties (example listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val customAttributePostModel : CustomAttributePostModel =  // CustomAttributePostModel | 
try {
    val result : CustomAttributeModel = apiInstance.createProjectsAttribute(projectId, customAttributePostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributesApi#createProjectsAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributesApi#createProjectsAttribute")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customAttributePostModel** | [**CustomAttributePostModel**](CustomAttributePostModel.md)|  | [optional] |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProjectsAttribute"></a>
# **deleteProjectsAttribute**
> deleteProjectsAttribute(projectId, attributeId)

Delete project attribute

 Use case  User sets project identifier and runs method execution  User sets attribute identifier  User runs method execution  System search project  System search and delete attribute  System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val attributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project attribute internal (UUID)
try {
    apiInstance.deleteProjectsAttribute(projectId, attributeId)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributesApi#deleteProjectsAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributesApi#deleteProjectsAttribute")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeId** | **java.util.UUID**| Project attribute internal (UUID) | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAttributeByProjectId"></a>
# **getAttributeByProjectId**
> CustomAttributeModel getAttributeByProjectId(projectId, attributeId)

Get project attribute

 Use case  User sets project internal or global identifier  User sets project attribute identifier  User runs method execution  System search project  System search project attribute  System returns project attribute (listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val attributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project attribute internal (UUID) or global (integer) identifier
try {
    val result : CustomAttributeModel = apiInstance.getAttributeByProjectId(projectId, attributeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributesApi#getAttributeByProjectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributesApi#getAttributeByProjectId")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeId** | **java.util.UUID**| Project attribute internal (UUID) or global (integer) identifier | |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAttributesByProjectId"></a>
# **getAttributesByProjectId**
> kotlin.collections.List&lt;CustomAttributeModel&gt; getAttributesByProjectId(projectId, isDeleted)

Get project attributes

 Use case  User sets project internal or global identifier  [Optional] User sets isDeleted field value  User runs method execution  System search project  [Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project  [Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted  [Optional] If User did not set isDeleted field value, System search all attributes related to project  System returns array of found attributes (listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val isDeleted : DeletionState =  // DeletionState | 
try {
    val result : kotlin.collections.List<CustomAttributeModel> = apiInstance.getAttributesByProjectId(projectId, isDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributesApi#getAttributesByProjectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributesApi#getAttributesByProjectId")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDeleted** | [**DeletionState**](.md)|  | [optional] [enum: Any, Deleted, NotDeleted] |

### Return type

[**kotlin.collections.List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchAttributesInProject"></a>
# **searchAttributesInProject**
> kotlin.collections.List&lt;CustomAttributeGetModel&gt; searchAttributesInProject(projectId, skip, take, orderBy, searchField, searchValue, projectAttributesFilterModel)

Search for attributes used in the project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global project ID
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val projectAttributesFilterModel : ProjectAttributesFilterModel =  // ProjectAttributesFilterModel | 
try {
    val result : kotlin.collections.List<CustomAttributeGetModel> = apiInstance.searchAttributesInProject(projectId, skip, take, orderBy, searchField, searchValue, projectAttributesFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributesApi#searchAttributesInProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributesApi#searchAttributesInProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global project ID | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectAttributesFilterModel** | [**ProjectAttributesFilterModel**](ProjectAttributesFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CustomAttributeGetModel&gt;**](CustomAttributeGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProjectsAttribute"></a>
# **updateProjectsAttribute**
> updateProjectsAttribute(projectId, customAttributePutModel)

Edit attribute of the project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global project ID
val customAttributePutModel : CustomAttributePutModel =  // CustomAttributePutModel | 
try {
    apiInstance.updateProjectsAttribute(projectId, customAttributePutModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributesApi#updateProjectsAttribute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributesApi#updateProjectsAttribute")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Unique or global project ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customAttributePutModel** | [**CustomAttributePutModel**](CustomAttributePutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

