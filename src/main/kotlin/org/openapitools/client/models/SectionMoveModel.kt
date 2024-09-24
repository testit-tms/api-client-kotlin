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
 * @param id Unique ID of the section
 * @param oldParentId Unique ID of the section's current parent section
 * @param parentId Unique ID of the section's target parent section
 * @param nextSectionId Unique ID of the section's following section
 */


data class SectionMoveModel (

    /* Unique ID of the section */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Unique ID of the section's current parent section */
    @Json(name = "oldParentId")
    val oldParentId: java.util.UUID,

    /* Unique ID of the section's target parent section */
    @Json(name = "parentId")
    val parentId: java.util.UUID,

    /* Unique ID of the section's following section */
    @Json(name = "nextSectionId")
    val nextSectionId: java.util.UUID? = null

) {


}

