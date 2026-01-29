
# AutoTestCreateApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String** | External ID of the autotest |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest project |  |
| **name** | **kotlin.String** | Name of the autotest |  |
| **externalKey** | **kotlin.String** | External key of the autotest |  [optional] |
| **namespace** | **kotlin.String** | Name of the autotest namespace |  [optional] |
| **classname** | **kotlin.String** | Name of the autotest class |  [optional] |
| **steps** | [**kotlin.collections.List&lt;AutoTestStepApiModel&gt;**](AutoTestStepApiModel.md) | Collection of the autotest steps |  [optional] |
| **setup** | [**kotlin.collections.List&lt;AutoTestStepApiModel&gt;**](AutoTestStepApiModel.md) | Collection of the autotest setup steps |  [optional] |
| **teardown** | [**kotlin.collections.List&lt;AutoTestStepApiModel&gt;**](AutoTestStepApiModel.md) | Collection of the autotest teardown steps |  [optional] |
| **title** | **kotlin.String** | Name of the autotest in autotest&#39;s card |  [optional] |
| **description** | **kotlin.String** | Description of the autotest in autotest&#39;s card |  [optional] |
| **labels** | [**kotlin.collections.List&lt;LabelApiModel&gt;**](LabelApiModel.md) | Collection of the autotest labels |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkCreateApiModel&gt;**](LinkCreateApiModel.md) | Collection of the autotest links |  [optional] |
| **isFlaky** | **kotlin.Boolean** | Indicates if the autotest is marked as flaky |  [optional] |
| **workItemIdsForLinkWithAutoTest** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the IDs of work items to link your autotest to. You can specify several IDs. |  [optional] |
| **workItemIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the IDs of work items to link your autotest to. You can specify several IDs. |  [optional] |
| **shouldCreateWorkItem** | **kotlin.Boolean** | Creates a test case linked to the autotest. |  [optional] |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Key value pair of custom work item attributes |  [optional] |



