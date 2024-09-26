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

import ru.testit.kotlin.client.models.WorkItemSelectModel
import ru.testit.kotlin.client.models.WorkItemExtractionModel
import ru.testit.kotlin.client.models.WorkItemFilterModel

class WorkItemSelectModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemSelectModel
        //val modelInstance = WorkItemSelectModel()

        // to test the property `filter` - Collection of filters to apply to search
        should("test filter") {
            // uncomment below to test the property
            //modelInstance.filter shouldBe ("TODO")
        }

        // to test the property `extractionModel` - Rules for different level entities inclusion/exclusion
        should("test extractionModel") {
            // uncomment below to test the property
            //modelInstance.extractionModel shouldBe ("TODO")
        }

    }
}