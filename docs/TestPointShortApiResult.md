
# TestPointShortApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Test point unique internal identifier |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **statusModel** | [**TestStatusApiResult**](TestStatusApiResult.md) | Test point status |  |
| **iterationId** | [**java.util.UUID**](java.util.UUID.md) | Iteration unique identifier |  |
| **testSuiteId** | [**java.util.UUID**](java.util.UUID.md) | Test suite to which test point relates unique identifier |  |
| **testerId** | [**java.util.UUID**](java.util.UUID.md) | Tester who is responded for the test unique internal identifier |  [optional] |
| **workItemId** | [**java.util.UUID**](java.util.UUID.md) | Workitem to which test point relates unique identifier |  [optional] |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) | Configuration to which test point relates unique identifier |  [optional] |
| **status** | **kotlin.String** | Test point status  Applies one of these values: Blocked, NoResults, Failed, Passed |  [optional] |
| **lastTestResultId** | [**java.util.UUID**](java.util.UUID.md) | Last test result unique identifier |  [optional] |
| **workItemMedianDuration** | **kotlin.Long** | Median duration of work item the test point represents |  [optional] |



