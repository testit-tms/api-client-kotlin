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

import ru.testit.kotlin.client.models.GlobalCustomAttributeUpdateModel
import ru.testit.kotlin.client.models.CustomAttributeOptionModel

class GlobalCustomAttributeUpdateModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GlobalCustomAttributeUpdateModel
        //val modelInstance = GlobalCustomAttributeUpdateModel()

        // to test the property `name` - Name of attribute
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `options` - Collection of attribute options     Available for attributes of type `options` and `multiple options` only
        should("test options") {
            // uncomment below to test the property
            //modelInstance.options shouldBe ("TODO")
        }

        // to test the property `isEnabled` - Indicates whether the attribute is available
        should("test isEnabled") {
            // uncomment below to test the property
            //modelInstance.isEnabled shouldBe ("TODO")
        }

        // to test the property `isRequired` - Indicates whether the attribute value is mandatory to specify
        should("test isRequired") {
            // uncomment below to test the property
            //modelInstance.isRequired shouldBe ("TODO")
        }

    }
}
