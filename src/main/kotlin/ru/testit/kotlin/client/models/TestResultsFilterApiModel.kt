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

import ru.testit.kotlin.client.models.DateTimeRangeSelectorModel
import ru.testit.kotlin.client.models.FailureCategoryModel
import ru.testit.kotlin.client.models.Int64RangeSelectorModel
import ru.testit.kotlin.client.models.TestResultOutcome

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param configurationIds Specifies a test result configuration IDs to search for
 * @param outcomes Specifies a test result outcomes to search for
 * @param statusCodes Specifies a test result status codes to search for
 * @param failureCategories Specifies a test result failure categories to search for
 * @param namespace Specifies a test result namespace to search for
 * @param className Specifies a test result class name to search for
 * @param autoTestGlobalIds Specifies an autotest global IDs to search results for
 * @param name Specifies an autotest name to search results for
 * @param createdDate Specifies a test result creation date and time range to search for
 * @param modifiedDate Specifies a test result modified date and time range to search for
 * @param startedOn Specifies a test result started on date and time range to search for
 * @param completedOn Specifies a test result completed on date and time range to search for
 * @param duration Specifies a test result duration range to search for
 * @param resultReasons Specifies result reasons for searching test results
 * @param testRunIds Specifies a test result test run IDs to search for
 */


data class TestResultsFilterApiModel (

    /* Specifies a test result configuration IDs to search for */
    @Json(name = "configurationIds")
    val configurationIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test result outcomes to search for */
    @Json(name = "outcomes")
    @Deprecated(message = "This property is deprecated.")
    val outcomes: kotlin.collections.List<TestResultOutcome>? = null,

    /* Specifies a test result status codes to search for */
    @Json(name = "statusCodes")
    val statusCodes: kotlin.collections.List<kotlin.String>? = null,

    /* Specifies a test result failure categories to search for */
    @Json(name = "failureCategories")
    val failureCategories: kotlin.collections.List<FailureCategoryModel>? = null,

    /* Specifies a test result namespace to search for */
    @Json(name = "namespace")
    val namespace: kotlin.String? = null,

    /* Specifies a test result class name to search for */
    @Json(name = "className")
    val className: kotlin.String? = null,

    /* Specifies an autotest global IDs to search results for */
    @Json(name = "autoTestGlobalIds")
    val autoTestGlobalIds: kotlin.collections.List<kotlin.Long>? = null,

    /* Specifies an autotest name to search results for */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Specifies a test result creation date and time range to search for */
    @Json(name = "createdDate")
    val createdDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a test result modified date and time range to search for */
    @Json(name = "modifiedDate")
    val modifiedDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a test result started on date and time range to search for */
    @Json(name = "startedOn")
    val startedOn: DateTimeRangeSelectorModel? = null,

    /* Specifies a test result completed on date and time range to search for */
    @Json(name = "completedOn")
    val completedOn: DateTimeRangeSelectorModel? = null,

    /* Specifies a test result duration range to search for */
    @Json(name = "duration")
    val duration: Int64RangeSelectorModel? = null,

    /* Specifies result reasons for searching test results */
    @Json(name = "resultReasons")
    val resultReasons: kotlin.collections.List<kotlin.String>? = null,

    /* Specifies a test result test run IDs to search for */
    @Json(name = "testRunIds")
    val testRunIds: kotlin.collections.List<java.util.UUID>? = null

) {


}

