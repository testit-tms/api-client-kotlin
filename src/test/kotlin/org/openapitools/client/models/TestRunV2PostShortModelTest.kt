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

import org.openapitools.client.models.TestRunV2PostShortModel
import org.openapitools.client.models.AttachmentPutModel
import org.openapitools.client.models.LinkPostModel

class TestRunV2PostShortModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TestRunV2PostShortModel
        //val modelInstance = TestRunV2PostShortModel()

        // to test the property `projectId` - This property is to link test run with a project
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `name`
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `description`
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `launchSource`
        should("test launchSource") {
            // uncomment below to test the property
            //modelInstance.launchSource shouldBe ("TODO")
        }

        // to test the property `attachments`
        should("test attachments") {
            // uncomment below to test the property
            //modelInstance.attachments shouldBe ("TODO")
        }

        // to test the property `links`
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

    }
}
