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
import ru.testit.kotlin.client.models.Int64RangeSelectorModel
import ru.testit.kotlin.client.models.TestPointStatus
import ru.testit.kotlin.client.models.WorkItemPriorityModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param testPlanIds Specifies a test point test plan IDS to search for
 * @param testSuiteIds Specifies a test point test suite IDs to search for
 * @param workItemGlobalIds Specifies a test point work item global IDs to search for
 * @param workItemMedianDuration Specifies a test point work item median duration range to search for
 * @param workItemIsDeleted Specifies a test point work item is deleted flag to search for
 * @param statuses Specifies a test point statuses to search for
 * @param statusCodes Specifies a test point status codes to search for
 * @param priorities Specifies a test point priorities to search for
 * @param isAutomated Specifies a test point automation status to search for
 * @param name Specifies a test point name to search for
 * @param configurationIds Specifies a test point configuration IDs to search for
 * @param testerIds Specifies a test point assigned user IDs to search for
 * @param duration Specifies a test point range of duration to search for
 * @param sectionIds Specifies a test point work item section IDs to search for
 * @param createdDate Specifies a test point range of creation date to search for
 * @param createdByIds Specifies a test point creator IDs to search for
 * @param modifiedDate Specifies a test point range of last modification date to search for
 * @param modifiedByIds Specifies a test point last editor IDs to search for
 * @param tags Specifies a test point tags to search for
 * @param attributes Specifies a test point attributes to search for
 * @param workItemCreatedDate Specifies a work item range of creation date to search for
 * @param workItemCreatedByIds Specifies a work item creator IDs to search for
 * @param workItemModifiedDate Specifies a work item range of last modification date to search for
 * @param workItemModifiedByIds Specifies a work item last editor IDs to search for
 */


data class TestPointFilterModel (

    /* Specifies a test point test plan IDS to search for */
    @Json(name = "testPlanIds")
    val testPlanIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test point test suite IDs to search for */
    @Json(name = "testSuiteIds")
    val testSuiteIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test point work item global IDs to search for */
    @Json(name = "workItemGlobalIds")
    val workItemGlobalIds: kotlin.collections.List<kotlin.Long>? = null,

    /* Specifies a test point work item median duration range to search for */
    @Json(name = "workItemMedianDuration")
    val workItemMedianDuration: Int64RangeSelectorModel? = null,

    /* Specifies a test point work item is deleted flag to search for */
    @Json(name = "workItemIsDeleted")
    val workItemIsDeleted: kotlin.Boolean? = null,

    /* Specifies a test point statuses to search for */
    @Json(name = "statuses")
    @Deprecated(message = "This property is deprecated.")
    val statuses: kotlin.collections.List<TestPointStatus>? = null,

    /* Specifies a test point status codes to search for */
    @Json(name = "statusCodes")
    val statusCodes: kotlin.collections.List<kotlin.String>? = null,

    /* Specifies a test point priorities to search for */
    @Json(name = "priorities")
    val priorities: kotlin.collections.List<WorkItemPriorityModel>? = null,

    /* Specifies a test point automation status to search for */
    @Json(name = "isAutomated")
    val isAutomated: kotlin.Boolean? = null,

    /* Specifies a test point name to search for */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Specifies a test point configuration IDs to search for */
    @Json(name = "configurationIds")
    val configurationIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test point assigned user IDs to search for */
    @Json(name = "testerIds")
    val testerIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test point range of duration to search for */
    @Json(name = "duration")
    val duration: Int64RangeSelectorModel? = null,

    /* Specifies a test point work item section IDs to search for */
    @Json(name = "sectionIds")
    val sectionIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test point range of creation date to search for */
    @Json(name = "createdDate")
    val createdDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a test point creator IDs to search for */
    @Json(name = "createdByIds")
    val createdByIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test point range of last modification date to search for */
    @Json(name = "modifiedDate")
    val modifiedDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a test point last editor IDs to search for */
    @Json(name = "modifiedByIds")
    val modifiedByIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a test point tags to search for */
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,

    /* Specifies a test point attributes to search for */
    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<kotlin.String>>? = null,

    /* Specifies a work item range of creation date to search for */
    @Json(name = "workItemCreatedDate")
    val workItemCreatedDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a work item creator IDs to search for */
    @Json(name = "workItemCreatedByIds")
    val workItemCreatedByIds: kotlin.collections.List<java.util.UUID>? = null,

    /* Specifies a work item range of last modification date to search for */
    @Json(name = "workItemModifiedDate")
    val workItemModifiedDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a work item last editor IDs to search for */
    @Json(name = "workItemModifiedByIds")
    val workItemModifiedByIds: kotlin.collections.List<java.util.UUID>? = null

) {


}

