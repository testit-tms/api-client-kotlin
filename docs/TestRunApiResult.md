
# TestRunApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the entity |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **build** | **kotlin.String** |  |  |
| **stateName** | [**TestRunState**](TestRunState.md) |  |  |
| **status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestApiResult&gt;**](AutoTestApiResult.md) |  |  |
| **autoTestsCount** | **kotlin.Int** |  |  |
| **testSuiteIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  |
| **isAutomated** | **kotlin.Boolean** |  |  |
| **analytic** | [**TestRunAnalyticApiResult**](TestRunAnalyticApiResult.md) |  |  |
| **testResults** | [**kotlin.collections.List&lt;TestResultApiResult&gt;**](TestResultApiResult.md) |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **startedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **runByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **stoppedByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **launchSource** | **kotlin.String** |  |  [optional] |
| **testPlan** | [**TestPlanApiResult**](TestPlanApiResult.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **createdByUserName** | **kotlin.String** |  |  [optional] |



