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
 * @param id Step unique internal identifier
 * @param action Action applied by user
 * @param expected Expected system reaction
 * @param testData Test data for step
 * @param comments Comments for step
 * @param workItemId Unique identifier of workitem which relates to the step
 */


data class UpdateStepApiModel (

    /* Step unique internal identifier */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Action applied by user */
    @Json(name = "action")
    val action: kotlin.String? = null,

    /* Expected system reaction */
    @Json(name = "expected")
    val expected: kotlin.String? = null,

    /* Test data for step */
    @Json(name = "testData")
    val testData: kotlin.String? = null,

    /* Comments for step */
    @Json(name = "comments")
    val comments: kotlin.String? = null,

    /* Unique identifier of workitem which relates to the step */
    @Json(name = "workItemId")
    val workItemId: java.util.UUID? = null

) {


}

