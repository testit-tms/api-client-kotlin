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

import ru.testit.kotlin.client.models.SharedStepModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param workItem Nested shared steps are allowed
 * @param action 
 * @param expected 
 * @param testData 
 * @param comments 
 * @param workItemId 
 */


data class StepModel (

    @Json(name = "id")
    val id: java.util.UUID,

    /* Nested shared steps are allowed */
    @Json(name = "workItem")
    val workItem: SharedStepModel? = null,

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

