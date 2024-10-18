
# WebHookModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name of the webhook |  |
| **eventType** | [**WebHookEventTypeModel**](WebHookEventTypeModel.md) | Type of event which triggers the webhook |  |
| **url** | **kotlin.String** | Url to which the webhook sends request |  |
| **requestType** | [**RequestTypeModel**](RequestTypeModel.md) | Method which the webhook uses |  |
| **shouldSendBody** | **kotlin.Boolean** | Indicates if the webhook sends body |  |
| **isEnabled** | **kotlin.Boolean** | Indicates if the webhook is active |  |
| **shouldSendCustomBody** | **kotlin.Boolean** | Indicates if the webhook sends custom body |  |
| **shouldReplaceParameters** | **kotlin.Boolean** | Indicates if the webhook injects parameters |  |
| **shouldEscapeParameters** | **kotlin.Boolean** | Indicates if the webhook escapes invalid characters in parameters |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation date of the webhook |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of user who created the webhook |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of project where the webhook is located |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the entity |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **description** | **kotlin.String** | Description of the webhook |  [optional] |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Collection of headers which the webhook sends |  [optional] |
| **queryParameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Collection of query parameters which the webhook sends |  [optional] |
| **customBody** | **kotlin.String** | Custom body of the webhook |  [optional] |
| **customBodyMediaType** | **kotlin.String** | MIME type of body of the webhook |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last modification date of the webhook |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of user who modified the webhook last time |  [optional] |



