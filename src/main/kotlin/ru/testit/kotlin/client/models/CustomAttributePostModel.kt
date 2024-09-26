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

import ru.testit.kotlin.client.models.CustomAttributeOptionPostModel
import ru.testit.kotlin.client.models.CustomAttributeTypesEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type Type of attribute
 * @param name Name of the attribute
 * @param isEnabled Indicates if the attribute is enabled
 * @param isRequired Indicates if the attribute value is mandatory to specify
 * @param isGlobal Indicates if the attribute is available across all projects
 * @param options Collection of attribute options     Available for attributes of type `options` and `multiple options` only
 */


data class CustomAttributePostModel (

    /* Type of attribute */
    @Json(name = "type")
    val type: CustomAttributeTypesEnum,

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
    val isGlobal: kotlin.Boolean,

    /* Collection of attribute options     Available for attributes of type `options` and `multiple options` only */
    @Json(name = "options")
    val options: kotlin.collections.List<CustomAttributeOptionPostModel>? = null

) {


}
