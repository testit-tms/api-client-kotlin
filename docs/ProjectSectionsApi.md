# ProjectSectionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSectionsByProjectId**](ProjectSectionsApi.md#getSectionsByProjectId) | **GET** /api/v2/projects/{projectId}/sections | Get project sections |


<a id="getSectionsByProjectId"></a>
# **getSectionsByProjectId**
> kotlin.collections.List&lt;SectionModel&gt; getSectionsByProjectId(projectId, skip, take, orderBy, searchField, searchValue)

Get project sections

  Use case    User sets project internal or global identifier and runs method execution    System search project    System search all sections related to the project    System returns array of sections (listed in response)

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectSectionsApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
try {
    val result : kotlin.collections.List<SectionModel> = apiInstance.getSectionsByProjectId(projectId, skip, take, orderBy, searchField, searchValue)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectSectionsApi#getSectionsByProjectId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectSectionsApi#getSectionsByProjectId")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |

### Return type

[**kotlin.collections.List&lt;SectionModel&gt;**](SectionModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

