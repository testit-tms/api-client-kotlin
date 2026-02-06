
# CreateWorkItemApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the project |  |
| **name** | **kotlin.String** | Name of the work item |  |
| **entityTypeName** | [**WorkItemEntityTypeApiModel**](WorkItemEntityTypeApiModel.md) | Type of entity associated with this work item |  |
| **duration** | **kotlin.Long** | Duration of the work item in milliseconds |  |
| **state** | [**WorkItemStateApiModel**](WorkItemStateApiModel.md) | State of the work item |  |
| **priority** | [**WorkItemPriorityApiModel**](WorkItemPriorityApiModel.md) | Priority level of the work item |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Set of custom attributes associated with the work item |  |
| **tags** | [**kotlin.collections.List&lt;TagModel&gt;**](TagModel.md) | Set of tags applied to the work item |  |
| **preconditionSteps** | [**kotlin.collections.List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Set of precondition steps that need to be executed before starting the main steps |  |
| **steps** | [**kotlin.collections.List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Main steps or actions defined for the work item |  |
| **postconditionSteps** | [**kotlin.collections.List&lt;CreateStepApiModel&gt;**](CreateStepApiModel.md) | Set of postcondition steps that are executed after completing the main steps |  |
| **links** | [**kotlin.collections.List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Set of links related to the work item |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the section within a project |  [optional] |
| **description** | **kotlin.String** | Description of the work item |  [optional] |
| **iterations** | [**kotlin.collections.List&lt;AssignIterationApiModel&gt;**](AssignIterationApiModel.md) | Associated iterations linked to the work item |  [optional] |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestIdModel&gt;**](AutoTestIdModel.md) | Automated tests associated with the work item |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Files attached to the work item |  [optional] |



