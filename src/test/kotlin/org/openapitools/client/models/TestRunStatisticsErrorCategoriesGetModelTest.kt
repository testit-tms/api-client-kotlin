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

import org.openapitools.client.models.TestRunStatisticsErrorCategoriesGetModel

class TestRunStatisticsErrorCategoriesGetModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunStatisticsErrorCategoriesGetModel
        //val modelInstance = TestRunStatisticsErrorCategoriesGetModel()

        // to test the property `noAnalytics` - Number of test results which outcomes were not analyzed
        should("test noAnalytics") {
            // uncomment below to test the property
            //modelInstance.noAnalytics shouldBe ("TODO")
        }

        // to test the property `noDefect` - Number of test results which outcomes were not caused by any defect
        should("test noDefect") {
            // uncomment below to test the property
            //modelInstance.noDefect shouldBe ("TODO")
        }

        // to test the property `infrastructureDefect` - Number of test results which outcomes were caused by some infrastructure defect
        should("test infrastructureDefect") {
            // uncomment below to test the property
            //modelInstance.infrastructureDefect shouldBe ("TODO")
        }

        // to test the property `productDefect` - Number of test results which outcomes were caused by some tested product defect
        should("test productDefect") {
            // uncomment below to test the property
            //modelInstance.productDefect shouldBe ("TODO")
        }

        // to test the property `testDefect` - Number of test results which outcomes were caused by test itself
        should("test testDefect") {
            // uncomment below to test the property
            //modelInstance.testDefect shouldBe ("TODO")
        }

    }
}
