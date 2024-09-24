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

import org.openapitools.client.models.CustomAttributeOptionModel
import org.openapitools.client.models.CustomAttributeTypesEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Unique ID of the attribute
 * @param options Collection of the attribute options     Available for attributes of type `options` and `multiple options` only
 * @param type Type of the attribute
 * @param isDeleted Indicates if the attribute is deleted
 * @param name Name of the attribute
 * @param isEnabled Indicates if the attribute is enabled
 * @param isRequired Indicates if the attribute value is mandatory to specify
 * @param isGlobal Indicates if the attribute is available across all projects
 */


data class CustomAttributeModel (

    /* Unique ID of the attribute */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Collection of the attribute options     Available for attributes of type `options` and `multiple options` only */
    @Json(name = "options")
    val options: kotlin.collections.List<CustomAttributeOptionModel>,

    /* Type of the attribute */
    @Json(name = "type")
    val type: CustomAttributeTypesEnum,

    /* Indicates if the attribute is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    /* Name of the attribute */
    @Json(name = "name")
    val name: kotlin.String,

    /* Indicates if the attribute is enabled */
    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean,

    /* Indicates if the attribute value is mandatory to specify */
    @Json(name = "isRequired")
    val isRequired: kotlin.Boolean,

    /* Indicates if the attribute is available across all projects */
    @Json(name = "isGlobal")
    val isGlobal: kotlin.Boolean

) {


}
