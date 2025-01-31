
# TestSuiteTestPlanApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Test suite nane |  |
| **workItemsSelector** | [**WorkItemSelectModel**](WorkItemSelectModel.md) | Model containing options to filter work items |  |
| **configurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Configuration identifiers. Empty configurations means using default configurations |  [optional] |
| **type** | [**TestSuiteType**](TestSuiteType.md) | Type of the test suite |  [optional] |
| **saveStructure** | **kotlin.Boolean** | Indicates if the test suite retains section tree structure |  [optional] |



