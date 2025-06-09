
# CreateEmptyTestRunApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Project unique identifier              This property is to link test run with a project |  |
| **name** | **kotlin.String** | Test run name |  [optional] |
| **description** | **kotlin.String** | Test run description |  [optional] |
| **launchSource** | **kotlin.String** | Test run launch source |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of attachments to relate to the test run |  [optional] |
| **links** | [**kotlin.collections.List&lt;CreateLinkApiModel&gt;**](CreateLinkApiModel.md) | Collection of links to relate to the test run |  [optional] |



