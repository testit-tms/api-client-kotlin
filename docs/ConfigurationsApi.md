# ConfigurationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ConfigurationsCreateByParametersPost**](ConfigurationsApi.md#apiV2ConfigurationsCreateByParametersPost) | **POST** /api/v2/configurations/createByParameters | Create configurations by parameters |
| [**apiV2ConfigurationsDeleteBulkPost**](ConfigurationsApi.md#apiV2ConfigurationsDeleteBulkPost) | **POST** /api/v2/configurations/delete/bulk | Delete multiple configurations |
| [**apiV2ConfigurationsIdDelete**](ConfigurationsApi.md#apiV2ConfigurationsIdDelete) | **DELETE** /api/v2/configurations/{id} | Delete configuration |
| [**apiV2ConfigurationsIdPatch**](ConfigurationsApi.md#apiV2ConfigurationsIdPatch) | **PATCH** /api/v2/configurations/{id} | Patch configuration |
| [**apiV2ConfigurationsIdPurgePost**](ConfigurationsApi.md#apiV2ConfigurationsIdPurgePost) | **POST** /api/v2/configurations/{id}/purge | Permanently delete configuration from archive |
| [**apiV2ConfigurationsIdRestorePost**](ConfigurationsApi.md#apiV2ConfigurationsIdRestorePost) | **POST** /api/v2/configurations/{id}/restore | Restore configuration from the archive |
| [**apiV2ConfigurationsPurgeBulkPost**](ConfigurationsApi.md#apiV2ConfigurationsPurgeBulkPost) | **POST** /api/v2/configurations/purge/bulk | Permanently delete multiple archived configurations |
| [**apiV2ConfigurationsPut**](ConfigurationsApi.md#apiV2ConfigurationsPut) | **PUT** /api/v2/configurations | Edit configuration |
| [**apiV2ConfigurationsRestoreBulkPost**](ConfigurationsApi.md#apiV2ConfigurationsRestoreBulkPost) | **POST** /api/v2/configurations/restore/bulk | Restore multiple configurations from the archive |
| [**apiV2ConfigurationsSearchPost**](ConfigurationsApi.md#apiV2ConfigurationsSearchPost) | **POST** /api/v2/configurations/search | Search for configurations |
| [**createConfiguration**](ConfigurationsApi.md#createConfiguration) | **POST** /api/v2/configurations | Create Configuration |
| [**getConfigurationById**](ConfigurationsApi.md#getConfigurationById) | **GET** /api/v2/configurations/{id} | Get configuration by internal or global ID |


<a id="apiV2ConfigurationsCreateByParametersPost"></a>
# **apiV2ConfigurationsCreateByParametersPost**
> kotlin.collections.List&lt;java.util.UUID&gt; apiV2ConfigurationsCreateByParametersPost(configurationByParametersModel)

Create configurations by parameters

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val configurationByParametersModel : ConfigurationByParametersModel =  // ConfigurationByParametersModel | 
try {
    val result : kotlin.collections.List<java.util.UUID> = apiInstance.apiV2ConfigurationsCreateByParametersPost(configurationByParametersModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsCreateByParametersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsCreateByParametersPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationByParametersModel** | [**ConfigurationByParametersModel**](ConfigurationByParametersModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ConfigurationsDeleteBulkPost"></a>
# **apiV2ConfigurationsDeleteBulkPost**
> kotlin.Int apiV2ConfigurationsDeleteBulkPost(configurationSelectModel)

Delete multiple configurations

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val configurationSelectModel : ConfigurationSelectModel =  // ConfigurationSelectModel | 
try {
    val result : kotlin.Int = apiInstance.apiV2ConfigurationsDeleteBulkPost(configurationSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsDeleteBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsDeleteBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationSelectModel** | [**ConfigurationSelectModel**](ConfigurationSelectModel.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ConfigurationsIdDelete"></a>
# **apiV2ConfigurationsIdDelete**
> apiV2ConfigurationsIdDelete(id)

Delete configuration

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the configuration
try {
    apiInstance.apiV2ConfigurationsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the configuration | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ConfigurationsIdPatch"></a>
# **apiV2ConfigurationsIdPatch**
> apiV2ConfigurationsIdPatch(id, operation)

Patch configuration

See &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc6902\&quot; target&#x3D;\&quot;_blank\&quot;&gt;RFC 6902: JavaScript Object Notation (JSON) Patch&lt;/a&gt; for details

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the configuration
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.apiV2ConfigurationsIdPatch(id, operation)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsIdPatch")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Unique ID of the configuration | |
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

<a id="apiV2ConfigurationsIdPurgePost"></a>
# **apiV2ConfigurationsIdPurgePost**
> apiV2ConfigurationsIdPurgePost(id)

Permanently delete configuration from archive

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the configuration
try {
    apiInstance.apiV2ConfigurationsIdPurgePost(id)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsIdPurgePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsIdPurgePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the configuration | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ConfigurationsIdRestorePost"></a>
# **apiV2ConfigurationsIdRestorePost**
> apiV2ConfigurationsIdRestorePost(id)

Restore configuration from the archive

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the configuration
try {
    apiInstance.apiV2ConfigurationsIdRestorePost(id)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsIdRestorePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsIdRestorePost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Unique or global ID of the configuration | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ConfigurationsPurgeBulkPost"></a>
# **apiV2ConfigurationsPurgeBulkPost**
> kotlin.Int apiV2ConfigurationsPurgeBulkPost(configurationSelectModel)

Permanently delete multiple archived configurations

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val configurationSelectModel : ConfigurationSelectModel =  // ConfigurationSelectModel | 
try {
    val result : kotlin.Int = apiInstance.apiV2ConfigurationsPurgeBulkPost(configurationSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsPurgeBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsPurgeBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationSelectModel** | [**ConfigurationSelectModel**](ConfigurationSelectModel.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ConfigurationsPut"></a>
# **apiV2ConfigurationsPut**
> apiV2ConfigurationsPut(configurationPutModel)

Edit configuration

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val configurationPutModel : ConfigurationPutModel =  // ConfigurationPutModel | 
try {
    apiInstance.apiV2ConfigurationsPut(configurationPutModel)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationPutModel** | [**ConfigurationPutModel**](ConfigurationPutModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ConfigurationsRestoreBulkPost"></a>
# **apiV2ConfigurationsRestoreBulkPost**
> kotlin.Int apiV2ConfigurationsRestoreBulkPost(configurationSelectModel)

Restore multiple configurations from the archive

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val configurationSelectModel : ConfigurationSelectModel =  // ConfigurationSelectModel | 
try {
    val result : kotlin.Int = apiInstance.apiV2ConfigurationsRestoreBulkPost(configurationSelectModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsRestoreBulkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsRestoreBulkPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationSelectModel** | [**ConfigurationSelectModel**](ConfigurationSelectModel.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ConfigurationsSearchPost"></a>
# **apiV2ConfigurationsSearchPost**
> kotlin.collections.List&lt;ConfigurationModel&gt; apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, configurationFilterModel)

Search for configurations

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val configurationFilterModel : ConfigurationFilterModel =  // ConfigurationFilterModel | Model containing all the filters
try {
    val result : kotlin.collections.List<ConfigurationModel> = apiInstance.apiV2ConfigurationsSearchPost(skip, take, orderBy, searchField, searchValue, configurationFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#apiV2ConfigurationsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#apiV2ConfigurationsSearchPost")
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
| **configurationFilterModel** | [**ConfigurationFilterModel**](ConfigurationFilterModel.md)| Model containing all the filters | [optional] |

### Return type

[**kotlin.collections.List&lt;ConfigurationModel&gt;**](ConfigurationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createConfiguration"></a>
# **createConfiguration**
> ConfigurationModel createConfiguration(configurationPostModel)

Create Configuration

 Use case  User sets configuration model (listed in the request example)  User runs method execution  System creates configuration  System returns created configuration (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val configurationPostModel : ConfigurationPostModel =  // ConfigurationPostModel | 
try {
    val result : ConfigurationModel = apiInstance.createConfiguration(configurationPostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#createConfiguration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#createConfiguration")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationPostModel** | [**ConfigurationPostModel**](ConfigurationPostModel.md)|  | [optional] |

### Return type

[**ConfigurationModel**](ConfigurationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getConfigurationById"></a>
# **getConfigurationById**
> ConfigurationModel getConfigurationById(id)

Get configuration by internal or global ID

 Use case  User sets configuration internal (guid format) or global (integer format) identifier  User runs method execution  System search configuration using the identifier  System returns configuration

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationsApi()
val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | Configuration internal (guid format) or global (integer format) identifier
try {
    val result : ConfigurationModel = apiInstance.getConfigurationById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationsApi#getConfigurationById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationsApi#getConfigurationById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Configuration internal (guid format) or global (integer format) identifier | |

### Return type

[**ConfigurationModel**](ConfigurationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

