
# AutoTestResultHistoryApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **testRunId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **configurationName** | **kotlin.String** |  |  |
| **outcome** | [**AutotestResultOutcome**](AutotestResultOutcome.md) |  |  |
| **status** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  |
| **rerunCount** | **kotlin.Int** |  |  |
| **rerunTestResults** | [**kotlin.collections.List&lt;RerunTestResultApiResult&gt;**](RerunTestResultApiResult.md) |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **testPlanId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **testPlanGlobalId** | **kotlin.Long** |  |  [optional] |
| **testPlanName** | **kotlin.String** |  |  [optional] |
| **duration** | **kotlin.Long** |  |  [optional] |
| **testRunName** | **kotlin.String** |  |  [optional] |
| **launchSource** | **kotlin.String** |  |  [optional] |
| **createdByName** | **kotlin.String** |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |



