
# UpdateTestPlanApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Test plan unique internal identifier |  |
| **name** | **kotlin.String** | Test plan name |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Project unique identifier |  |
| **lockedById** | [**java.util.UUID**](java.util.UUID.md) | User who locked test plan modification internal identifier |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of test plan start |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of test plan end |  [optional] |
| **description** | **kotlin.String** | Test plan description |  [optional] |
| **build** | **kotlin.String** | Build of the application on which test plan is executed |  [optional] |
| **productName** | **kotlin.String** | Name of the testing product |  [optional] |
| **hasAutomaticDurationTimer** | **kotlin.Boolean** | Boolean flag defines if test plan has automatic duration timer |  [optional] |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Key value pair of test plan custom attributes |  [optional] |
| **tags** | [**kotlin.collections.List&lt;TagApiModel&gt;**](TagApiModel.md) | Test plan tag names collection |  [optional] |



