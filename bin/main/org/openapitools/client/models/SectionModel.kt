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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param isDeleted 
 * @param id 
 * @param createdDate 
 * @param createdById 
 * @param name 
 * @param projectId 
 * @param parentId 
 * @param modifiedDate 
 * @param modifiedById 
 */


data class SectionModel (

    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "projectId")
    val projectId: java.util.UUID? = null,

    @Json(name = "parentId")
    val parentId: java.util.UUID? = null,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null

) {


}

