
# AutoTestProjectSettingsApiResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Unique ID of the project. |  |
| **isFlakyAuto** | **kotlin.Boolean** | Indicates if the status \&quot;Flaky/Stable\&quot; sets automatically |  |
| **flakyStabilityPercentage** | **kotlin.Int** | Stability percentage for autotest flaky computing |  |
| **flakyTestRunCount** | **kotlin.Int** | Last test run count for autotest flaky computing |  |
| **rerunEnabled** | **kotlin.Boolean** | Auto rerun enabled |  |
| **rerunAttemptsCount** | **kotlin.Int** | Auto rerun attempt count |  |
| **workItemUpdatingEnabled** | **kotlin.Boolean** | Autotest to work item updating enabled |  |
| **workItemUpdatingFields** | [**WorkItemUpdatingFieldsApiResult**](WorkItemUpdatingFieldsApiResult.md) | Autotest to work item updating fields |  |
| **archiveOutdatedTestRunsEnabled** | **kotlin.Boolean** | Indicates whether archiving of outdated test runs is enabled for the project. |  |
| **testRunsArchiveLimitEnabled** | **kotlin.Boolean** | Indicates whether a limit is enforced on the number of archived test runs. |  |
| **testRunsRetentionPeriodDays** | **kotlin.Int** |  The retention period in days for test runs. After this period,  outdated test runs may be archived based on project settings |  |
| **maxActiveTestRunsCount** | **kotlin.Int** | Maximum number of active test runs to keep. When this limit is exceeded,  older test runs are automatically archived |  |



