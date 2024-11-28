
# AutotestResultHistoricalGetModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **createdByName** | **kotlin.String** |  |  |
| **testRunId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **configurationName** | **kotlin.String** |  |  |
| **outcome** | [**AutotestResultOutcome**](AutotestResultOutcome.md) |  |  |
| **rerunCount** | **kotlin.Int** |  |  |
| **rerunTestResults** | [**kotlin.collections.List&lt;RerunTestResultModel&gt;**](RerunTestResultModel.md) |  |  |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPlanGlobalId** | **kotlin.Long** |  |  [optional] |
| **testPlanName** | **kotlin.String** |  |  [optional] |
| **duration** | **kotlin.Long** |  |  [optional] |
| **testRunName** | **kotlin.String** |  |  [optional] |
| **launchSource** | **kotlin.String** |  |  [optional] |



