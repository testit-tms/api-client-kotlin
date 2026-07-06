# FailureCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2AutotestsFailureCategoriesGroupingSearchPost**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesGroupingSearchPost) | **POST** /api/v2/autotests/failure-categories/grouping-search | Get failure categories with support for filtering, sorting and grouping |
| [**apiV2AutotestsFailureCategoriesIdDelete**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesIdDelete) | **DELETE** /api/v2/autotests/failure-categories/{id} | Delete failure category |
| [**apiV2AutotestsFailureCategoriesIdGet**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesIdGet) | **GET** /api/v2/autotests/failure-categories/{id} | Get failure category by ID |
| [**apiV2AutotestsFailureCategoriesNameNameExistsGet**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesNameNameExistsGet) | **GET** /api/v2/autotests/failure-categories/name/{name}/exists | Check failure category with the specified name already exists |
| [**apiV2AutotestsFailureCategoriesPost**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesPost) | **POST** /api/v2/autotests/failure-categories | Create failure category |
| [**apiV2AutotestsFailureCategoriesPut**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesPut) | **PUT** /api/v2/autotests/failure-categories | Update failure category |
| [**apiV2AutotestsFailureCategoriesSearchPost**](FailureCategoriesApi.md#apiV2AutotestsFailureCategoriesSearchPost) | **POST** /api/v2/autotests/failure-categories/search |  |
| [**apiV2AutotestsResultReasonsGroupingSearchPost**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsGroupingSearchPost) | **POST** /api/v2/autotests/resultReasons/grouping-search | Get failure categories with support for filtering, sorting and grouping |
| [**apiV2AutotestsResultReasonsIdDelete**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsIdDelete) | **DELETE** /api/v2/autotests/resultReasons/{id} | Delete failure category |
| [**apiV2AutotestsResultReasonsIdGet**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsIdGet) | **GET** /api/v2/autotests/resultReasons/{id} | Get failure category by ID |
| [**apiV2AutotestsResultReasonsNameNameExistsGet**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsNameNameExistsGet) | **GET** /api/v2/autotests/resultReasons/name/{name}/exists | Check failure category with the specified name already exists |
| [**apiV2AutotestsResultReasonsPost**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsPost) | **POST** /api/v2/autotests/resultReasons | Create failure category |
| [**apiV2AutotestsResultReasonsPut**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsPut) | **PUT** /api/v2/autotests/resultReasons | Update failure category |
| [**apiV2AutotestsResultReasonsSearchPost**](FailureCategoriesApi.md#apiV2AutotestsResultReasonsSearchPost) | **POST** /api/v2/autotests/resultReasons/search |  |


<a id="apiV2AutotestsFailureCategoriesGroupingSearchPost"></a>
# **apiV2AutotestsFailureCategoriesGroupingSearchPost**
> FailureCategoryGroupItemApiResultReply apiV2AutotestsFailureCategoriesGroupingSearchPost(failureCategoryGroupSearchApiModel)

Get failure categories with support for filtering, sorting and grouping

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val failureCategoryGroupSearchApiModel : FailureCategoryGroupSearchApiModel =  // FailureCategoryGroupSearchApiModel | 
try {
    val result : FailureCategoryGroupItemApiResultReply = apiInstance.apiV2AutotestsFailureCategoriesGroupingSearchPost(failureCategoryGroupSearchApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesGroupingSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesGroupingSearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **failureCategoryGroupSearchApiModel** | [**FailureCategoryGroupSearchApiModel**](FailureCategoryGroupSearchApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryGroupItemApiResultReply**](FailureCategoryGroupItemApiResultReply.md)

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

<a id="apiV2AutotestsFailureCategoriesIdDelete"></a>
# **apiV2AutotestsFailureCategoriesIdDelete**
> apiV2AutotestsFailureCategoriesIdDelete(id)

Delete failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2AutotestsFailureCategoriesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesIdDelete")
    e.printStackTrace()
}
```

### Parameters
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

<a id="apiV2AutotestsFailureCategoriesIdGet"></a>
# **apiV2AutotestsFailureCategoriesIdGet**
> FailureCategoryApiResult apiV2AutotestsFailureCategoriesIdGet(id, isDeleted)

Get failure category by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FailureCategoryApiResult = apiInstance.apiV2AutotestsFailureCategoriesIdGet(id, isDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesIdGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDeleted** | **kotlin.Boolean**|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

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

<a id="apiV2AutotestsFailureCategoriesNameNameExistsGet"></a>
# **apiV2AutotestsFailureCategoriesNameNameExistsGet**
> kotlin.Boolean apiV2AutotestsFailureCategoriesNameNameExistsGet(name)

Check failure category with the specified name already exists

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.apiV2AutotestsFailureCategoriesNameNameExistsGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesNameNameExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesNameNameExistsGet")
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


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2AutotestsFailureCategoriesPost"></a>
# **apiV2AutotestsFailureCategoriesPost**
> FailureCategoryApiResult apiV2AutotestsFailureCategoriesPost(createFailureCategoryApiModel)

Create failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val createFailureCategoryApiModel : CreateFailureCategoryApiModel =  // CreateFailureCategoryApiModel | 
try {
    val result : FailureCategoryApiResult = apiInstance.apiV2AutotestsFailureCategoriesPost(createFailureCategoryApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFailureCategoryApiModel** | [**CreateFailureCategoryApiModel**](CreateFailureCategoryApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

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

<a id="apiV2AutotestsFailureCategoriesPut"></a>
# **apiV2AutotestsFailureCategoriesPut**
> apiV2AutotestsFailureCategoriesPut(updateFailureCategoryApiModel)

Update failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val updateFailureCategoryApiModel : UpdateFailureCategoryApiModel =  // UpdateFailureCategoryApiModel | 
try {
    apiInstance.apiV2AutotestsFailureCategoriesPut(updateFailureCategoryApiModel)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateFailureCategoryApiModel** | [**UpdateFailureCategoryApiModel**](UpdateFailureCategoryApiModel.md)|  | [optional] |

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

<a id="apiV2AutotestsFailureCategoriesSearchPost"></a>
# **apiV2AutotestsFailureCategoriesSearchPost**
> kotlin.collections.List&lt;AutotestResultReasonShortGetModel&gt; apiV2AutotestsFailureCategoriesSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val autotestResultReasonFilterModel : AutotestResultReasonFilterModel =  // AutotestResultReasonFilterModel | 
try {
    val result : kotlin.collections.List<AutotestResultReasonShortGetModel> = apiInstance.apiV2AutotestsFailureCategoriesSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsFailureCategoriesSearchPost")
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
| **autotestResultReasonFilterModel** | [**AutotestResultReasonFilterModel**](AutotestResultReasonFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;AutotestResultReasonShortGetModel&gt;**](AutotestResultReasonShortGetModel.md)

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

<a id="apiV2AutotestsResultReasonsGroupingSearchPost"></a>
# **apiV2AutotestsResultReasonsGroupingSearchPost**
> FailureCategoryGroupItemApiResultReply apiV2AutotestsResultReasonsGroupingSearchPost(failureCategoryGroupSearchApiModel)

Get failure categories with support for filtering, sorting and grouping

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val failureCategoryGroupSearchApiModel : FailureCategoryGroupSearchApiModel =  // FailureCategoryGroupSearchApiModel | 
try {
    val result : FailureCategoryGroupItemApiResultReply = apiInstance.apiV2AutotestsResultReasonsGroupingSearchPost(failureCategoryGroupSearchApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsGroupingSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsGroupingSearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **failureCategoryGroupSearchApiModel** | [**FailureCategoryGroupSearchApiModel**](FailureCategoryGroupSearchApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryGroupItemApiResultReply**](FailureCategoryGroupItemApiResultReply.md)

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

<a id="apiV2AutotestsResultReasonsIdDelete"></a>
# **apiV2AutotestsResultReasonsIdDelete**
> apiV2AutotestsResultReasonsIdDelete(id)

Delete failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2AutotestsResultReasonsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsIdDelete")
    e.printStackTrace()
}
```

### Parameters
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

<a id="apiV2AutotestsResultReasonsIdGet"></a>
# **apiV2AutotestsResultReasonsIdGet**
> FailureCategoryApiResult apiV2AutotestsResultReasonsIdGet(id, isDeleted)

Get failure category by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FailureCategoryApiResult = apiInstance.apiV2AutotestsResultReasonsIdGet(id, isDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsIdGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isDeleted** | **kotlin.Boolean**|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

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

<a id="apiV2AutotestsResultReasonsNameNameExistsGet"></a>
# **apiV2AutotestsResultReasonsNameNameExistsGet**
> kotlin.Boolean apiV2AutotestsResultReasonsNameNameExistsGet(name)

Check failure category with the specified name already exists

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.apiV2AutotestsResultReasonsNameNameExistsGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsNameNameExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsNameNameExistsGet")
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


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Cookies:
    ApiClient.apiKey["session"] = ""
    ApiClient.apiKeyPrefix["session"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2AutotestsResultReasonsPost"></a>
# **apiV2AutotestsResultReasonsPost**
> FailureCategoryApiResult apiV2AutotestsResultReasonsPost(createFailureCategoryApiModel)

Create failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val createFailureCategoryApiModel : CreateFailureCategoryApiModel =  // CreateFailureCategoryApiModel | 
try {
    val result : FailureCategoryApiResult = apiInstance.apiV2AutotestsResultReasonsPost(createFailureCategoryApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createFailureCategoryApiModel** | [**CreateFailureCategoryApiModel**](CreateFailureCategoryApiModel.md)|  | [optional] |

### Return type

[**FailureCategoryApiResult**](FailureCategoryApiResult.md)

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

<a id="apiV2AutotestsResultReasonsPut"></a>
# **apiV2AutotestsResultReasonsPut**
> apiV2AutotestsResultReasonsPut(updateFailureCategoryApiModel)

Update failure category

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val updateFailureCategoryApiModel : UpdateFailureCategoryApiModel =  // UpdateFailureCategoryApiModel | 
try {
    apiInstance.apiV2AutotestsResultReasonsPut(updateFailureCategoryApiModel)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateFailureCategoryApiModel** | [**UpdateFailureCategoryApiModel**](UpdateFailureCategoryApiModel.md)|  | [optional] |

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

<a id="apiV2AutotestsResultReasonsSearchPost"></a>
# **apiV2AutotestsResultReasonsSearchPost**
> kotlin.collections.List&lt;AutotestResultReasonShortGetModel&gt; apiV2AutotestsResultReasonsSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = FailureCategoriesApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val autotestResultReasonFilterModel : AutotestResultReasonFilterModel =  // AutotestResultReasonFilterModel | 
try {
    val result : kotlin.collections.List<AutotestResultReasonShortGetModel> = apiInstance.apiV2AutotestsResultReasonsSearchPost(skip, take, orderBy, searchField, searchValue, autotestResultReasonFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FailureCategoriesApi#apiV2AutotestsResultReasonsSearchPost")
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
| **autotestResultReasonFilterModel** | [**AutotestResultReasonFilterModel**](AutotestResultReasonFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;AutotestResultReasonShortGetModel&gt;**](AutotestResultReasonShortGetModel.md)

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

