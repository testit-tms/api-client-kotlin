# ConfigurationParametersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ConfigurationParametersConfigurationParameterIdDelete**](ConfigurationParametersApi.md#apiV2ConfigurationParametersConfigurationParameterIdDelete) | **DELETE** /api/v2/configuration-parameters/{configurationParameterId} | Deletes configuration parameter |
| [**apiV2ConfigurationParametersConfigurationParameterIdGet**](ConfigurationParametersApi.md#apiV2ConfigurationParametersConfigurationParameterIdGet) | **GET** /api/v2/configuration-parameters/{configurationParameterId} | Gets configuration parameter by its identifier |
| [**apiV2ConfigurationParametersConfigurationParameterIdPut**](ConfigurationParametersApi.md#apiV2ConfigurationParametersConfigurationParameterIdPut) | **PUT** /api/v2/configuration-parameters/{configurationParameterId} | Updates configuration parameter |
| [**apiV2ConfigurationParametersPost**](ConfigurationParametersApi.md#apiV2ConfigurationParametersPost) | **POST** /api/v2/configuration-parameters | Creates new configuration parameter |
| [**apiV2ConfigurationParametersSearchPost**](ConfigurationParametersApi.md#apiV2ConfigurationParametersSearchPost) | **POST** /api/v2/configuration-parameters/search | Searches for configuration parameters |


<a id="apiV2ConfigurationParametersConfigurationParameterIdDelete"></a>
# **apiV2ConfigurationParametersConfigurationParameterIdDelete**
> apiV2ConfigurationParametersConfigurationParameterIdDelete(configurationParameterId)

Deletes configuration parameter

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationParametersApi()
val configurationParameterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2ConfigurationParametersConfigurationParameterIdDelete(configurationParameterId)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationParameterId** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Identity.Application:
    ApiClient.apiKey["backoffice"] = ""
    ApiClient.apiKeyPrefix["backoffice"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ConfigurationParametersConfigurationParameterIdGet"></a>
# **apiV2ConfigurationParametersConfigurationParameterIdGet**
> ConfigurationParameterApiResult apiV2ConfigurationParametersConfigurationParameterIdGet(configurationParameterId)

Gets configuration parameter by its identifier

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationParametersApi()
val configurationParameterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ConfigurationParameterApiResult = apiInstance.apiV2ConfigurationParametersConfigurationParameterIdGet(configurationParameterId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationParameterId** | **java.util.UUID**|  | |

### Return type

[**ConfigurationParameterApiResult**](ConfigurationParameterApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Identity.Application:
    ApiClient.apiKey["backoffice"] = ""
    ApiClient.apiKeyPrefix["backoffice"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ConfigurationParametersConfigurationParameterIdPut"></a>
# **apiV2ConfigurationParametersConfigurationParameterIdPut**
> apiV2ConfigurationParametersConfigurationParameterIdPut(configurationParameterId, configurationParameterApiModel)

Updates configuration parameter

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationParametersApi()
val configurationParameterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val configurationParameterApiModel : ConfigurationParameterApiModel =  // ConfigurationParameterApiModel | 
try {
    apiInstance.apiV2ConfigurationParametersConfigurationParameterIdPut(configurationParameterId, configurationParameterApiModel)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersConfigurationParameterIdPut")
    e.printStackTrace()
}
```

### Parameters
| **configurationParameterId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationParameterApiModel** | [**ConfigurationParameterApiModel**](ConfigurationParameterApiModel.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Identity.Application:
    ApiClient.apiKey["backoffice"] = ""
    ApiClient.apiKeyPrefix["backoffice"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ConfigurationParametersPost"></a>
# **apiV2ConfigurationParametersPost**
> ConfigurationParameterApiResult apiV2ConfigurationParametersPost(configurationParameterApiModel)

Creates new configuration parameter

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationParametersApi()
val configurationParameterApiModel : ConfigurationParameterApiModel =  // ConfigurationParameterApiModel | 
try {
    val result : ConfigurationParameterApiResult = apiInstance.apiV2ConfigurationParametersPost(configurationParameterApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationParameterApiModel** | [**ConfigurationParameterApiModel**](ConfigurationParameterApiModel.md)|  | [optional] |

### Return type

[**ConfigurationParameterApiResult**](ConfigurationParameterApiResult.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Identity.Application:
    ApiClient.apiKey["backoffice"] = ""
    ApiClient.apiKeyPrefix["backoffice"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ConfigurationParametersSearchPost"></a>
# **apiV2ConfigurationParametersSearchPost**
> ConfigurationParameterPreviewApiResultIReply apiV2ConfigurationParametersSearchPost(searchConfigurationParametersApiModel)

Searches for configuration parameters

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ConfigurationParametersApi()
val searchConfigurationParametersApiModel : SearchConfigurationParametersApiModel =  // SearchConfigurationParametersApiModel | 
try {
    val result : ConfigurationParameterPreviewApiResultIReply = apiInstance.apiV2ConfigurationParametersSearchPost(searchConfigurationParametersApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConfigurationParametersApi#apiV2ConfigurationParametersSearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchConfigurationParametersApiModel** | [**SearchConfigurationParametersApiModel**](SearchConfigurationParametersApiModel.md)|  | [optional] |

### Return type

[**ConfigurationParameterPreviewApiResultIReply**](ConfigurationParameterPreviewApiResultIReply.md)

### Authorization


Configure PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""
Configure Identity.Application:
    ApiClient.apiKey["backoffice"] = ""
    ApiClient.apiKeyPrefix["backoffice"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

