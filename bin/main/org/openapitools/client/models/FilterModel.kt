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

import org.openapitools.client.models.WorkItemSearchQueryModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param createdDate 
 * @param createdById 
 * @param `data` 
 * @param projectId 
 * @param name 
 * @param id Unique ID of the entity
 * @param isDeleted Indicates if the entity is deleted
 * @param modifiedDate 
 * @param modifiedById 
 * @param fieldsToShow 
 */


data class FilterModel (

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "data")
    val `data`: WorkItemSearchQueryModel,

    @Json(name = "projectId")
    val projectId: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    /* Unique ID of the entity */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Indicates if the entity is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null,

    @Json(name = "fieldsToShow")
    val fieldsToShow: kotlin.Any? = null

) {


}

