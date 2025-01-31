
# TestRunShortApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test run |  |
| **name** | **kotlin.String** | Name of the test run |  |
| **state** | [**TestRunState**](TestRunState.md) | Current state of the test run |  |
| **status** | [**TestStatusApiResult**](TestStatusApiResult.md) | Current status of the test run |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date when the test run was created |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of user who created the test run |  |
| **isDeleted** | **kotlin.Boolean** | Is the test run is deleted |  |
| **autoTestsCount** | **kotlin.Int** | Number of AutoTests run in the test run |  |
| **statistics** | [**TestResultsStatisticsApiResult**](TestResultsStatisticsApiResult.md) | Statistics of the test run |  |
| **testResultsConfigurations** | [**kotlin.collections.List&lt;ConfigurationShortApiResult&gt;**](ConfigurationShortApiResult.md) | Test results configurations |  |
| **startedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date when the test run was started |  [optional] |
| **completedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Completion date of the test run |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of user who modified the test run last time |  [optional] |



