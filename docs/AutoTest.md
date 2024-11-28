
# AutoTest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String** | External ID of the autotest |  |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest project |  |
| **name** | **kotlin.String** | Name of the autotest |  |
| **globalId** | **kotlin.Long** | Global ID of the autotest |  |
| **isDeleted** | **kotlin.Boolean** | Indicates if the autotest is deleted |  |
| **mustBeApproved** | **kotlin.Boolean** | Indicates if the autotest has unapproved changes from linked work items |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation date of the autotest |  |
| **createdById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project creator |  |
| **links** | [**kotlin.collections.List&lt;Link&gt;**](Link.md) | Collection of the autotest links |  [optional] |
| **namespace** | **kotlin.String** | Name of the autotest namespace |  [optional] |
| **classname** | **kotlin.String** | Name of the autotest class |  [optional] |
| **steps** | [**kotlin.collections.List&lt;AutoTestStep&gt;**](AutoTestStep.md) | Collection of the autotest steps |  [optional] |
| **setup** | [**kotlin.collections.List&lt;AutoTestStep&gt;**](AutoTestStep.md) | Collection of the autotest setup steps |  [optional] |
| **teardown** | [**kotlin.collections.List&lt;AutoTestStep&gt;**](AutoTestStep.md) | Collection of the autotest teardown steps |  [optional] |
| **title** | **kotlin.String** | Name of the autotest in autotest&#39;s card |  [optional] |
| **description** | **kotlin.String** | Description of the autotest in autotest&#39;s card |  [optional] |
| **labels** | [**kotlin.collections.List&lt;Label&gt;**](Label.md) | Collection of the autotest labels |  [optional] |
| **isFlaky** | **kotlin.Boolean** | Indicates if the autotest is marked as flaky |  [optional] |
| **externalKey** | **kotlin.String** | External key of the autotest |  [optional] |
| **modifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Last modification date of the project |  [optional] |
| **modifiedById** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project last editor |  [optional] |
| **lastTestRunId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest last test run |  [optional] |
| **lastTestRunName** | **kotlin.String** | Name of the autotest last test run |  [optional] |
| **lastTestResultId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the autotest last test result |  [optional] |
| **lastTestResultConfiguration** | [**ConfigurationShort**](ConfigurationShort.md) | Configuration of the autotest last test result |  [optional] |
| **lastTestResultOutcome** | **kotlin.String** | Outcome of the autotest last test result |  [optional] |
| **stabilityPercentage** | **kotlin.Int** | Stability percentage of the autotest |  [optional] |



