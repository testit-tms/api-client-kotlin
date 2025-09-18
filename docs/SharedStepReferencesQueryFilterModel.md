
# SharedStepReferencesQueryFilterModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name of work item |  [optional] |
| **globalIds** | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Collection of global (integer) identifiers |  [optional] |
| **sectionIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of section identifiers |  [optional] |
| **createdByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of identifiers of users who created work item |  [optional] |
| **modifiedByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of identifiers of users who applied last modification to work item |  [optional] |
| **states** | [**kotlin.collections.Set&lt;WorkItemStates&gt;**](WorkItemStates.md) | Collection of states of work item |  [optional] |
| **priorities** | [**kotlin.collections.Set&lt;WorkItemPriorityModel&gt;**](WorkItemPriorityModel.md) | Collection of priorities of work item |  [optional] |
| **entityTypes** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Collection of types of work item    Allowed values: &#x60;TestCases&#x60;, &#x60;CheckLists&#x60;, &#x60;SharedSteps&#x60; |  [optional] |
| **createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Date and time of work item creation |  [optional] |
| **modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Date and time of work item last modification |  [optional] |
| **isAutomated** | **kotlin.Boolean** | Is result must consist of only manual/automated work items |  [optional] |
| **tags** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Collection of tags |  [optional] |



