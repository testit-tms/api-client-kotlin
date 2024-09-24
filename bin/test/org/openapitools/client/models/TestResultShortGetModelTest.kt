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

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.TestResultShortGetModel
import org.openapitools.client.models.AttachmentModel
import org.openapitools.client.models.AutotestResultReasonSubGetModel
import org.openapitools.client.models.LinkSubGetModel

class TestResultShortGetModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestResultShortGetModel
        //val modelInstance = TestResultShortGetModel()

        // to test the property `id` - Unique ID of the test result
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `name` - Name of autotest represented by the test result
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `autotestGlobalId` - Global ID of autotest represented by the test result
        should("test autotestGlobalId") {
            // uncomment below to test the property
            //modelInstance.autotestGlobalId shouldBe ("TODO")
        }

        // to test the property `testRunId` - Unique ID of test run where the test result is located
        should("test testRunId") {
            // uncomment below to test the property
            //modelInstance.testRunId shouldBe ("TODO")
        }

        // to test the property `configurationId` - Unique ID of configuration which the test result uses
        should("test configurationId") {
            // uncomment below to test the property
            //modelInstance.configurationId shouldBe ("TODO")
        }

        // to test the property `configurationName` - Name of configuration which the test result uses
        should("test configurationName") {
            // uncomment below to test the property
            //modelInstance.configurationName shouldBe ("TODO")
        }

        // to test the property `outcome` - Outcome of the test result
        should("test outcome") {
            // uncomment below to test the property
            //modelInstance.outcome shouldBe ("TODO")
        }

        // to test the property `resultReasons` - Collection of result reasons which the test result have
        should("test resultReasons") {
            // uncomment below to test the property
            //modelInstance.resultReasons shouldBe ("TODO")
        }

        // to test the property `date` - Date when the test result was completed or started or created
        should("test date") {
            // uncomment below to test the property
            //modelInstance.date shouldBe ("TODO")
        }

        // to test the property `createdDate` - Date when the test result has been created
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `links` - Collection of links attached to the test result
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

        // to test the property `attachments` - Collection of files attached to the test result
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `comment` - Comment to the test result
        should("test comment") {
            // uncomment below to test the property
            //modelInstance.comment shouldBe ("TODO")
        }

        // to test the property `modifiedDate` - Date when the test result has been modified
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `startedOn` - Date when the test result has been started
        should("test startedOn") {
            // uncomment below to test the property
            //modelInstance.startedOn shouldBe ("TODO")
        }

        // to test the property `completedOn` - Date when the test result has been completed
        should("test completedOn") {
            // uncomment below to test the property
            //modelInstance.completedOn shouldBe ("TODO")
        }

        // to test the property `duration` - Time which it took to run the test
        should("test duration") {
            // uncomment below to test the property
            //modelInstance.duration shouldBe ("TODO")
        }

    }
}
