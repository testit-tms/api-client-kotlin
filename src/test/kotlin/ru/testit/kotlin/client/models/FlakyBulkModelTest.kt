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

import ru.testit.kotlin.client.models.FlakyBulkModel
import ru.testit.kotlin.client.models.AutotestSelectModel

class FlakyBulkModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of FlakyBulkModel
        //val modelInstance = FlakyBulkModel()

        // to test the property `autotestSelect`
        should("test autotestSelect") {
            // uncomment below to test the property
            //modelInstance.autotestSelect shouldBe ("TODO")
        }

        // to test the property ``value`` - Are autotests flaky
        should("test `value`") {
            // uncomment below to test the property
            //modelInstance.`value` shouldBe ("TODO")
        }

    }
}
