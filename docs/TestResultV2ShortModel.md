
# TestResultV2ShortModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **workItemVersionId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **testRunId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **outcome** | **kotlin.String** | Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped |  |
| **autoTestId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **traces** | **kotlin.String** |  |  [optional] |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **runByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **stoppedByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPointId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPoint** | [**TestPointShortModel**](TestPointShortModel.md) |  |  [optional] |
| **comment** | **kotlin.String** |  |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkModel&gt;**](LinkModel.md) |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md) |  |  [optional] |
| **parameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **properties** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |



