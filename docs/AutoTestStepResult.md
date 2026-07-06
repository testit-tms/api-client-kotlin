
# AutoTestStepResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** | The name of the step. |  [optional] |
| **description** | **kotlin.String** | Description of the step result. |  [optional] |
| **info** | **kotlin.String** | Extended description of the step result. |  [optional] |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Step start date. |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Step end date. |  [optional] |
| **duration** | **kotlin.Long** | Expected or actual duration of the test run execution in milliseconds. |  [optional] |
| **outcome** | [**AvailableTestResultOutcome**](AvailableTestResultOutcome.md) | Specifies the result of the autotest execution. |  [optional] |
| **stepResults** | [**kotlin.collections.List&lt;AutoTestStepResult&gt;**](AutoTestStepResult.md) | Nested step results. The maximum nesting level is 15. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentApiResult&gt;**](AttachmentApiResult.md) | /// &lt;summary&gt;  Specifies an attachment GUID. Multiple values can be sent.  &lt;/summary&gt; |  [optional] |
| **parameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | \&quot;&lt;b&gt;parameter&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom parameters. Multiple parameters can be sent. |  [optional] |



