
# WorkItemApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the work item |  |
| **globalId** | **kotlin.Long** | Global identifier of the work item |  |
| **versionId** | [**java.util.UUID**](java.util.UUID.md) | Version identifier of the work item |  |
| **versionNumber** | **kotlin.Int** | Version number of the work item |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the project |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the section within a project |  |
| **name** | **kotlin.String** | Name of the work item |  |
| **sourceType** | [**WorkItemSourceTypeApiModel**](WorkItemSourceTypeApiModel.md) | Source type of the work item |  |
| **entityTypeName** | [**WorkItemEntityTypeApiModel**](WorkItemEntityTypeApiModel.md) | Type of entity associated with this work item |  |
| **duration** | **kotlin.Int** | Duration of the work item in milliseconds |  |
| **medianDuration** | **kotlin.Long** | Median duration of the work item in milliseconds |  |
| **state** | [**WorkItemStateApiModel**](WorkItemStateApiModel.md) | State of the work item |  |
| **priority** | [**WorkItemPriorityApiModel**](WorkItemPriorityApiModel.md) | Priority level of the work item |  |
| **isAutomated** | **kotlin.Boolean** |  |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Set of custom attributes associated with the work item |  |
| **tags** | [**kotlin.collections.List&lt;TagModel&gt;**](TagModel.md) | Set of tags applied to the work item |  |
| **sectionPreconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) | Set of section precondition steps that need to be executed before starting the work item steps |  |
| **sectionPostconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) | Set of section postcondition steps that need to be executed after completing the work item steps |  |
| **preconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) | Set of precondition steps that need to be executed before starting the main steps |  |
| **steps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) | Main steps or actions defined for the work item |  |
| **postconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) | Set of postcondition steps that are executed after completing the main steps |  |
| **iterations** | [**kotlin.collections.List&lt;IterationModel&gt;**](IterationModel.md) | Associated iterations linked to the work item |  |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestModel&gt;**](AutoTestModel.md) | Automated tests associated with the work item |  |
| **attachments** | [**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md) | Files attached to the work item |  |
| **links** | [**kotlin.collections.List&lt;LinkModel&gt;**](LinkModel.md) | Set of links related to the work item |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation date of the work item |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the work item creator |  |
| **isDeleted** | **kotlin.Boolean** | Indicates whether the work item is marked as deleted |  |
| **description** | **kotlin.String** | Description of the work item |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Modification date of the work item |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of the work item modifier |  [optional] |



