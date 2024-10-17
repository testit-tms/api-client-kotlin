
# TestSuiteV2TreeModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test suite |  |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of test plan to which the test suite belongs |  |
| **name** | **kotlin.String** | Name of the test suite |  |
| **children** | [**kotlin.collections.List&lt;TestSuiteV2TreeModel&gt;**](TestSuiteV2TreeModel.md) | nested enumeration of children is allowed |  [optional] |
| **refreshDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date of the last refresh of the test suite |  [optional] |
| **parentId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the parent test suite in hierarchy |  [optional] |
| **type** | [**TestSuiteType**](TestSuiteType.md) | Type of the test suite |  [optional] |
| **saveStructure** | **kotlin.Boolean** | Indicates if the test suite retains section tree structure |  [optional] |
| **autoRefresh** | **kotlin.Boolean** | Indicates if scheduled auto refresh is enabled for the test suite |  [optional] |



