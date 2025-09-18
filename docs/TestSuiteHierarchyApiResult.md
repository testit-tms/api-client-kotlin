
# TestSuiteHierarchyApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test suite |  |
| **name** | **kotlin.String** | Name of the test suite |  |
| **type** | [**TestSuiteTypeApiResult**](TestSuiteTypeApiResult.md) | Type of the test suite |  |
| **saveStructure** | **kotlin.Boolean** | Flag indicating whether the structure of the test suite should be saved |  |
| **autoRefresh** | **kotlin.Boolean** | Flag indicating whether auto-refresh functionality is enabled for the test suite |  |
| **refreshDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The last time the test suite&#39;s results were refreshed |  |
| **parentId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the parent test suite, if any |  |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the associated test plan |  |
| **children** | [**kotlin.collections.List&lt;TestSuiteHierarchyApiResult&gt;**](TestSuiteHierarchyApiResult.md) | Collection of child test suites |  [optional] |



