
# TestPlanTestPointsSearchApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **testSuiteIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test point test suite IDs to search for |  [optional] |
| **workItemGlobalIds** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Specifies a test point work item global IDs to search for |  [optional] |
| **workItemMedianDuration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies a test point work item median duration range to search for |  [optional] |
| **statuses** | [**kotlin.collections.List&lt;TestPointStatus&gt;**](TestPointStatus.md) | Specifies a test point statuses to search for |  [optional] |
| **statusCodes** | **kotlin.collections.List&lt;kotlin.String&gt;** | Specifies a test point status codes to search for |  [optional] |
| **priorities** | [**kotlin.collections.List&lt;WorkItemPriorityModel&gt;**](WorkItemPriorityModel.md) | Specifies a test point priorities to search for |  [optional] |
| **isAutomated** | **kotlin.Boolean** | Specifies a test point automation status to search for |  [optional] |
| **name** | **kotlin.String** | Specifies a test point name to search for |  [optional] |
| **configurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test point configuration IDs to search for |  [optional] |
| **testerIds** | [**kotlin.collections.List&lt;java.util.UUID?&gt;**](java.util.UUID.md) | Specifies a test point assigned user IDs to search for |  [optional] |
| **duration** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies a test point range of duration to search for |  [optional] |
| **sectionIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test point work item section IDs to search for |  [optional] |
| **createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test point range of creation date to search for |  [optional] |
| **createdByIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test point creator IDs to search for |  [optional] |
| **modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a test point range of last modification date to search for |  [optional] |
| **modifiedByIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a test point last editor IDs to search for |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Specifies a test point tags to search for |  [optional] |
| **excludeTags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Specifies a test point tags to exclude to search for |  [optional] |
| **attributes** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.Set&lt;kotlin.String&gt;&gt;** | Specifies a test point attributes to search for |  [optional] |
| **workItemCreatedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of creation date to search for |  [optional] |
| **workItemCreatedByIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a work item creator IDs to search for |  [optional] |
| **workItemModifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies a work item range of last modification date to search for |  [optional] |
| **workItemModifiedByIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies a work item last editor IDs to search for |  [optional] |



