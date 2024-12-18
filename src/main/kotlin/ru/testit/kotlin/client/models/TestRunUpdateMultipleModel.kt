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

import ru.testit.kotlin.client.models.TestRunSelectModel
import ru.testit.kotlin.client.models.UpdateAttachmentShortModel
import ru.testit.kotlin.client.models.UpdateLinkShortModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param selectModel Model containing options to filter test runs
 * @param attachmentUpdateScheme 
 * @param linkUpdateScheme 
 * @param description 
 */


data class TestRunUpdateMultipleModel (

    /* Model containing options to filter test runs */
    @Json(name = "selectModel")
    val selectModel: TestRunSelectModel,

    @Json(name = "attachmentUpdateScheme")
    val attachmentUpdateScheme: UpdateAttachmentShortModel,

    @Json(name = "linkUpdateScheme")
    val linkUpdateScheme: UpdateLinkShortModel,

    @Json(name = "description")
    val description: kotlin.String? = null

) {


}

