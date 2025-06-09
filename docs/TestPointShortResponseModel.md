
# TestPointShortResponseModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test point |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation date of the test point |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test point creator |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Collection of attributes of work item the test point represents |  |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Collection of the test point tags |  |
| **links** | **kotlin.collections.List&lt;kotlin.String&gt;** | Collection of the test point links |  |
| **testSuiteId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of test suite the test point assigned to |  |
| **testSuiteName** | **kotlin.String** | Name of the test suite |  |
| **workItemId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of work item the test point represents |  |
| **workItemGlobalId** | **kotlin.Long** | Global ID of work item the test point represents |  |
| **workItemVersionId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of work item version the test point represents |  |
| **workItemVersionNumber** | **kotlin.Int** | Number of work item version the test point represents |  |
| **status** | [**TestPointStatus**](TestPointStatus.md) | Status of the test point |  |
| **statusModel** | [**TestStatusApiResult**](TestStatusApiResult.md) | Status of the test point |  |
| **priority** | [**WorkItemPriorityModel**](WorkItemPriorityModel.md) | Priority of the test point |  |
| **sourceType** | [**WorkItemSourceTypeModel**](WorkItemSourceTypeModel.md) | Source type of the test point |  |
| **isAutomated** | **kotlin.Boolean** | Indicates if the test point represents an autotest |  |
| **name** | **kotlin.String** | Name of the test point |  |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test point configuration |  |
| **duration** | **kotlin.Int** | Duration of the test point |  |
| **sectionId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of section where work item the test point represents is located |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test point project |  |
| **iterationId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of work item iteration the test point represents |  |
| **workItemState** | [**WorkItemState**](WorkItemState.md) | Work item state |  |
| **workItemCreatedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the work item creator |  |
| **workItemCreatedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation date of work item |  |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last modification date of the test point |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test point last editor |  [optional] |
| **testerId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test point assigned user |  [optional] |
| **parameters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Collection of the test point parameters |  [optional] |
| **workItemMedianDuration** | **kotlin.Long** | Median duration of work item the test point represents |  [optional] |
| **sectionName** | **kotlin.String** | Name of section where work item the test point represents is located |  [optional] |
| **lastTestResult** | [**LastTestResultModel**](LastTestResultModel.md) | Model of the test point last test result |  [optional] |
| **workItemModifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the work item last editor |  [optional] |
| **workItemModifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Modified date of work item |  [optional] |



