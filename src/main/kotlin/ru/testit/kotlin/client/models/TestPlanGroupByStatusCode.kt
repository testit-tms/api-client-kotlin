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
 * @param `value` 
 */


data class TestPlanGroupByStatusCode (

    @Json(name = "statusCode")
    val statusCode: kotlin.String,

    @Json(name = "value")
    val `value`: kotlin.Long

) {


}

