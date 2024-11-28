
# TestResultResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **failureClassIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **testPointId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **testRunId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **workItemVersionId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **stepComments** | [**kotlin.collections.List&lt;StepComment&gt;**](StepComment.md) |  |  [optional] |
| **outcome** | [**TestResultOutcome**](TestResultOutcome.md) |  |  [optional] |
| **status** | [**TestStatus**](TestStatus.md) |  |  [optional] |
| **comment** | **kotlin.String** |  |  [optional] |
| **links** | [**kotlin.collections.List&lt;Link&gt;**](Link.md) |  |  [optional] |
| **stepResults** | [**kotlin.collections.List&lt;StepResult&gt;**](StepResult.md) |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;Attachment&gt;**](Attachment.md) |  |  [optional] |
| **autoTestId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **durationInMs** | **kotlin.Long** |  |  [optional] |
| **traces** | **kotlin.String** |  |  [optional] |
| **failureType** | **kotlin.String** |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **runByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **stoppedByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPoint** | [**TestPoint**](TestPoint.md) |  |  [optional] |
| **autoTest** | [**AutoTest**](AutoTest.md) |  |  [optional] |
| **autoTestStepResults** | [**kotlin.collections.List&lt;AutoTestStepResult&gt;**](AutoTestStepResult.md) |  |  [optional] |
| **setupResults** | [**kotlin.collections.List&lt;AutoTestStepResult&gt;**](AutoTestStepResult.md) |  |  [optional] |
| **teardownResults** | [**kotlin.collections.List&lt;AutoTestStepResult&gt;**](AutoTestStepResult.md) |  |  [optional] |
| **workItemVersionNumber** | **kotlin.Int** |  |  [optional] |
| **parameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **properties** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |



