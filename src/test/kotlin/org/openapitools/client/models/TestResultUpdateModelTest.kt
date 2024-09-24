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

import org.openapitools.client.models.TestResultUpdateModel
import org.openapitools.client.models.AttachmentPutModel
import org.openapitools.client.models.AttachmentPutModelAutoTestStepResultsModel
import org.openapitools.client.models.LinkModel
import org.openapitools.client.models.StepResultModel
import org.openapitools.client.models.TestResultOutcome
import org.openapitools.client.models.TestResultStepCommentPutModel

class TestResultUpdateModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestResultUpdateModel
        //val modelInstance = TestResultUpdateModel()

        // to test the property `failureClassIds`
        should("test failureClassIds") {
            // uncomment below to test the property
            //modelInstance.failureClassIds shouldBe ("TODO")
        }

        // to test the property `outcome`
        should("test outcome") {
            // uncomment below to test the property
            //modelInstance.outcome shouldBe ("TODO")
        }

        // to test the property `comment`
        should("test comment") {
            // uncomment below to test the property
            //modelInstance.comment shouldBe ("TODO")
        }

        // to test the property `links`
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

        // to test the property `stepResults`
        should("test stepResults") {
            // uncomment below to test the property
            //modelInstance.stepResults shouldBe ("TODO")
        }

        // to test the property `attachments`
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `durationInMs`
        should("test durationInMs") {
            // uncomment below to test the property
            //modelInstance.durationInMs shouldBe ("TODO")
        }

        // to test the property `duration`
        should("test duration") {
            // uncomment below to test the property
            //modelInstance.duration shouldBe ("TODO")
        }

        // to test the property `stepComments`
        should("test stepComments") {
            // uncomment below to test the property
            //modelInstance.stepComments shouldBe ("TODO")
        }

        // to test the property `setupResults`
        should("test setupResults") {
            // uncomment below to test the property
            //modelInstance.setupResults shouldBe ("TODO")
        }

        // to test the property `teardownResults`
        should("test teardownResults") {
            // uncomment below to test the property
            //modelInstance.teardownResults shouldBe ("TODO")
        }

        // to test the property `message`
        should("test message") {
            // uncomment below to test the property
            //modelInstance.message shouldBe ("TODO")
        }

        // to test the property `trace`
        should("test trace") {
            // uncomment below to test the property
            //modelInstance.trace shouldBe ("TODO")
        }

    }
}