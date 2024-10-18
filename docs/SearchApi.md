# SearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SearchGlobalSearchPost**](SearchApi.md#apiV2SearchGlobalSearchPost) | **POST** /api/v2/search/globalSearch |  |


<a id="apiV2SearchGlobalSearchPost"></a>
# **apiV2SearchGlobalSearchPost**
> GlobalSearchResponse apiV2SearchGlobalSearchPost(globalSearchRequest)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = SearchApi()
val globalSearchRequest : GlobalSearchRequest =  // GlobalSearchRequest | 
try {
    val result : GlobalSearchResponse = apiInstance.apiV2SearchGlobalSearchPost(globalSearchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#apiV2SearchGlobalSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#apiV2SearchGlobalSearchPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **globalSearchRequest** | [**GlobalSearchRequest**](GlobalSearchRequest.md)|  | [optional] |

### Return type

[**GlobalSearchResponse**](GlobalSearchResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

