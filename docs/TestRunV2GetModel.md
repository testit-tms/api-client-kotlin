
# TestRunV2GetModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **stateName** | [**TestRunState**](TestRunState.md) |  |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | This property is used to link test run with project |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **attachments** | [**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  |
| **links** | [**kotlin.collections.List&lt;LinkModel&gt;**](LinkModel.md) |  |  |
| **webhooks** | [**kotlin.collections.List&lt;NamedEntityModel&gt;**](NamedEntityModel.md) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) | This property is used to link test run with test plan |  [optional] |
| **testResults** | [**kotlin.collections.List&lt;TestResultV2GetModel&gt;**](TestResultV2GetModel.md) |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **createdByUserName** | **kotlin.String** |  |  [optional] |
| **customParameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **launchSource** | **kotlin.String** | Once launch source is specified it cannot be updated |  [optional] |



