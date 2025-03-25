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

import ru.testit.kotlin.client.models.AttachmentUpdateRequest
import ru.testit.kotlin.client.models.AvailableTestResultOutcome

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param title The name of the step.
 * @param description Description of the step result.
 * @param info Extended description of the step result.
 * @param startedOn Step start date.
 * @param completedOn Step end date.
 * @param duration Expected or actual duration of the test run execution in milliseconds.
 * @param outcome Specifies the result of the autotest execution.
 * @param stepResults Nested step results. The maximum nesting level is 15.
 * @param attachments /// <summary>  Specifies an attachment GUID. Multiple values can be sent.  </summary>
 * @param parameters \"<b>parameter</b>\": \"<b>value</b>\" pair with arbitrary custom parameters. Multiple parameters can be sent.
 */


data class AutoTestStepResultUpdateRequest (

    /* The name of the step. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Description of the step result. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Extended description of the step result. */
    @Json(name = "info")
    val info: kotlin.String? = null,

    /* Step start date. */
    @Json(name = "startedOn")
    val startedOn: java.time.OffsetDateTime? = null,

    /* Step end date. */
    @Json(name = "completedOn")
    val completedOn: java.time.OffsetDateTime? = null,

    /* Expected or actual duration of the test run execution in milliseconds. */
    @Json(name = "duration")
    val duration: kotlin.Long? = null,

    /* Specifies the result of the autotest execution. */
    @Json(name = "outcome")
    val outcome: AvailableTestResultOutcome? = null,

    /* Nested step results. The maximum nesting level is 15. */
    @Json(name = "stepResults")
    val stepResults: kotlin.collections.List<AutoTestStepResultUpdateRequest>? = null,

    /* /// <summary>  Specifies an attachment GUID. Multiple values can be sent.  </summary> */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<AttachmentUpdateRequest>? = null,

    /* \"<b>parameter</b>\": \"<b>value</b>\" pair with arbitrary custom parameters. Multiple parameters can be sent. */
    @Json(name = "parameters")
    val parameters: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) {


}

