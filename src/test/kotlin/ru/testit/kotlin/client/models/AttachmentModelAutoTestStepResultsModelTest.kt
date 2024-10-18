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

import ru.testit.kotlin.client.models.AttachmentModelAutoTestStepResultsModel
import ru.testit.kotlin.client.models.AttachmentModel
import ru.testit.kotlin.client.models.AvailableTestResultOutcome

class AttachmentModelAutoTestStepResultsModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AttachmentModelAutoTestStepResultsModel
        //val modelInstance = AttachmentModelAutoTestStepResultsModel()

        // to test the property `title` - The name of the step.
        should("test title") {
            // uncomment below to test the property
            //modelInstance.title shouldBe ("TODO")
        }

        // to test the property `description` - Description of the step result.
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `info` - Extended description of the step result.
        should("test info") {
            // uncomment below to test the property
            //modelInstance.info shouldBe ("TODO")
        }

        // to test the property `startedOn` - Step start date.
        should("test startedOn") {
            // uncomment below to test the property
            //modelInstance.startedOn shouldBe ("TODO")
        }

        // to test the property `completedOn` - Step end date.
        should("test completedOn") {
            // uncomment below to test the property
            //modelInstance.completedOn shouldBe ("TODO")
        }

        // to test the property `duration` - Expected or actual duration of the test run execution in milliseconds.
        should("test duration") {
            // uncomment below to test the property
            //modelInstance.duration shouldBe ("TODO")
        }

        // to test the property `outcome` - Specifies the result of the autotest execution.
        should("test outcome") {
            // uncomment below to test the property
            //modelInstance.outcome shouldBe ("TODO")
        }

        // to test the property `stepResults` - Nested step results. The maximum nesting level is 15.
        should("test stepResults") {
            // uncomment below to test the property
            //modelInstance.stepResults shouldBe ("TODO")
        }

        // to test the property `attachments` - /// <summary>  Specifies an attachment GUID. Multiple values can be sent.  </summary>
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `parameters` - \"<b>parameter</b>\": \"<b>value</b>\" pair with arbitrary custom parameters. Multiple parameters can be sent.
        should("test parameters") {
            // uncomment below to test the property
            //modelInstance.parameters shouldBe ("TODO")
        }

    }
}
