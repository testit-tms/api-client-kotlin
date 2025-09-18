# NotificationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2NotificationsCountGet**](NotificationsApi.md#apiV2NotificationsCountGet) | **GET** /api/v2/notifications/count | Get unread Notifications total in last 7 days |
| [**apiV2NotificationsGet**](NotificationsApi.md#apiV2NotificationsGet) | **GET** /api/v2/notifications | Get all Notifications for current User |
| [**apiV2NotificationsIdReadPost**](NotificationsApi.md#apiV2NotificationsIdReadPost) | **POST** /api/v2/notifications/{id}/read | Set Notification as read |
| [**apiV2NotificationsReadPost**](NotificationsApi.md#apiV2NotificationsReadPost) | **POST** /api/v2/notifications/read | Set all Notifications as read |
| [**apiV2NotificationsSearchPost**](NotificationsApi.md#apiV2NotificationsSearchPost) | **POST** /api/v2/notifications/search | Search Notifications for current User |


<a id="apiV2NotificationsCountGet"></a>
# **apiV2NotificationsCountGet**
> kotlin.Int apiV2NotificationsCountGet(isRead)

Get unread Notifications total in last 7 days

  Use case    User runs method execution    System returns unread notifications total (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = NotificationsApi()
val isRead : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Int = apiInstance.apiV2NotificationsCountGet(isRead)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#apiV2NotificationsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#apiV2NotificationsCountGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isRead** | **kotlin.Boolean**|  | [optional] |

### Return type

**kotlin.Int**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2NotificationsGet"></a>
# **apiV2NotificationsGet**
> kotlin.collections.List&lt;NotificationModel&gt; apiV2NotificationsGet(notificationType, skip, take, orderBy, searchField, searchValue)

Get all Notifications for current User

  Use case    User runs method execution    System returns notifications (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = NotificationsApi()
val notificationType : NotificationTypeModel =  // NotificationTypeModel | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<NotificationModel> = apiInstance.apiV2NotificationsGet(notificationType, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#apiV2NotificationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#apiV2NotificationsGet")
    e.printStackTrace()
}
```

### Parameters
| **notificationType** | [**NotificationTypeModel**](.md)|  | [optional] [enum: MentionInComment, TestPointIsSetInTestPlan, MentionInCustomAttribute, TestPlanUnlockRequest] |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;NotificationModel&gt;**](NotificationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2NotificationsIdReadPost"></a>
# **apiV2NotificationsIdReadPost**
> apiV2NotificationsIdReadPost(id)

Set Notification as read

  Use case    User sets notification internal (guid format) identifier    User runs method execution    System set notification as read

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = NotificationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2NotificationsIdReadPost(id)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#apiV2NotificationsIdReadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#apiV2NotificationsIdReadPost")
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


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2NotificationsReadPost"></a>
# **apiV2NotificationsReadPost**
> apiV2NotificationsReadPost()

Set all Notifications as read

  Use case    User runs method execution    System set all notifications as read

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = NotificationsApi()
try {
    apiInstance.apiV2NotificationsReadPost()
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#apiV2NotificationsReadPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#apiV2NotificationsReadPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2NotificationsSearchPost"></a>
# **apiV2NotificationsSearchPost**
> kotlin.collections.List&lt;NotificationModel&gt; apiV2NotificationsSearchPost(skip, take, orderBy, searchField, searchValue, notificationQueryFilterModel)

Search Notifications for current User

  Use case    User set filter and runs method execution    System returns notifications (listed in the response example)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = NotificationsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val notificationQueryFilterModel : NotificationQueryFilterModel =  // NotificationQueryFilterModel | 
try {
    val result : kotlin.collections.List<NotificationModel> = apiInstance.apiV2NotificationsSearchPost(skip, take, orderBy, searchField, searchValue, notificationQueryFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationsApi#apiV2NotificationsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsApi#apiV2NotificationsSearchPost")
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
| **notificationQueryFilterModel** | [**NotificationQueryFilterModel**](NotificationQueryFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;NotificationModel&gt;**](NotificationModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

