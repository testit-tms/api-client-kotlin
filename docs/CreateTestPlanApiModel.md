
# CreateTestPlanApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Test plan name |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Project unique identifier |  |
| **attributes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Key value pair of test plan custom attributes |  |
| **tags** | [**kotlin.collections.List&lt;TagPostModel&gt;**](TagPostModel.md) | Test plan tag names collection |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of test plan start |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time of test plan end |  [optional] |
| **description** | **kotlin.String** | Test plan description |  [optional] |
| **build** | **kotlin.String** | Build of the application on which test plan is executed |  [optional] |
| **productName** | **kotlin.String** | Name of the testing product |  [optional] |
| **hasAutomaticDurationTimer** | **kotlin.Boolean** | Boolean flag defines if test plan has automatic duration timer |  [optional] |
| **testSuite** | [**TestSuiteTestPlanApiModel**](TestSuiteTestPlanApiModel.md) |  |  [optional] |



