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

import ru.testit.kotlin.client.models.RequestTypeModel
import ru.testit.kotlin.client.models.WebHookEventTypeModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param projectId Unique ID of the webhook project
 * @param eventType Type of event which triggers the webhook
 * @param url Request URL of the webhook
 * @param requestType Request method of the webhook
 * @param shouldSendBody Indicates if the webhook sends body
 * @param headers Collection of the webhook headers
 * @param queryParameters Collection of the webhook query parameters
 * @param isEnabled Indicates if the webhook is active
 * @param shouldSendCustomBody Indicates if the webhook sends custom body
 * @param shouldReplaceParameters Indicates if the webhook injects parameters
 * @param shouldEscapeParameters Indicates if the webhook escapes invalid characters in parameters
 * @param name Name of the webhook
 * @param description Description of the webhook
 * @param customBody Custom body of the webhook
 */


data class WebHookPostModel (

    /* Unique ID of the webhook project */
    @Json(name = "projectId")
    val projectId: java.util.UUID,

    /* Type of event which triggers the webhook */
    @Json(name = "eventType")
    val eventType: WebHookEventTypeModel,

    /* Request URL of the webhook */
    @Json(name = "url")
    val url: kotlin.String,

    /* Request method of the webhook */
    @Json(name = "requestType")
    val requestType: RequestTypeModel,

    /* Indicates if the webhook sends body */
    @Json(name = "shouldSendBody")
    val shouldSendBody: kotlin.Boolean,

    /* Collection of the webhook headers */
    @Json(name = "headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.String>,

    /* Collection of the webhook query parameters */
    @Json(name = "queryParameters")
    val queryParameters: kotlin.collections.Map<kotlin.String, kotlin.String>,

    /* Indicates if the webhook is active */
    @Json(name = "isEnabled")
    val isEnabled: kotlin.Boolean,

    /* Indicates if the webhook sends custom body */
    @Json(name = "shouldSendCustomBody")
    val shouldSendCustomBody: kotlin.Boolean,

    /* Indicates if the webhook injects parameters */
    @Json(name = "shouldReplaceParameters")
    val shouldReplaceParameters: kotlin.Boolean,

    /* Indicates if the webhook escapes invalid characters in parameters */
    @Json(name = "shouldEscapeParameters")
    val shouldEscapeParameters: kotlin.Boolean,

    /* Name of the webhook */
    @Json(name = "name")
    val name: kotlin.String,

    /* Description of the webhook */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Custom body of the webhook */
    @Json(name = "customBody")
    val customBody: kotlin.String? = null

) {


}

