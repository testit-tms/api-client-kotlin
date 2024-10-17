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

import ru.testit.kotlin.client.models.AttachmentModel
import ru.testit.kotlin.client.models.AutotestResultReasonSubGetModel
import ru.testit.kotlin.client.models.LinkSubGetModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Unique ID of the test result
 * @param name Name of autotest represented by the test result
 * @param autotestGlobalId Global ID of autotest represented by the test result
 * @param testRunId Unique ID of test run where the test result is located
 * @param configurationId Unique ID of configuration which the test result uses
 * @param configurationName Name of configuration which the test result uses
 * @param outcome Outcome of the test result
 * @param resultReasons Collection of result reasons which the test result have
 * @param date Date when the test result was completed or started or created
 * @param createdDate Date when the test result has been created
 * @param links Collection of links attached to the test result
 * @param attachments Collection of files attached to the test result
 * @param comment Comment to the test result
 * @param modifiedDate Date when the test result has been modified
 * @param startedOn Date when the test result has been started
 * @param completedOn Date when the test result has been completed
 * @param duration Time which it took to run the test
 */


data class TestResultShortGetModel (

    /* Unique ID of the test result */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Name of autotest represented by the test result */
    @Json(name = "name")
    val name: kotlin.String,

    /* Global ID of autotest represented by the test result */
    @Json(name = "autotestGlobalId")
    val autotestGlobalId: kotlin.Long,

    /* Unique ID of test run where the test result is located */
    @Json(name = "testRunId")
    val testRunId: java.util.UUID,

    /* Unique ID of configuration which the test result uses */
    @Json(name = "configurationId")
    val configurationId: java.util.UUID,

    /* Name of configuration which the test result uses */
    @Json(name = "configurationName")
    val configurationName: kotlin.String,

    /* Outcome of the test result */
    @Json(name = "outcome")
    val outcome: kotlin.String,

    /* Collection of result reasons which the test result have */
    @Json(name = "resultReasons")
    val resultReasons: kotlin.collections.List<AutotestResultReasonSubGetModel>,

    /* Date when the test result was completed or started or created */
    @Json(name = "date")
    @Deprecated(message = "This property is deprecated.")
    val date: java.time.OffsetDateTime,

    /* Date when the test result has been created */
    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    /* Collection of links attached to the test result */
    @Json(name = "links")
    val links: kotlin.collections.List<LinkSubGetModel>,

    /* Collection of files attached to the test result */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<AttachmentModel>,

    /* Comment to the test result */
    @Json(name = "comment")
    val comment: kotlin.String? = null,

    /* Date when the test result has been modified */
    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    /* Date when the test result has been started */
    @Json(name = "startedOn")
    val startedOn: java.time.OffsetDateTime? = null,

    /* Date when the test result has been completed */
    @Json(name = "completedOn")
    val completedOn: java.time.OffsetDateTime? = null,

    /* Time which it took to run the test */
    @Json(name = "duration")
    val duration: kotlin.Long? = null

) {


}

