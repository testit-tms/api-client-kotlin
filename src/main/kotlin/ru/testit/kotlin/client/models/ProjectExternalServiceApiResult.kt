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

import ru.testit.kotlin.client.models.ExternalServiceMetadataApiResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id The unique ID of the external service
 * @param name The name of the external service
 * @param metadata The metadata associated with the external service
 * @param enabled Indicates whether the external service is enabled or not
 */


data class ProjectExternalServiceApiResult (

    /* The unique ID of the external service */
    @Json(name = "id")
    val id: java.util.UUID,

    /* The name of the external service */
    @Json(name = "name")
    val name: kotlin.String,

    /* The metadata associated with the external service */
    @Json(name = "metadata")
    val metadata: ExternalServiceMetadataApiResult,

    /* Indicates whether the external service is enabled or not */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean

) {


}

