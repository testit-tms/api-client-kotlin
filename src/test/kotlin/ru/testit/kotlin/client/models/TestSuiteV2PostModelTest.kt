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

import ru.testit.kotlin.client.models.TestSuiteV2PostModel
import ru.testit.kotlin.client.models.TestSuiteType

class TestSuiteV2PostModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestSuiteV2PostModel
        //val modelInstance = TestSuiteV2PostModel()

        // to test the property `testPlanId` - Unique ID of test plan to which the test suite belongs
        should("test testPlanId") {
            // uncomment below to test the property
            //modelInstance.testPlanId shouldBe ("TODO")
        }

        // to test the property `name` - Name of the test suite
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `parentId` - Unique ID of the parent test suite in hierarchy
        should("test parentId") {
            // uncomment below to test the property
            //modelInstance.parentId shouldBe ("TODO")
        }

        // to test the property `type` - Type of the test suite
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `saveStructure` - Indicates if the test suite retains section tree structure
        should("test saveStructure") {
            // uncomment below to test the property
            //modelInstance.saveStructure shouldBe ("TODO")
        }

        // to test the property `autoRefresh` - Indicates if scheduled auto refresh is enabled for the test suite
        should("test autoRefresh") {
            // uncomment below to test the property
            //modelInstance.autoRefresh shouldBe ("TODO")
        }

    }
}