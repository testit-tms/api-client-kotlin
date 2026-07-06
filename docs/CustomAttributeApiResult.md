
# CustomAttributeApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the attribute |  |
| **options** | [**kotlin.collections.List&lt;CustomAttributeOptionApiResult&gt;**](CustomAttributeOptionApiResult.md) | Collection of the attribute options      Available for attributes of type &#x60;options&#x60; and &#x60;multiple options&#x60; only |  |
| **type** | [**CustomAttributeType**](CustomAttributeType.md) | Type of the attribute |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the attribute is deleted |  |
| **name** | **kotlin.String** | Name of the attribute |  |
| **isEnabled** | **kotlin.Boolean** | Indicates if the attribute is enabled |  |
| **isRequired** | **kotlin.Boolean** | Indicates if the attribute value is mandatory to specify |  |
| **isGlobal** | **kotlin.Boolean** | Indicates if the attribute is available across all projects |  |
| **isSystem** | **kotlin.Boolean** | Indicates if the attribute is system |  |
| **targets** | **kotlin.collections.List&lt;kotlin.String&gt;** | Collection of the attribute targets      Defines where the attribute can be used (e.g., TestCases, AutoTestCases, TestPlans) |  |



