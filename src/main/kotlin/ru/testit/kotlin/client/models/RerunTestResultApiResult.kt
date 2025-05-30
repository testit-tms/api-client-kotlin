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

import ru.testit.kotlin.client.models.TestStatusApiResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param outcome 
 * @param status 
 * @param runNumber 
 */


data class RerunTestResultApiResult (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "outcome")
    val outcome: kotlin.String,

    @Json(name = "status")
    val status: TestStatusApiResult,

    @Json(name = "runNumber")
    val runNumber: kotlin.Int

) {


}

