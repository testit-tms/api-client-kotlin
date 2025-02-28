
# TestResultApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **outcome** | **kotlin.String** |  |  |
| **testRunId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
| **attachments** | [**kotlin.collections.List&lt;AttachmentApiResult&gt;**](AttachmentApiResult.md) |  |  |
| **links** | [**kotlin.collections.List&lt;LinkApiResult&gt;**](LinkApiResult.md) |  |  |
| **failureClasses** | [**kotlin.collections.List&lt;TestResultFailureClassApiResult&gt;**](TestResultFailureClassApiResult.md) |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **isDeleted** | **kotlin.Boolean** |  |  |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **durationInMs** | **kotlin.Long** |  |  [optional] |
| **traces** | **kotlin.String** |  |  [optional] |
| **failureType** | **kotlin.String** |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **runByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **stoppedByUserId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **autoTestId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPointId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPoint** | [**TestPointShortApiResult**](TestPointShortApiResult.md) |  |  [optional] |
| **autoTest** | [**AutoTestApiResult**](AutoTestApiResult.md) |  |  [optional] |
| **autoTestStepResults** | [**kotlin.collections.List&lt;AutoTestStepResultsApiResult&gt;**](AutoTestStepResultsApiResult.md) |  |  [optional] |
| **setupResults** | [**kotlin.collections.List&lt;AutoTestStepResultsApiResult&gt;**](AutoTestStepResultsApiResult.md) |  |  [optional] |
| **teardownResults** | [**kotlin.collections.List&lt;AutoTestStepResultsApiResult&gt;**](AutoTestStepResultsApiResult.md) |  |  [optional] |
| **workItemVersionId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **workItemVersionNumber** | **kotlin.Int** |  |  [optional] |
| **stepComments** | [**kotlin.collections.List&lt;StepCommentApiModel&gt;**](StepCommentApiModel.md) |  |  [optional] |
| **parameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **properties** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |



