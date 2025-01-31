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

import ru.testit.kotlin.client.models.Attachment
import ru.testit.kotlin.client.models.AutoTest
import ru.testit.kotlin.client.models.AutoTestStepResult
import ru.testit.kotlin.client.models.Link
import ru.testit.kotlin.client.models.StepComment
import ru.testit.kotlin.client.models.StepResult
import ru.testit.kotlin.client.models.TestPoint
import ru.testit.kotlin.client.models.TestResultOutcome
import ru.testit.kotlin.client.models.TestStatusApiResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param createdDate 
 * @param createdById 
 * @param failureClassIds 
 * @param configurationId 
 * @param testPointId 
 * @param testRunId 
 * @param workItemVersionId 
 * @param modifiedDate 
 * @param modifiedById 
 * @param stepComments 
 * @param outcome 
 * @param status 
 * @param comment 
 * @param links 
 * @param stepResults 
 * @param attachments 
 * @param autoTestId 
 * @param startedOn 
 * @param completedOn 
 * @param durationInMs 
 * @param traces 
 * @param failureType 
 * @param message 
 * @param runByUserId 
 * @param stoppedByUserId 
 * @param testPoint 
 * @param autoTest 
 * @param autoTestStepResults 
 * @param setupResults 
 * @param teardownResults 
 * @param workItemVersionNumber 
 * @param parameters 
 * @param properties 
 */


data class TestResultResponse (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "failureClassIds")
    val failureClassIds: kotlin.collections.List<java.util.UUID>,

    @Json(name = "configurationId")
    val configurationId: java.util.UUID,

    @Json(name = "testPointId")
    val testPointId: java.util.UUID,

    @Json(name = "testRunId")
    val testRunId: java.util.UUID,

    @Json(name = "workItemVersionId")
    val workItemVersionId: java.util.UUID,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null,

    @Json(name = "stepComments")
    val stepComments: kotlin.collections.List<StepComment>? = null,

    @Json(name = "outcome")
    @Deprecated(message = "This property is deprecated.")
    val outcome: TestResultOutcome? = null,

    @Json(name = "status")
    val status: TestStatusApiResult? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "links")
    val links: kotlin.collections.List<Link>? = null,

    @Json(name = "stepResults")
    val stepResults: kotlin.collections.List<StepResult>? = null,

    @Json(name = "attachments")
    val attachments: kotlin.collections.List<Attachment>? = null,

    @Json(name = "autoTestId")
    val autoTestId: java.util.UUID? = null,

    @Json(name = "startedOn")
    val startedOn: java.time.OffsetDateTime? = null,

    @Json(name = "completedOn")
    val completedOn: java.time.OffsetDateTime? = null,

    @Json(name = "durationInMs")
    val durationInMs: kotlin.Long? = null,

    @Json(name = "traces")
    val traces: kotlin.String? = null,

    @Json(name = "failureType")
    val failureType: kotlin.String? = null,

    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "runByUserId")
    val runByUserId: java.util.UUID? = null,

    @Json(name = "stoppedByUserId")
    val stoppedByUserId: java.util.UUID? = null,

    @Json(name = "testPoint")
    val testPoint: TestPoint? = null,

    @Json(name = "autoTest")
    val autoTest: AutoTest? = null,

    @Json(name = "autoTestStepResults")
    val autoTestStepResults: kotlin.collections.List<AutoTestStepResult>? = null,

    @Json(name = "setupResults")
    val setupResults: kotlin.collections.List<AutoTestStepResult>? = null,

    @Json(name = "teardownResults")
    val teardownResults: kotlin.collections.List<AutoTestStepResult>? = null,

    @Json(name = "workItemVersionNumber")
    val workItemVersionNumber: kotlin.Int? = null,

    @Json(name = "parameters")
    val parameters: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Json(name = "properties")
    val properties: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) {


}

