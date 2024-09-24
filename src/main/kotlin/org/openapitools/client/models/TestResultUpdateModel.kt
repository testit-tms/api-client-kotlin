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

import org.openapitools.client.models.AttachmentPutModel
import org.openapitools.client.models.AttachmentPutModelAutoTestStepResultsModel
import org.openapitools.client.models.LinkModel
import org.openapitools.client.models.StepResultModel
import org.openapitools.client.models.TestResultOutcome
import org.openapitools.client.models.TestResultStepCommentPutModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param failureClassIds 
 * @param outcome 
 * @param comment 
 * @param links 
 * @param stepResults 
 * @param attachments 
 * @param durationInMs 
 * @param duration 
 * @param stepComments 
 * @param setupResults 
 * @param teardownResults 
 * @param message 
 * @param trace 
 */


data class TestResultUpdateModel (

    @Json(name = "failureClassIds")
    val failureClassIds: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "outcome")
    val outcome: TestResultOutcome? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "links")
    val links: kotlin.collections.List<LinkModel>? = null,

    @Json(name = "stepResults")
    val stepResults: kotlin.collections.List<StepResultModel>? = null,

    @Json(name = "attachments")
    val attachments: kotlin.collections.List<AttachmentPutModel>? = null,

    @Json(name = "durationInMs")
    @Deprecated(message = "This property is deprecated.")
    val durationInMs: kotlin.Long? = null,

    @Json(name = "duration")
    val duration: kotlin.Long? = null,

    @Json(name = "stepComments")
    val stepComments: kotlin.collections.List<TestResultStepCommentPutModel>? = null,

    @Json(name = "setupResults")
    val setupResults: kotlin.collections.List<AttachmentPutModelAutoTestStepResultsModel>? = null,

    @Json(name = "teardownResults")
    val teardownResults: kotlin.collections.List<AttachmentPutModelAutoTestStepResultsModel>? = null,

    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "trace")
    val trace: kotlin.String? = null

) {


}

