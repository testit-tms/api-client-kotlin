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
 * @param type 
 * @param oldAttributeName 
 * @param newAttributeName 
 * @param oldValue 
 * @param newValue 
 */


data class CustomAttributeChangeModel (

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "oldAttributeName")
    val oldAttributeName: kotlin.String? = null,

    @Json(name = "newAttributeName")
    val newAttributeName: kotlin.String? = null,

    @Json(name = "oldValue")
    val oldValue: kotlin.Any? = null,

    @Json(name = "newValue")
    val newValue: kotlin.Any? = null

) {


}

