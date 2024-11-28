# TestResultsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost**](TestResultsApi.md#apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost) | **POST** /api/v2/testResults/external-projects/{externalProjectId}/defects/external-forms |  |
| [**apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost**](TestResultsApi.md#apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost) | **POST** /api/v2/testResults/external-projects/{externalProjectId}/defects |  |
| [**apiV2TestResultsIdAggregatedGet**](TestResultsApi.md#apiV2TestResultsIdAggregatedGet) | **GET** /api/v2/testResults/{id}/aggregated | Get test result by ID aggregated with previous results |
| [**apiV2TestResultsIdAttachmentsAttachmentIdPut**](TestResultsApi.md#apiV2TestResultsIdAttachmentsAttachmentIdPut) | **PUT** /api/v2/testResults/{id}/attachments/{attachmentId} | Attach file to the test result |
| [**apiV2TestResultsIdAttachmentsInfoGet**](TestResultsApi.md#apiV2TestResultsIdAttachmentsInfoGet) | **GET** /api/v2/testResults/{id}/attachments/info | Get test result attachments meta-information |
| [**apiV2TestResultsIdGet**](TestResultsApi.md#apiV2TestResultsIdGet) | **GET** /api/v2/testResults/{id} | Get test result by ID |
| [**apiV2TestResultsIdPut**](TestResultsApi.md#apiV2TestResultsIdPut) | **PUT** /api/v2/testResults/{id} | Edit test result by ID |
| [**apiV2TestResultsIdRerunsGet**](TestResultsApi.md#apiV2TestResultsIdRerunsGet) | **GET** /api/v2/testResults/{id}/reruns | Get reruns |
| [**apiV2TestResultsSearchPost**](TestResultsApi.md#apiV2TestResultsSearchPost) | **POST** /api/v2/testResults/search | Search for test results |
| [**apiV2TestResultsStatisticsFilterPost**](TestResultsApi.md#apiV2TestResultsStatisticsFilterPost) | **POST** /api/v2/testResults/statistics/filter | Search for test results and extract statistics |
| [**createAttachment**](TestResultsApi.md#createAttachment) | **POST** /api/v2/testResults/{id}/attachments | Upload and link attachment to TestResult |
| [**deleteAttachment**](TestResultsApi.md#deleteAttachment) | **DELETE** /api/v2/testResults/{id}/attachments/{attachmentId} | Remove attachment and unlink from TestResult |
| [**downloadAttachment**](TestResultsApi.md#downloadAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId} | Get attachment of TestResult |
| [**getAttachment**](TestResultsApi.md#getAttachment) | **GET** /api/v2/testResults/{id}/attachments/{attachmentId}/info | Get Metadata of TestResult&#39;s attachment |
| [**getAttachments**](TestResultsApi.md#getAttachments) | **GET** /api/v2/testResults/{id}/attachments | Get all attachments of TestResult |


<a id="apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost"></a>
# **apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost**
> GetExternalFormApiResult apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost(externalProjectId, testResultsSelectApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val externalProjectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val testResultsSelectApiModel : TestResultsSelectApiModel =  // TestResultsSelectApiModel | 
try {
    val result : GetExternalFormApiResult = apiInstance.apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost(externalProjectId, testResultsSelectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsExternalProjectsExternalProjectIdDefectsExternalFormsPost")
    e.printStackTrace()
}
```

### Parameters
| **externalProjectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testResultsSelectApiModel** | [**TestResultsSelectApiModel**](TestResultsSelectApiModel.md)|  | [optional] |

### Return type

[**GetExternalFormApiResult**](GetExternalFormApiResult.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost"></a>
# **apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost**
> DefectApiModel apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost(externalProjectId, createDefectApiModel)



### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val externalProjectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createDefectApiModel : CreateDefectApiModel =  // CreateDefectApiModel | 
try {
    val result : DefectApiModel = apiInstance.apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost(externalProjectId, createDefectApiModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsExternalProjectsExternalProjectIdDefectsPost")
    e.printStackTrace()
}
```

### Parameters
| **externalProjectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createDefectApiModel** | [**CreateDefectApiModel**](CreateDefectApiModel.md)|  | [optional] |

### Return type

[**DefectApiModel**](DefectApiModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestResultsIdAggregatedGet"></a>
# **apiV2TestResultsIdAggregatedGet**
> TestResultResponse apiV2TestResultsIdAggregatedGet(id)

Get test result by ID aggregated with previous results

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test result unique ID
try {
    val result : TestResultResponse = apiInstance.apiV2TestResultsIdAggregatedGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsIdAggregatedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsIdAggregatedGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test result unique ID | |

### Return type

[**TestResultResponse**](TestResultResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestResultsIdAttachmentsAttachmentIdPut"></a>
# **apiV2TestResultsIdAttachmentsAttachmentIdPut**
> apiV2TestResultsIdAttachmentsAttachmentIdPut(id, attachmentId)

Attach file to the test result

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test result unique ID
val attachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Attachment unique ID
try {
    apiInstance.apiV2TestResultsIdAttachmentsAttachmentIdPut(id, attachmentId)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsIdAttachmentsAttachmentIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsIdAttachmentsAttachmentIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test result unique ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attachmentId** | **java.util.UUID**| Attachment unique ID | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestResultsIdAttachmentsInfoGet"></a>
# **apiV2TestResultsIdAttachmentsInfoGet**
> kotlin.collections.List&lt;AttachmentModel&gt; apiV2TestResultsIdAttachmentsInfoGet(id)

Get test result attachments meta-information

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test result unique ID
try {
    val result : kotlin.collections.List<AttachmentModel> = apiInstance.apiV2TestResultsIdAttachmentsInfoGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsIdAttachmentsInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsIdAttachmentsInfoGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test result unique ID | |

### Return type

[**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestResultsIdGet"></a>
# **apiV2TestResultsIdGet**
> TestResultResponse apiV2TestResultsIdGet(id)

Get test result by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test result unique ID
try {
    val result : TestResultResponse = apiInstance.apiV2TestResultsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsIdGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test result unique ID | |

### Return type

[**TestResultResponse**](TestResultResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestResultsIdPut"></a>
# **apiV2TestResultsIdPut**
> apiV2TestResultsIdPut(id, testResultUpdateV2Request)

Edit test result by ID

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test result unique ID
val testResultUpdateV2Request : TestResultUpdateV2Request =  // TestResultUpdateV2Request | 
try {
    apiInstance.apiV2TestResultsIdPut(id, testResultUpdateV2Request)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsIdPut")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test result unique ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testResultUpdateV2Request** | [**TestResultUpdateV2Request**](TestResultUpdateV2Request.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestResultsIdRerunsGet"></a>
# **apiV2TestResultsIdRerunsGet**
> RerunsModel apiV2TestResultsIdRerunsGet(id)

Get reruns

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test result unique ID
try {
    val result : RerunsModel = apiInstance.apiV2TestResultsIdRerunsGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsIdRerunsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsIdRerunsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test result unique ID | |

### Return type

[**RerunsModel**](RerunsModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TestResultsSearchPost"></a>
# **apiV2TestResultsSearchPost**
> kotlin.collections.List&lt;TestResultShortResponse&gt; apiV2TestResultsSearchPost(skip, take, orderBy, searchField, searchValue, testResultsFilterRequest)

Search for test results

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val testResultsFilterRequest : TestResultsFilterRequest =  // TestResultsFilterRequest | 
try {
    val result : kotlin.collections.List<TestResultShortResponse> = apiInstance.apiV2TestResultsSearchPost(skip, take, orderBy, searchField, searchValue, testResultsFilterRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsSearchPost")
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
| **testResultsFilterRequest** | [**TestResultsFilterRequest**](TestResultsFilterRequest.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;TestResultShortResponse&gt;**](TestResultShortResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TestResultsStatisticsFilterPost"></a>
# **apiV2TestResultsStatisticsFilterPost**
> TestResultsStatisticsResponse apiV2TestResultsStatisticsFilterPost(testResultsFilterRequest)

Search for test results and extract statistics

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val testResultsFilterRequest : TestResultsFilterRequest =  // TestResultsFilterRequest | 
try {
    val result : TestResultsStatisticsResponse = apiInstance.apiV2TestResultsStatisticsFilterPost(testResultsFilterRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#apiV2TestResultsStatisticsFilterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#apiV2TestResultsStatisticsFilterPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **testResultsFilterRequest** | [**TestResultsFilterRequest**](TestResultsFilterRequest.md)|  | [optional] |

### Return type

[**TestResultsStatisticsResponse**](TestResultsStatisticsResponse.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAttachment"></a>
# **createAttachment**
> createAttachment(id, file)

Upload and link attachment to TestResult

 Use case   User sets testResultId   User attaches a file   System creates attachment and links it to the test result   System returns attachment identifier

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test result internal identifier (guid format)
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Select file
try {
    apiInstance.createAttachment(id, file)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#createAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#createAttachment")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test result internal identifier (guid format) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| Select file | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="deleteAttachment"></a>
# **deleteAttachment**
> deleteAttachment(id, attachmentId)

Remove attachment and unlink from TestResult

 Use case   User sets testResultId and attachmentId   User attaches a file   User runs method execution   System deletes attachment and unlinks it from the test result   System returns attachment identifier

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test result internal identifier (guid format)
val attachmentId : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Attachment internal identifier (guid format)
try {
    apiInstance.deleteAttachment(id, attachmentId)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#deleteAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#deleteAttachment")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test result internal identifier (guid format) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attachmentId** | **java.util.UUID**| Attachment internal identifier (guid format) | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadAttachment"></a>
# **downloadAttachment**
> downloadAttachment(attachmentId, id, width, height, resizeType, backgroundColor, preview)

Get attachment of TestResult

 Use case   User sets attachmentId and testResultId   [Optional] User sets resize configuration   User runs method execution   System search attachments by the attachmentId and the testResultId                         [Optional] If resize configuration is set, System resizes the attachment according to the resize                      configuration                     [Optional] Otherwise, System does not resize the attachment   System returns attachment as a file

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val attachmentId : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Attachment internal identifier (guid format)
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test result internal identifier (guid format)
val width : kotlin.Int = 56 // kotlin.Int | Width of the result image
val height : kotlin.Int = 56 // kotlin.Int | Height of the result image
val resizeType : ImageResizeType =  // ImageResizeType | Type of resizing to apply to the result image
val backgroundColor : kotlin.String = backgroundColor_example // kotlin.String | Color of the background if the `resizeType` is `AddBackgroundStripes`
val preview : kotlin.Boolean = true // kotlin.Boolean | If image must be converted to a preview (lower quality, no animation)
try {
    apiInstance.downloadAttachment(attachmentId, id, width, height, resizeType, backgroundColor, preview)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#downloadAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#downloadAttachment")
    e.printStackTrace()
}
```

### Parameters
| **attachmentId** | **java.util.UUID**| Attachment internal identifier (guid format) | |
| **id** | **java.util.UUID**| Test result internal identifier (guid format) | |
| **width** | **kotlin.Int**| Width of the result image | [optional] |
| **height** | **kotlin.Int**| Height of the result image | [optional] |
| **resizeType** | [**ImageResizeType**](.md)| Type of resizing to apply to the result image | [optional] [enum: Crop, AddBackgroundStripes] |
| **backgroundColor** | **kotlin.String**| Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **preview** | **kotlin.Boolean**| If image must be converted to a preview (lower quality, no animation) | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAttachment"></a>
# **getAttachment**
> AttachmentModel getAttachment(id, attachmentId)

Get Metadata of TestResult&#39;s attachment

 Use case   User sets attachmentId and testResultId   User runs method execution   System search attachment by the attachmentId and the testResultId   System returns attachment data

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test result internal identifier (guid format)
val attachmentId : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Attachment internal identifier (guid format)
try {
    val result : AttachmentModel = apiInstance.getAttachment(id, attachmentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#getAttachment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#getAttachment")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**| Test result internal identifier (guid format) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attachmentId** | **java.util.UUID**| Attachment internal identifier (guid format) | |

### Return type

[**AttachmentModel**](AttachmentModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAttachments"></a>
# **getAttachments**
> kotlin.collections.List&lt;AttachmentModel&gt; getAttachments(id)

Get all attachments of TestResult

 Use case   User sets testResultId   User runs method execution   System search all attachments of the test result   System returns attachments enumeration

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = TestResultsApi()
val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test result internal identifier (guid format)
try {
    val result : kotlin.collections.List<AttachmentModel> = apiInstance.getAttachments(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TestResultsApi#getAttachments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TestResultsApi#getAttachments")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **java.util.UUID**| Test result internal identifier (guid format) | |

### Return type

[**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

