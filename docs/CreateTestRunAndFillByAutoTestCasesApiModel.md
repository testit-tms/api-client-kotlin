
# CreateTestRunAndFillByAutoTestCasesApiModel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **projectId** | [**java.util.UUID**](java.util.UUID.md) | Specifies the GUID of the project, in which a test run will be created. |  |
| **configurationIds** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md) | Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs. |  |
| **option** | [**TestRunLaunchOptionApiModel**](TestRunLaunchOptionApiModel.md) | Specifies the test run launch options. |  |
| **filter** | [**CompositeFilter**](CompositeFilter.md) | Specifies the filter for selecting autotests, from which test points are created. |  [optional] |
| **name** | **kotlin.String** | Specifies the name of the test run. |  [optional] |
| **description** | **kotlin.String** | Specifies the test run description. |  [optional] |
| **launchSource** | **kotlin.String** | Specifies the test run launch source. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Collection of tags to assign to the test run |  [optional] |



