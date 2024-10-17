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

import ru.testit.kotlin.client.models.WorkItemModel
import ru.testit.kotlin.client.models.AttachmentModel
import ru.testit.kotlin.client.models.AutoTestModel
import ru.testit.kotlin.client.models.IterationModel
import ru.testit.kotlin.client.models.LinkModel
import ru.testit.kotlin.client.models.StepModel
import ru.testit.kotlin.client.models.TagPutModel
import ru.testit.kotlin.client.models.WorkItemEntityTypes
import ru.testit.kotlin.client.models.WorkItemPriorityModel
import ru.testit.kotlin.client.models.WorkItemStates

class WorkItemModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemModel
        //val modelInstance = WorkItemModel()

        // to test the property `versionId` - used for versioning changes in workitem
        should("test versionId") {
            // uncomment below to test the property
            //modelInstance.versionId shouldBe ("TODO")
        }

        // to test the property `medianDuration` - used for getting a median duration of all autotests related to this workitem
        should("test medianDuration") {
            // uncomment below to test the property
            //modelInstance.medianDuration shouldBe ("TODO")
        }

        // to test the property `isDeleted`
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `projectId`
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `entityTypeName`
        should("test entityTypeName") {
            // uncomment below to test the property
            //modelInstance.entityTypeName shouldBe ("TODO")
        }

        // to test the property `isAutomated`
        should("test isAutomated") {
            // uncomment below to test the property
            //modelInstance.isAutomated shouldBe ("TODO")
        }

        // to test the property `versionNumber` - used for define chronology of workitem state in each version
        should("test versionNumber") {
            // uncomment below to test the property
            //modelInstance.versionNumber shouldBe ("TODO")
        }

        // to test the property `createdDate`
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `createdById`
        should("test createdById") {
            // uncomment below to test the property
            //modelInstance.createdById shouldBe ("TODO")
        }

        // to test the property `globalId`
        should("test globalId") {
            // uncomment below to test the property
            //modelInstance.globalId shouldBe ("TODO")
        }

        // to test the property `id`
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `sectionId`
        should("test sectionId") {
            // uncomment below to test the property
            //modelInstance.sectionId shouldBe ("TODO")
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

        // to test the property `duration`
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

        // to test the property `autoTests`
        should("test autoTests") {
            // uncomment below to test the property
            //modelInstance.autoTests shouldBe ("TODO")
        }

        // to test the property `attachments`
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `sectionPreconditionSteps`
        should("test sectionPreconditionSteps") {
            // uncomment below to test the property
            //modelInstance.sectionPreconditionSteps shouldBe ("TODO")
        }

        // to test the property `sectionPostconditionSteps`
        should("test sectionPostconditionSteps") {
            // uncomment below to test the property
            //modelInstance.sectionPostconditionSteps shouldBe ("TODO")
        }

        // to test the property `iterations`
        should("test iterations") {
            // uncomment below to test the property
            //modelInstance.iterations shouldBe ("TODO")
        }

        // to test the property `modifiedDate`
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `modifiedById`
        should("test modifiedById") {
            // uncomment below to test the property
            //modelInstance.modifiedById shouldBe ("TODO")
        }

        // to test the property `description`
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

    }
}
