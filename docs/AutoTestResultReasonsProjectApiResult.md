
# AutoTestResultReasonsProjectApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Failure category identifier |  |
| **failureCategory** | [**FailureCategory**](FailureCategory.md) | Category type |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Failure category creation date |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Failure category creator identifier |  |
| **failureCategoryId** | **kotlin.Int** | Category type index |  |
| **regexCount** | **kotlin.Int** | Regexes count |  |
| **projects** | [**kotlin.collections.List&lt;ProjectNameApiResult&gt;**](ProjectNameApiResult.md) | Projects names |  |
| **projectIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Projects identifiers |  |
| **name** | **kotlin.String** | Failure category name |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Failure category last modification date |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Failure category last modifier identifier |  [optional] |



