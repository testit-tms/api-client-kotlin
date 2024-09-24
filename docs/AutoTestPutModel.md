
# AutoTestPutModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String** | External ID of the autotest |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest project |  |
| **name** | **kotlin.String** | Name of the autotest |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Used for search autotest. If value is null or equals Guid mask filled with zeros, search will be executed using ExternalId |  [optional] |
| **workItemIdsForLinkWithAutoTest** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkPutModel&gt;**](LinkPutModel.md) | Collection of the autotest links |  [optional] |
| **namespace** | **kotlin.String** | Name of the autotest namespace |  [optional] |
| **classname** | **kotlin.String** | Name of the autotest class |  [optional] |
| **steps** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest steps |  [optional] |
| **setup** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest setup steps |  [optional] |
| **teardown** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest teardown steps |  [optional] |
| **title** | **kotlin.String** | Name of the autotest in autotest&#39;s card |  [optional] |
| **description** | **kotlin.String** | Description of the autotest in autotest&#39;s card |  [optional] |
| **labels** | [**kotlin.collections.List&lt;LabelPostModel&gt;**](LabelPostModel.md) | Collection of the autotest labels |  [optional] |
| **isFlaky** | **kotlin.Boolean** | Indicates if the autotest is marked as flaky |  [optional] |
| **externalKey** | **kotlin.String** | External key of the autotest |  [optional] |



