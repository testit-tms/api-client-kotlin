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

import ru.testit.kotlin.client.models.WorkItemGroupGetModel
import ru.testit.kotlin.client.models.WorkItemGroupType
import ru.testit.kotlin.client.models.WorkItemLocalSelectModel

class WorkItemGroupGetModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemGroupGetModel
        //val modelInstance = WorkItemGroupGetModel()

        // to test the property `groupType`
        should("test groupType") {
            // uncomment below to test the property
            //modelInstance.groupType shouldBe ("TODO")
        }

        // to test the property `selectModel` - Model containing options to filter work items
        should("test selectModel") {
            // uncomment below to test the property
            //modelInstance.selectModel shouldBe ("TODO")
        }

        // to test the property `customAttributeId`
        should("test customAttributeId") {
            // uncomment below to test the property
            //modelInstance.customAttributeId shouldBe ("TODO")
        }

    }
}
