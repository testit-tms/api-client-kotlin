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

import org.openapitools.client.models.DateTimeRangeSelectorModel
import org.openapitools.client.models.FailureCategoryModel
import org.openapitools.client.models.Int32RangeSelectorModel
import org.openapitools.client.models.TestResultOutcome
import org.openapitools.client.models.TestRunState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param projectIds Specifies a test run project IDs to search for
 * @param name Specifies test run name
 * @param states Specifies a test run states to search for
 * @param createdDate Specifies a test run range of created date to search for
 * @param startedDate Specifies a test run range of started date to search for
 * @param createdByIds Specifies a test run creator IDs to search for
 * @param modifiedByIds Specifies a test run last editor IDs to search for
 * @param isDeleted Specifies a test run deleted status to search for
 * @param autoTestsCount Number of autoTests run in the test run
 * @param testResultsOutcome Specifies test results outcomes
 * @param failureCategory Specifies failure categories
 * @param completedDate Specifies a test run range of completed date to search for
 */


data class TestRunFilterModel (

    /* Specifies a test run project IDs to search for */
    @Json(name = "projectIds")
    val projectIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Specifies test run name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Specifies a test run states to search for */
    @Json(name = "states")
    val states: kotlin.collections.Set<TestRunState>? = null,

    /* Specifies a test run range of created date to search for */
    @Json(name = "createdDate")
    val createdDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a test run range of started date to search for */
    @Json(name = "startedDate")
    val startedDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a test run creator IDs to search for */
    @Json(name = "createdByIds")
    val createdByIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Specifies a test run last editor IDs to search for */
    @Json(name = "modifiedByIds")
    val modifiedByIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Specifies a test run deleted status to search for */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Number of autoTests run in the test run */
    @Json(name = "autoTestsCount")
    val autoTestsCount: Int32RangeSelectorModel? = null,

    /* Specifies test results outcomes */
    @Json(name = "testResultsOutcome")
    val testResultsOutcome: kotlin.collections.List<TestResultOutcome>? = null,

    /* Specifies failure categories */
    @Json(name = "failureCategory")
    val failureCategory: kotlin.collections.List<FailureCategoryModel>? = null,

    /* Specifies a test run range of completed date to search for */
    @Json(name = "completedDate")
    val completedDate: DateTimeRangeSelectorModel? = null

) {


}

