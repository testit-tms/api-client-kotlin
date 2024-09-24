# TestSuitesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addTestPointsToTestSuite**](TestSuitesApi.md#addTestPointsToTestSuite) | **POST** /api/v2/testSuites/{id}/test-points | Add test-points to test suite |
| [**apiV2TestSuitesIdPatch**](TestSuitesApi.md#apiV2TestSuitesIdPatch) | **PATCH** /api/v2/testSuites/{id} | Patch test suite |
| [**apiV2TestSuitesIdRefreshPost**](TestSuitesApi.md#apiV2TestSuitesIdRefreshPost) | **POST** /api/v2/testSuites/{id}/refresh | Refresh test suite. Only dynamic test suites are supported by this method |
| [**apiV2TestSuitesIdWorkItemsPost**](TestSuitesApi.md#apiV2TestSuitesIdWorkItemsPost) | **POST** /api/v2/testSuites/{id}/workItems | Set work items for test suite |
| [**apiV2TestSuitesPost**](TestSuitesApi.md#apiV2TestSuitesPost) | **POST** /api/v2/testSuites | Create test suite |
| [**apiV2TestSuitesPut**](TestSuitesApi.md#apiV2TestSuitesPut) | **PUT** /api/v2/testSuites | Edit test suite |
| [**deleteTestSuite**](TestSuitesApi.md#deleteTestSuite) | **DELETE** /api/v2/testSuites/{id} | Delete TestSuite |
| [**getConfigurationsByTestSuiteId**](TestSuitesApi.md#getConfigurationsByTestSuiteId) | **GET** /api/v2/testSuites/{id}/configurations | Get Configurations By Id |
| [**getTestPointsById**](TestSuitesApi.md#getTestPointsById) | **GET** /api/v2/testSuites/{id}/testPoints | Get TestPoints By Id |
| [**getTestResultsById**](TestSuitesApi.md#getTestResultsById) | **GET** /api/v2/testSuites/{id}/testResults | Get TestResults By Id |
| [**getTestSuiteById**](TestSuitesApi.md#getTestSuiteById) | **GET** /api/v2/testSuites/{id} | Get TestSuite by Id |
| [**searchWorkItems**](TestSuitesApi.md#searchWorkItems) | **POST** /api/v2/testSuites/{id}/workItems/search | Search WorkItems |
| [**setConfigurationsByTestSuiteId**](TestSuitesApi.md#setConfigurationsByTestSuiteId) | **POST** /api/v2/testSuites/{id}/configurations | Set Configurations By TestSuite Id |


<a id="addTestPointsToTestSuite"></a>
# **addTestPointsToTestSuite**
> addTestPointsToTestSuite(id, workItemSelectModel)

Add test-points to test suite

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 1ed608bf-8ac9-4ffd-b91e-ebdbbdce6132 // java.util.UUID | Test suite internal identifier
val workItemSelectModel : WorkItemSelectModel =  // WorkItemSelectModel | Filter object to retrieve work items for test-suite's project
try {
    apiInstance.addTestPointsToTestSuite(id, workItemSelectModel)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#addTestPointsToTestSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#addTestPointsToTestSuite")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test suite internal identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workItemSelectModel** | [**WorkItemSelectModel**](WorkItemSelectModel.md)| Filter object to retrieve work items for test-suite&#39;s project | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestSuitesIdPatch"></a>
# **apiV2TestSuitesIdPatch**
> apiV2TestSuitesIdPatch(id, operation)

Patch test suite

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test Suite internal (UUID) identifier
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.apiV2TestSuitesIdPatch(id, operation)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#apiV2TestSuitesIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#apiV2TestSuitesIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test Suite internal (UUID) identifier | |
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

<a id="apiV2TestSuitesIdRefreshPost"></a>
# **apiV2TestSuitesIdRefreshPost**
> apiV2TestSuitesIdRefreshPost(id)

Refresh test suite. Only dynamic test suites are supported by this method

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test Suite internal (UUID) identifier
try {
    apiInstance.apiV2TestSuitesIdRefreshPost(id)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#apiV2TestSuitesIdRefreshPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#apiV2TestSuitesIdRefreshPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test Suite internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestSuitesIdWorkItemsPost"></a>
# **apiV2TestSuitesIdWorkItemsPost**
> apiV2TestSuitesIdWorkItemsPost(id, javaUtilUUID)

Set work items for test suite

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the test suite
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    apiInstance.apiV2TestSuitesIdWorkItemsPost(id, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#apiV2TestSuitesIdWorkItemsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#apiV2TestSuitesIdWorkItemsPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Unique ID of the test suite | |
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

<a id="apiV2TestSuitesPost"></a>
# **apiV2TestSuitesPost**
> TestSuiteV2GetModel apiV2TestSuitesPost(testSuiteV2PostModel)

Create test suite

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val testSuiteV2PostModel : TestSuiteV2PostModel =  // TestSuiteV2PostModel | 
try {
    val result : TestSuiteV2GetModel = apiInstance.apiV2TestSuitesPost(testSuiteV2PostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#apiV2TestSuitesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#apiV2TestSuitesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testSuiteV2PostModel** | [**TestSuiteV2PostModel**](TestSuiteV2PostModel.md)|  | [optional] |

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestSuitesPut"></a>
# **apiV2TestSuitesPut**
> apiV2TestSuitesPut(testSuiteV2PutModel)

Edit test suite

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val testSuiteV2PutModel : TestSuiteV2PutModel =  // TestSuiteV2PutModel | 
try {
    apiInstance.apiV2TestSuitesPut(testSuiteV2PutModel)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#apiV2TestSuitesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#apiV2TestSuitesPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testSuiteV2PutModel** | [**TestSuiteV2PutModel**](TestSuiteV2PutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTestSuite"></a>
# **deleteTestSuite**
> deleteTestSuite(id)

Delete TestSuite

 Use case   User sets test suite identifier   User runs method execution   System search test suite by identifier   System deletes test suite   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test suite internal (guid format) identifier\"
try {
    apiInstance.deleteTestSuite(id)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#deleteTestSuite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#deleteTestSuite")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getConfigurationsByTestSuiteId"></a>
# **getConfigurationsByTestSuiteId**
> kotlin.collections.List&lt;ConfigurationModel&gt; getConfigurationsByTestSuiteId(id)

Get Configurations By Id

 Use case   User sets test suite identifier   User runs method execution   System search test suite by identifier   System search test points related to the test suite   System search configurations related to the test points   System returns configurations array

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test suite internal (guid format) identifier\"
try {
    val result : kotlin.collections.List<ConfigurationModel> = apiInstance.getConfigurationsByTestSuiteId(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#getConfigurationsByTestSuiteId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#getConfigurationsByTestSuiteId")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**kotlin.collections.List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestPointsById"></a>
# **getTestPointsById**
> kotlin.collections.List&lt;TestPointByTestSuiteModel&gt; getTestPointsById(id)

Get TestPoints By Id

 Use case   User sets test suite identifier   User runs method execution   System search test suite by identifier   System search test points related to the test suite   System returns test points array

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test suite internal (guid format) identifier\"
try {
    val result : kotlin.collections.List<TestPointByTestSuiteModel> = apiInstance.getTestPointsById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#getTestPointsById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#getTestPointsById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**kotlin.collections.List&lt;TestPointByTestSuiteModel&gt;**](TestPointByTestSuiteModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestResultsById"></a>
# **getTestResultsById**
> kotlin.collections.List&lt;TestResultV2ShortModel&gt; getTestResultsById(id)

Get TestResults By Id

 Use case   User sets test suite identifier   User runs method execution   System search test suite by identifier   System search test points related to the test suite   System search test results related to the test points   System returns test results array

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test suite internal (guid format) identifier\"
try {
    val result : kotlin.collections.List<TestResultV2ShortModel> = apiInstance.getTestResultsById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#getTestResultsById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#getTestResultsById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**kotlin.collections.List&lt;TestResultV2ShortModel&gt;**](TestResultV2ShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTestSuiteById"></a>
# **getTestSuiteById**
> TestSuiteV2GetModel getTestSuiteById(id)

Get TestSuite by Id

 Use case   User sets test suite identifier   User runs method execution   System search test suite by identifier   System returns test suite

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test suite internal (guid format) identifier\"
try {
    val result : TestSuiteV2GetModel = apiInstance.getTestSuiteById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#getTestSuiteById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#getTestSuiteById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test suite internal (guid format) identifier\&quot; | |

### Return type

[**TestSuiteV2GetModel**](TestSuiteV2GetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchWorkItems"></a>
# **searchWorkItems**
> kotlin.collections.List&lt;WorkItemShortModel&gt; searchWorkItems(id, skip, take, orderBy, searchField, searchValue, testSuiteWorkItemsSearchModel)

Search WorkItems

 Use case   User sets test suite identifier   [Optional] User sets filter   User runs method execution   System search test suite by identifier   System search test points related to the test suite   System search work items related to the test points                         [Optional] User sets filter, system applies filter                     System returns work items array

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test suite internal (guid format) identifier\"
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val testSuiteWorkItemsSearchModel : TestSuiteWorkItemsSearchModel =  // TestSuiteWorkItemsSearchModel | 
try {
    val result : kotlin.collections.List<WorkItemShortModel> = apiInstance.searchWorkItems(id, skip, take, orderBy, searchField, searchValue, testSuiteWorkItemsSearchModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#searchWorkItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#searchWorkItems")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test suite internal (guid format) identifier\&quot; | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testSuiteWorkItemsSearchModel** | [**TestSuiteWorkItemsSearchModel**](TestSuiteWorkItemsSearchModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;WorkItemShortModel&gt;**](WorkItemShortModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="setConfigurationsByTestSuiteId"></a>
# **setConfigurationsByTestSuiteId**
> setConfigurationsByTestSuiteId(id, javaUtilUUID)

Set Configurations By TestSuite Id

 Use case   User sets test suite identifier   User sets collection of configuration identifiers   User runs method execution   System search test suite by identifier   System search test points related to the test suite   System search configuration   System restores(if exist) or creates test points with listed configuration   System returns no content response

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TestSuitesApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test suite internal (guid format) identifier\"
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | Collection of configuration identifiers\"
try {
    apiInstance.setConfigurationsByTestSuiteId(id, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling TestSuitesApi#setConfigurationsByTestSuiteId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestSuitesApi#setConfigurationsByTestSuiteId")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test suite internal (guid format) identifier\&quot; | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **javaUtilUUID** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md)| Collection of configuration identifiers\&quot; | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

