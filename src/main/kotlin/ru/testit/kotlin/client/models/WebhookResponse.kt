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
 * @param statusCode 
 * @param requestMeta 
 * @param responseBody 
 * @param responseMeta 
 * @param uri 
 * @param requestBody 
 */


data class WebhookResponse (

    @Json(name = "statusCode")
    val statusCode: kotlin.Int,

    @Json(name = "requestMeta")
    val requestMeta: kotlin.String,

    @Json(name = "responseBody")
    val responseBody: kotlin.String,

    @Json(name = "responseMeta")
    val responseMeta: kotlin.String,

    @Json(name = "uri")
    val uri: kotlin.String? = null,

    @Json(name = "requestBody")
    val requestBody: kotlin.String? = null

) {


}

