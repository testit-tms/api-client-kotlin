
# UpdateEmptyTestRunApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Test run unique identifier |  |
| **name** | **kotlin.String** | Test run name |  |
| **description** | **kotlin.String** | Test run description |  [optional] |
| **launchSource** | **kotlin.String** | Test run launch source                Once launch source is specified it cannot be updated |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;AssignAttachmentApiModel&gt;**](AssignAttachmentApiModel.md) | Collection of attachments related to the test run |  [optional] |
| **links** | [**kotlin.collections.List&lt;UpdateLinkApiModel&gt;**](UpdateLinkApiModel.md) | Collection of links related to the test run |  [optional] |



