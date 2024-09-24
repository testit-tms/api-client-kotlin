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

import org.openapitools.client.models.TestRunTestResultsSelectModel
import org.openapitools.client.models.GuidExtractionModel
import org.openapitools.client.models.TestResultsLocalFilterModel

class TestRunTestResultsSelectModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunTestResultsSelectModel
        //val modelInstance = TestRunTestResultsSelectModel()

        // to test the property `filter` - Collection of filters to apply to search
        should("test filter") {
            // uncomment below to test the property
            //modelInstance.filter shouldBe ("TODO")
        }

        // to test the property `testResultIdsExtractionModel` - Rules to include and exclude certain entities in result
        should("test testResultIdsExtractionModel") {
            // uncomment below to test the property
            //modelInstance.testResultIdsExtractionModel shouldBe ("TODO")
        }

    }
}
