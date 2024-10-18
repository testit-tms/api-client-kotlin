
# TestResultHistoryReportModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **userId** | [**java.util.UUID**](java.util.UUID.md) | If test run was stopped, this property equals identifier of user who stopped it.Otherwise, the property equals identifier of user who created the test result |  |
| **isAutomated** | **kotlin.Boolean** |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **failureClassIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) |  |  |
| **testRunId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testRunName** | **kotlin.String** |  |  [optional] |
| **createdByUserName** | **kotlin.String** |  |  [optional] |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPlanGlobalId** | **kotlin.Long** |  |  [optional] |
| **testPlanName** | **kotlin.String** |  |  [optional] |
| **configurationName** | **kotlin.String** | If test point related to the test result has configuration, this property will be equal to the test point configuration name. Otherwise, this property will be equal to the test result configuration name |  [optional] |
| **outcome** | **kotlin.String** | If any test result related to the test run is linked with autotest and the run has an outcome, the outcome value equalsto the worst outcome of the last modified test result.Otherwise, the outcome equals to the outcome of first created test result in the test run |  [optional] |
| **comment** | **kotlin.String** | If any test result related to the test run is linked with autotest, comment will have default valueOtherwise, the comment equals to the comment of first created test result in the test run |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkModel&gt;**](LinkModel.md) | If any test result related to the test run is linked with autotest, link will be equal to the links of last modified test result.Otherwise, the links equals to the links of first created test result in the test run |  [optional] |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **duration** | **kotlin.Long** |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md) | If any test result related to the test run is linked with autotest, attachments will be equal to the attachments of last modified test result.Otherwise, the attachments equals to the attachments of first created test result in the test run |  [optional] |
| **workItemVersionId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **workItemVersionNumber** | **kotlin.Int** |  |  [optional] |
| **launchSource** | **kotlin.String** |  |  [optional] |
| **parameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |



