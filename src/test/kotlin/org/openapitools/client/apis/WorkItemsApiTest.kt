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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.WorkItemsApi
import org.openapitools.client.models.AutoTestModel
import org.openapitools.client.models.IterationModel
import org.openapitools.client.models.ProblemDetails
import org.openapitools.client.models.SharedStepReferenceModel
import org.openapitools.client.models.SharedStepReferenceSectionModel
import org.openapitools.client.models.SharedStepReferenceSectionsQueryFilterModel
import org.openapitools.client.models.SharedStepReferencesQueryFilterModel
import org.openapitools.client.models.TestResultChronologyModel
import org.openapitools.client.models.TestResultHistoryReportModel
import org.openapitools.client.models.ValidationProblemDetails
import org.openapitools.client.models.WorkItemChangeModel
import org.openapitools.client.models.WorkItemLikeModel
import org.openapitools.client.models.WorkItemModel
import org.openapitools.client.models.WorkItemMovePostModel
import org.openapitools.client.models.WorkItemPostModel
import org.openapitools.client.models.WorkItemPutModel
import org.openapitools.client.models.WorkItemSelectModel
import org.openapitools.client.models.WorkItemShortModel
import org.openapitools.client.models.WorkItemVersionModel

class WorkItemsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemsApi
        //val apiInstance = WorkItemsApi()

        // to test apiV2WorkItemsIdAttachmentsPost
        should("test apiV2WorkItemsIdAttachmentsPost") {
            // uncomment below to test apiV2WorkItemsIdAttachmentsPost
            //val id : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Work item internal identifier (guid format)
            //val file : java.io.File = BINARY_DATA_HERE // java.io.File | Select file
            //apiInstance.apiV2WorkItemsIdAttachmentsPost(id, file)
        }

        // to test apiV2WorkItemsIdCheckListTransformToTestCasePost
        should("test apiV2WorkItemsIdCheckListTransformToTestCasePost") {
            // uncomment below to test apiV2WorkItemsIdCheckListTransformToTestCasePost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : WorkItemModel = apiInstance.apiV2WorkItemsIdCheckListTransformToTestCasePost(id)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsIdHistoryGet
        should("test apiV2WorkItemsIdHistoryGet") {
            // uncomment below to test apiV2WorkItemsIdHistoryGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val result : kotlin.collections.List<WorkItemChangeModel> = apiInstance.apiV2WorkItemsIdHistoryGet(id, skip, take, orderBy, searchField, searchValue)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsIdLikeDelete
        should("test apiV2WorkItemsIdLikeDelete") {
            // uncomment below to test apiV2WorkItemsIdLikeDelete
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //apiInstance.apiV2WorkItemsIdLikeDelete(id)
        }

        // to test apiV2WorkItemsIdLikePost
        should("test apiV2WorkItemsIdLikePost") {
            // uncomment below to test apiV2WorkItemsIdLikePost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //apiInstance.apiV2WorkItemsIdLikePost(id)
        }

        // to test apiV2WorkItemsIdLikesCountGet
        should("test apiV2WorkItemsIdLikesCountGet") {
            // uncomment below to test apiV2WorkItemsIdLikesCountGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : kotlin.Int = apiInstance.apiV2WorkItemsIdLikesCountGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsIdLikesGet
        should("test apiV2WorkItemsIdLikesGet") {
            // uncomment below to test apiV2WorkItemsIdLikesGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : kotlin.collections.List<WorkItemLikeModel> = apiInstance.apiV2WorkItemsIdLikesGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsIdTestResultsHistoryGet
        should("test apiV2WorkItemsIdTestResultsHistoryGet") {
            // uncomment below to test apiV2WorkItemsIdTestResultsHistoryGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val from : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Take results from this date
            //val to : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Take results until this date
            //val configurationIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of test result configurations
            //val testPlanIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of test plans which contain test results
            //val userIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of users who set test results
            //val outcomes : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of outcomes of test results
            //val isAutomated : kotlin.Boolean = true // kotlin.Boolean | OBSOLETE: Use `Automated` instead
            //val automated : kotlin.Boolean = true // kotlin.Boolean | If result must consist of only manual/automated test results
            //val testRunIds : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | Identifiers of test runs which contain test results
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val result : kotlin.collections.List<TestResultHistoryReportModel> = apiInstance.apiV2WorkItemsIdTestResultsHistoryGet(id, from, to, configurationIds, testPlanIds, userIds, outcomes, isAutomated, automated, testRunIds, skip, take, orderBy, searchField, searchValue)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsIdVersionVersionIdActualPost
        should("test apiV2WorkItemsIdVersionVersionIdActualPost") {
            // uncomment below to test apiV2WorkItemsIdVersionVersionIdActualPost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val versionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : WorkItemModel = apiInstance.apiV2WorkItemsIdVersionVersionIdActualPost(id, versionId)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsMovePost
        should("test apiV2WorkItemsMovePost") {
            // uncomment below to test apiV2WorkItemsMovePost
            //val workItemMovePostModel : WorkItemMovePostModel =  // WorkItemMovePostModel | 
            //val result : WorkItemShortModel = apiInstance.apiV2WorkItemsMovePost(workItemMovePostModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsSearchPost
        should("test apiV2WorkItemsSearchPost") {
            // uncomment below to test apiV2WorkItemsSearchPost
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val workItemSelectModel : WorkItemSelectModel =  // WorkItemSelectModel | 
            //val result : kotlin.collections.List<WorkItemShortModel> = apiInstance.apiV2WorkItemsSearchPost(skip, take, orderBy, searchField, searchValue, workItemSelectModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsSharedStepIdReferencesSectionsPost
        should("test apiV2WorkItemsSharedStepIdReferencesSectionsPost") {
            // uncomment below to test apiV2WorkItemsSharedStepIdReferencesSectionsPost
            //val sharedStepId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val sharedStepReferenceSectionsQueryFilterModel : SharedStepReferenceSectionsQueryFilterModel =  // SharedStepReferenceSectionsQueryFilterModel | 
            //val result : kotlin.collections.List<SharedStepReferenceSectionModel> = apiInstance.apiV2WorkItemsSharedStepIdReferencesSectionsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferenceSectionsQueryFilterModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsSharedStepIdReferencesWorkItemsPost
        should("test apiV2WorkItemsSharedStepIdReferencesWorkItemsPost") {
            // uncomment below to test apiV2WorkItemsSharedStepIdReferencesWorkItemsPost
            //val sharedStepId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val sharedStepReferencesQueryFilterModel : SharedStepReferencesQueryFilterModel =  // SharedStepReferencesQueryFilterModel | 
            //val result : kotlin.collections.List<SharedStepReferenceModel> = apiInstance.apiV2WorkItemsSharedStepIdReferencesWorkItemsPost(sharedStepId, skip, take, orderBy, searchField, searchValue, sharedStepReferencesQueryFilterModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsSharedStepsSharedStepIdReferencesGet
        should("test apiV2WorkItemsSharedStepsSharedStepIdReferencesGet") {
            // uncomment below to test apiV2WorkItemsSharedStepsSharedStepIdReferencesGet
            //val sharedStepId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //val result : kotlin.collections.List<SharedStepReferenceModel> = apiInstance.apiV2WorkItemsSharedStepsSharedStepIdReferencesGet(sharedStepId)
            //result shouldBe ("TODO")
        }

        // to test createWorkItem
        should("test createWorkItem") {
            // uncomment below to test createWorkItem
            //val workItemPostModel : WorkItemPostModel =  // WorkItemPostModel | 
            //val result : WorkItemModel = apiInstance.createWorkItem(workItemPostModel)
            //result shouldBe ("TODO")
        }

        // to test deleteAllWorkItemsFromAutoTest
        should("test deleteAllWorkItemsFromAutoTest") {
            // uncomment below to test deleteAllWorkItemsFromAutoTest
            //val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
            //apiInstance.deleteAllWorkItemsFromAutoTest(id)
        }

        // to test deleteWorkItem
        should("test deleteWorkItem") {
            // uncomment below to test deleteWorkItem
            //val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
            //apiInstance.deleteWorkItem(id)
        }

        // to test getAutoTestsForWorkItem
        should("test getAutoTestsForWorkItem") {
            // uncomment below to test getAutoTestsForWorkItem
            //val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
            //val result : kotlin.collections.List<AutoTestModel> = apiInstance.getAutoTestsForWorkItem(id)
            //result shouldBe ("TODO")
        }

        // to test getIterations
        should("test getIterations") {
            // uncomment below to test getIterations
            //val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
            //val versionId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | WorkItem version (guid format) identifier
            //val versionNumber : kotlin.Int = 0 // kotlin.Int | WorkItem version number (0 is the last version)\"
            //val result : kotlin.collections.List<IterationModel> = apiInstance.getIterations(id, versionId, versionNumber)
            //result shouldBe ("TODO")
        }

        // to test getWorkItemById
        should("test getWorkItemById") {
            // uncomment below to test getWorkItemById
            //val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
            //val versionId : java.util.UUID = 00000000-0000-0000-0000-000000000000 // java.util.UUID | WorkItem version (guid format) identifier\"
            //val versionNumber : kotlin.Int = 0 // kotlin.Int | WorkItem version number (0 is the last version)\"
            //val result : WorkItemModel = apiInstance.getWorkItemById(id, versionId, versionNumber)
            //result shouldBe ("TODO")
        }

        // to test getWorkItemChronology
        should("test getWorkItemChronology") {
            // uncomment below to test getWorkItemChronology
            //val id : kotlin.String = id_example // kotlin.String | 
            //val result : kotlin.collections.List<TestResultChronologyModel> = apiInstance.getWorkItemChronology(id)
            //result shouldBe ("TODO")
        }

        // to test getWorkItemVersions
        should("test getWorkItemVersions") {
            // uncomment below to test getWorkItemVersions
            //val id : kotlin.String = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // kotlin.String | WorkItem internal (guid format) or  global(integer format) identifier\"
            //val workItemVersionId : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | WorkItem version (guid format)  identifier\"
            //val versionNumber : kotlin.Int = 1 // kotlin.Int | WorkItem version (integer format)  number\"
            //val result : kotlin.collections.List<WorkItemVersionModel> = apiInstance.getWorkItemVersions(id, workItemVersionId, versionNumber)
            //result shouldBe ("TODO")
        }

        // to test purgeWorkItem
        should("test purgeWorkItem") {
            // uncomment below to test purgeWorkItem
            //val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
            //apiInstance.purgeWorkItem(id)
        }

        // to test restoreWorkItem
        should("test restoreWorkItem") {
            // uncomment below to test restoreWorkItem
            //val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
            //apiInstance.restoreWorkItem(id)
        }

        // to test updateWorkItem
        should("test updateWorkItem") {
            // uncomment below to test updateWorkItem
            //val workItemPutModel : WorkItemPutModel =  // WorkItemPutModel | 
            //apiInstance.updateWorkItem(workItemPutModel)
        }

    }
}
