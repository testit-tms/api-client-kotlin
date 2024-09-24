# AttachmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2AttachmentsIdDelete**](AttachmentsApi.md#apiV2AttachmentsIdDelete) | **DELETE** /api/v2/attachments/{id} | Delete attachment file |
| [**apiV2AttachmentsIdGet**](AttachmentsApi.md#apiV2AttachmentsIdGet) | **GET** /api/v2/attachments/{id} | Download attachment file |
| [**apiV2AttachmentsOccupiedFileStorageSizeGet**](AttachmentsApi.md#apiV2AttachmentsOccupiedFileStorageSizeGet) | **GET** /api/v2/attachments/occupiedFileStorageSize | Get size of attachments storage in bytes |
| [**apiV2AttachmentsPost**](AttachmentsApi.md#apiV2AttachmentsPost) | **POST** /api/v2/attachments | Upload new attachment file |


<a id="apiV2AttachmentsIdDelete"></a>
# **apiV2AttachmentsIdDelete**
> apiV2AttachmentsIdDelete(id)

Delete attachment file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiV2AttachmentsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#apiV2AttachmentsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#apiV2AttachmentsIdDelete")
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

<a id="apiV2AttachmentsIdGet"></a>
# **apiV2AttachmentsIdGet**
> apiV2AttachmentsIdGet(id, width, height, resizeType, backgroundColor, preview)

Download attachment file

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val width : kotlin.Int = 56 // kotlin.Int | Width of the result image
val height : kotlin.Int = 56 // kotlin.Int | Height of the result image
val resizeType : ImageResizeType =  // ImageResizeType | Type of resizing to apply to the result image
val backgroundColor : kotlin.String = backgroundColor_example // kotlin.String | Color of the background if the `resizeType` is `AddBackgroundStripes`
val preview : kotlin.Boolean = true // kotlin.Boolean | If image must be converted to a preview (lower quality, no animation)
try {
    apiInstance.apiV2AttachmentsIdGet(id, width, height, resizeType, backgroundColor, preview)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#apiV2AttachmentsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#apiV2AttachmentsIdGet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="apiV2AttachmentsOccupiedFileStorageSizeGet"></a>
# **apiV2AttachmentsOccupiedFileStorageSizeGet**
> kotlin.Long apiV2AttachmentsOccupiedFileStorageSizeGet()

Get size of attachments storage in bytes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentsApi()
try {
    val result : kotlin.Long = apiInstance.apiV2AttachmentsOccupiedFileStorageSizeGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#apiV2AttachmentsOccupiedFileStorageSizeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#apiV2AttachmentsOccupiedFileStorageSizeGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Long**

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2AttachmentsPost"></a>
# **apiV2AttachmentsPost**
> AttachmentModel apiV2AttachmentsPost(file)

Upload new attachment file

File size is restricted to 50 MB (52 428 800 bytes)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttachmentsApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : AttachmentModel = apiInstance.apiV2AttachmentsPost(file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#apiV2AttachmentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#apiV2AttachmentsPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

[**AttachmentModel**](AttachmentModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

