
# TestPlanWithAnalyticModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **analytic** | [**TestPointAnalyticResult**](TestPointAnalyticResult.md) |  |  |
| **status** | [**TestPlanStatusModel**](TestPlanStatusModel.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **globalId** | **kotlin.Long** | Used for search Test plan |  |
| **isDeleted** | **kotlin.Boolean** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Set when test plan is starter (status changed to: In Progress) |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | set when test plan status is completed (status changed to: Completed) |  [optional] |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **lockedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **lockedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **tags** | [**kotlin.collections.List&lt;TagPostModel&gt;**](TagPostModel.md) |  |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Used for analytics |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Used for analytics |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **build** | **kotlin.String** |  |  [optional] |
| **productName** | **kotlin.String** |  |  [optional] |
| **hasAutomaticDurationTimer** | **kotlin.Boolean** |  |  [optional] |



