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

import org.openapitools.client.models.TestRunTestResultsPartialBulkSetModel
import org.openapitools.client.models.LinkPostModel
import org.openapitools.client.models.TestRunTestResultsSelectModel

class TestRunTestResultsPartialBulkSetModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunTestResultsPartialBulkSetModel
        //val modelInstance = TestRunTestResultsPartialBulkSetModel()

        // to test the property `selector` - Object with filters and extraction parameters
        should("test selector") {
            // uncomment below to test the property
            //modelInstance.selector shouldBe ("TODO")
        }

        // to test the property `resultReasonIds` - Unique IDs of result reasons to be assigned to test results
        should("test resultReasonIds") {
            // uncomment below to test the property
            //modelInstance.resultReasonIds shouldBe ("TODO")
        }

        // to test the property `links` - Collection of links to be assigned to test results
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

        // to test the property `comment` - Comment to be added to test results
        should("test comment") {
            // uncomment below to test the property
            //modelInstance.comment shouldBe ("TODO")
        }

        // to test the property `attachmentIds` - Unique IDs of files to be attached to test results
        should("test attachmentIds") {
            // uncomment below to test the property
            //modelInstance.attachmentIds shouldBe ("TODO")
        }

    }
}
