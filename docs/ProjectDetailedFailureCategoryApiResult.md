
# ProjectDetailedFailureCategoryApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Failure category identifier |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **failureCategory** | [**FailureCategory**](FailureCategory.md) | Category type |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Failure category creation date |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Failure category creator identifier |  |
| **failureClassRegexes** | [**kotlin.collections.List&lt;FailureClassRegexApiResult&gt;**](FailureClassRegexApiResult.md) | Failure category regexes |  |
| **projectsCount** | **kotlin.Int** | Projects relations count |  |
| **name** | **kotlin.String** | Failure category name |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Failure category last modification date |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Failure category last modifier identifier |  [optional] |



