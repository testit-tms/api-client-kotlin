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

package ru.testit.kotlin.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ru.testit.kotlin.client.models.TestRunFilterModel
import ru.testit.kotlin.client.models.DateTimeRangeSelectorModel
import ru.testit.kotlin.client.models.FailureCategoryModel
import ru.testit.kotlin.client.models.Int32RangeSelectorModel
import ru.testit.kotlin.client.models.TestResultOutcome
import ru.testit.kotlin.client.models.TestRunState

class TestRunFilterModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunFilterModel
        //val modelInstance = TestRunFilterModel()

        // to test the property `projectIds` - Specifies a test run project IDs to search for
        should("test projectIds") {
            // uncomment below to test the property
            //modelInstance.projectIds shouldBe ("TODO")
        }

        // to test the property `name` - Specifies test run name
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `states` - Specifies a test run states to search for
        should("test states") {
            // uncomment below to test the property
            //modelInstance.states shouldBe ("TODO")
        }

        // to test the property `createdDate` - Specifies a test run range of created date to search for
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `startedDate` - Specifies a test run range of started date to search for
        should("test startedDate") {
            // uncomment below to test the property
            //modelInstance.startedDate shouldBe ("TODO")
        }

        // to test the property `createdByIds` - Specifies a test run creator IDs to search for
        should("test createdByIds") {
            // uncomment below to test the property
            //modelInstance.createdByIds shouldBe ("TODO")
        }

        // to test the property `modifiedByIds` - Specifies a test run last editor IDs to search for
        should("test modifiedByIds") {
            // uncomment below to test the property
            //modelInstance.modifiedByIds shouldBe ("TODO")
        }

        // to test the property `isDeleted` - Specifies a test run deleted status to search for
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `autoTestsCount` - Number of autoTests run in the test run
        should("test autoTestsCount") {
            // uncomment below to test the property
            //modelInstance.autoTestsCount shouldBe ("TODO")
        }

        // to test the property `testResultsOutcome` - Specifies test results outcomes
        should("test testResultsOutcome") {
            // uncomment below to test the property
            //modelInstance.testResultsOutcome shouldBe ("TODO")
        }

        // to test the property `failureCategory` - Specifies failure categories
        should("test failureCategory") {
            // uncomment below to test the property
            //modelInstance.failureCategory shouldBe ("TODO")
        }

        // to test the property `completedDate` - Specifies a test run range of completed date to search for
        should("test completedDate") {
            // uncomment below to test the property
            //modelInstance.completedDate shouldBe ("TODO")
        }

    }
}
