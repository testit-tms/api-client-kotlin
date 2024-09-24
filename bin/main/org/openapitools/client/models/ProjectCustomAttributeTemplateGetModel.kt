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

import org.openapitools.client.models.CustomAttributeModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Unique ID of the custom attributes template
 * @param isDeleted Indicates if the custom attribute template is deleted
 * @param name Name of the custom attribute template
 * @param customAttributeModels Attributes of the template
 */


data class ProjectCustomAttributeTemplateGetModel (

    /* Unique ID of the custom attributes template */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Indicates if the custom attribute template is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    /* Name of the custom attribute template */
    @Json(name = "name")
    val name: kotlin.String,

    /* Attributes of the template */
    @Json(name = "customAttributeModels")
    val customAttributeModels: kotlin.collections.List<CustomAttributeModel>

) {


}

