# UserRoleAssignmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2UsersUserIdRolesRoleIdDelete**](UserRoleAssignmentsApi.md#apiV2UsersUserIdRolesRoleIdDelete) | **DELETE** /api/v2/users/{userId}/roles/{roleId} |  |
| [**apiV2UsersUserIdRolesRoleIdPost**](UserRoleAssignmentsApi.md#apiV2UsersUserIdRolesRoleIdPost) | **POST** /api/v2/users/{userId}/roles/{roleId} |  |


<a id="apiV2UsersUserIdRolesRoleIdDelete"></a>
# **apiV2UsersUserIdRolesRoleIdDelete**
> apiV2UsersUserIdRolesRoleIdDelete(userId, roleId)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UserRoleAssignmentsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val roleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2UsersUserIdRolesRoleIdDelete(userId, roleId)
} catch (e: ClientException) {
    println("4xx response calling UserRoleAssignmentsApi#apiV2UsersUserIdRolesRoleIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRoleAssignmentsApi#apiV2UsersUserIdRolesRoleIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2UsersUserIdRolesRoleIdPost"></a>
# **apiV2UsersUserIdRolesRoleIdPost**
> apiV2UsersUserIdRolesRoleIdPost(userId, roleId)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = UserRoleAssignmentsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val roleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2UsersUserIdRolesRoleIdPost(userId, roleId)
} catch (e: ClientException) {
    println("4xx response calling UserRoleAssignmentsApi#apiV2UsersUserIdRolesRoleIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserRoleAssignmentsApi#apiV2UsersUserIdRolesRoleIdPost")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

