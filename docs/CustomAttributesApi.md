# CustomAttributesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2CustomAttributesExistsGet**](CustomAttributesApi.md#apiV2CustomAttributesExistsGet) | **GET** /api/v2/customAttributes/exists |  |
| [**apiV2CustomAttributesGlobalIdDelete**](CustomAttributesApi.md#apiV2CustomAttributesGlobalIdDelete) | **DELETE** /api/v2/customAttributes/global/{id} | Delete global attribute |
| [**apiV2CustomAttributesGlobalIdPut**](CustomAttributesApi.md#apiV2CustomAttributesGlobalIdPut) | **PUT** /api/v2/customAttributes/global/{id} | Edit global attribute |
| [**apiV2CustomAttributesGlobalPost**](CustomAttributesApi.md#apiV2CustomAttributesGlobalPost) | **POST** /api/v2/customAttributes/global | Create global attribute |
| [**apiV2CustomAttributesIdGet**](CustomAttributesApi.md#apiV2CustomAttributesIdGet) | **GET** /api/v2/customAttributes/{id} | Get attribute |
| [**apiV2CustomAttributesSearchPost**](CustomAttributesApi.md#apiV2CustomAttributesSearchPost) | **POST** /api/v2/customAttributes/search | Search for attributes |


<a id="apiV2CustomAttributesExistsGet"></a>
# **apiV2CustomAttributesExistsGet**
> CustomAttributeValidationResult apiV2CustomAttributesExistsGet(name, isGlobal)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributesApi()
val name : kotlin.String = name_example // kotlin.String | 
val isGlobal : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : CustomAttributeValidationResult = apiInstance.apiV2CustomAttributesExistsGet(name, isGlobal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributesApi#apiV2CustomAttributesExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributesApi#apiV2CustomAttributesExistsGet")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isGlobal** | **kotlin.Boolean**|  | [optional] |

### Return type

[**CustomAttributeValidationResult**](CustomAttributeValidationResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CustomAttributesGlobalIdDelete"></a>
# **apiV2CustomAttributesGlobalIdDelete**
> apiV2CustomAttributesGlobalIdDelete(id)

Delete global attribute

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of attribute
try {
    apiInstance.apiV2CustomAttributesGlobalIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributesApi#apiV2CustomAttributesGlobalIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributesApi#apiV2CustomAttributesGlobalIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique ID of attribute | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CustomAttributesGlobalIdPut"></a>
# **apiV2CustomAttributesGlobalIdPut**
> CustomAttributeModel apiV2CustomAttributesGlobalIdPut(id, globalCustomAttributeUpdateModel)

Edit global attribute

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of attribute
val globalCustomAttributeUpdateModel : GlobalCustomAttributeUpdateModel =  // GlobalCustomAttributeUpdateModel | 
try {
    val result : CustomAttributeModel = apiInstance.apiV2CustomAttributesGlobalIdPut(id, globalCustomAttributeUpdateModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributesApi#apiV2CustomAttributesGlobalIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributesApi#apiV2CustomAttributesGlobalIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Unique ID of attribute | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **globalCustomAttributeUpdateModel** | [**GlobalCustomAttributeUpdateModel**](GlobalCustomAttributeUpdateModel.md)|  | [optional] |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2CustomAttributesGlobalPost"></a>
# **apiV2CustomAttributesGlobalPost**
> CustomAttributeModel apiV2CustomAttributesGlobalPost(globalCustomAttributePostModel)

Create global attribute

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributesApi()
val globalCustomAttributePostModel : GlobalCustomAttributePostModel =  // GlobalCustomAttributePostModel | 
try {
    val result : CustomAttributeModel = apiInstance.apiV2CustomAttributesGlobalPost(globalCustomAttributePostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributesApi#apiV2CustomAttributesGlobalPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributesApi#apiV2CustomAttributesGlobalPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **globalCustomAttributePostModel** | [**GlobalCustomAttributePostModel**](GlobalCustomAttributePostModel.md)|  | [optional] |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2CustomAttributesIdGet"></a>
# **apiV2CustomAttributesIdGet**
> CustomAttributeModel apiV2CustomAttributesIdGet(id)

Get attribute

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of attribute
try {
    val result : CustomAttributeModel = apiInstance.apiV2CustomAttributesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributesApi#apiV2CustomAttributesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributesApi#apiV2CustomAttributesIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Unique ID of attribute | |

### Return type

[**CustomAttributeModel**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CustomAttributesSearchPost"></a>
# **apiV2CustomAttributesSearchPost**
> kotlin.collections.List&lt;CustomAttributeModel&gt; apiV2CustomAttributesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeSearchQueryModel)

Search for attributes

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributesApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val customAttributeSearchQueryModel : CustomAttributeSearchQueryModel =  // CustomAttributeSearchQueryModel | 
try {
    val result : kotlin.collections.List<CustomAttributeModel> = apiInstance.apiV2CustomAttributesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeSearchQueryModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributesApi#apiV2CustomAttributesSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributesApi#apiV2CustomAttributesSearchPost")
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
| **customAttributeSearchQueryModel** | [**CustomAttributeSearchQueryModel**](CustomAttributeSearchQueryModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CustomAttributeModel&gt;**](CustomAttributeModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

