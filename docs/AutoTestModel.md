
# AutoTestModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **globalId** | **kotlin.Long** | Global ID of the autotest |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the autotest is deleted |  |
| **mustBeApproved** | **kotlin.Boolean** | Indicates if the autotest has unapproved changes from linked work items |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation date of the autotest |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project creator |  |
| **lastTestResultStatus** | [**TestStatusModel**](TestStatusModel.md) | Status of the autotest last test result |  |
| **externalId** | **kotlin.String** | External ID of the autotest |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest project |  |
| **name** | **kotlin.String** | Name of the autotest |  |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last modification date of the project |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project last editor |  [optional] |
| **lastTestRunId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest last test run |  [optional] |
| **lastTestRunName** | **kotlin.String** | Name of the autotest last test run |  [optional] |
| **lastTestResultId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest last test result |  [optional] |
| **lastTestResultConfiguration** | [**ConfigurationShortModel**](ConfigurationShortModel.md) | Configuration of the autotest last test result |  [optional] |
| **lastTestResultOutcome** | **kotlin.String** | Outcome of the autotest last test result |  [optional] |
| **stabilityPercentage** | **kotlin.Int** | Stability percentage of the autotest |  [optional] |
| **links** | [**kotlin.collections.List&lt;LinkPutModel&gt;**](LinkPutModel.md) | Collection of the autotest links |  [optional] |
| **namespace** | **kotlin.String** | Name of the autotest namespace |  [optional] |
| **classname** | **kotlin.String** | Name of the autotest class |  [optional] |
| **steps** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest steps |  [optional] |
| **setup** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest setup steps |  [optional] |
| **teardown** | [**kotlin.collections.List&lt;AutoTestStepModel&gt;**](AutoTestStepModel.md) | Collection of the autotest teardown steps |  [optional] |
| **title** | **kotlin.String** | Name of the autotest in autotest&#39;s card |  [optional] |
| **description** | **kotlin.String** | Description of the autotest in autotest&#39;s card |  [optional] |
| **labels** | [**kotlin.collections.List&lt;LabelShortModel&gt;**](LabelShortModel.md) | Collection of the autotest labels |  [optional] |
| **isFlaky** | **kotlin.Boolean** | Indicates if the autotest is marked as flaky |  [optional] |
| **externalKey** | **kotlin.String** | External key of the autotest |  [optional] |



