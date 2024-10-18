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

import ru.testit.kotlin.client.models.AttachmentModel

class AttachmentModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AttachmentModel
        //val modelInstance = AttachmentModel()

        // to test the property `fileId` - Unique ID of the attachment file
        should("test fileId") {
            // uncomment below to test the property
            //modelInstance.fileId shouldBe ("TODO")
        }

        // to test the property `type` - MIME type of the attachment
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `propertySize` - Size in bytes of the attachment file
        should("test propertySize") {
            // uncomment below to test the property
            //modelInstance.propertySize shouldBe ("TODO")
        }

        // to test the property `createdDate` - Creation date of the attachment
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `createdById` - Unique ID of the attachment creator
        should("test createdById") {
            // uncomment below to test the property
            //modelInstance.createdById shouldBe ("TODO")
        }

        // to test the property `name` - Name of the attachment file
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `id` - Unique ID of the attachment
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `modifiedDate` - Last modification date of the attachment
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `modifiedById` - Unique ID of the attachment last editor
        should("test modifiedById") {
            // uncomment below to test the property
            //modelInstance.modifiedById shouldBe ("TODO")
        }

    }
}
