
# CustomAttributePutModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the attribute |  |
| **type** | [**CustomAttributeTypesEnum**](CustomAttributeTypesEnum.md) | Type of the attribute |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the entity is deleted |  |
| **name** | **kotlin.String** | Name of the attribute |  |
| **isEnabled** | **kotlin.Boolean** | Indicates if the attribute is enabled |  |
| **isRequired** | **kotlin.Boolean** | Indicates if the attribute value is mandatory to specify |  |
| **isGlobal** | **kotlin.Boolean** | Indicates if the attribute is available across all projects |  |
| **options** | [**kotlin.collections.List&lt;CustomAttributeOptionModel&gt;**](CustomAttributeOptionModel.md) | Collection of the attribute options   Available for attributes of type &#x60;options&#x60; and &#x60;multiple options&#x60; only |  [optional] |



