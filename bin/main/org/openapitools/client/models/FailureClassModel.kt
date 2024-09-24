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

import org.openapitools.client.models.FailureCategoryModel
import org.openapitools.client.models.FailureClassRegexModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param failureCategory 
 * @param createdDate 
 * @param createdById 
 * @param id Unique ID of the entity
 * @param isDeleted Indicates if the entity is deleted
 * @param name 
 * @param modifiedDate 
 * @param modifiedById 
 * @param failureClassRegexes 
 */


data class FailureClassModel (

    @Json(name = "failureCategory")
    val failureCategory: FailureCategoryModel,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    /* Unique ID of the entity */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Indicates if the entity is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null,

    @Json(name = "failureClassRegexes")
    val failureClassRegexes: kotlin.collections.List<FailureClassRegexModel>? = null

) {


}
