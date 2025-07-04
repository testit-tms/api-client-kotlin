# ProjectAttributeTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsProjectIdAttributesTemplatesSearchPost**](ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesSearchPost) | **POST** /api/v2/projects/{projectId}/attributes/templates/search | Search for custom attributes templates |
| [**apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete**](ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete) | **DELETE** /api/v2/projects/{projectId}/attributes/templates/{templateId} | Delete CustomAttributeTemplate from Project |
| [**apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost**](ProjectAttributeTemplatesApi.md#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost) | **POST** /api/v2/projects/{projectId}/attributes/templates/{templateId} | Add CustomAttributeTemplate to Project |


<a id="apiV2ProjectsProjectIdAttributesTemplatesSearchPost"></a>
# **apiV2ProjectsProjectIdAttributesTemplatesSearchPost**
> kotlin.collections.List&lt;ProjectCustomAttributeTemplateGetModel&gt; apiV2ProjectsProjectIdAttributesTemplatesSearchPost(projectId, skip, take, orderBy, searchField, searchValue, projectCustomAttributesTemplatesFilterModel)

Search for custom attributes templates

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributeTemplatesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | 
val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
val projectCustomAttributesTemplatesFilterModel : ProjectCustomAttributesTemplatesFilterModel =  // ProjectCustomAttributesTemplatesFilterModel | 
try {
    val result : kotlin.collections.List<ProjectCustomAttributeTemplateGetModel> = apiInstance.apiV2ProjectsProjectIdAttributesTemplatesSearchPost(projectId, skip, take, orderBy, searchField, searchValue, projectCustomAttributesTemplatesFilterModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesSearchPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**|  | |
| **skip** | **kotlin.Int**| Amount of items to be skipped (offset) | [optional] |
| **take** | **kotlin.Int**| Amount of items to be taken (limit) | [optional] |
| **orderBy** | **kotlin.String**| SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) | [optional] |
| **searchField** | **kotlin.String**| Property name for searching | [optional] |
| **searchValue** | **kotlin.String**| Value for searching | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectCustomAttributesTemplatesFilterModel** | [**ProjectCustomAttributesTemplatesFilterModel**](ProjectCustomAttributesTemplatesFilterModel.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ProjectCustomAttributeTemplateGetModel&gt;**](ProjectCustomAttributeTemplateGetModel.md)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete"></a>
# **apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete**
> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(projectId, templateId)

Delete CustomAttributeTemplate from Project

 Use case  User sets project internal or global identifier  User sets attribute template internal identifier  User runs method execution  System delete attribute template from project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributeTemplatesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | CustomAttributeTemplate internal (UUID) identifier
try {
    apiInstance.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(projectId, templateId)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **java.util.UUID**| CustomAttributeTemplate internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost"></a>
# **apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost**
> apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(projectId, templateId)

Add CustomAttributeTemplate to Project

 Use case  User sets project internal or global identifier  User sets attribute template internal identifier  User runs method execution  System add attribute template to project

### Example
```kotlin
// Import classes:
//import ru.testit.kotlin.client.infrastructure.*
//import ru.testit.kotlin.client.models.*

val apiInstance = ProjectAttributeTemplatesApi()
val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | CustomAttributeTemplate internal (UUID) identifier
try {
    apiInstance.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(projectId, templateId)
} catch (e: ClientException) {
    println("4xx response calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectAttributeTemplatesApi#apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **kotlin.String**| Project internal (UUID) or global (integer) identifier | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateId** | **java.util.UUID**| CustomAttributeTemplate internal (UUID) identifier | |

### Return type

null (empty response body)

### Authorization


Configure Bearer or PrivateToken:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

