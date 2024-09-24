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
 * @param globalId Global ID of the label
 * @param name Name of the label
 */


data class LabelShortModel (

    /* Global ID of the label */
    @Json(name = "globalId")
    val globalId: kotlin.Long,

    /* Name of the label */
    @Json(name = "name")
    val name: kotlin.String

) {


}

