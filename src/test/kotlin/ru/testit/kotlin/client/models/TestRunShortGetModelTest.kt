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

import ru.testit.kotlin.client.models.TestRunShortGetModel
import ru.testit.kotlin.client.models.TestResultsStatisticsGetModel
import ru.testit.kotlin.client.models.TestRunState

class TestRunShortGetModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunShortGetModel
        //val modelInstance = TestRunShortGetModel()

        // to test the property `id` - Unique ID of the test run
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `name` - Name of the test run
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `state` - Current state of the test run
        should("test state") {
            // uncomment below to test the property
            //modelInstance.state shouldBe ("TODO")
        }

        // to test the property `createdDate` - Date when the test run was created
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `createdById` - Unique ID of user who created the test run
        should("test createdById") {
            // uncomment below to test the property
            //modelInstance.createdById shouldBe ("TODO")
        }

        // to test the property `isDeleted` - Is the test run is deleted
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `autoTestsCount` - Number of AutoTests run in the test run
        should("test autoTestsCount") {
            // uncomment below to test the property
            //modelInstance.autoTestsCount shouldBe ("TODO")
        }

        // to test the property `statistics` - Statistics of the test run
        should("test statistics") {
            // uncomment below to test the property
            //modelInstance.statistics shouldBe ("TODO")
        }

        // to test the property `startedDate` - Date when the test run was started
        should("test startedDate") {
            // uncomment below to test the property
            //modelInstance.startedDate shouldBe ("TODO")
        }

        // to test the property `completedDate` - Completion date of the test run
        should("test completedDate") {
            // uncomment below to test the property
            //modelInstance.completedDate shouldBe ("TODO")
        }

        // to test the property `modifiedById` - Unique ID of user who modified the test run last time
        should("test modifiedById") {
            // uncomment below to test the property
            //modelInstance.modifiedById shouldBe ("TODO")
        }

    }
}
