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

import ru.testit.kotlin.client.models.TestPointSelector

class TestPointSelectorTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestPointSelector
        //val modelInstance = TestPointSelector()

        // to test the property `configurationId` - Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs.
        should("test configurationId") {
            // uncomment below to test the property
            //modelInstance.configurationId shouldBe ("TODO")
        }

        // to test the property `workItemIds` - Specifies the work item GUIDs, from which test points are created. You can specify several GUIDs.
        should("test workItemIds") {
            // uncomment below to test the property
            //modelInstance.workItemIds shouldBe ("TODO")
        }

    }
}