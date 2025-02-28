
# TestResultUpdateV2Request

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **failureClassIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  [optional] |
| **outcome** | [**TestResultOutcome**](TestResultOutcome.md) |  |  [optional] |
| **statusCode** | **kotlin.String** |  |  [optional] |
| **comment** | **kotlin.String** |  |  [optional] |
| **links** | [**kotlin.collections.List&lt;Link&gt;**](Link.md) |  |  [optional] |
| **stepResults** | [**kotlin.collections.List&lt;StepResultApiModel&gt;**](StepResultApiModel.md) |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentUpdateRequest&gt;**](AttachmentUpdateRequest.md) |  |  [optional] |
| **durationInMs** | **kotlin.Long** |  |  [optional] |
| **duration** | **kotlin.Long** |  |  [optional] |
| **stepComments** | [**kotlin.collections.List&lt;TestResultStepCommentUpdateRequest&gt;**](TestResultStepCommentUpdateRequest.md) |  |  [optional] |
| **setupResults** | [**kotlin.collections.List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) |  |  [optional] |
| **teardownResults** | [**kotlin.collections.List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **trace** | **kotlin.String** |  |  [optional] |



