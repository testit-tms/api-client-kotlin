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

import ru.testit.kotlin.client.models.WebhooksDeleteFilterRequest
import ru.testit.kotlin.client.models.WebhooksExtractionRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param filter 
 * @param extractor 
 */


data class WebhooksDeleteRequest (

    @Json(name = "filter")
    val filter: WebhooksDeleteFilterRequest,

    @Json(name = "extractor")
    val extractor: WebhooksExtractionRequest

) {


}
