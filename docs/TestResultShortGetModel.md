
# TestResultShortGetModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the test result |  |
| **name** | **kotlin.String** | Name of autotest represented by the test result |  |
| **autotestGlobalId** | **kotlin.Long** | Global ID of autotest represented by the test result |  |
| **testRunId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of test run where the test result is located |  |
| **configurationId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of configuration which the test result uses |  |
| **configurationName** | **kotlin.String** | Name of configuration which the test result uses |  |
| **outcome** | **kotlin.String** | Outcome of the test result |  |
| **resultReasons** | [**kotlin.collections.List&lt;AutotestResultReasonSubGetModel&gt;**](AutotestResultReasonSubGetModel.md) | Collection of result reasons which the test result have |  |
| **date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date when the test result was completed or started or created |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date when the test result has been created |  |
| **links** | [**kotlin.collections.List&lt;LinkSubGetModel&gt;**](LinkSubGetModel.md) | Collection of links attached to the test result |  |
| **attachments** | [**kotlin.collections.List&lt;AttachmentModel&gt;**](AttachmentModel.md) | Collection of files attached to the test result |  |
| **comment** | **kotlin.String** | Comment to the test result |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date when the test result has been modified |  [optional] |
| **startedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date when the test result has been started |  [optional] |
| **completedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date when the test result has been completed |  [optional] |
| **duration** | **kotlin.Long** | Time which it took to run the test |  [optional] |



