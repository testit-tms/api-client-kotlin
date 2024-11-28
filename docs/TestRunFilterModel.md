
# TestRunFilterModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test run project IDs to search for |  [optional] |
| **name** | **kotlin.String** | Specifies test run name |  [optional] |
| **states** | [**kotlin.collections.Set&lt;TestRunState&gt;**](TestRunState.md) | Specifies a test run states to search for |  [optional] |
| **createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test run range of created date to search for |  [optional] |
| **startedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test run range of started date to search for |  [optional] |
| **createdByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test run creator IDs to search for |  [optional] |
| **modifiedByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test run last editor IDs to search for |  [optional] |
| **isDeleted** | **kotlin.Boolean** | Specifies a test run deleted status to search for |  [optional] |
| **autoTestsCount** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) | Number of autoTests run in the test run |  [optional] |
| **testResultsOutcome** | [**kotlin.collections.List&lt;TestResultOutcome&gt;**](TestResultOutcome.md) | Specifies test results outcomes |  [optional] |
| **failureCategory** | [**kotlin.collections.List&lt;FailureCategoryModel&gt;**](FailureCategoryModel.md) | Specifies failure categories |  [optional] |
| **completedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test run range of completed date to search for |  [optional] |
| **testResultsConfigurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test result configuration IDs to search for |  [optional] |



