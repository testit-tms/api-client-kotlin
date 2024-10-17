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

import ru.testit.kotlin.client.models.TestRunFillByWorkItemsPostModel
import ru.testit.kotlin.client.models.AttachmentPutModel
import ru.testit.kotlin.client.models.LinkPostModel

class TestRunFillByWorkItemsPostModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunFillByWorkItemsPostModel
        //val modelInstance = TestRunFillByWorkItemsPostModel()

        // to test the property `configurationIds` - Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs.
        should("test configurationIds") {
            // uncomment below to test the property
            //modelInstance.configurationIds shouldBe ("TODO")
        }

        // to test the property `workItemIds` - Specifies the work item GUIDs, from which test points are created. You can specify several GUIDs.
        should("test workItemIds") {
            // uncomment below to test the property
            //modelInstance.workItemIds shouldBe ("TODO")
        }

        // to test the property `projectId` - Specifies the GUID of the project, in which a test run will be created.
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `testPlanId` - Specifies the GUID of the test plan, within which the test run will be created.
        should("test testPlanId") {
            // uncomment below to test the property
            //modelInstance.testPlanId shouldBe ("TODO")
        }

        // to test the property `name` - Specifies the name of the test run.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `description` - Specifies the test run description.
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `launchSource` - Specifies the test run launch source.
        should("test launchSource") {
            // uncomment below to test the property
            //modelInstance.launchSource shouldBe ("TODO")
        }

        // to test the property `attachments` - Collection of attachment ids to relate to the test run
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `links` - Collection of links to relate to the test run
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

    }
}
