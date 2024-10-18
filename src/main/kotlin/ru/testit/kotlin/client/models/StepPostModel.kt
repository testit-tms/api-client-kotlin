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
 * @param action 
 * @param expected 
 * @param testData 
 * @param comments 
 * @param workItemId 
 */


data class StepPostModel (

    @Json(name = "action")
    val action: kotlin.String? = null,

    @Json(name = "expected")
    val expected: kotlin.String? = null,

    @Json(name = "testData")
    val testData: kotlin.String? = null,

    @Json(name = "comments")
    val comments: kotlin.String? = null,

    @Json(name = "workItemId")
    val workItemId: java.util.UUID? = null

) {


}

