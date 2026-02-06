
# WorkItemShortModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Work Item internal unique identifier |  |
| **versionId** | [**java.util.UUID**](java.util.UUID.md) | Work Item version identifier |  |
| **versionNumber** | **kotlin.Int** | Work Item version number |  |
| **name** | **kotlin.String** | Work Item name |  |
| **entityTypeName** | **kotlin.String** | Work Item type. Possible values: CheckLists, SharedSteps, TestCases |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Project unique identifier |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) | Identifier of Section where Work Item is located |  |
| **sectionName** | **kotlin.String** | Section name of Work Item |  |
| **isAutomated** | **kotlin.Boolean** | Boolean flag determining whether Work Item is automated |  |
| **globalId** | **kotlin.Long** | Work Item global identifier |  |
| **duration** | **kotlin.Long** | Work Item duration |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of user who created Work Item |  |
| **state** | [**WorkItemStates**](WorkItemStates.md) | The current state of Work Item |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) | Work Item priority level |  |
| **sourceType** | [**WorkItemSourceTypeModel**](WorkItemSourceTypeModel.md) | Work Item source type |  |
| **isDeleted** | **kotlin.Boolean** | Flag determining whether Work Item is deleted |  |
| **iterations** | [**kotlin.collections.List&lt;IterationModel&gt;**](IterationModel.md) | Set of iterations related to Work Item |  |
| **links** | [**kotlin.collections.List&lt;LinkShortModel&gt;**](LinkShortModel.md) | Set of links related to Work Item |  |
| **medianDuration** | **kotlin.Long** | Work Item median duration |  [optional] |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Work Item attributes |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of user who applied the latest modification of Work Item |  [optional] |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of Work Item creation |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of the latest modification of Work Item |  [optional] |
| **tagNames** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of tag names of Work Item |  [optional] |



