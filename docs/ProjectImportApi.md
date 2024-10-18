# ProjectImportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**backgroundImportToExistingProject**](ProjectImportApi.md#backgroundImportToExistingProject) | **POST** /api/v2/projects/{projectId}/import/json | Import project from JSON file into existing project in background job |
| [**backgroundImportZipToExistingProject**](ProjectImportApi.md#backgroundImportZipToExistingProject) | **POST** /api/v2/projects/{projectId}/import/zip | Import project from Zip file into existing project in background job |
| [**importToExistingProject**](ProjectImportApi.md#importToExistingProject) | **POST** /api/v2/projects/{projectId}/import | Import project from JSON file into existing project |


<a id="backgroundImportToExistingProject"></a>
# **backgroundImportToExistingProject**
> java.util.UUID backgroundImportToExistingProject(projectId, file)

Import project from JSON file into existing project in background job

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectImportApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Select file
try {
    val result : java.util.UUID = apiInstance.backgroundImportToExistingProject(projectId, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectImportApi#backgroundImportToExistingProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectImportApi#backgroundImportToExistingProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| Select file | [optional] |

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="backgroundImportZipToExistingProject"></a>
# **backgroundImportZipToExistingProject**
> java.util.UUID backgroundImportZipToExistingProject(projectId, file)

Import project from Zip file into existing project in background job

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectImportApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Select file
try {
    val result : java.util.UUID = apiInstance.backgroundImportZipToExistingProject(projectId, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectImportApi#backgroundImportZipToExistingProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectImportApi#backgroundImportZipToExistingProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| Select file | [optional] |

### Return type

[**java.util.UUID**](java.util.UUID.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="importToExistingProject"></a>
# **importToExistingProject**
> importToExistingProject(projectId, includeAttachments, file)

Import project from JSON file into existing project

 Use case   User attaches project as json file taken from export or export-by-testPlans method   User runs method execution   System updates project   System returns no content response

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectImportApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val includeAttachments : kotlin.Boolean = true // kotlin.Boolean | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Select file
try {
    apiInstance.importToExistingProject(projectId, includeAttachments, file)
} catch (e: ClientException) {
    println("4xx response calling ProjectImportApi#importToExistingProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectImportApi#importToExistingProject")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| **includeAttachments** | **kotlin.Boolean**|  | [optional] |
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

