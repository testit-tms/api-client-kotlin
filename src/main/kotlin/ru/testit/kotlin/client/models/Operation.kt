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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `value` 
 * @param path 
 * @param op 
 * @param from 
 */


data class Operation (

    @Json(name = "value")
    val `value`: kotlin.Any? = null,

    @Json(name = "path")
    val path: kotlin.String? = null,

    @Json(name = "op")
    val op: kotlin.String? = null,

    @Json(name = "from")
    val from: kotlin.String? = null

) {


}

