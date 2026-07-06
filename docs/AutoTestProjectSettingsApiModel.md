
# AutoTestProjectSettingsApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rerunEnabled** | **kotlin.Boolean** | Auto rerun enabled |  |
| **rerunAttemptsCount** | **kotlin.Int** | Auto rerun attempt count |  |
| **workItemUpdatingFields** | [**WorkItemUpdatingFieldsApiModel**](WorkItemUpdatingFieldsApiModel.md) | Autotest to work item updating fields |  |
| **archiveOutdatedTestRunsEnabled** | **kotlin.Boolean** | Indicates whether archiving of outdated test runs is enabled for the project. |  |
| **testRunsArchiveLimitEnabled** | **kotlin.Boolean** | Indicates whether a limit is enforced on the number of archived test runs. |  |
| **isFlakyAuto** | **kotlin.Boolean** | Indicates if the status \&quot;Flaky/Stable\&quot; sets automatically |  [optional] |
| **flakyStabilityPercentage** | **kotlin.Int** | Stability percentage for autotest flaky computing |  [optional] |
| **flakyTestRunCount** | **kotlin.Int** | Last test run count for autotest flaky computing |  [optional] |
| **workItemUpdatingEnabled** | **kotlin.Boolean** | Autotest to work item updating enabled |  [optional] |
| **testRunsRetentionPeriodDays** | **kotlin.Int** |  The retention period in days for test runs. After this period,  outdated test runs may be archived based on project settings |  [optional] |
| **maxActiveTestRunsCount** | **kotlin.Int** | Maximum number of active test runs to keep. When this limit is exceeded,  older test runs are automatically archived |  [optional] |



