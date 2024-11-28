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

import ru.testit.kotlin.client.models.TestStatusType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param type 
 * @param isBased 
 * @param isDefault 
 * @param code 
 * @param description 
 */


data class TestStatus (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "type")
    val type: TestStatusType,

    @Json(name = "isBased")
    val isBased: kotlin.Boolean,

    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean,

    @Json(name = "code")
    val code: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String? = null

) {


}
