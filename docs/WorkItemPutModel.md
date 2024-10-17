
# WorkItemPutModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **attachments** | [**kotlin.collections.List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **state** | [**WorkItemStates**](WorkItemStates.md) |  |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  |  |
| **steps** | [**kotlin.collections.List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
| **preconditionSteps** | [**kotlin.collections.List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
| **postconditionSteps** | [**kotlin.collections.List&lt;StepPutModel&gt;**](StepPutModel.md) |  |  |
| **duration** | **kotlin.Int** |  |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  |
| **tags** | [**kotlin.collections.List&lt;TagPutModel&gt;**](TagPutModel.md) |  |  |
| **links** | [**kotlin.collections.List&lt;LinkPutModel&gt;**](LinkPutModel.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **iterations** | [**kotlin.collections.List&lt;IterationPutModel&gt;**](IterationPutModel.md) |  |  [optional] |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |



