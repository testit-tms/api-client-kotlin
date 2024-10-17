/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ru.testit.kotlin.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ru.testit.kotlin.client.apis.TestRunsApi
import ru.testit.kotlin.client.models.AutoTestResultsForTestRunModel
import ru.testit.kotlin.client.models.ProblemDetails
import ru.testit.kotlin.client.models.TestPointResultModel
import ru.testit.kotlin.client.models.TestResultsLocalFilterModel
import ru.testit.kotlin.client.models.TestResultsStatisticsGetModel
import ru.testit.kotlin.client.models.TestRunFillByAutoTestsPostModel
import ru.testit.kotlin.client.models.TestRunFillByConfigurationsPostModel
import ru.testit.kotlin.client.models.TestRunFillByWorkItemsPostModel
import ru.testit.kotlin.client.models.TestRunFilterModel
import ru.testit.kotlin.client.models.TestRunSelectModel
import ru.testit.kotlin.client.models.TestRunShortGetModel
import ru.testit.kotlin.client.models.TestRunTestResultsPartialBulkSetModel
import ru.testit.kotlin.client.models.TestRunUpdateMultipleModel
import ru.testit.kotlin.client.models.TestRunV2GetModel
import ru.testit.kotlin.client.models.TestRunV2PostShortModel
import ru.testit.kotlin.client.models.TestRunV2PutModel
import ru.testit.kotlin.client.models.ValidationProblemDetails

class TestRunsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunsApi
        //val apiInstance = TestRunsApi()

        // to test apiV2TestRunsDelete
        should("test apiV2TestRunsDelete") {
            // uncomment below to test apiV2TestRunsDelete
            //val testRunSelectModel : TestRunSelectModel =  // TestRunSelectModel | 
            //val result : kotlin.Int = apiInstance.apiV2TestRunsDelete(testRunSelectModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2TestRunsIdDelete
        should("test apiV2TestRunsIdDelete") {
            // uncomment below to test apiV2TestRunsIdDelete
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run internal (UUID) identifier
            //apiInstance.apiV2TestRunsIdDelete(id)
        }

        // to test apiV2TestRunsIdPurgePost
        should("test apiV2TestRunsIdPurgePost") {
            // uncomment below to test apiV2TestRunsIdPurgePost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run internal (UUID) identifier
            //apiInstance.apiV2TestRunsIdPurgePost(id)
        }

        // to test apiV2TestRunsIdRestorePost
        should("test apiV2TestRunsIdRestorePost") {
            // uncomment below to test apiV2TestRunsIdRestorePost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of the test run
            //apiInstance.apiV2TestRunsIdRestorePost(id)
        }

        // to test apiV2TestRunsIdStatisticsFilterPost
        should("test apiV2TestRunsIdStatisticsFilterPost") {
            // uncomment below to test apiV2TestRunsIdStatisticsFilterPost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
            //val testResultsLocalFilterModel : TestResultsLocalFilterModel =  // TestResultsLocalFilterModel | 
            //val result : TestResultsStatisticsGetModel = apiInstance.apiV2TestRunsIdStatisticsFilterPost(id, testResultsLocalFilterModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2TestRunsIdTestPointsResultsGet
        should("test apiV2TestRunsIdTestPointsResultsGet") {
            // uncomment below to test apiV2TestRunsIdTestPointsResultsGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
            //val result : kotlin.collections.List<TestPointResultModel> = apiInstance.apiV2TestRunsIdTestPointsResultsGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiV2TestRunsIdTestResultsBulkPut
        should("test apiV2TestRunsIdTestResultsBulkPut") {
            // uncomment below to test apiV2TestRunsIdTestResultsBulkPut
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
            //val testRunTestResultsPartialBulkSetModel : TestRunTestResultsPartialBulkSetModel =  // TestRunTestResultsPartialBulkSetModel | 
            //apiInstance.apiV2TestRunsIdTestResultsBulkPut(id, testRunTestResultsPartialBulkSetModel)
        }

        // to test apiV2TestRunsIdTestResultsLastModifiedModificationDateGet
        should("test apiV2TestRunsIdTestResultsLastModifiedModificationDateGet") {
            // uncomment below to test apiV2TestRunsIdTestResultsLastModifiedModificationDateGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test run unique ID
            //val result : java.time.OffsetDateTime = apiInstance.apiV2TestRunsIdTestResultsLastModifiedModificationDateGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiV2TestRunsPurgeBulkPost
        should("test apiV2TestRunsPurgeBulkPost") {
            // uncomment below to test apiV2TestRunsPurgeBulkPost
            //val testRunSelectModel : TestRunSelectModel =  // TestRunSelectModel | 
            //val result : kotlin.Int = apiInstance.apiV2TestRunsPurgeBulkPost(testRunSelectModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2TestRunsRestoreBulkPost
        should("test apiV2TestRunsRestoreBulkPost") {
            // uncomment below to test apiV2TestRunsRestoreBulkPost
            //val testRunSelectModel : TestRunSelectModel =  // TestRunSelectModel | 
            //val result : kotlin.Int = apiInstance.apiV2TestRunsRestoreBulkPost(testRunSelectModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2TestRunsSearchPost
        should("test apiV2TestRunsSearchPost") {
            // uncomment below to test apiV2TestRunsSearchPost
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val testRunFilterModel : TestRunFilterModel =  // TestRunFilterModel | 
            //val result : kotlin.collections.List<TestRunShortGetModel> = apiInstance.apiV2TestRunsSearchPost(skip, take, orderBy, searchField, searchValue, testRunFilterModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2TestRunsUpdateMultiplePost
        should("test apiV2TestRunsUpdateMultiplePost") {
            // uncomment below to test apiV2TestRunsUpdateMultiplePost
            //val testRunUpdateMultipleModel : TestRunUpdateMultipleModel =  // TestRunUpdateMultipleModel | 
            //apiInstance.apiV2TestRunsUpdateMultiplePost(testRunUpdateMultipleModel)
        }

        // to test completeTestRun
        should("test completeTestRun") {
            // uncomment below to test completeTestRun
            //val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
            //apiInstance.completeTestRun(id)
        }

        // to test createAndFillByAutoTests
        should("test createAndFillByAutoTests") {
            // uncomment below to test createAndFillByAutoTests
            //val testRunFillByAutoTestsPostModel : TestRunFillByAutoTestsPostModel =  // TestRunFillByAutoTestsPostModel | 
            //val result : TestRunV2GetModel = apiInstance.createAndFillByAutoTests(testRunFillByAutoTestsPostModel)
            //result shouldBe ("TODO")
        }

        // to test createAndFillByConfigurations
        should("test createAndFillByConfigurations") {
            // uncomment below to test createAndFillByConfigurations
            //val testRunFillByConfigurationsPostModel : TestRunFillByConfigurationsPostModel =  // TestRunFillByConfigurationsPostModel | 
            //val result : TestRunV2GetModel = apiInstance.createAndFillByConfigurations(testRunFillByConfigurationsPostModel)
            //result shouldBe ("TODO")
        }

        // to test createAndFillByWorkItems
        should("test createAndFillByWorkItems") {
            // uncomment below to test createAndFillByWorkItems
            //val testRunFillByWorkItemsPostModel : TestRunFillByWorkItemsPostModel =  // TestRunFillByWorkItemsPostModel | 
            //val result : TestRunV2GetModel = apiInstance.createAndFillByWorkItems(testRunFillByWorkItemsPostModel)
            //result shouldBe ("TODO")
        }

        // to test createEmpty
        should("test createEmpty") {
            // uncomment below to test createEmpty
            //val testRunV2PostShortModel : TestRunV2PostShortModel =  // TestRunV2PostShortModel | 
            //val result : TestRunV2GetModel = apiInstance.createEmpty(testRunV2PostShortModel)
            //result shouldBe ("TODO")
        }

        // to test getTestRunById
        should("test getTestRunById") {
            // uncomment below to test getTestRunById
            //val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
            //val result : TestRunV2GetModel = apiInstance.getTestRunById(id)
            //result shouldBe ("TODO")
        }

        // to test setAutoTestResultsForTestRun
        should("test setAutoTestResultsForTestRun") {
            // uncomment below to test setAutoTestResultsForTestRun
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Test Run internal identifier (GUID format)
            //val autoTestResultsForTestRunModel : kotlin.collections.List<AutoTestResultsForTestRunModel> =  // kotlin.collections.List<AutoTestResultsForTestRunModel> | 
            //val result : kotlin.collections.List<java.util.UUID> = apiInstance.setAutoTestResultsForTestRun(id, autoTestResultsForTestRunModel)
            //result shouldBe ("TODO")
        }

        // to test startTestRun
        should("test startTestRun") {
            // uncomment below to test startTestRun
            //val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
            //apiInstance.startTestRun(id)
        }

        // to test stopTestRun
        should("test stopTestRun") {
            // uncomment below to test stopTestRun
            //val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Test Run internal identifier (GUID format)
            //apiInstance.stopTestRun(id)
        }

        // to test updateEmpty
        should("test updateEmpty") {
            // uncomment below to test updateEmpty
            //val testRunV2PutModel : TestRunV2PutModel =  // TestRunV2PutModel | 
            //apiInstance.updateEmpty(testRunV2PutModel)
        }

    }
}
