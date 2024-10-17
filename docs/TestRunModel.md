
# TestRunModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **autoTestsCount** | **kotlin.Int** |  |  |
| **isAutomated** | **kotlin.Boolean** |  |  |
| **analytic** | [**TestRunAnalyticResultModel**](TestRunAnalyticResultModel.md) |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **build** | **kotlin.String** |  |  |
| **description** | **kotlin.String** |  |  |
| **stateName** | [**TestRunState**](TestRunState.md) |  |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **launchSource** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the entity |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  [optional] |
| **testSuiteIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional] |
| **testResults** | [**kotlin.collections.List&lt;TestResultModel&gt;**](TestResultModel.md) |  |  [optional] |
| **testPlan** | [**TestPlanModel**](TestPlanModel.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **createdByUserName** | **kotlin.String** |  |  [optional] |
| **startedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **runByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **stoppedByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |



