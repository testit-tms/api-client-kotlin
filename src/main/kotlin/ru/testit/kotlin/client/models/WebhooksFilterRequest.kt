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

import ru.testit.kotlin.client.models.RequestTypeRequest
import ru.testit.kotlin.client.models.WebHookEventTypeRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name Specifies a webhook name to search for
 * @param eventTypes Specifies a webhook event types to search for
 * @param methods Specifies a webhook methods to search for
 * @param projectIds Specifies a webhook project IDs to search for
 */


data class WebhooksFilterRequest (

    /* Specifies a webhook name to search for */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Specifies a webhook event types to search for */
    @Json(name = "eventTypes")
    val eventTypes: kotlin.collections.Set<WebHookEventTypeRequest>? = null,

    /* Specifies a webhook methods to search for */
    @Json(name = "methods")
    val methods: kotlin.collections.Set<RequestTypeRequest>? = null,

    /* Specifies a webhook project IDs to search for */
    @Json(name = "projectIds")
    val projectIds: kotlin.collections.Set<java.util.UUID>? = null

) {


}

