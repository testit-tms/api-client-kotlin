
# TestResultsFilterModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **testRunIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test result test run IDs to search for |  [optional] |
| **autoTestGlobalIds** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Specifies an autotest global IDs to search results for |  [optional] |
| **name** | **kotlin.String** | Specifies an autotest name to search results for |  [optional] |
| **createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test result creation date and time range to search for |  [optional] |
| **modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test result modified date and time range to search for |  [optional] |
| **startedOn** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test result started on date and time range to search for |  [optional] |
| **completedOn** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test result completed on date and time range to search for |  [optional] |
| **duration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies a test result duration range to search for |  [optional] |
| **resultReasons** | **kotlin.collections.List&lt;kotlin.String&gt;** | Specifies result reasons for searching test results |  [optional] |
| **configurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test result configuration IDs to search for |  [optional] |
| **outcomes** | [**kotlin.collections.List&lt;TestResultOutcome&gt;**](TestResultOutcome.md) | Specifies a test result outcomes to search for |  [optional] |
| **failureCategories** | [**kotlin.collections.List&lt;FailureCategoryModel&gt;**](FailureCategoryModel.md) | Specifies a test result failure categories to search for |  [optional] |
| **namespace** | **kotlin.String** | Specifies a test result namespace to search for |  [optional] |
| **className** | **kotlin.String** | Specifies a test result class name to search for |  [optional] |



