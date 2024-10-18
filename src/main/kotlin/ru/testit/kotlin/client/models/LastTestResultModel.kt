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

import ru.testit.kotlin.client.models.AttachmentModel
import ru.testit.kotlin.client.models.LinkModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param testRunId 
 * @param workItemVersionId 
 * @param autoTestId 
 * @param comment 
 * @param links 
 * @param attachments 
 */


data class LastTestResultModel (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "testRunId")
    val testRunId: java.util.UUID,

    @Json(name = "workItemVersionId")
    val workItemVersionId: java.util.UUID,

    @Json(name = "autoTestId")
    val autoTestId: java.util.UUID? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "links")
    val links: kotlin.collections.List<LinkModel>? = null,

    @Json(name = "attachments")
    val attachments: kotlin.collections.List<AttachmentModel>? = null

) {


}

