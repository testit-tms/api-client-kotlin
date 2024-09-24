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

import org.openapitools.client.models.WorkItemShortModel
import org.openapitools.client.models.IterationModel
import org.openapitools.client.models.LinkShortModel
import org.openapitools.client.models.WorkItemPriorityModel
import org.openapitools.client.models.WorkItemStates

class WorkItemShortModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemShortModel
        //val modelInstance = WorkItemShortModel()

        // to test the property `id` - Work Item internal unique identifier
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `versionId` - Work Item version identifier
        should("test versionId") {
            // uncomment below to test the property
            //modelInstance.versionId shouldBe ("TODO")
        }

        // to test the property `versionNumber` - Work Item version number
        should("test versionNumber") {
            // uncomment below to test the property
            //modelInstance.versionNumber shouldBe ("TODO")
        }

        // to test the property `name` - Work Item name
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `entityTypeName` - Work Item type. Possible values: CheckLists, SharedSteps, TestCases
        should("test entityTypeName") {
            // uncomment below to test the property
            //modelInstance.entityTypeName shouldBe ("TODO")
        }

        // to test the property `projectId` - Project unique identifier
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `sectionId` - Identifier of Section where Work Item is located
        should("test sectionId") {
            // uncomment below to test the property
            //modelInstance.sectionId shouldBe ("TODO")
        }

        // to test the property `sectionName` - Section name of Work Item
        should("test sectionName") {
            // uncomment below to test the property
            //modelInstance.sectionName shouldBe ("TODO")
        }

        // to test the property `isAutomated` - Boolean flag determining whether Work Item is automated
        should("test isAutomated") {
            // uncomment below to test the property
            //modelInstance.isAutomated shouldBe ("TODO")
        }

        // to test the property `globalId` - Work Item global identifier
        should("test globalId") {
            // uncomment below to test the property
            //modelInstance.globalId shouldBe ("TODO")
        }

        // to test the property `duration` - Work Item duration
        should("test duration") {
            // uncomment below to test the property
            //modelInstance.duration shouldBe ("TODO")
        }

        // to test the property `createdById` - Unique identifier of user who created Work Item
        should("test createdById") {
            // uncomment below to test the property
            //modelInstance.createdById shouldBe ("TODO")
        }

        // to test the property `state` - The current state of Work Item
        should("test state") {
            // uncomment below to test the property
            //modelInstance.state shouldBe ("TODO")
        }

        // to test the property `priority` - Work Item priority level
        should("test priority") {
            // uncomment below to test the property
            //modelInstance.priority shouldBe ("TODO")
        }

        // to test the property `isDeleted` - Flag determining whether Work Item is deleted
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `iterations` - Set of iterations related to Work Item
        should("test iterations") {
            // uncomment below to test the property
            //modelInstance.iterations shouldBe ("TODO")
        }

        // to test the property `links` - Set of links related to Work Item
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

        // to test the property `medianDuration` - Work Item median duration
        should("test medianDuration") {
            // uncomment below to test the property
            //modelInstance.medianDuration shouldBe ("TODO")
        }

        // to test the property `attributes` - Work Item attributes
        should("test attributes") {
            // uncomment below to test the property
            //modelInstance.attributes shouldBe ("TODO")
        }

        // to test the property `modifiedById` - Unique identifier of user who applied the latest modification of Work Item
        should("test modifiedById") {
            // uncomment below to test the property
            //modelInstance.modifiedById shouldBe ("TODO")
        }

        // to test the property `createdDate` - Date and time of Work Item creation
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `modifiedDate` - Date and time of the latest modification of Work Item
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `tagNames` - Array of tag names of Work Item
        should("test tagNames") {
            // uncomment below to test the property
            //modelInstance.tagNames shouldBe ("TODO")
        }

    }
}
