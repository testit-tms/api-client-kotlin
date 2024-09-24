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

import org.openapitools.client.models.SharedStepResultModel
import org.openapitools.client.models.StepCommentModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param stepId 
 * @param outcome 
 * @param sharedStepVersionId 
 * @param sharedStepResults 
 * @param comment 
 */


data class StepResultModel (

    @Json(name = "stepId")
    val stepId: java.util.UUID,

    @Json(name = "outcome")
    val outcome: kotlin.String,

    @Json(name = "sharedStepVersionId")
    val sharedStepVersionId: java.util.UUID? = null,

    @Json(name = "sharedStepResults")
    val sharedStepResults: kotlin.collections.List<SharedStepResultModel>? = null,

    @Json(name = "comment")
    val comment: StepCommentModel? = null

) {


}

