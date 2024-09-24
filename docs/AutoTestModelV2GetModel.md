
# AutoTestModelV2GetModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String** | This property is used to set autotest identifier from client system |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | This property is used to link autotest with project |  |
| **name** | **kotlin.String** |  |  |
| **globalId** | **kotlin.Long** |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the entity |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **links** | [**kotlin.collections.List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
| **namespace** | **kotlin.String** |  |  [optional] |
| **classname** | **kotlin.String** |  |  [optional] |
| **steps** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional] |
| **setup** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional] |
| **teardown** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) |  |  [optional] |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **labels** | [**kotlin.collections.List&lt;LabelShortModel&gt;**](LabelShortModel.md) |  |  [optional] |
| **externalKey** | **kotlin.String** |  |  [optional] |



