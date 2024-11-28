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

import ru.testit.kotlin.client.models.AutotestResultOutcome
import ru.testit.kotlin.client.models.RerunTestResultModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param createdDate 
 * @param createdById 
 * @param createdByName 
 * @param testRunId 
 * @param configurationId 
 * @param configurationName 
 * @param outcome 
 * @param rerunCount 
 * @param rerunTestResults 
 * @param modifiedDate 
 * @param modifiedById 
 * @param testPlanId 
 * @param testPlanGlobalId 
 * @param testPlanName 
 * @param duration 
 * @param testRunName 
 * @param launchSource 
 */


data class AutotestResultHistoricalGetModel (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "createdByName")
    val createdByName: kotlin.String,

    @Json(name = "testRunId")
    val testRunId: java.util.UUID,

    @Json(name = "configurationId")
    val configurationId: java.util.UUID,

    @Json(name = "configurationName")
    val configurationName: kotlin.String,

    @Json(name = "outcome")
    val outcome: AutotestResultOutcome,

    @Json(name = "rerunCount")
    val rerunCount: kotlin.Int,

    @Json(name = "rerunTestResults")
    val rerunTestResults: kotlin.collections.List<RerunTestResultModel>,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null,

    @Json(name = "testPlanId")
    val testPlanId: java.util.UUID? = null,

    @Json(name = "testPlanGlobalId")
    val testPlanGlobalId: kotlin.Long? = null,

    @Json(name = "testPlanName")
    val testPlanName: kotlin.String? = null,

    @Json(name = "duration")
    val duration: kotlin.Long? = null,

    @Json(name = "testRunName")
    val testRunName: kotlin.String? = null,

    @Json(name = "launchSource")
    val launchSource: kotlin.String? = null

) {


}

