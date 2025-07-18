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

import ru.testit.kotlin.client.models.TestPlanTestPointsStatusGroupApiResult
import ru.testit.kotlin.client.models.TestPlanTestPointsTesterAndStatusGroupApiResult
import ru.testit.kotlin.client.models.TestPlanTestPointsTesterGroupApiResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param countGroupByStatus 
 * @param sumGroupByTester 
 * @param countGroupByTester 
 * @param countGroupByTesterAndStatus 
 */


data class TestPlanTestPointsAnalyticsApiResult (

    @Json(name = "countGroupByStatus")
    val countGroupByStatus: kotlin.collections.List<TestPlanTestPointsStatusGroupApiResult>,

    @Json(name = "sumGroupByTester")
    val sumGroupByTester: kotlin.collections.List<TestPlanTestPointsTesterGroupApiResult>,

    @Json(name = "countGroupByTester")
    val countGroupByTester: kotlin.collections.List<TestPlanTestPointsTesterGroupApiResult>,

    @Json(name = "countGroupByTesterAndStatus")
    val countGroupByTesterAndStatus: kotlin.collections.List<TestPlanTestPointsTesterAndStatusGroupApiResult>

) {


}

