
# TestRunFillByAutoTestsPostModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Specifies the GUID of the project, in which a test run will be created. |  |
| **configurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs. |  |
| **autoTestExternalIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Specifies the external ID of the autotest. You can specify several IDs. |  |
| **name** | **kotlin.String** | Specifies the name of the test run. |  [optional] |
| **description** | **kotlin.String** | Specifies the test run description. |  [optional] |
| **launchSource** | **kotlin.String** | Specifies the test run launch source. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AttachmentPutModel&gt;**](AttachmentPutModel.md) | Collection of attachment ids to relate to the test run |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkPostModel&gt;**](LinkPostModel.md) | Collection of links to relate to the test run |  [optional] |



