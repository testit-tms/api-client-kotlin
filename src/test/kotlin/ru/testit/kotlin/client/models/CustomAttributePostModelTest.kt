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

import ru.testit.kotlin.client.models.CustomAttributePostModel
import ru.testit.kotlin.client.models.CustomAttributeOptionPostModel
import ru.testit.kotlin.client.models.CustomAttributeTypesEnum

class CustomAttributePostModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomAttributePostModel
        //val modelInstance = CustomAttributePostModel()

        // to test the property `type` - Type of attribute
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `name` - Name of the attribute
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `isEnabled` - Indicates if the attribute is enabled
        should("test isEnabled") {
            // uncomment below to test the property
            //modelInstance.isEnabled shouldBe ("TODO")
        }

        // to test the property `isRequired` - Indicates if the attribute value is mandatory to specify
        should("test isRequired") {
            // uncomment below to test the property
            //modelInstance.isRequired shouldBe ("TODO")
        }

        // to test the property `isGlobal` - Indicates if the attribute is available across all projects
        should("test isGlobal") {
            // uncomment below to test the property
            //modelInstance.isGlobal shouldBe ("TODO")
        }

        // to test the property `options` - Collection of attribute options     Available for attributes of type `options` and `multiple options` only
        should("test options") {
            // uncomment below to test the property
            //modelInstance.options shouldBe ("TODO")
        }

    }
}