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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.AttachmentsApi
import org.openapitools.client.models.AttachmentModel
import org.openapitools.client.models.ImageResizeType
import org.openapitools.client.models.ProblemDetails
import org.openapitools.client.models.ValidationProblemDetails

class AttachmentsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AttachmentsApi
        // val apiInstance = AttachmentsApi()

        // to test apiV2AttachmentsIdDelete
        should("test apiV2AttachmentsIdDelete") {
            // uncomment below to test apiV2AttachmentsIdDelete
            // val id : java.util.UUID = java.util.UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d") // java.util.UUID | 
            // apiInstance.apiV2AttachmentsIdDelete(id)
        }

        // to test apiV2AttachmentsIdGet
        should("test apiV2AttachmentsIdGet") {
            // uncomment below to test apiV2AttachmentsIdGet
            // val id : java.util.UUID = java.util.UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d") // java.util.UUID | 
            // val width : kotlin.Int = 56 // kotlin.Int | Width of the result image
            // val height : kotlin.Int = 56 // kotlin.Int | Height of the result image
            // val resizeType : ImageResizeType? = null // ImageResizeType | Type of resizing to apply to the result image
            // val backgroundColor : kotlin.String = "white" // kotlin.String | Color of the background if the `resizeType` is `AddBackgroundStripes`
            // val preview : kotlin.Boolean = true // kotlin.Boolean | If image must be converted to a preview (lower quality, no animation)
            // apiInstance.apiV2AttachmentsIdGet(id, width, height, resizeType, backgroundColor, preview)
        }

        // to test apiV2AttachmentsOccupiedFileStorageSizeGet
        should("test apiV2AttachmentsOccupiedFileStorageSizeGet") {
            // uncomment below to test apiV2AttachmentsOccupiedFileStorageSizeGet
            // val result : kotlin.Long = apiInstance.apiV2AttachmentsOccupiedFileStorageSizeGet()
            // result shouldBe ("TODO")
        }

        // to test apiV2AttachmentsPost
        should("test apiV2AttachmentsPost") {
            // uncomment below to test apiV2AttachmentsPost
            // val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
            // val result : AttachmentModel = apiInstance.apiV2AttachmentsPost(file)
            // result shouldBe ("TODO")
        }

    }
}
