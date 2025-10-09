
# TestPointShortModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **testSuiteId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Test point unique internal identifier |  |
| **iterationId** | [**java.util.UUID**](java.util.UUID.md) | Iteration unique identifier |  |
| **testerId** | [**java.util.UUID**](java.util.UUID.md) | Tester who is responded for the test unique internal identifier |  [optional] |
| **workItemId** | [**java.util.UUID**](java.util.UUID.md) | Workitem to which test point relates unique identifier |  [optional] |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) | Configuration to which test point relates unique identifier |  [optional] |
| **status** | **kotlin.String** | Test point status  Applies one of these values: Blocked, NoResults, Failed, Passed |  [optional] |
| **lastTestResultId** | [**java.util.UUID**](java.util.UUID.md) | Last test result unique identifier |  [optional] |
| **workItemMedianDuration** | **kotlin.Long** | Median duration of work item the test point represents |  [optional] |



