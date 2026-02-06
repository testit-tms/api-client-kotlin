
# AutoTestApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **name** | **kotlin.String** |  |  |
| **isFlaky** | **kotlin.Boolean** |  |  |
| **globalId** | **kotlin.Long** |  |  |
| **isDeleted** | **kotlin.Boolean** |  |  |
| **mustBeApproved** | **kotlin.Boolean** |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) |  |  |
| **externalId** | **kotlin.String** |  |  [optional] |
| **namespace** | **kotlin.String** |  |  [optional] |
| **classname** | **kotlin.String** |  |  [optional] |
| **steps** | [**kotlin.collections.List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
| **setup** | [**kotlin.collections.List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
| **teardown** | [**kotlin.collections.List&lt;AutoTestStepApiResult&gt;**](AutoTestStepApiResult.md) |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **externalKey** | **kotlin.String** |  |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **lastTestRunId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **lastTestRunName** | **kotlin.String** |  |  [optional] |
| **lastTestResultId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **lastTestResultConfiguration** | [**ConfigurationShortApiResult**](ConfigurationShortApiResult.md) |  |  [optional] |
| **lastTestResultOutcome** | **kotlin.String** |  |  [optional] |
| **lastTestResultStatus** | [**TestStatusApiResult**](TestStatusApiResult.md) |  |  [optional] |
| **stabilityPercentage** | **kotlin.Long** |  |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkApiResult&gt;**](LinkApiResult.md) |  |  [optional] |
| **labels** | [**kotlin.collections.List&lt;LabelApiResult&gt;**](LabelApiResult.md) |  |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |



