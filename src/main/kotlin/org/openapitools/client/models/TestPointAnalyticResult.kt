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

package org.openapitools.client.models

import org.openapitools.client.models.TestPlanGroupByStatus
import org.openapitools.client.models.TestPlanGroupByTestSuite
import org.openapitools.client.models.TestPlanGroupByTester
import org.openapitools.client.models.TestPlanGroupByTesterAndStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param countGroupByStatus 
 * @param sumGroupByTester 
 * @param countGroupByTester 
 * @param countGroupByTestSuite 
 * @param countGroupByTesterAndStatus 
 */


data class TestPointAnalyticResult (

    @Json(name = "countGroupByStatus")
    val countGroupByStatus: kotlin.collections.List<TestPlanGroupByStatus>,

    @Json(name = "sumGroupByTester")
    val sumGroupByTester: kotlin.collections.List<TestPlanGroupByTester>,

    @Json(name = "countGroupByTester")
    val countGroupByTester: kotlin.collections.List<TestPlanGroupByTester>,

    @Json(name = "countGroupByTestSuite")
    val countGroupByTestSuite: kotlin.collections.List<TestPlanGroupByTestSuite>,

    @Json(name = "countGroupByTesterAndStatus")
    val countGroupByTesterAndStatus: kotlin.collections.List<TestPlanGroupByTesterAndStatus>

) {


}

