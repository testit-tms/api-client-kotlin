# ProjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addGlobaAttributesToProject**](ProjectsApi.md#addGlobaAttributesToProject) | **POST** /api/v2/projects/{id}/globalAttributes | Add global attributes to project |
| [**apiV2ProjectsDemoPost**](ProjectsApi.md#apiV2ProjectsDemoPost) | **POST** /api/v2/projects/demo |  |
| [**apiV2ProjectsIdDelete**](ProjectsApi.md#apiV2ProjectsIdDelete) | **DELETE** /api/v2/projects/{id} | Archive project |
| [**apiV2ProjectsIdFailureClassesGet**](ProjectsApi.md#apiV2ProjectsIdFailureClassesGet) | **GET** /api/v2/projects/{id}/failureClasses | Get failure classes |
| [**apiV2ProjectsIdFavoritePut**](ProjectsApi.md#apiV2ProjectsIdFavoritePut) | **PUT** /api/v2/projects/{id}/favorite | Mark Project as favorite |
| [**apiV2ProjectsIdFiltersGet**](ProjectsApi.md#apiV2ProjectsIdFiltersGet) | **GET** /api/v2/projects/{id}/filters | Get Project filters |
| [**apiV2ProjectsIdPatch**](ProjectsApi.md#apiV2ProjectsIdPatch) | **PATCH** /api/v2/projects/{id} | Patch project |
| [**apiV2ProjectsIdPurgePost**](ProjectsApi.md#apiV2ProjectsIdPurgePost) | **POST** /api/v2/projects/{id}/purge | Purge the project |
| [**apiV2ProjectsIdRestorePost**](ProjectsApi.md#apiV2ProjectsIdRestorePost) | **POST** /api/v2/projects/{id}/restore | Restore archived project |
| [**apiV2ProjectsIdTestPlansAttributeAttributeIdDelete**](ProjectsApi.md#apiV2ProjectsIdTestPlansAttributeAttributeIdDelete) | **DELETE** /api/v2/projects/{id}/testPlans/attribute/{attributeId} | Delete attribute from project&#39;s test plans |
| [**apiV2ProjectsIdTestPlansAttributePut**](ProjectsApi.md#apiV2ProjectsIdTestPlansAttributePut) | **PUT** /api/v2/projects/{id}/testPlans/attribute | Update attribute of project&#39;s test plans |
| [**apiV2ProjectsIdTestRunsActiveGet**](ProjectsApi.md#apiV2ProjectsIdTestRunsActiveGet) | **GET** /api/v2/projects/{id}/testRuns/active | Get active Project TestRuns |
| [**apiV2ProjectsIdTestRunsFullGet**](ProjectsApi.md#apiV2ProjectsIdTestRunsFullGet) | **GET** /api/v2/projects/{id}/testRuns/full | Get Project TestRuns full models |
| [**apiV2ProjectsNameNameExistsGet**](ProjectsApi.md#apiV2ProjectsNameNameExistsGet) | **GET** /api/v2/projects/name/{name}/exists |  |
| [**apiV2ProjectsPurgeBulkPost**](ProjectsApi.md#apiV2ProjectsPurgeBulkPost) | **POST** /api/v2/projects/purge/bulk | Purge multiple projects |
| [**apiV2ProjectsRestoreBulkPost**](ProjectsApi.md#apiV2ProjectsRestoreBulkPost) | **POST** /api/v2/projects/restore/bulk | Restore multiple projects |
| [**apiV2ProjectsSearchPost**](ProjectsApi.md#apiV2ProjectsSearchPost) | **POST** /api/v2/projects/search | Search for projects |
| [**apiV2ProjectsShortsPost**](ProjectsApi.md#apiV2ProjectsShortsPost) | **POST** /api/v2/projects/shorts | Get projects short models |
| [**createProject**](ProjectsApi.md#createProject) | **POST** /api/v2/projects | Create project |
| [**deleteProjectAutoTests**](ProjectsApi.md#deleteProjectAutoTests) | **DELETE** /api/v2/projects/{id}/autoTests | Delete all autotests from project |
| [**getAllProjects**](ProjectsApi.md#getAllProjects) | **GET** /api/v2/projects | Get all projects |
| [**getAutoTestsNamespaces**](ProjectsApi.md#getAutoTestsNamespaces) | **GET** /api/v2/projects/{id}/autoTestsNamespaces | Get namespaces of autotests in project |
| [**getProjectById**](ProjectsApi.md#getProjectById) | **GET** /api/v2/projects/{id} | Get project by ID |
| [**getTestPlansByProjectId**](ProjectsApi.md#getTestPlansByProjectId) | **GET** /api/v2/projects/{id}/testPlans | Get project test plans |
| [**getTestRunsByProjectId**](ProjectsApi.md#getTestRunsByProjectId) | **GET** /api/v2/projects/{id}/testRuns | Get project test runs |
| [**updateProject**](ProjectsApi.md#updateProject) | **PUT** /api/v2/projects | Update project |


<a id="addGlobaAttributesToProject"></a>
# **addGlobaAttributesToProject**
> addGlobaAttributesToProject(id, javaUtilUUID)

Add global attributes to project

 Use case  User sets project internal or global identifier and attributes identifiers  System search project  System relates global attributes with project  System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    apiInstance.addGlobaAttributesToProject(id, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#addGlobaAttributesToProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#addGlobaAttributesToProject")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
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

<a id="apiV2ProjectsDemoPost"></a>
# **apiV2ProjectsDemoPost**
> DemoProjectApiResult apiV2ProjectsDemoPost(createProjectApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val createProjectApiModel : CreateProjectApiModel =  // CreateProjectApiModel | 
try {
    val result : DemoProjectApiResult = apiInstance.apiV2ProjectsDemoPost(createProjectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsDemoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsDemoPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createProjectApiModel** | [**CreateProjectApiModel**](CreateProjectApiModel.md)|  | [optional] |

### Return type

[**DemoProjectApiResult**](DemoProjectApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsIdDelete"></a>
# **apiV2ProjectsIdDelete**
> apiV2ProjectsIdDelete(id)

Archive project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the project
try {
    apiInstance.apiV2ProjectsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the project | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdFailureClassesGet"></a>
# **apiV2ProjectsIdFailureClassesGet**
> kotlin.collections.List&lt;FailureClassModel&gt; apiV2ProjectsIdFailureClassesGet(id, isDeleted)

Get failure classes

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the project
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.collections.List<FailureClassModel> = apiInstance.apiV2ProjectsIdFailureClassesGet(id, isDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdFailureClassesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdFailureClassesGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Unique or global ID of the project | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDeleted** | **kotlin.Boolean**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;FailureClassModel&gt;**](FailureClassModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdFavoritePut"></a>
# **apiV2ProjectsIdFavoritePut**
> apiV2ProjectsIdFavoritePut(id)

Mark Project as favorite

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
try {
    apiInstance.apiV2ProjectsIdFavoritePut(id)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdFavoritePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdFavoritePut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdFiltersGet"></a>
# **apiV2ProjectsIdFiltersGet**
> kotlin.collections.List&lt;FilterModel&gt; apiV2ProjectsIdFiltersGet(id)

Get Project filters

 Use case  User sets project internal or global identifier  User runs method execution  System returns project filters

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<FilterModel> = apiInstance.apiV2ProjectsIdFiltersGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdFiltersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdFiltersGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;FilterModel&gt;**](FilterModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdPatch"></a>
# **apiV2ProjectsIdPatch**
> apiV2ProjectsIdPatch(id, operation)

Patch project

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique or global Id of project
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.apiV2ProjectsIdPatch(id, operation)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Unique or global Id of project | |
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

<a id="apiV2ProjectsIdPurgePost"></a>
# **apiV2ProjectsIdPurgePost**
> apiV2ProjectsIdPurgePost(id)

Purge the project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the project
try {
    apiInstance.apiV2ProjectsIdPurgePost(id)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdPurgePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdPurgePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the project | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdRestorePost"></a>
# **apiV2ProjectsIdRestorePost**
> apiV2ProjectsIdRestorePost(id)

Restore archived project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the project
try {
    apiInstance.apiV2ProjectsIdRestorePost(id)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdRestorePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdRestorePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the project | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdTestPlansAttributeAttributeIdDelete"></a>
# **apiV2ProjectsIdTestPlansAttributeAttributeIdDelete**
> apiV2ProjectsIdTestPlansAttributeAttributeIdDelete(id, attributeId)

Delete attribute from project&#39;s test plans

 Use case  User sets project internal or global identifier and attribute identifier  User runs method execution  System updates project and delete attribute from project for test plans  System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val attributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2ProjectsIdTestPlansAttributeAttributeIdDelete(id, attributeId)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdTestPlansAttributeAttributeIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdTestPlansAttributeAttributeIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
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

<a id="apiV2ProjectsIdTestPlansAttributePut"></a>
# **apiV2ProjectsIdTestPlansAttributePut**
> apiV2ProjectsIdTestPlansAttributePut(id, customAttributeTestPlanProjectRelationPutModel)

Update attribute of project&#39;s test plans

 Use case  User sets project internal or global identifier and attribute model  User runs method execution  System updates project and project attribute for test plan  System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val customAttributeTestPlanProjectRelationPutModel : CustomAttributeTestPlanProjectRelationPutModel =  // CustomAttributeTestPlanProjectRelationPutModel | 
try {
    apiInstance.apiV2ProjectsIdTestPlansAttributePut(id, customAttributeTestPlanProjectRelationPutModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdTestPlansAttributePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdTestPlansAttributePut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
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

<a id="apiV2ProjectsIdTestRunsActiveGet"></a>
# **apiV2ProjectsIdTestRunsActiveGet**
> kotlin.collections.List&lt;PublicTestRunModel&gt; apiV2ProjectsIdTestRunsActiveGet(id)

Get active Project TestRuns

 Use case  User sets project internal or global identifier  User runs method execution  System returns active testruns

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<PublicTestRunModel> = apiInstance.apiV2ProjectsIdTestRunsActiveGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdTestRunsActiveGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdTestRunsActiveGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;PublicTestRunModel&gt;**](PublicTestRunModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsIdTestRunsFullGet"></a>
# **apiV2ProjectsIdTestRunsFullGet**
> kotlin.collections.List&lt;TestRunApiResult&gt; apiV2ProjectsIdTestRunsFullGet(id, includeTestResults, mustAggregateTestResults, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)

Get Project TestRuns full models

 Use case  User sets project internal or global identifier  User sets query params  User runs method execution  System returns project test runs full models

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val includeTestResults : kotlin.Boolean = true // kotlin.Boolean | 
val mustAggregateTestResults : kotlin.Boolean = true // kotlin.Boolean | 
val notStarted : kotlin.Boolean = true // kotlin.Boolean | 
val inProgress : kotlin.Boolean = true // kotlin.Boolean | 
val stopped : kotlin.Boolean = true // kotlin.Boolean | 
val completed : kotlin.Boolean = true // kotlin.Boolean | 
val createdDateFrom : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val createdDateTo : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val testPlanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TestRunApiResult> = apiInstance.apiV2ProjectsIdTestRunsFullGet(id, includeTestResults, mustAggregateTestResults, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsIdTestRunsFullGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsIdTestRunsFullGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| **includeTestResults** | **kotlin.Boolean**|  | [optional] |
| **mustAggregateTestResults** | **kotlin.Boolean**|  | [optional] |
| **notStarted** | **kotlin.Boolean**|  | [optional] |
| **inProgress** | **kotlin.Boolean**|  | [optional] |
| **stopped** | **kotlin.Boolean**|  | [optional] |
| **completed** | **kotlin.Boolean**|  | [optional] |
| **createdDateFrom** | **java.time.OffsetDateTime**|  | [optional] |
| **createdDateTo** | **java.time.OffsetDateTime**|  | [optional] |
| **testPlanId** | **java.util.UUID**|  | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TestRunApiResult&gt;**](TestRunApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsNameNameExistsGet"></a>
# **apiV2ProjectsNameNameExistsGet**
> kotlin.Boolean apiV2ProjectsNameNameExistsGet(name)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.apiV2ProjectsNameNameExistsGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsNameNameExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsNameNameExistsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**|  | |

### Return type

**kotlin.Boolean**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsPurgeBulkPost"></a>
# **apiV2ProjectsPurgeBulkPost**
> kotlin.Long apiV2ProjectsPurgeBulkPost(projectSelectModel)

Purge multiple projects

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val projectSelectModel : ProjectSelectModel =  // ProjectSelectModel | 
try {
    val result : kotlin.Long = apiInstance.apiV2ProjectsPurgeBulkPost(projectSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsPurgeBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsPurgeBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectSelectModel** | [**ProjectSelectModel**](ProjectSelectModel.md)|  | [optional] |

### Return type

**kotlin.Long**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsRestoreBulkPost"></a>
# **apiV2ProjectsRestoreBulkPost**
> kotlin.Long apiV2ProjectsRestoreBulkPost(projectSelectModel)

Restore multiple projects

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val projectSelectModel : ProjectSelectModel =  // ProjectSelectModel | 
try {
    val result : kotlin.Long = apiInstance.apiV2ProjectsRestoreBulkPost(projectSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsRestoreBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsRestoreBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectSelectModel** | [**ProjectSelectModel**](ProjectSelectModel.md)|  | [optional] |

### Return type

**kotlin.Long**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsSearchPost"></a>
# **apiV2ProjectsSearchPost**
> kotlin.collections.List&lt;ProjectShortModel&gt; apiV2ProjectsSearchPost(skip, take, orderBy, searchField, searchValue, projectsFilterModel)

Search for projects

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val projectsFilterModel : ProjectsFilterModel =  // ProjectsFilterModel | 
try {
    val result : kotlin.collections.List<ProjectShortModel> = apiInstance.apiV2ProjectsSearchPost(skip, take, orderBy, searchField, searchValue, projectsFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectsFilterModel** | [**ProjectsFilterModel**](ProjectsFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ProjectShortModel&gt;**](ProjectShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsShortsPost"></a>
# **apiV2ProjectsShortsPost**
> ProjectShortApiResultReply apiV2ProjectsShortsPost(getShortProjectsApiModel)

Get projects short models

 Use case  User sets query params  User runs method execution  System return projects short models

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val getShortProjectsApiModel : GetShortProjectsApiModel =  // GetShortProjectsApiModel | 
try {
    val result : ProjectShortApiResultReply = apiInstance.apiV2ProjectsShortsPost(getShortProjectsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsShortsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsShortsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getShortProjectsApiModel** | [**GetShortProjectsApiModel**](GetShortProjectsApiModel.md)|  | [optional] |

### Return type

[**ProjectShortApiResultReply**](ProjectShortApiResultReply.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProject"></a>
# **createProject**
> ProjectModel createProject(createProjectApiModel)

Create project

 Use case  User sets project parameters (listed in request example) and runs method execution  System creates project  System returns project model (example listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val createProjectApiModel : CreateProjectApiModel =  // CreateProjectApiModel | 
try {
    val result : ProjectModel = apiInstance.createProject(createProjectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createProjectApiModel** | [**CreateProjectApiModel**](CreateProjectApiModel.md)|  | [optional] |

### Return type

[**ProjectModel**](ProjectModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProjectAutoTests"></a>
# **deleteProjectAutoTests**
> deleteProjectAutoTests(id)

Delete all autotests from project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the project
try {
    apiInstance.deleteProjectAutoTests(id)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProjectAutoTests")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProjectAutoTests")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the project | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAllProjects"></a>
# **getAllProjects**
> kotlin.collections.List&lt;ProjectShortModel&gt; getAllProjects(isDeleted, projectName, skip, take, orderBy, searchField, searchValue)

Get all projects

 Use case  [Optional] User sets isDeleted field value  [Optional] If User sets isDeleted field value as true, System search all deleted projects  [Optional] If User sets isDeleted field value as false, System search all projects which are not deleted  If User did not set isDeleted field value, System search all projects  System returns array of all found projects(listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | If result must consist of only actual/deleted parameters
val projectName : kotlin.String = projectName_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<ProjectShortModel> = apiInstance.getAllProjects(isDeleted, projectName, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getAllProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getAllProjects")
    e.printStackTrace()
}
```

### Parameters
| **isDeleted** | **kotlin.Boolean**| If result must consist of only actual/deleted parameters | [optional] |
| **projectName** | **kotlin.String**|  | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;ProjectShortModel&gt;**](ProjectShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAutoTestsNamespaces"></a>
# **getAutoTestsNamespaces**
> kotlin.collections.List&lt;AutoTestNamespaceModel&gt; getAutoTestsNamespaces(id)

Get namespaces of autotests in project

 Use case  User sets project internal or global identifier and runs method execution  System search project  System search all autotest related to the project  System returns array of autotest with namespaces and classnames (listed in response)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
try {
    val result : kotlin.collections.List<AutoTestNamespaceModel> = apiInstance.getAutoTestsNamespaces(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getAutoTestsNamespaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getAutoTestsNamespaces")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**kotlin.collections.List&lt;AutoTestNamespaceModel&gt;**](AutoTestNamespaceModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectById"></a>
# **getProjectById**
> ProjectModel getProjectById(id)

Get project by ID

 Use case  User sets project internal or global identifier and runs method execution  System search project  System returns project (example listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
try {
    val result : ProjectModel = apiInstance.getProjectById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |

### Return type

[**ProjectModel**](ProjectModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestPlansByProjectId"></a>
# **getTestPlansByProjectId**
> kotlin.collections.List&lt;TestPlanModel&gt; getTestPlansByProjectId(id, isDeleted)

Get project test plans

 Use case  User sets project internal or global identifier  [Optional] User sets isDeleted field value  User runs method execution  System search project  [Optional] If User sets isDeleted field value as true, System search all deleted test plans related to project  [Optional] If User sets isDeleted field value as false, System search all test plans related to project which are not deleted  [Optional] If User did not set isDeleted field value, System search all v related to project  System returns array of found test plans (listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | If result must consist of only actual/archived test plans
try {
    val result : kotlin.collections.List<TestPlanModel> = apiInstance.getTestPlansByProjectId(id, isDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getTestPlansByProjectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getTestPlansByProjectId")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDeleted** | **kotlin.Boolean**| If result must consist of only actual/archived test plans | [optional] |

### Return type

[**kotlin.collections.List&lt;TestPlanModel&gt;**](TestPlanModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestRunsByProjectId"></a>
# **getTestRunsByProjectId**
> kotlin.collections.List&lt;TestRunV2ApiResult&gt; getTestRunsByProjectId(id, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)

Get project test runs

 Use case  User sets project internal or global identifier  User runs method execution  System search project  System search all test runs related to project  System returns array of found test runs (listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val id : kotlin.String = id_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val notStarted : kotlin.Boolean = true // kotlin.Boolean | 
val inProgress : kotlin.Boolean = true // kotlin.Boolean | 
val stopped : kotlin.Boolean = true // kotlin.Boolean | 
val completed : kotlin.Boolean = true // kotlin.Boolean | 
val createdDateFrom : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val createdDateTo : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val testPlanId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<TestRunV2ApiResult> = apiInstance.getTestRunsByProjectId(id, notStarted, inProgress, stopped, completed, createdDateFrom, createdDateTo, testPlanId, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getTestRunsByProjectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getTestRunsByProjectId")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| **notStarted** | **kotlin.Boolean**|  | |
| **inProgress** | **kotlin.Boolean**|  | |
| **stopped** | **kotlin.Boolean**|  | |
| **completed** | **kotlin.Boolean**|  | |
| **createdDateFrom** | **java.time.OffsetDateTime**|  | [optional] |
| **createdDateTo** | **java.time.OffsetDateTime**|  | [optional] |
| **testPlanId** | **java.util.UUID**|  | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;TestRunV2ApiResult&gt;**](TestRunV2ApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateProject"></a>
# **updateProject**
> updateProject(updateProjectApiModel)

Update project

 Use case  User sets project parameters (listed in request example) and runs method execution  System updates project  System returns updated project model (example listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectsApi()
val updateProjectApiModel : UpdateProjectApiModel =  // UpdateProjectApiModel | 
try {
    apiInstance.updateProject(updateProjectApiModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#updateProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#updateProject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateProjectApiModel** | [**UpdateProjectApiModel**](UpdateProjectApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

