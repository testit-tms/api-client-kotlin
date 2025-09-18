# WebhooksLogsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2WebhooksLogsGet**](WebhooksLogsApi.md#apiV2WebhooksLogsGet) | **GET** /api/v2/webhooks/logs | Get last webhook logs |
| [**apiV2WebhooksLogsIdDelete**](WebhooksLogsApi.md#apiV2WebhooksLogsIdDelete) | **DELETE** /api/v2/webhooks/logs/{id} | Delete webhook log by ID |
| [**apiV2WebhooksLogsIdGet**](WebhooksLogsApi.md#apiV2WebhooksLogsIdGet) | **GET** /api/v2/webhooks/logs/{id} | Get webhook log by ID |


<a id="apiV2WebhooksLogsGet"></a>
# **apiV2WebhooksLogsGet**
> kotlin.collections.List&lt;WebhookLogApiResult&gt; apiV2WebhooksLogsGet(projectId, skip, take, orderBy, searchField, searchValue)

Get last webhook logs

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksLogsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project unique ID
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<WebhookLogApiResult> = apiInstance.apiV2WebhooksLogsGet(projectId, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksLogsApi#apiV2WebhooksLogsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksLogsApi#apiV2WebhooksLogsGet")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**| Project unique ID | [optional] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;WebhookLogApiResult&gt;**](WebhookLogApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WebhooksLogsIdDelete"></a>
# **apiV2WebhooksLogsIdDelete**
> apiV2WebhooksLogsIdDelete(id)

Delete webhook log by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksLogsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook log unique ID
try {
    apiInstance.apiV2WebhooksLogsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling WebhooksLogsApi#apiV2WebhooksLogsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksLogsApi#apiV2WebhooksLogsIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Webhook log unique ID | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WebhooksLogsIdGet"></a>
# **apiV2WebhooksLogsIdGet**
> WebhookLogApiResult apiV2WebhooksLogsIdGet(id)

Get webhook log by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksLogsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook log unique ID
try {
    val result : WebhookLogApiResult = apiInstance.apiV2WebhooksLogsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksLogsApi#apiV2WebhooksLogsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksLogsApi#apiV2WebhooksLogsIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Webhook log unique ID | |

### Return type

[**WebhookLogApiResult**](WebhookLogApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

