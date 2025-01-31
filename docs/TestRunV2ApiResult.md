
# TestRunV2ApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Test run unique identifier |  |
| **name** | **kotlin.String** | Test run name |  |
| **stateName** | [**TestRunState**](TestRunState.md) | Test run state |  |
| **status** | [**TestStatusApiResult**](TestStatusApiResult.md) | Test run status |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Project unique identifier                This property is used to link test run with project. |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of test run creation |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of user who created test run |  |
| **attachments** | [**kotlin.collections.List&lt;AttachmentApiResult&gt;**](AttachmentApiResult.md) | Collection of attachments related to the test run |  |
| **links** | [**kotlin.collections.List&lt;LinkApiResult&gt;**](LinkApiResult.md) | Collection of links related to the test run |  |
| **webhooks** | [**kotlin.collections.List&lt;NamedEntityApiModel&gt;**](NamedEntityApiModel.md) | Enabled webhooks |  |
| **runCount** | **kotlin.Int** | Run count |  |
| **description** | **kotlin.String** | Test run description |  [optional] |
| **launchSource** | **kotlin.String** | Test run launch source                Once launch source is specified it cannot be updated. |  [optional] |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of test run start |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of test run end |  [optional] |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) | Test plan unique identifier                This property is used to link test run with test plan. |  [optional] |
| **testResults** | [**kotlin.collections.List&lt;TestResultV2GetModel&gt;**](TestResultV2GetModel.md) | Enumeration of test results related to test run |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of last test run  modification |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique identifier of user who applied last test run  modification |  [optional] |
| **createdByUserName** | **kotlin.String** | Username of user who created test run |  [optional] |
| **customParameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Customers test run parameters |  [optional] |



