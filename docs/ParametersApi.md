# ParametersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ParametersBulkPost**](ParametersApi.md#apiV2ParametersBulkPost) | **POST** /api/v2/parameters/bulk | Create multiple parameters |
| [**apiV2ParametersBulkPut**](ParametersApi.md#apiV2ParametersBulkPut) | **PUT** /api/v2/parameters/bulk | Update multiple parameters |
| [**apiV2ParametersGroupsGet**](ParametersApi.md#apiV2ParametersGroupsGet) | **GET** /api/v2/parameters/groups | Get parameters as group |
| [**apiV2ParametersKeyNameNameExistsGet**](ParametersApi.md#apiV2ParametersKeyNameNameExistsGet) | **GET** /api/v2/parameters/key/name/{name}/exists | Check existence parameter key in system |
| [**apiV2ParametersKeyValuesGet**](ParametersApi.md#apiV2ParametersKeyValuesGet) | **GET** /api/v2/parameters/{key}/values | Get all parameter key values |
| [**apiV2ParametersKeysGet**](ParametersApi.md#apiV2ParametersKeysGet) | **GET** /api/v2/parameters/keys | Get all parameter keys |
| [**apiV2ParametersSearchGroupsPost**](ParametersApi.md#apiV2ParametersSearchGroupsPost) | **POST** /api/v2/parameters/search/groups | Search for parameters as group |
| [**apiV2ParametersSearchPost**](ParametersApi.md#apiV2ParametersSearchPost) | **POST** /api/v2/parameters/search | Search for parameters |
| [**createParameter**](ParametersApi.md#createParameter) | **POST** /api/v2/parameters | Create parameter |
| [**deleteByName**](ParametersApi.md#deleteByName) | **DELETE** /api/v2/parameters/name/{name} | Delete parameter by name |
| [**deleteByParameterKeyId**](ParametersApi.md#deleteByParameterKeyId) | **DELETE** /api/v2/parameters/keyId/{keyId} | Delete parameters by parameter key identifier |
| [**deleteParameter**](ParametersApi.md#deleteParameter) | **DELETE** /api/v2/parameters/{id} | Delete parameter |
| [**getAllParameters**](ParametersApi.md#getAllParameters) | **GET** /api/v2/parameters | Get all parameters |
| [**getParameterById**](ParametersApi.md#getParameterById) | **GET** /api/v2/parameters/{id} | Get parameter by ID |
| [**updateParameter**](ParametersApi.md#updateParameter) | **PUT** /api/v2/parameters | Update parameter |


<a id="apiV2ParametersBulkPost"></a>
# **apiV2ParametersBulkPost**
> kotlin.collections.List&lt;ParameterModel&gt; apiV2ParametersBulkPost(parameterPostModel)

Create multiple parameters

 Use case   User sets list of parameter model (listed in the request example)   User runs method execution   System creates parameters   System returns list of parameter model (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val parameterPostModel : kotlin.collections.List<ParameterPostModel> =  // kotlin.collections.List<ParameterPostModel> | 
try {
    val result : kotlin.collections.List<ParameterModel> = apiInstance.apiV2ParametersBulkPost(parameterPostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parameterPostModel** | [**kotlin.collections.List&lt;ParameterPostModel&gt;**](ParameterPostModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ParameterModel&gt;**](ParameterModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ParametersBulkPut"></a>
# **apiV2ParametersBulkPut**
> apiV2ParametersBulkPut(parameterPutModel)

Update multiple parameters

 Use case   User sets list of parameter model (listed in the request example)   User runs method execution   System updates parameters

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val parameterPutModel : kotlin.collections.List<ParameterPutModel> =  // kotlin.collections.List<ParameterPutModel> | 
try {
    apiInstance.apiV2ParametersBulkPut(parameterPutModel)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersBulkPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersBulkPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parameterPutModel** | [**kotlin.collections.List&lt;ParameterPutModel&gt;**](ParameterPutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ParametersGroupsGet"></a>
# **apiV2ParametersGroupsGet**
> kotlin.collections.List&lt;ParameterGroupModel&gt; apiV2ParametersGroupsGet(isDeleted, parameterKeyIds, skip, take, orderBy, searchField, searchValue)

Get parameters as group

 Use case   User runs method execution   System search parameters   System returns parameters models as groups (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | 
val parameterKeyIds : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<ParameterGroupModel> = apiInstance.apiV2ParametersGroupsGet(isDeleted, parameterKeyIds, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersGroupsGet")
    e.printStackTrace()
}
```

### Parameters
| **isDeleted** | **kotlin.Boolean**|  | [optional] |
| **parameterKeyIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;ParameterGroupModel&gt;**](ParameterGroupModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ParametersKeyNameNameExistsGet"></a>
# **apiV2ParametersKeyNameNameExistsGet**
> kotlin.Boolean apiV2ParametersKeyNameNameExistsGet(name)

Check existence parameter key in system

 Use case   User sets name of parameter key   User runs method execution   System search parameter key   System returns the flag for the existence of the parameter key in the system

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val name : kotlin.String = name_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.apiV2ParametersKeyNameNameExistsGet(name)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersKeyNameNameExistsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersKeyNameNameExistsGet")
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

<a id="apiV2ParametersKeyValuesGet"></a>
# **apiV2ParametersKeyValuesGet**
> kotlin.collections.List&lt;kotlin.String&gt; apiV2ParametersKeyValuesGet(key)

Get all parameter key values

 Use case   User sets parameter key (string format)   User runs method execution   System search parameter values using the key   System returns parameter

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val key : kotlin.String = SomeKey // kotlin.String | Parameter key (string format)
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.apiV2ParametersKeyValuesGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersKeyValuesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersKeyValuesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **key** | **kotlin.String**| Parameter key (string format) | |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ParametersKeysGet"></a>
# **apiV2ParametersKeysGet**
> kotlin.collections.List&lt;kotlin.String&gt; apiV2ParametersKeysGet()

Get all parameter keys

 Use case   User runs method execution   System search all parameter keys   System returns parameter keys

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.apiV2ParametersKeysGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersKeysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersKeysGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ParametersSearchGroupsPost"></a>
# **apiV2ParametersSearchGroupsPost**
> kotlin.collections.List&lt;ParameterGroupModel&gt; apiV2ParametersSearchGroupsPost(skip, take, orderBy, searchField, searchValue, parameterFilterModel)

Search for parameters as group

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val parameterFilterModel : ParameterFilterModel =  // ParameterFilterModel | 
try {
    val result : kotlin.collections.List<ParameterGroupModel> = apiInstance.apiV2ParametersSearchGroupsPost(skip, take, orderBy, searchField, searchValue, parameterFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersSearchGroupsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersSearchGroupsPost")
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
| **parameterFilterModel** | [**ParameterFilterModel**](ParameterFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ParameterGroupModel&gt;**](ParameterGroupModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ParametersSearchPost"></a>
# **apiV2ParametersSearchPost**
> kotlin.collections.List&lt;ParameterModel&gt; apiV2ParametersSearchPost(skip, take, orderBy, searchField, searchValue, parameterFilterModel)

Search for parameters

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val parameterFilterModel : ParameterFilterModel =  // ParameterFilterModel | 
try {
    val result : kotlin.collections.List<ParameterModel> = apiInstance.apiV2ParametersSearchPost(skip, take, orderBy, searchField, searchValue, parameterFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#apiV2ParametersSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#apiV2ParametersSearchPost")
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
| **parameterFilterModel** | [**ParameterFilterModel**](ParameterFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ParameterModel&gt;**](ParameterModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createParameter"></a>
# **createParameter**
> ParameterModel createParameter(parameterPostModel)

Create parameter

 Use case   User sets parameter model (listed in the request example)   User runs method execution   System creates parameter   System returns parameter model

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val parameterPostModel : ParameterPostModel =  // ParameterPostModel | 
try {
    val result : ParameterModel = apiInstance.createParameter(parameterPostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#createParameter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#createParameter")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parameterPostModel** | [**ParameterPostModel**](ParameterPostModel.md)|  | [optional] |

### Return type

[**ParameterModel**](ParameterModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteByName"></a>
# **deleteByName**
> deleteByName(name)

Delete parameter by name

Deletes parameter and all it&#39;s values

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val name : kotlin.String = name_example // kotlin.String | Name of the parameter
try {
    apiInstance.deleteByName(name)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#deleteByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#deleteByName")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| Name of the parameter | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteByParameterKeyId"></a>
# **deleteByParameterKeyId**
> deleteByParameterKeyId(keyId)

Delete parameters by parameter key identifier

Deletes parameter and all it&#39;s values by parameter key identifier

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val keyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Identifier of the parameter key
try {
    apiInstance.deleteByParameterKeyId(keyId)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#deleteByParameterKeyId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#deleteByParameterKeyId")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyId** | **java.util.UUID**| Identifier of the parameter key | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteParameter"></a>
# **deleteParameter**
> deleteParameter(id)

Delete parameter

 Use case   User sets parameter internal (guid format) identifier   System search and delete parameter   System returns deleted parameter

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Parameter internal (UUID) identifier
try {
    apiInstance.deleteParameter(id)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#deleteParameter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#deleteParameter")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Parameter internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAllParameters"></a>
# **getAllParameters**
> kotlin.collections.List&lt;ParameterModel&gt; getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue)

Get all parameters

 Use case   [Optional] User sets isDeleted field value   [Optional] If User sets isDeleted field value as true, System search all deleted parameters   [Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted   If User did not set isDeleted field value, System search all parameters   System returns array of all found parameters(listed in response model)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | If result must consist of only actual/deleted parameters
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<ParameterModel> = apiInstance.getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#getAllParameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#getAllParameters")
    e.printStackTrace()
}
```

### Parameters
| **isDeleted** | **kotlin.Boolean**| If result must consist of only actual/deleted parameters | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;ParameterModel&gt;**](ParameterModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getParameterById"></a>
# **getParameterById**
> ParameterModel getParameterById(id)

Get parameter by ID

 Use case   User sets parameter internal (guid format) identifier   User runs method execution   System search parameter using the identifier   System returns parameter

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Parameter internal (UUID) identifier
try {
    val result : ParameterModel = apiInstance.getParameterById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#getParameterById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#getParameterById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Parameter internal (UUID) identifier | |

### Return type

[**ParameterModel**](ParameterModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateParameter"></a>
# **updateParameter**
> updateParameter(parameterPutModel)

Update parameter

 Use case   User sets parameter updated properties(listed in the request example)   User runs method execution   System updated parameter using updated properties   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ParametersApi()
val parameterPutModel : ParameterPutModel =  // ParameterPutModel | 
try {
    apiInstance.updateParameter(parameterPutModel)
} catch (e: ClientException) {
    println("4xx response calling ParametersApi#updateParameter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ParametersApi#updateParameter")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parameterPutModel** | [**ParameterPutModel**](ParameterPutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

