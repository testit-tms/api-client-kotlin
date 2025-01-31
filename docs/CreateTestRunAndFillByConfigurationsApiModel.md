
# CreateTestRunAndFillByConfigurationsApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Specifies the GUID of the project, in which a test run will be created. |  |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) | Specifies the GUID of the test plan, within which the test run will be created. |  |
| **testPointSelectors** | [**kotlin.collections.List&lt;TestPointSelector&gt;**](TestPointSelector.md) | Specifies an array of work items and configuration to create a test run for. |  |
| **name** | **kotlin.String** | Specifies the name of the test run. |  [optional] |
| **description** | **kotlin.String** | Specifies the test run description. |  [optional] |
| **launchSource** | **kotlin.String** | Specifies the test run launch source. |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of attachment ids to relate to the test run |  [optional] |
| **links** | [**kotlin.collections.List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Collection of links to relate to the test run |  [optional] |



