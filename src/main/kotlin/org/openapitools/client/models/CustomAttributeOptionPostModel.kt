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
 * @param isDefault Indicates if the attribute option is used by default
 * @param `value` Value of the attribute option
 */


data class CustomAttributeOptionPostModel (

    /* Indicates if the attribute option is used by default */
    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean,

    /* Value of the attribute option */
    @Json(name = "value")
    val `value`: kotlin.String? = null

) {


}

