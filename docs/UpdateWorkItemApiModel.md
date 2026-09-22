
# UpdateWorkItemApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the work item |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the section within a project |  |
| **name** | **kotlin.String** | Name of the work item |  |
| **duration** | **kotlin.Long** | Duration of the work item in milliseconds |  |
| **state** | [**WorkItemStateApiModel**](WorkItemStateApiModel.md) | Current state of the work item |  |
| **priority** | [**WorkItemPriorityApiModel**](WorkItemPriorityApiModel.md) | Priority level assigned to the work item |  |
| **description** | **kotlin.String** | Description of the work item |  [optional] |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Set of custom attributes associated with the work item |  [optional] |
| **tags** | [**kotlin.collections.List&lt;TagModel&gt;**](TagModel.md) | Set of tags applied to the work item |  [optional] |
| **preconditionSteps** | [**kotlin.collections.List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Set of precondition steps that must be executed before the main steps |  [optional] |
| **steps** | [**kotlin.collections.List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Set of main steps or actions defined for the work item |  [optional] |
| **postconditionSteps** | [**kotlin.collections.List&lt;UpdateStepApiModel&gt;**](UpdateStepApiModel.md) | Set of postcondition steps that are executed after completing the main steps |  [optional] |
| **iterations** | [**kotlin.collections.List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Set of iterations associated with the work item |  [optional] |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Set of automated tests linked to the work item |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Set of files attached to the work item |  [optional] |
| **links** | [**kotlin.collections.List&lt;UpdateLinkApiModel&gt;**](UpdateLinkApiModel.md) | Set of links related to the work item |  [optional] |
| **parameters** | [**kotlin.collections.List&lt;WorkItemParameterKeyApiModel&gt;**](WorkItemParameterKeyApiModel.md) | Set of parameter keys associated with the work item |  [optional] |



