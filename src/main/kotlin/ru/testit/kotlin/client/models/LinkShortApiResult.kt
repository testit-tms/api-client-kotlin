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
 * @param id 
 * @param title 
 * @param url 
 * @param type 
 */


data class LinkShortApiResult (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "url")
    val url: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String

) {


}

