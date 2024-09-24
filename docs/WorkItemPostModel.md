
# WorkItemPostModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityTypeName** | [**WorkItemEntityTypes**](WorkItemEntityTypes.md) |  |  |
| **state** | [**WorkItemStates**](WorkItemStates.md) |  |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  |  |
| **steps** | [**kotlin.collections.List&lt;StepPostModel&gt;**](StepPostModel.md) |  |  |
| **preconditionSteps** | [**kotlin.collections.List&lt;StepPostModel&gt;**](StepPostModel.md) |  |  |
| **postconditionSteps** | [**kotlin.collections.List&lt;StepPostModel&gt;**](StepPostModel.md) |  |  |
| **duration** | **kotlin.Int** | Must be 0 for shared steps and greater than 0 for the other types of work items |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  |
| **tags** | [**kotlin.collections.List&lt;TagPostModel&gt;**](TagPostModel.md) |  |  |
| **links** | [**kotlin.collections.List&lt;LinkPostModel&gt;**](LinkPostModel.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | This property is used to link workitem with project |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **description** | **kotlin.String** |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  |  [optional] |
| **iterations** | [**kotlin.collections.List&lt;IterationPutModel&gt;**](IterationPutModel.md) |  |  [optional] |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) |  |  [optional] |



