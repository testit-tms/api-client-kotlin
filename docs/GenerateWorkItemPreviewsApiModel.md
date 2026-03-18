
# GenerateWorkItemPreviewsApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalServiceId** | [**java.util.UUID**](java.util.UUID.md) | The ID of the external AI service to be used for generation. |  |
| **temperature** | **kotlin.Float** | Controls randomness of the AI model output. |  |
| **previewLimit** | **kotlin.Int** | Number of work item previews to generate. |  |
| **taskKey** | **kotlin.String** | The key of the issue in an issue tracker (e.g., JIRA-123). |  [optional] |
| **issueKey** | **kotlin.String** | The key of the issue in an issue tracker (e.g., JIRA-123). |  [optional] |
| **userContext** | **kotlin.String** | Additional user context or description of the issue if no issue key is provided. |  [optional] |



