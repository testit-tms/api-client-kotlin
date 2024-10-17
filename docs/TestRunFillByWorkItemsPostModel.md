
# TestRunFillByWorkItemsPostModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **configurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs. |  |
| **workItemIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the work item GUIDs, from which test points are created. You can specify several GUIDs. |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Specifies the GUID of the project, in which a test run will be created. |  |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) | Specifies the GUID of the test plan, within which the test run will be created. |  |
| **name** | **kotlin.String** | Specifies the name of the test run. |  [optional] |
| **description** | **kotlin.String** | Specifies the test run description. |  [optional] |
| **launchSource** | **kotlin.String** | Specifies the test run launch source. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) | Collection of attachment ids to relate to the test run |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkPostModel&gt;**](LinkPostModel.md) | Collection of links to relate to the test run |  [optional] |



