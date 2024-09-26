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

import ru.testit.kotlin.client.models.TestResultsStatisticsGetModel
import ru.testit.kotlin.client.models.TestRunState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Unique ID of the test run
 * @param name Name of the test run
 * @param state Current state of the test run
 * @param createdDate Date when the test run was created
 * @param createdById Unique ID of user who created the test run
 * @param isDeleted Is the test run is deleted
 * @param autoTestsCount Number of AutoTests run in the test run
 * @param statistics Statistics of the test run
 * @param startedDate Date when the test run was started
 * @param completedDate Completion date of the test run
 * @param modifiedById Unique ID of user who modified the test run last time
 */


data class TestRunShortGetModel (

    /* Unique ID of the test run */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Name of the test run */
    @Json(name = "name")
    val name: kotlin.String,

    /* Current state of the test run */
    @Json(name = "state")
    val state: TestRunState,

    /* Date when the test run was created */
    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    /* Unique ID of user who created the test run */
    @Json(name = "createdById")
    val createdById: java.util.UUID,

    /* Is the test run is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    /* Number of AutoTests run in the test run */
    @Json(name = "autoTestsCount")
    val autoTestsCount: kotlin.Int,

    /* Statistics of the test run */
    @Json(name = "statistics")
    val statistics: TestResultsStatisticsGetModel,

    /* Date when the test run was started */
    @Json(name = "startedDate")
    val startedDate: java.time.OffsetDateTime? = null,

    /* Completion date of the test run */
    @Json(name = "completedDate")
    val completedDate: java.time.OffsetDateTime? = null,

    /* Unique ID of user who modified the test run last time */
    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null

) {


}
