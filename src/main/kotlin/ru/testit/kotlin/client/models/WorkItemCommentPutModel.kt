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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param text Text of the comment
 * @param id Unique ID of the comment
 */


data class WorkItemCommentPutModel (

    /* Text of the comment */
    @Json(name = "text")
    val text: kotlin.String,

    /* Unique ID of the comment */
    @Json(name = "id")
    val id: java.util.UUID

) {


}

