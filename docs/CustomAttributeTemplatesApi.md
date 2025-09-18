# CustomAttributeTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2CustomAttributesTemplatesExistsGet**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesExistsGet) | **GET** /api/v2/customAttributes/templates/exists |  |
| [**apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/exclude | Exclude CustomAttributes from CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost) | **POST** /api/v2/customAttributes/templates/{id}/customAttributes/include | Include CustomAttributes to CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesIdDelete**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdDelete) | **DELETE** /api/v2/customAttributes/templates/{id} | Delete CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesIdGet**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesIdGet) | **GET** /api/v2/customAttributes/templates/{id} | Get CustomAttributeTemplate by ID |
| [**apiV2CustomAttributesTemplatesNameGet**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesNameGet) | **GET** /api/v2/customAttributes/templates/{name} | Get CustomAttributeTemplate by name |
| [**apiV2CustomAttributesTemplatesPost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPost) | **POST** /api/v2/customAttributes/templates | Create CustomAttributeTemplate |
| [**apiV2CustomAttributesTemplatesPut**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesPut) | **PUT** /api/v2/customAttributes/templates | Update custom attributes template |
| [**apiV2CustomAttributesTemplatesSearchPost**](CustomAttributeTemplatesApi.md#apiV2CustomAttributesTemplatesSearchPost) | **POST** /api/v2/customAttributes/templates/search | Search CustomAttributeTemplates |


<a id="apiV2CustomAttributesTemplatesExistsGet"></a>
# **apiV2CustomAttributesTemplatesExistsGet**
> CustomAttributeTemplateValidationResult apiV2CustomAttributesTemplatesExistsGet(name)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : CustomAttributeTemplateValidationResult = apiInstance.apiV2CustomAttributesTemplatesExistsGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesExistsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**|  | [optional] |

### Return type

[**CustomAttributeTemplateValidationResult**](CustomAttributeTemplateValidationResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost"></a>
# **apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost**
> apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost(id, javaUtilUUID)

Exclude CustomAttributes from CustomAttributeTemplate

  Use case    User sets attribute template internal identifier    User sets attribute internal identifiers    User runs method execution    System delete attributes from attributes tempalte

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Attribute template internal (UUID) identifier
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    apiInstance.apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost(id, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Attribute template internal (UUID) identifier | |
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

<a id="apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost"></a>
# **apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost**
> apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost(id, javaUtilUUID)

Include CustomAttributes to CustomAttributeTemplate

  Use case    User sets attribute template internal identifier    User sets attribute internal identifiers    User runs method execution    System add attributes to attributes tempalte

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Attribute template internal (UUID) identifier
val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
try {
    apiInstance.apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost(id, javaUtilUUID)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Attribute template internal (UUID) identifier | |
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

<a id="apiV2CustomAttributesTemplatesIdDelete"></a>
# **apiV2CustomAttributesTemplatesIdDelete**
> apiV2CustomAttributesTemplatesIdDelete(id)

Delete CustomAttributeTemplate

  Use case    User sets attribute template internal identifier    User runs method execution    System search and delete attribute template    System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Attribute template internal (UUID) identifier
try {
    apiInstance.apiV2CustomAttributesTemplatesIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Attribute template internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CustomAttributesTemplatesIdGet"></a>
# **apiV2CustomAttributesTemplatesIdGet**
> CustomAttributeTemplateModel apiV2CustomAttributesTemplatesIdGet(id)

Get CustomAttributeTemplate by ID

  Use case    User sets attribute template internal identifier    User runs method execution    System return attribute template (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | CustomAttributeTemplate internal (UUID) identifier
try {
    val result : CustomAttributeTemplateModel = apiInstance.apiV2CustomAttributesTemplatesIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| CustomAttributeTemplate internal (UUID) identifier | |

### Return type

[**CustomAttributeTemplateModel**](CustomAttributeTemplateModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CustomAttributesTemplatesNameGet"></a>
# **apiV2CustomAttributesTemplatesNameGet**
> CustomAttributeTemplateModel apiV2CustomAttributesTemplatesNameGet(name)

Get CustomAttributeTemplate by name

  Use case    User sets attribute template name    User runs method execution    System search and return list of attribute templates (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val name : kotlin.String = name_example // kotlin.String | CustomAttributeTemplate name for search
try {
    val result : CustomAttributeTemplateModel = apiInstance.apiV2CustomAttributesTemplatesNameGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesNameGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesNameGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| CustomAttributeTemplate name for search | |

### Return type

[**CustomAttributeTemplateModel**](CustomAttributeTemplateModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CustomAttributesTemplatesPost"></a>
# **apiV2CustomAttributesTemplatesPost**
> CustomAttributeTemplateModel apiV2CustomAttributesTemplatesPost(customAttributeTemplatePostModel)

Create CustomAttributeTemplate

  Use case    User sets attribute template parameters (listed in request example)    User runs method execution    System creates attribute template    System returns attribute template model (example listed in response parameters)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val customAttributeTemplatePostModel : CustomAttributeTemplatePostModel =  // CustomAttributeTemplatePostModel | 
try {
    val result : CustomAttributeTemplateModel = apiInstance.apiV2CustomAttributesTemplatesPost(customAttributeTemplatePostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customAttributeTemplatePostModel** | [**CustomAttributeTemplatePostModel**](CustomAttributeTemplatePostModel.md)|  | [optional] |

### Return type

[**CustomAttributeTemplateModel**](CustomAttributeTemplateModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2CustomAttributesTemplatesPut"></a>
# **apiV2CustomAttributesTemplatesPut**
> apiV2CustomAttributesTemplatesPut(customAttributeTemplatePutModel)

Update custom attributes template

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val customAttributeTemplatePutModel : CustomAttributeTemplatePutModel =  // CustomAttributeTemplatePutModel | 
try {
    apiInstance.apiV2CustomAttributesTemplatesPut(customAttributeTemplatePutModel)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customAttributeTemplatePutModel** | [**CustomAttributeTemplatePutModel**](CustomAttributeTemplatePutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2CustomAttributesTemplatesSearchPost"></a>
# **apiV2CustomAttributesTemplatesSearchPost**
> kotlin.collections.List&lt;SearchCustomAttributeTemplateGetModel&gt; apiV2CustomAttributesTemplatesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeTemplateSearchQueryModel)

Search CustomAttributeTemplates

  Use case    User sets search params model (listed in request example)    User runs method execution    System return attribute templates (listed in response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = CustomAttributeTemplatesApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val customAttributeTemplateSearchQueryModel : CustomAttributeTemplateSearchQueryModel =  // CustomAttributeTemplateSearchQueryModel | 
try {
    val result : kotlin.collections.List<SearchCustomAttributeTemplateGetModel> = apiInstance.apiV2CustomAttributesTemplatesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeTemplateSearchQueryModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomAttributeTemplatesApi#apiV2CustomAttributesTemplatesSearchPost")
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
| **customAttributeTemplateSearchQueryModel** | [**CustomAttributeTemplateSearchQueryModel**](CustomAttributeTemplateSearchQueryModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;SearchCustomAttributeTemplateGetModel&gt;**](SearchCustomAttributeTemplateGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

