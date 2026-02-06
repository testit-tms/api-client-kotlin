
# UpdateWorkItemApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Workitem internal identifier |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) | Internal identifier of section where workitem is located |  |
| **state** | [**WorkItemStates**](WorkItemStates.md) |  |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  |  |
| **steps** | [**kotlin.collections.List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Collection of workitem steps |  |
| **preconditionSteps** | [**kotlin.collections.List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Collection of workitem precondtion steps |  |
| **postconditionSteps** | [**kotlin.collections.List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Collection of workitem postcondition steps |  |
| **duration** | **kotlin.Long** | Workitem duration in milliseconds |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Key value pair of custom workitem attributes |  |
| **tags** | [**kotlin.collections.List&lt;TagModel&gt;**](TagModel.md) | Collection of workitem tags |  |
| **links** | [**kotlin.collections.List&lt;UpdateLinkApiModel&gt;**](UpdateLinkApiModel.md) | Collection of workitem links |  |
| **name** | **kotlin.String** | Workitem name |  |
| **attachments** | [**kotlin.collections.List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) |  |  |
| **description** | **kotlin.String** | Workitem description |  [optional] |
| **sourceType** | [**WorkItemSourceTypeModel**](WorkItemSourceTypeModel.md) |  |  [optional] |
| **iterations** | [**kotlin.collections.List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Collection of parameter id sets |  [optional] |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Collection of autotest internal ids |  [optional] |



