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

import ru.testit.kotlin.client.models.RequestTypeModel
import ru.testit.kotlin.client.models.WebHookEventTypeModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param webHookName 
 * @param eventType 
 * @param webHookId 
 * @param responseStatusCode 
 * @param projectId 
 * @param url 
 * @param requestType 
 * @param createdById 
 * @param id Unique ID of the entity
 * @param isDeleted Indicates if the entity is deleted
 * @param requestBody 
 * @param requestMeta 
 * @param responseBody 
 * @param responseMeta 
 * @param createdDate 
 * @param modifiedDate 
 * @param modifiedById 
 */


data class WebHookLogModel (

    @Json(name = "webHookName")
    val webHookName: kotlin.String,

    @Json(name = "eventType")
    val eventType: WebHookEventTypeModel,

    @Json(name = "webHookId")
    val webHookId: java.util.UUID,

    @Json(name = "responseStatusCode")
    val responseStatusCode: kotlin.Int,

    @Json(name = "projectId")
    val projectId: java.util.UUID,

    @Json(name = "url")
    val url: kotlin.String,

    @Json(name = "requestType")
    val requestType: RequestTypeModel,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    /* Unique ID of the entity */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Indicates if the entity is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "requestBody")
    val requestBody: kotlin.String? = null,

    @Json(name = "requestMeta")
    val requestMeta: kotlin.String? = null,

    @Json(name = "responseBody")
    val responseBody: kotlin.String? = null,

    @Json(name = "responseMeta")
    val responseMeta: kotlin.String? = null,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null

) {


}

