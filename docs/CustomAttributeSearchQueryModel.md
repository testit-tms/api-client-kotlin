
# CustomAttributeSearchQueryModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name of attribute |  [optional] |
| **projectIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Unique IDs of projects where attribute is in use |  [optional] |
| **customAttributeIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Unique IDs of attributes for search restriction |  [optional] |
| **customAttributeTypes** | [**kotlin.collections.Set&lt;CustomAttributeTypesEnum&gt;**](CustomAttributeTypesEnum.md) | Collection of attribute types |  [optional] |
| **isGlobal** | **kotlin.Boolean** | Indicates whether the attribute is available across all projects |  [optional] |
| **isDeleted** | **kotlin.Boolean** | Indicates whether the attribute is deleted |  [optional] |



