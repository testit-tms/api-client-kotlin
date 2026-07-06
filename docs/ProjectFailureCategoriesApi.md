# ProjectFailureCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost) | **POST** /api/v2/projects/{projectId}/autotests/failure-categories/grouping-search | Get failure categories with support for filtering, sorting and grouping |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete) | **DELETE** /api/v2/projects/{projectId}/autotests/failure-categories/{id} | Delete failure category |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet) | **GET** /api/v2/projects/{projectId}/autotests/failure-categories/{id} | Get failure category by ID |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesPost**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesPost) | **POST** /api/v2/projects/{projectId}/autotests/failure-categories | Create failure category |
| [**apiV2ProjectsProjectIdAutotestsFailureCategoriesPut**](ProjectFailureCategoriesApi.md#apiV2ProjectsProjectIdAutotestsFailureCategoriesPut) | **PUT** /api/v2/projects/{projectId}/autotests/failure-categories | Update failure category |


<a id="apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost"></a>
# **apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost**
> ProjectFailureCategoryGroupItemApiResultReply apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost(projectId, failureCategoryGroupSearchApiModel)

Get failure categories with support for filtering, sorting and grouping

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectFailureCategoriesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val failureCategoryGroupSearchApiModel : FailureCategoryGroupSearchApiModel =  // FailureCategoryGroupSearchApiModel | 
try {
    val result : ProjectFailureCategoryGroupItemApiResultReply = apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost(projectId, failureCategoryGroupSearchApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesGroupingSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **failureCategoryGroupSearchApiModel** | [**FailureCategoryGroupSearchApiModel**](FailureCategoryGroupSearchApiModel.md)|  | [optional] |

### Return type

[**ProjectFailureCategoryGroupItemApiResultReply**](ProjectFailureCategoryGroupItemApiResultReply.md)

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

<a id="apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete"></a>
# **apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete**
> apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete(projectId, id)

Delete failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectFailureCategoriesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete(projectId, id)
} catch (e: ClientException) {
    println("4xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

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

<a id="apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet"></a>
# **apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet**
> ProjectDetailedFailureCategoryApiResult apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet(projectId, id)

Get failure category by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectFailureCategoriesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ProjectDetailedFailureCategoryApiResult = apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet(projectId, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesIdGet")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**|  | |

### Return type

[**ProjectDetailedFailureCategoryApiResult**](ProjectDetailedFailureCategoryApiResult.md)

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

<a id="apiV2ProjectsProjectIdAutotestsFailureCategoriesPost"></a>
# **apiV2ProjectsProjectIdAutotestsFailureCategoriesPost**
> ProjectDetailedFailureCategoryApiResult apiV2ProjectsProjectIdAutotestsFailureCategoriesPost(projectId, createProjectFailureCategoryApiModel)

Create failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectFailureCategoriesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val createProjectFailureCategoryApiModel : CreateProjectFailureCategoryApiModel =  // CreateProjectFailureCategoryApiModel | 
try {
    val result : ProjectDetailedFailureCategoryApiResult = apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesPost(projectId, createProjectFailureCategoryApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createProjectFailureCategoryApiModel** | [**CreateProjectFailureCategoryApiModel**](CreateProjectFailureCategoryApiModel.md)|  | [optional] |

### Return type

[**ProjectDetailedFailureCategoryApiResult**](ProjectDetailedFailureCategoryApiResult.md)

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

<a id="apiV2ProjectsProjectIdAutotestsFailureCategoriesPut"></a>
# **apiV2ProjectsProjectIdAutotestsFailureCategoriesPut**
> apiV2ProjectsProjectIdAutotestsFailureCategoriesPut(projectId, updateFailureCategoryProjectApiModel)

Update failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectFailureCategoriesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Internal (UUID) or global (integer) identifier
val updateFailureCategoryProjectApiModel : UpdateFailureCategoryProjectApiModel =  // UpdateFailureCategoryProjectApiModel | 
try {
    apiInstance.apiV2ProjectsProjectIdAutotestsFailureCategoriesPut(projectId, updateFailureCategoryProjectApiModel)
} catch (e: ClientException) {
    println("4xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectFailureCategoriesApi#apiV2ProjectsProjectIdAutotestsFailureCategoriesPut")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateFailureCategoryProjectApiModel** | [**UpdateFailureCategoryProjectApiModel**](UpdateFailureCategoryProjectApiModel.md)|  | [optional] |

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

