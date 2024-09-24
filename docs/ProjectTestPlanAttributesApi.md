# ProjectTestPlanAttributesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCustomAttributeTestPlanProjectRelations**](ProjectTestPlanAttributesApi.md#createCustomAttributeTestPlanProjectRelations) | **POST** /api/v2/projects/{projectId}/testPlans/attributes | Add attributes to project&#39;s test plans |
| [**deleteCustomAttributeTestPlanProjectRelations**](ProjectTestPlanAttributesApi.md#deleteCustomAttributeTestPlanProjectRelations) | **DELETE** /api/v2/projects/{projectId}/testPlans/attributes/{attributeId} | Delete attribute from project&#39;s test plans |
| [**getCustomAttributeTestPlanProjectRelations**](ProjectTestPlanAttributesApi.md#getCustomAttributeTestPlanProjectRelations) | **GET** /api/v2/projects/{projectId}/testPlans/attributes | Get project&#39;s test plan attributes |
| [**searchTestPlanAttributesInProject**](ProjectTestPlanAttributesApi.md#searchTestPlanAttributesInProject) | **POST** /api/v2/projects/{projectId}/testPlans/attributes/search | Search for attributes used in the project test plans |
| [**updateCustomAttributeTestPlanProjectRelations**](ProjectTestPlanAttributesApi.md#updateCustomAttributeTestPlanProjectRelations) | **PUT** /api/v2/projects/{projectId}/testPlans/attributes | Update attribute of project&#39;s test plans |


<a id="createCustomAttributeTestPlanProjectRelations"></a>
# **createCustomAttributeTestPlanProjectRelations**
> createCustomAttributeTestPlanProjectRelations(projectId, javaUtilUUID)

Add attributes to project&#39;s test plans

 Use case   User sets project internal or global identifier and attributes identifiers   User runs method execution   System updates project and add attributes to project for test plans   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTestPlanAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    apiInstance.createCustomAttributeTestPlanProjectRelations(projectId, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanAttributesApi#createCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanAttributesApi#createCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **javaUtilUUID** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCustomAttributeTestPlanProjectRelations"></a>
# **deleteCustomAttributeTestPlanProjectRelations**
> deleteCustomAttributeTestPlanProjectRelations(projectId, attributeId)

Delete attribute from project&#39;s test plans

 Use case   User sets project internal or global identifier and attribute identifier   User runs method execution   System updates project and delete attribute from project for test plans   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTestPlanAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val attributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteCustomAttributeTestPlanProjectRelations(projectId, attributeId)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanAttributesApi#deleteCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanAttributesApi#deleteCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeId** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCustomAttributeTestPlanProjectRelations"></a>
# **getCustomAttributeTestPlanProjectRelations**
> kotlin.collections.List&lt;CustomAttributeModel&gt; getCustomAttributeTestPlanProjectRelations(projectId)

Get project&#39;s test plan attributes

 Use case   User runs method execution   System returns project for test plans attributes by project identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTestPlanAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<CustomAttributeModel> = apiInstance.getCustomAttributeTestPlanProjectRelations(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanAttributesApi#getCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanAttributesApi#getCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchTestPlanAttributesInProject"></a>
# **searchTestPlanAttributesInProject**
> kotlin.collections.List&lt;CustomAttributeGetModel&gt; searchTestPlanAttributesInProject(projectId, skip, take, orderBy, searchField, searchValue, projectAttributesFilterModel)

Search for attributes used in the project test plans

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTestPlanAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Unique or global project ID
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val projectAttributesFilterModel : ProjectAttributesFilterModel =  // ProjectAttributesFilterModel | 
try {
    val result : kotlin.collections.List<CustomAttributeGetModel> = apiInstance.searchTestPlanAttributesInProject(projectId, skip, take, orderBy, searchField, searchValue, projectAttributesFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanAttributesApi#searchTestPlanAttributesInProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanAttributesApi#searchTestPlanAttributesInProject")
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

<a id="updateCustomAttributeTestPlanProjectRelations"></a>
# **updateCustomAttributeTestPlanProjectRelations**
> updateCustomAttributeTestPlanProjectRelations(projectId, customAttributeTestPlanProjectRelationPutModel)

Update attribute of project&#39;s test plans

 Use case   User sets project internal or global identifier and attribute model   User runs method execution   System updates project and project attribute for test plan   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTestPlanAttributesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val customAttributeTestPlanProjectRelationPutModel : CustomAttributeTestPlanProjectRelationPutModel =  // CustomAttributeTestPlanProjectRelationPutModel | 
try {
    apiInstance.updateCustomAttributeTestPlanProjectRelations(projectId, customAttributeTestPlanProjectRelationPutModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectTestPlanAttributesApi#updateCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTestPlanAttributesApi#updateCustomAttributeTestPlanProjectRelations")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customAttributeTestPlanProjectRelationPutModel** | [**CustomAttributeTestPlanProjectRelationPutModel**](CustomAttributeTestPlanProjectRelationPutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

