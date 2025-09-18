
# AutoTestResultReasonProjectApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Failure category identifier |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **failureCategory** | [**FailureCategory**](FailureCategory.md) | Category type |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Failure category creation date |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Failure category creator identifier |  |
| **projects** | [**kotlin.collections.List&lt;ProjectNameApiResult&gt;**](ProjectNameApiResult.md) | Projects names |  |
| **failureClassRegexes** | [**kotlin.collections.List&lt;FailureClassRegexApiResult&gt;**](FailureClassRegexApiResult.md) | Failure category regexes |  |
| **name** | **kotlin.String** | Failure category name |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Failure category last modification date |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Failure category last modifier identifier |  [optional] |



