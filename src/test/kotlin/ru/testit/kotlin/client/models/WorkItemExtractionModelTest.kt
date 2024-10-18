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

import ru.testit.kotlin.client.models.WorkItemExtractionModel
import ru.testit.kotlin.client.models.GuidExtractionModel

class WorkItemExtractionModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemExtractionModel
        //val modelInstance = WorkItemExtractionModel()

        // to test the property `projectIds` - Extraction parameters for projects
        should("test projectIds") {
            // uncomment below to test the property
            //modelInstance.projectIds shouldBe ("TODO")
        }

        // to test the property `ids` - Extraction parameters for work items
        should("test ids") {
            // uncomment below to test the property
            //modelInstance.ids shouldBe ("TODO")
        }

        // to test the property `sectionIds` - Extraction parameters for sections
        should("test sectionIds") {
            // uncomment below to test the property
            //modelInstance.sectionIds shouldBe ("TODO")
        }

    }
}
