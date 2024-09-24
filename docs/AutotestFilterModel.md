
# AutotestFilterModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies an autotest projects IDs to search for |  [optional] |
| **externalIds** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Specifies an autotest external IDs to search for |  [optional] |
| **globalIds** | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Specifies an autotest global IDs to search for |  [optional] |
| **name** | **kotlin.String** | Specifies an autotest name to search for |  [optional] |
| **isFlaky** | **kotlin.Boolean** | Specifies an autotest flaky status to search for |  [optional] |
| **mustBeApproved** | **kotlin.Boolean** | Specifies an autotest unapproved changes status to search for |  [optional] |
| **stabilityPercentage** | [**Int64RangeSelectorModel**](Int64RangeSelectorModel.md) | Specifies an autotest range of stability percentage to search for |  [optional] |
| **createdDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies an autotest range of creation date to search for |  [optional] |
| **createdByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies an autotest creator IDs to search for |  [optional] |
| **modifiedDate** | [**DateTimeRangeSelectorModel**](DateTimeRangeSelectorModel.md) | Specifies an autotest range of last modification date to search for |  [optional] |
| **modifiedByIds** | [**kotlin.collections.Set&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies an autotest last editor IDs to search for |  [optional] |
| **isDeleted** | **kotlin.Boolean** | Specifies an autotest deleted status to search for |  [optional] |
| **namespace** | **kotlin.String** | Specifies an autotest namespace to search for |  [optional] |
| **isEmptyNamespace** | **kotlin.Boolean** | Specifies an autotest namespace name presence status to search for |  [optional] |
| **className** | **kotlin.String** | Specifies an autotest class name to search for |  [optional] |
| **isEmptyClassName** | **kotlin.Boolean** | Specifies an autotest class name presence status to search for |  [optional] |
| **lastTestResultOutcome** | [**AutotestResultOutcome**](AutotestResultOutcome.md) | Specifies an autotest outcome of the last test result to search for |  [optional] |
| **externalKey** | **kotlin.String** | Specifies an autotest external key to search for |  [optional] |



