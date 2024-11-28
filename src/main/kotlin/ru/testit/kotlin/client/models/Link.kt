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

import ru.testit.kotlin.client.models.LinkType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param url Address can be specified without protocol, but necessarily with the domain.
 * @param hasInfo Flag defines if link relates to integrated jira service
 * @param id Link unique identifier
 * @param title Link name.
 * @param description Link description.
 * @param type Specifies the type of the link.
 */


data class Link (

    /* Address can be specified without protocol, but necessarily with the domain. */
    @Json(name = "url")
    val url: kotlin.String,

    /* Flag defines if link relates to integrated jira service */
    @Json(name = "hasInfo")
    val hasInfo: kotlin.Boolean,

    /* Link unique identifier */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    /* Link name. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Link description. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Specifies the type of the link. */
    @Json(name = "type")
    val type: LinkType? = null

) {


}

