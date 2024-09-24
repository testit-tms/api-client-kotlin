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

import org.openapitools.client.models.ProjectModel
import org.openapitools.client.models.CustomAttributeModel
import org.openapitools.client.models.ProjectTypeModel

class ProjectModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProjectModel
        //val modelInstance = ProjectModel()

        // to test the property `id` - Unique ID of the project
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `name` - Name of the project
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `isFavorite` - Indicates if the project is marked as favorite
        should("test isFavorite") {
            // uncomment below to test the property
            //modelInstance.isFavorite shouldBe ("TODO")
        }

        // to test the property `isDeleted` - Indicates if the project is deleted
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `createdDate` - Creation date of the project
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `createdById` - Unique ID of the project creator
        should("test createdById") {
            // uncomment below to test the property
            //modelInstance.createdById shouldBe ("TODO")
        }

        // to test the property `globalId` - Global ID of the project
        should("test globalId") {
            // uncomment below to test the property
            //modelInstance.globalId shouldBe ("TODO")
        }

        // to test the property `type` - Type of the project
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `isFlakyAuto` - Indicates if the status \"Flaky/Stable\" sets automatically
        should("test isFlakyAuto") {
            // uncomment below to test the property
            //modelInstance.isFlakyAuto shouldBe ("TODO")
        }

        // to test the property `description` - Description of the project
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `attributesScheme` - Collection of the project attributes
        should("test attributesScheme") {
            // uncomment below to test the property
            //modelInstance.attributesScheme shouldBe ("TODO")
        }

        // to test the property `testPlansAttributesScheme` - Collection of the project test plans attributes
        should("test testPlansAttributesScheme") {
            // uncomment below to test the property
            //modelInstance.testPlansAttributesScheme shouldBe ("TODO")
        }

        // to test the property `testCasesCount` - Number of test cases in the project
        should("test testCasesCount") {
            // uncomment below to test the property
            //modelInstance.testCasesCount shouldBe ("TODO")
        }

        // to test the property `sharedStepsCount` - Number of shared steps in the project
        should("test sharedStepsCount") {
            // uncomment below to test the property
            //modelInstance.sharedStepsCount shouldBe ("TODO")
        }

        // to test the property `checkListsCount` - Number of checklists in the project
        should("test checkListsCount") {
            // uncomment below to test the property
            //modelInstance.checkListsCount shouldBe ("TODO")
        }

        // to test the property `autoTestsCount` - Number of autotests in the project
        should("test autoTestsCount") {
            // uncomment below to test the property
            //modelInstance.autoTestsCount shouldBe ("TODO")
        }

        // to test the property `modifiedDate` - Last modification date of the project
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `modifiedById` - Unique ID of the project last editor
        should("test modifiedById") {
            // uncomment below to test the property
            //modelInstance.modifiedById shouldBe ("TODO")
        }

    }
}
