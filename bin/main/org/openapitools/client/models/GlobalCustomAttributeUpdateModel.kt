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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name Name of attribute
 * @param options Collection of attribute options     Available for attributes of type `options` and `multiple options` only
 * @param isEnabled Indicates whether the attribute is available
 * @param isRequired Indicates whether the attribute value is mandatory to specify
 */


data class GlobalCustomAttributeUpdateModel (

    /* Name of attribute */
    @Json(name = "name")
    val name: kotlin.String,

    /* Collection of attribute options     Available for attributes of type `options` and `multiple options` only */
    @Json(name = "options")
    val options: kotlin.collections.List<CustomAttributeOptionModel>? = null,

    /* Indicates whether the attribute is available */
    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean? = null,

    /* Indicates whether the attribute value is mandatory to specify */
    @Json(name = "isRequired")
    val isRequired: kotlin.Boolean? = null

) {


}

