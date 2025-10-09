# ExternalIssuesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ExternalIssuesSuggestionsPost**](ExternalIssuesApi.md#apiV2ExternalIssuesSuggestionsPost) | **POST** /api/v2/external-issues/suggestions | Returns list of suggestions from available external issues |


<a id="apiV2ExternalIssuesSuggestionsPost"></a>
# **apiV2ExternalIssuesSuggestionsPost**
> ExternalIssueApiFieldSuggestionReply apiV2ExternalIssuesSuggestionsPost(getExternalIssueSuggestionsApiModel)

Returns list of suggestions from available external issues

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ExternalIssuesApi()
val getExternalIssueSuggestionsApiModel : GetExternalIssueSuggestionsApiModel =  // GetExternalIssueSuggestionsApiModel | 
try {
    val result : ExternalIssueApiFieldSuggestionReply = apiInstance.apiV2ExternalIssuesSuggestionsPost(getExternalIssueSuggestionsApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalIssuesApi#apiV2ExternalIssuesSuggestionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalIssuesApi#apiV2ExternalIssuesSuggestionsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getExternalIssueSuggestionsApiModel** | [**GetExternalIssueSuggestionsApiModel**](GetExternalIssueSuggestionsApiModel.md)|  | [optional] |

### Return type

[**ExternalIssueApiFieldSuggestionReply**](ExternalIssueApiFieldSuggestionReply.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

