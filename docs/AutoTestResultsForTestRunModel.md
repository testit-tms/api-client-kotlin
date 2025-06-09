
# AutoTestResultsForTestRunModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) | Specifies the GUID of the autotest configuration, which was specified when the test run was created. |  |
| **autoTestExternalId** | **kotlin.String** | Specifies the external ID of the autotest, which was specified when the test run was created. |  |
| **links** | [**kotlin.collections.List&lt;LinkPostModel&gt;**](LinkPostModel.md) | Specifies the links in the autotest. |  [optional] |
| **failureReasonNames** | [**kotlin.collections.List&lt;FailureCategoryModel&gt;**](FailureCategoryModel.md) | Specifies the cause of autotest failure. |  [optional] |
| **outcome** | [**AvailableTestResultOutcome**](AvailableTestResultOutcome.md) | Specifies the result of the autotest execution. |  [optional] |
| **statusCode** | **kotlin.String** | Specifies the result of the autotest execution. |  [optional] |
| **message** | **kotlin.String** | A comment for the result. |  [optional] |
| **traces** | **kotlin.String** | An extended comment or a stack trace. |  [optional] |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Test run start date. |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Test run end date. |  [optional] |
| **duration** | **kotlin.Long** | Expected or actual duration of the test run execution in milliseconds. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) | Specifies an attachment GUID. Multiple values can be sent. |  [optional] |
| **parameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | \&quot;&lt;b&gt;parameter&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom parameters. Multiple parameters can be sent. |  [optional] |
| **properties** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | \&quot;&lt;b&gt;property&lt;/b&gt;\&quot;: \&quot;&lt;b&gt;value&lt;/b&gt;\&quot; pair with arbitrary custom properties. Multiple properties can be sent. |  [optional] |
| **stepResults** | [**kotlin.collections.List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) | Specifies the results of individual steps. |  [optional] |
| **setupResults** | [**kotlin.collections.List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) | Specifies the results of setup steps. For information on supported values, see the &#x60;stepResults&#x60; parameter above. |  [optional] |
| **teardownResults** | [**kotlin.collections.List&lt;AttachmentPutModelAutoTestStepResultsModel&gt;**](AttachmentPutModelAutoTestStepResultsModel.md) | Specifies the results of the teardown steps. For information on supported values, see the &#x60;stepResults&#x60; parameter above. |  [optional] |



