
# ProjectShortModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project |  |
| **name** | **kotlin.String** | Name of the project |  |
| **isFavorite** | **kotlin.Boolean** | Indicates if the project is marked as favorite |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the project is deleted |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation date of the project |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project creator |  |
| **globalId** | **kotlin.Long** | Global ID of the project |  |
| **type** | [**ProjectTypeModel**](ProjectTypeModel.md) | Type of the project |  |
| **workflowId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **description** | **kotlin.String** | Description of the project |  [optional] |
| **testCasesCount** | **kotlin.Int** | Number of test cases in the project |  [optional] |
| **sharedStepsCount** | **kotlin.Int** | Number of shared steps in the project |  [optional] |
| **checkListsCount** | **kotlin.Int** | Number of checklists in the project |  [optional] |
| **autoTestsCount** | **kotlin.Int** | Number of autotests in the project |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last modification date of the project |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project last editor |  [optional] |
| **isFlakyAuto** | **kotlin.Boolean** | Indicates if the status \&quot;Flaky/Stable\&quot; sets automatically |  [optional] |



