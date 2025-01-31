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

import ru.testit.kotlin.client.models.AutoTestStepApiResult
import ru.testit.kotlin.client.models.ConfigurationShortApiResult
import ru.testit.kotlin.client.models.LabelApiResult
import ru.testit.kotlin.client.models.LinkApiResult
import ru.testit.kotlin.client.models.TestStatusApiResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param projectId 
 * @param name 
 * @param isFlaky 
 * @param globalId 
 * @param isDeleted 
 * @param mustBeApproved 
 * @param createdDate 
 * @param createdById 
 * @param externalId 
 * @param namespace 
 * @param classname 
 * @param steps 
 * @param setup 
 * @param teardown 
 * @param title 
 * @param description 
 * @param externalKey 
 * @param modifiedDate 
 * @param modifiedById 
 * @param lastTestRunId 
 * @param lastTestRunName 
 * @param lastTestResultId 
 * @param lastTestResultConfiguration 
 * @param lastTestResultOutcome 
 * @param lastTestResultStatus 
 * @param stabilityPercentage 
 * @param links 
 * @param labels 
 */


data class AutoTestApiResult (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "projectId")
    val projectId: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "isFlaky")
    val isFlaky: kotlin.Boolean,

    @Json(name = "globalId")
    val globalId: kotlin.Long,

    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "mustBeApproved")
    val mustBeApproved: kotlin.Boolean,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "externalId")
    val externalId: kotlin.String? = null,

    @Json(name = "namespace")
    val namespace: kotlin.String? = null,

    @Json(name = "classname")
    val classname: kotlin.String? = null,

    @Json(name = "steps")
    val steps: kotlin.collections.List<AutoTestStepApiResult>? = null,

    @Json(name = "setup")
    val setup: kotlin.collections.List<AutoTestStepApiResult>? = null,

    @Json(name = "teardown")
    val teardown: kotlin.collections.List<AutoTestStepApiResult>? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "externalKey")
    val externalKey: kotlin.String? = null,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null,

    @Json(name = "lastTestRunId")
    val lastTestRunId: java.util.UUID? = null,

    @Json(name = "lastTestRunName")
    val lastTestRunName: kotlin.String? = null,

    @Json(name = "lastTestResultId")
    val lastTestResultId: java.util.UUID? = null,

    @Json(name = "lastTestResultConfiguration")
    val lastTestResultConfiguration: ConfigurationShortApiResult? = null,

    @Json(name = "lastTestResultOutcome")
    val lastTestResultOutcome: kotlin.String? = null,

    @Json(name = "lastTestResultStatus")
    val lastTestResultStatus: TestStatusApiResult? = null,

    @Json(name = "stabilityPercentage")
    val stabilityPercentage: kotlin.Long? = null,

    @Json(name = "links")
    val links: kotlin.collections.List<LinkApiResult>? = null,

    @Json(name = "labels")
    val labels: kotlin.collections.List<LabelApiResult>? = null

) {


}

