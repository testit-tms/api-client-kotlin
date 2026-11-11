
# CustomAttributeModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the attribute. |  |
| **type** | [**CustomAttributeTypesEnum**](CustomAttributeTypesEnum.md) | Type of the attribute. |  |
| **options** | [**kotlin.collections.List&lt;CustomAttributeOptionModel&gt;**](CustomAttributeOptionModel.md) | Collection of the attribute options. |  |
| **targets** | **kotlin.collections.List&lt;kotlin.String&gt;** | Collection of the attribute targets.   Defines where the attribute can be used (e.g., TestCases, AutoTestCases, TestPlans). |  |
| **isReadOnly** | **kotlin.Boolean** | Indicates if the attribute is read-only. |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the attribute is deleted. |  |
| **isSystem** | **kotlin.Boolean** | Indicates if the attribute is system. |  |
| **name** | **kotlin.String** | Name of the attribute |  |
| **isEnabled** | **kotlin.Boolean** | Indicates if the attribute is enabled |  |
| **isRequired** | **kotlin.Boolean** | Indicates if the attribute value is mandatory to specify |  |
| **isGlobal** | **kotlin.Boolean** | Indicates if the attribute is available across all projects |  |
| **code** | **kotlin.String** | Optional code identifier for the attribute. |  [optional] |



