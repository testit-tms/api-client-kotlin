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
 * @param noAnalytics Number of test results which outcomes were not analyzed
 * @param noDefect Number of test results which outcomes were not caused by any defect
 * @param infrastructureDefect Number of test results which outcomes were caused by some infrastructure defect
 * @param productDefect Number of test results which outcomes were caused by some tested product defect
 * @param testDefect Number of test results which outcomes were caused by test itself
 */


data class TestRunStatisticsErrorCategoriesGetModel (

    /* Number of test results which outcomes were not analyzed */
    @Json(name = "noAnalytics")
    val noAnalytics: kotlin.Int,

    /* Number of test results which outcomes were not caused by any defect */
    @Json(name = "noDefect")
    val noDefect: kotlin.Int,

    /* Number of test results which outcomes were caused by some infrastructure defect */
    @Json(name = "infrastructureDefect")
    val infrastructureDefect: kotlin.Int,

    /* Number of test results which outcomes were caused by some tested product defect */
    @Json(name = "productDefect")
    val productDefect: kotlin.Int,

    /* Number of test results which outcomes were caused by test itself */
    @Json(name = "testDefect")
    val testDefect: kotlin.Int

) {


}
