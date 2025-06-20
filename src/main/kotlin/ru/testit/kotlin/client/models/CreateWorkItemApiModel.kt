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

import ru.testit.kotlin.client.models.AssignAttachmentApiModel
import ru.testit.kotlin.client.models.AssignIterationApiModel
import ru.testit.kotlin.client.models.AutoTestIdModel
import ru.testit.kotlin.client.models.CreateLinkApiModel
import ru.testit.kotlin.client.models.CreateStepApiModel
import ru.testit.kotlin.client.models.TagModel
import ru.testit.kotlin.client.models.WorkItemEntityTypes
import ru.testit.kotlin.client.models.WorkItemPriorityModel
import ru.testit.kotlin.client.models.WorkItemStates

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param entityTypeName 
 * @param state 
 * @param priority 
 * @param steps Collection of workitem steps
 * @param preconditionSteps Collection of workitem precondition steps
 * @param postconditionSteps Collection of workitem postcondition steps
 * @param duration WorkItem duration in milliseconds, must be 0 for shared steps and greater than 0 for the other types of work items
 * @param attributes Key value pair of custom workitem attributes
 * @param tags Collection of workitem tags
 * @param links Collection of workitem links
 * @param name Workitem name
 * @param projectId Project unique identifier - used to link workitem with project
 * @param sectionId Internal identifier of section where workitem is located
 * @param description Workitem description
 * @param attachments Collection of workitem attachments
 * @param iterations Collection of parameter sets
 * @param autoTests Collection of autotest internal ids
 */


data class CreateWorkItemApiModel (

    @Json(name = "entityTypeName")
    val entityTypeName: WorkItemEntityTypes,

    @Json(name = "state")
    val state: WorkItemStates,

    @Json(name = "priority")
    val priority: WorkItemPriorityModel,

    /* Collection of workitem steps */
    @Json(name = "steps")
    val steps: kotlin.collections.List<CreateStepApiModel>,

    /* Collection of workitem precondition steps */
    @Json(name = "preconditionSteps")
    val preconditionSteps: kotlin.collections.List<CreateStepApiModel>,

    /* Collection of workitem postcondition steps */
    @Json(name = "postconditionSteps")
    val postconditionSteps: kotlin.collections.List<CreateStepApiModel>,

    /* WorkItem duration in milliseconds, must be 0 for shared steps and greater than 0 for the other types of work items */
    @Json(name = "duration")
    val duration: kotlin.Int,

    /* Key value pair of custom workitem attributes */
    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    /* Collection of workitem tags */
    @Json(name = "tags")
    val tags: kotlin.collections.List<TagModel>,

    /* Collection of workitem links */
    @Json(name = "links")
    val links: kotlin.collections.List<CreateLinkApiModel>,

    /* Workitem name */
    @Json(name = "name")
    val name: kotlin.String,

    /* Project unique identifier - used to link workitem with project */
    @Json(name = "projectId")
    val projectId: java.util.UUID,

    /* Internal identifier of section where workitem is located */
    @Json(name = "sectionId")
    val sectionId: java.util.UUID,

    /* Workitem description */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Collection of workitem attachments */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<AssignAttachmentApiModel>? = null,

    /* Collection of parameter sets */
    @Json(name = "iterations")
    val iterations: kotlin.collections.List<AssignIterationApiModel>? = null,

    /* Collection of autotest internal ids */
    @Json(name = "autoTests")
    val autoTests: kotlin.collections.List<AutoTestIdModel>? = null

) {


}

