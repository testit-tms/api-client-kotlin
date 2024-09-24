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

import org.openapitools.client.models.WorkItemPostModel
import org.openapitools.client.models.AttachmentPutModel
import org.openapitools.client.models.AutoTestIdModel
import org.openapitools.client.models.IterationPutModel
import org.openapitools.client.models.LinkPostModel
import org.openapitools.client.models.StepPostModel
import org.openapitools.client.models.TagPostModel
import org.openapitools.client.models.WorkItemEntityTypes
import org.openapitools.client.models.WorkItemPriorityModel
import org.openapitools.client.models.WorkItemStates

class WorkItemPostModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemPostModel
        //val modelInstance = WorkItemPostModel()

        // to test the property `entityTypeName`
        should("test entityTypeName") {
            // uncomment below to test the property
            //modelInstance.entityTypeName shouldBe ("TODO")
        }

        // to test the property `state`
        should("test state") {
            // uncomment below to test the property
            //modelInstance.state shouldBe ("TODO")
        }

        // to test the property `priority`
        should("test priority") {
            // uncomment below to test the property
            //modelInstance.priority shouldBe ("TODO")
        }

        // to test the property `steps`
        should("test steps") {
            // uncomment below to test the property
            //modelInstance.steps shouldBe ("TODO")
        }

        // to test the property `preconditionSteps`
        should("test preconditionSteps") {
            // uncomment below to test the property
            //modelInstance.preconditionSteps shouldBe ("TODO")
        }

        // to test the property `postconditionSteps`
        should("test postconditionSteps") {
            // uncomment below to test the property
            //modelInstance.postconditionSteps shouldBe ("TODO")
        }

        // to test the property `duration` - Must be 0 for shared steps and greater than 0 for the other types of work items
        should("test duration") {
            // uncomment below to test the property
            //modelInstance.duration shouldBe ("TODO")
        }

        // to test the property `attributes`
        should("test attributes") {
            // uncomment below to test the property
            //modelInstance.attributes shouldBe ("TODO")
        }

        // to test the property `tags`
        should("test tags") {
            // uncomment below to test the property
            //modelInstance.tags shouldBe ("TODO")
        }

        // to test the property `links`
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

        // to test the property `name`
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `projectId` - This property is used to link workitem with project
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `sectionId`
        should("test sectionId") {
            // uncomment below to test the property
            //modelInstance.sectionId shouldBe ("TODO")
        }

        // to test the property `description`
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `attachments`
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `iterations`
        should("test iterations") {
            // uncomment below to test the property
            //modelInstance.iterations shouldBe ("TODO")
        }

        // to test the property `autoTests`
        should("test autoTests") {
            // uncomment below to test the property
            //modelInstance.autoTests shouldBe ("TODO")
        }

    }
}