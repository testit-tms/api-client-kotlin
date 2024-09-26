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

import ru.testit.kotlin.client.models.UserWithRankModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param text 
 * @param user 
 * @param createdById 
 * @param createdDate 
 * @param modifiedById 
 * @param modifiedDate 
 */


data class WorkItemCommentModel (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "user")
    val user: UserWithRankModel,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null

) {


}
