
# WorkItemModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **versionId** | [**java.util.UUID**](java.util.UUID.md) | used for versioning changes in workitem |  |
| **medianDuration** | **kotlin.Long** | used for getting a median duration of all autotests related to this workitem |  |
| **isDeleted** | **kotlin.Boolean** |  |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **entityTypeName** | [**WorkItemEntityTypes**](WorkItemEntityTypes.md) |  |  |
| **isAutomated** | **kotlin.Boolean** |  |  |
| **versionNumber** | **kotlin.Int** | used for define chronology of workitem state in each version |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **globalId** | **kotlin.Long** |  |  |
| **externalIssues** | [**kotlin.collections.List&lt;ExternalIssueModel&gt;**](ExternalIssueModel.md) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **state** | [**WorkItemStates**](WorkItemStates.md) |  |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  |  |
| **sourceType** | [**WorkItemSourceTypeModel**](WorkItemSourceTypeModel.md) |  |  |
| **steps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) |  |  |
| **preconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) |  |  |
| **postconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) |  |  |
| **duration** | **kotlin.Int** |  |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  |
| **tags** | [**kotlin.collections.List&lt;TagModel&gt;**](TagModel.md) |  |  |
| **links** | [**kotlin.collections.List&lt;LinkModel&gt;**](LinkModel.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **autoTests** | [**kotlin.collections.List&lt;AutoTestModel&gt;**](AutoTestModel.md) |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |
| **sectionPreconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) |  |  [optional] |
| **sectionPostconditionSteps** | [**kotlin.collections.List&lt;StepModel&gt;**](StepModel.md) |  |  [optional] |
| **iterations** | [**kotlin.collections.List&lt;IterationModel&gt;**](IterationModel.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |



