
# WebHookPostModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the webhook project |  |
| **eventType** | [**WebHookEventTypeModel**](WebHookEventTypeModel.md) | Type of event which triggers the webhook |  |
| **url** | **kotlin.String** | Request URL of the webhook |  |
| **requestType** | [**RequestTypeModel**](RequestTypeModel.md) | Request method of the webhook |  |
| **shouldSendBody** | **kotlin.Boolean** | Indicates if the webhook sends body |  |
| **headers** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Collection of the webhook headers |  |
| **queryParameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Collection of the webhook query parameters |  |
| **isEnabled** | **kotlin.Boolean** | Indicates if the webhook is active |  |
| **shouldSendCustomBody** | **kotlin.Boolean** | Indicates if the webhook sends custom body |  |
| **shouldReplaceParameters** | **kotlin.Boolean** | Indicates if the webhook injects parameters |  |
| **shouldEscapeParameters** | **kotlin.Boolean** | Indicates if the webhook escapes invalid characters in parameters |  |
| **name** | **kotlin.String** | Name of the webhook |  |
| **description** | **kotlin.String** | Description of the webhook |  [optional] |
| **customBody** | **kotlin.String** | Custom body of the webhook |  [optional] |



