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

import org.openapitools.client.models.CustomAttributeTypesEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name Name of attribute
 * @param projectIds Unique IDs of projects where attribute is in use
 * @param customAttributeIds Unique IDs of attributes for search restriction
 * @param customAttributeTypes Collection of attribute types
 * @param isGlobal Indicates whether the attribute is available across all projects
 * @param isDeleted Indicates whether the attribute is deleted
 */


data class CustomAttributeSearchQueryModel (

    /* Name of attribute */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Unique IDs of projects where attribute is in use */
    @Json(name = "projectIds")
    val projectIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Unique IDs of attributes for search restriction */
    @Json(name = "customAttributeIds")
    val customAttributeIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Collection of attribute types */
    @Json(name = "customAttributeTypes")
    val customAttributeTypes: kotlin.collections.Set<CustomAttributeTypesEnum>? = null,

    /* Indicates whether the attribute is available across all projects */
    @Json(name = "isGlobal")
    val isGlobal: kotlin.Boolean? = null,

    /* Indicates whether the attribute is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean? = null

) {


}

