
# AutoTestPostModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String** | External ID of the autotest |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest project |  |
| **name** | **kotlin.String** | Name of the autotest |  |
| **workItemIdsForLinkWithAutoTest** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the IDs of work items to link your autotest to. You can specify several IDs. |  [optional] |
| **workItemIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the IDs of work items to link your autotest to. You can specify several IDs. |  [optional] |
| **shouldCreateWorkItem** | **kotlin.Boolean** | Creates a test case linked to the autotest. |  [optional] |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Key value pair of custom work item attributes |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkPostModel&gt;**](LinkPostModel.md) | Collection of the autotest links |  [optional] |
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



