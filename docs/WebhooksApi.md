# WebhooksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2WebhooksDelete**](WebhooksApi.md#apiV2WebhooksDelete) | **DELETE** /api/v2/webhooks |  |
| [**apiV2WebhooksGet**](WebhooksApi.md#apiV2WebhooksGet) | **GET** /api/v2/webhooks | Get all webhooks |
| [**apiV2WebhooksIdDelete**](WebhooksApi.md#apiV2WebhooksIdDelete) | **DELETE** /api/v2/webhooks/{id} | Delete webhook by ID |
| [**apiV2WebhooksIdGet**](WebhooksApi.md#apiV2WebhooksIdGet) | **GET** /api/v2/webhooks/{id} | Get webhook by ID |
| [**apiV2WebhooksIdPut**](WebhooksApi.md#apiV2WebhooksIdPut) | **PUT** /api/v2/webhooks/{id} | Edit webhook by ID |
| [**apiV2WebhooksPost**](WebhooksApi.md#apiV2WebhooksPost) | **POST** /api/v2/webhooks | Create webhook |
| [**apiV2WebhooksPut**](WebhooksApi.md#apiV2WebhooksPut) | **PUT** /api/v2/webhooks |  |
| [**apiV2WebhooksSearchPost**](WebhooksApi.md#apiV2WebhooksSearchPost) | **POST** /api/v2/webhooks/search | Search for webhooks |
| [**apiV2WebhooksSpecialVariablesGet**](WebhooksApi.md#apiV2WebhooksSpecialVariablesGet) | **GET** /api/v2/webhooks/specialVariables | Get special variables for webhook event type |
| [**apiV2WebhooksTestPost**](WebhooksApi.md#apiV2WebhooksTestPost) | **POST** /api/v2/webhooks/test | Test webhook&#39;s url |


<a id="apiV2WebhooksDelete"></a>
# **apiV2WebhooksDelete**
> apiV2WebhooksDelete(webhooksDeleteRequest)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val webhooksDeleteRequest : WebhooksDeleteRequest =  // WebhooksDeleteRequest | 
try {
    apiInstance.apiV2WebhooksDelete(webhooksDeleteRequest)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhooksDeleteRequest** | [**WebhooksDeleteRequest**](WebhooksDeleteRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WebhooksGet"></a>
# **apiV2WebhooksGet**
> kotlin.collections.List&lt;WebHookModel&gt; apiV2WebhooksGet(projectId)

Get all webhooks

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project unique ID
try {
    val result : kotlin.collections.List<WebHookModel> = apiInstance.apiV2WebhooksGet(projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectId** | **java.util.UUID**| Project unique ID | [optional] |

### Return type

[**kotlin.collections.List&lt;WebHookModel&gt;**](WebHookModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WebhooksIdDelete"></a>
# **apiV2WebhooksIdDelete**
> apiV2WebhooksIdDelete(id)

Delete webhook by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook unique ID
try {
    apiInstance.apiV2WebhooksIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksIdDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Webhook unique ID | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WebhooksIdGet"></a>
# **apiV2WebhooksIdGet**
> WebHookModel apiV2WebhooksIdGet(id)

Get webhook by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook unique ID
try {
    val result : WebHookModel = apiInstance.apiV2WebhooksIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Webhook unique ID | |

### Return type

[**WebHookModel**](WebHookModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WebhooksIdPut"></a>
# **apiV2WebhooksIdPut**
> WebHookModel apiV2WebhooksIdPut(id, webHookPostModel)

Edit webhook by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook unique ID
val webHookPostModel : WebHookPostModel =  // WebHookPostModel | 
try {
    val result : WebHookModel = apiInstance.apiV2WebhooksIdPut(id, webHookPostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Webhook unique ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webHookPostModel** | [**WebHookPostModel**](WebHookPostModel.md)|  | [optional] |

### Return type

[**WebHookModel**](WebHookModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WebhooksPost"></a>
# **apiV2WebhooksPost**
> WebHookModel apiV2WebhooksPost(webHookPostModel)

Create webhook

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val webHookPostModel : WebHookPostModel =  // WebHookPostModel | 
try {
    val result : WebHookModel = apiInstance.apiV2WebhooksPost(webHookPostModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webHookPostModel** | [**WebHookPostModel**](WebHookPostModel.md)|  | [optional] |

### Return type

[**WebHookModel**](WebHookModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WebhooksPut"></a>
# **apiV2WebhooksPut**
> WebhooksUpdateResponse apiV2WebhooksPut(webhooksUpdateRequest)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val webhooksUpdateRequest : WebhooksUpdateRequest =  // WebhooksUpdateRequest | 
try {
    val result : WebhooksUpdateResponse = apiInstance.apiV2WebhooksPut(webhooksUpdateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhooksUpdateRequest** | [**WebhooksUpdateRequest**](WebhooksUpdateRequest.md)|  | [optional] |

### Return type

[**WebhooksUpdateResponse**](WebhooksUpdateResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WebhooksSearchPost"></a>
# **apiV2WebhooksSearchPost**
> kotlin.collections.List&lt;WebHookModel&gt; apiV2WebhooksSearchPost(skip, take, orderBy, searchField, searchValue, searchWebhooksQueryModel)

Search for webhooks

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val searchWebhooksQueryModel : SearchWebhooksQueryModel =  // SearchWebhooksQueryModel | 
try {
    val result : kotlin.collections.List<WebHookModel> = apiInstance.apiV2WebhooksSearchPost(skip, take, orderBy, searchField, searchValue, searchWebhooksQueryModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksSearchPost")
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
| **searchWebhooksQueryModel** | [**SearchWebhooksQueryModel**](SearchWebhooksQueryModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;WebHookModel&gt;**](WebHookModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2WebhooksSpecialVariablesGet"></a>
# **apiV2WebhooksSpecialVariablesGet**
> kotlin.collections.List&lt;kotlin.String&gt; apiV2WebhooksSpecialVariablesGet(eventType, variablesType)

Get special variables for webhook event type

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val eventType : WebHookEventType =  // WebHookEventType | Webhook event type
val variablesType : WebhookVariablesType =  // WebhookVariablesType | 
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.apiV2WebhooksSpecialVariablesGet(eventType, variablesType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksSpecialVariablesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksSpecialVariablesGet")
    e.printStackTrace()
}
```

### Parameters
| **eventType** | [**WebHookEventType**](.md)| Webhook event type | [optional] [enum: AutomatedTestRunCreated, TestPlansStatusChanged, TestRunStopped, TestPointAssigned, TestResultJiraIssueCreated, AutoTestFinished, UserMentionedInComment, UserSelectedInWorkItemAttribute, AllTestPointsFinished, AllAutoTestsFinished, AutoTestChanged, WorkItemAutoTestRelationChanged, WorkItemAttributeChanged, WorkItemChanged, ConfigurationChanged, ProjectChanged, TestPlanChanged] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **variablesType** | [**WebhookVariablesType**](.md)|  | [optional] [enum: VariablesForUrl, VariablesForHeaders, VariablesForBody] |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2WebhooksTestPost"></a>
# **apiV2WebhooksTestPost**
> WebhookResponse apiV2WebhooksTestPost(webHookTestModel)

Test webhook&#39;s url

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = WebhooksApi()
val webHookTestModel : WebHookTestModel =  // WebHookTestModel | 
try {
    val result : WebhookResponse = apiInstance.apiV2WebhooksTestPost(webHookTestModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#apiV2WebhooksTestPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#apiV2WebhooksTestPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webHookTestModel** | [**WebHookTestModel**](WebHookTestModel.md)|  | [optional] |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

