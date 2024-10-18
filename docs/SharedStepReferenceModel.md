
# SharedStepReferenceModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **globalId** | **kotlin.Long** |  |  |
| **name** | **kotlin.String** |  |  |
| **entityTypeName** | **kotlin.String** |  |  |
| **hasThisSharedStepAsStep** | **kotlin.Boolean** |  |  |
| **hasThisSharedStepAsPrecondition** | **kotlin.Boolean** |  |  |
| **hasThisSharedStepAsPostcondition** | **kotlin.Boolean** |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **state** | **kotlin.String** |  |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) |  |  |
| **isDeleted** | **kotlin.Boolean** |  |  |
| **versionId** | [**java.util.UUID**](java.util.UUID.md) | used for versioning changes in workitem |  |
| **isAutomated** | **kotlin.Boolean** |  |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tags** | [**kotlin.collections.List&lt;TagModel&gt;**](TagModel.md) |  |  [optional] |



