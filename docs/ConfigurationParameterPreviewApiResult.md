
# ConfigurationParameterPreviewApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Identifier of the configuration parameter |  |
| **name** | **kotlin.String** | Name of the configuration parameter |  |
| **isDeleted** | **kotlin.Boolean** | Is configuration parameter deleted? |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date of configuration parameter creation |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Identifier of user who created configuration parameter |  |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date of configuration parameter modification |  |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Identifier of user who modified configuration parameter |  |
| **propertyValues** | [**ConfigurationParameterValueApiResultApiCollectionPreview**](ConfigurationParameterValueApiResultApiCollectionPreview.md) | Preview of configuration parameter values |  |
| **projects** | [**ProjectNameApiResultApiCollectionPreview**](ProjectNameApiResultApiCollectionPreview.md) | Preview of assigned projects |  |



