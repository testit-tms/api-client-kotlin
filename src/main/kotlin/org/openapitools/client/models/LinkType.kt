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
 * Values: Related,BlockedBy,Defect,Issue,Requirement,Repository
 */

@JsonClass(generateAdapter = false)
enum class LinkType(val value: kotlin.String) {

    @Json(name = "Related")
    Related("Related"),

    @Json(name = "BlockedBy")
    BlockedBy("BlockedBy"),

    @Json(name = "Defect")
    Defect("Defect"),

    @Json(name = "Issue")
    Issue("Issue"),

    @Json(name = "Requirement")
    Requirement("Requirement"),

    @Json(name = "Repository")
    Repository("Repository");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is LinkType) "$data" else null

        /**
         * Returns a valid [LinkType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): LinkType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

