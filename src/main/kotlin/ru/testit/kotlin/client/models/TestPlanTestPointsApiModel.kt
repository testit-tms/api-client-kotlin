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

import ru.testit.kotlin.client.models.TestPlanTestPointsGroupApiModel
import ru.testit.kotlin.client.models.TestPlanTestPointsInquiryApiModel
import ru.testit.kotlin.client.models.TestPlanTestPointsSearchApiModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param filter 
 * @param group 
 * @param inquiry 
 */


data class TestPlanTestPointsApiModel (

    @Json(name = "filter")
    val filter: TestPlanTestPointsSearchApiModel? = null,

    @Json(name = "group")
    val group: TestPlanTestPointsGroupApiModel? = null,

    @Json(name = "inquiry")
    val inquiry: TestPlanTestPointsInquiryApiModel? = null

) {


}

