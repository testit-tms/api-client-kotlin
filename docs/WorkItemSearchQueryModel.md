
# WorkItemSearchQueryModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of project identifiers |  [optional] |
| **links** | [**WorkItemLinkFilterModel**](WorkItemLinkFilterModel.md) | Specifies a work item filter by its links |  [optional] |
| **name** | **kotlin.String** | Name of work item |  [optional] |
| **ids** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a work item unique IDs to search for |  [optional] |
| **globalIds** | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Collection of global (integer) identifiers |  [optional] |
| **attributes** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Set&lt;kotlin.String&gt;&gt;** | Custom attributes of work item |  [optional] |
| **isDeleted** | **kotlin.Boolean** | Is result must consist of only actual/deleted work items |  [optional] |
| **sectionIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of section identifiers |  [optional] |
| **createdByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of identifiers of users who created work item |  [optional] |
| **modifiedByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of identifiers of users who applied last modification to work item |  [optional] |
| **states** | [**kotlin.collections.Set&lt;WorkItemStates&gt;**](WorkItemStates.md) | Collection of states of work item |  [optional] |
| **priorities** | [**kotlin.collections.Set&lt;WorkItemPriorityModel&gt;**](WorkItemPriorityModel.md) | Collection of priorities of work item |  [optional] |
| **sourceTypes** | [**kotlin.collections.Set&lt;WorkItemSourceTypeModel&gt;**](WorkItemSourceTypeModel.md) | Collection of priorities of work item |  [optional] |
| **types** | [**kotlin.collections.Set&lt;WorkItemEntityTypes&gt;**](WorkItemEntityTypes.md) | Collection of types of work item |  [optional] |
| **createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of creation date to search for |  [optional] |
| **modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of last modification date to search for |  [optional] |
| **duration** | [**Int32RangeSelectorModel**](Int32RangeSelectorModel.md) | Specifies a work item duration range to search for |  [optional] |
| **medianDuration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies a work item median duration range to search for |  [optional] |
| **isAutomated** | **kotlin.Boolean** | Is result must consist of only manual/automated work items |  [optional] |
| **tags** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Collection of tags |  [optional] |
| **autoTestIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of identifiers of linked autotests |  [optional] |
| **workItemVersionIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Collection of identifiers work items versions. |  [optional] |



