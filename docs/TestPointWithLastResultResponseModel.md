
# TestPointWithLastResultResponseModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **isAutomated** | **kotlin.Boolean** |  |  |
| **workItemId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **testSuiteId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **duration** | **kotlin.Int** |  |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  |  |
| **workItemName** | **kotlin.String** |  |  [optional] |
| **testerId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **lastTestResult** | [**LastTestResultModel**](LastTestResultModel.md) |  |  [optional] |
| **status** | **kotlin.String** |  |  [optional] |
| **statusModel** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  [optional] |
| **workItemGlobalId** | **kotlin.Long** |  |  [optional] |
| **workItemEntityTypeName** | **kotlin.String** |  |  [optional] |
| **sectionName** | **kotlin.String** |  |  [optional] |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **tagNames** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **testSuiteNameBreadCrumbs** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **groupCount** | **kotlin.Int** |  |  [optional] |
| **iteration** | [**IterationModel**](IterationModel.md) |  |  [optional] |



