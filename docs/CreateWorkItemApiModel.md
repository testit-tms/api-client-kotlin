
# CreateWorkItemApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityTypeName** | [**WorkItemEntityTypes**](WorkItemEntityTypes.md) |  |  |
| **state** | [**WorkItemStates**](WorkItemStates.md) |  |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  |  |
| **steps** | [**kotlin.collections.List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Collection of workitem steps |  |
| **preconditionSteps** | [**kotlin.collections.List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Collection of workitem precondition steps |  |
| **postconditionSteps** | [**kotlin.collections.List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Collection of workitem postcondition steps |  |
| **duration** | **kotlin.Int** | WorkItem duration in milliseconds, must be 0 for shared steps and greater than 0 for the other types of work items |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Key value pair of custom workitem attributes |  |
| **tags** | [**kotlin.collections.List&lt;TagModel&gt;**](TagModel.md) | Collection of workitem tags |  |
| **links** | [**kotlin.collections.List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Collection of workitem links |  |
| **name** | **kotlin.String** | Workitem name |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Project unique identifier - used to link workitem with project |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) | Internal identifier of section where workitem is located |  |
| **description** | **kotlin.String** | Workitem description |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of workitem attachments |  [optional] |
| **iterations** | [**kotlin.collections.List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Collection of parameter sets |  [optional] |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Collection of autotest internal ids |  [optional] |



