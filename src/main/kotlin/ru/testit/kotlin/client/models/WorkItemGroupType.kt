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
 * Values: Type,Priority,Status,AutomationStatus,Creator,LastEditor,CustomAttribute
 */

@JsonClass(generateAdapter = false)
enum class WorkItemGroupType(val value: kotlin.String) {

    @Json(name = "Type")
    Type("Type"),

    @Json(name = "Priority")
    Priority("Priority"),

    @Json(name = "Status")
    Status("Status"),

    @Json(name = "AutomationStatus")
    AutomationStatus("AutomationStatus"),

    @Json(name = "Creator")
    Creator("Creator"),

    @Json(name = "LastEditor")
    LastEditor("LastEditor"),

    @Json(name = "CustomAttribute")
    CustomAttribute("CustomAttribute");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is WorkItemGroupType) "$data" else null

        /**
         * Returns a valid [WorkItemGroupType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): WorkItemGroupType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

