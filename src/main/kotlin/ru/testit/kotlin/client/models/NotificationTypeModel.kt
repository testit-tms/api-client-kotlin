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
 * Values: MentionInComment,TestPointIsSetInTestPlan,MentionInCustomAttribute,TestPlanUnlockRequest
 */

@JsonClass(generateAdapter = false)
enum class NotificationTypeModel(val value: kotlin.String) {

    @Json(name = "MentionInComment")
    MentionInComment("MentionInComment"),

    @Json(name = "TestPointIsSetInTestPlan")
    TestPointIsSetInTestPlan("TestPointIsSetInTestPlan"),

    @Json(name = "MentionInCustomAttribute")
    MentionInCustomAttribute("MentionInCustomAttribute"),

    @Json(name = "TestPlanUnlockRequest")
    TestPlanUnlockRequest("TestPlanUnlockRequest");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is NotificationTypeModel) "$data" else null

        /**
         * Returns a valid [NotificationTypeModel] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): NotificationTypeModel? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

