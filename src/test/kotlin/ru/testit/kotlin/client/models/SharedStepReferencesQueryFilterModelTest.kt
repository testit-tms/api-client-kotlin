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

import ru.testit.kotlin.client.models.SharedStepReferencesQueryFilterModel
import ru.testit.kotlin.client.models.DateTimeRangeSelectorModel
import ru.testit.kotlin.client.models.WorkItemPriorityModel
import ru.testit.kotlin.client.models.WorkItemStates

class SharedStepReferencesQueryFilterModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SharedStepReferencesQueryFilterModel
        //val modelInstance = SharedStepReferencesQueryFilterModel()

        // to test the property `name` - Name of work item
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `globalIds` - Collection of global (integer) identifiers
        should("test globalIds") {
            // uncomment below to test the property
            //modelInstance.globalIds shouldBe ("TODO")
        }

        // to test the property `sectionIds` - Collection of section identifiers
        should("test sectionIds") {
            // uncomment below to test the property
            //modelInstance.sectionIds shouldBe ("TODO")
        }

        // to test the property `createdByIds` - Collection of identifiers of users who created work item
        should("test createdByIds") {
            // uncomment below to test the property
            //modelInstance.createdByIds shouldBe ("TODO")
        }

        // to test the property `modifiedByIds` - Collection of identifiers of users who applied last modification to work item
        should("test modifiedByIds") {
            // uncomment below to test the property
            //modelInstance.modifiedByIds shouldBe ("TODO")
        }

        // to test the property `states` - Collection of states of work item
        should("test states") {
            // uncomment below to test the property
            //modelInstance.states shouldBe ("TODO")
        }

        // to test the property `priorities` - Collection of priorities of work item
        should("test priorities") {
            // uncomment below to test the property
            //modelInstance.priorities shouldBe ("TODO")
        }

        // to test the property `entityTypes` - Collection of types of work item   Allowed values: `TestCases`, `CheckLists`, `SharedSteps`
        should("test entityTypes") {
            // uncomment below to test the property
            //modelInstance.entityTypes shouldBe ("TODO")
        }

        // to test the property `createdDate` - Date and time of work item creation
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `modifiedDate` - Date and time of work item last modification
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `isAutomated` - Is result must consist of only manual/automated work items
        should("test isAutomated") {
            // uncomment below to test the property
            //modelInstance.isAutomated shouldBe ("TODO")
        }

        // to test the property `tags` - Collection of tags
        should("test tags") {
            // uncomment below to test the property
            //modelInstance.tags shouldBe ("TODO")
        }

    }
}
