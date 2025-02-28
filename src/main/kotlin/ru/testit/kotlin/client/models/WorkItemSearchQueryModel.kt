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
import ru.testit.kotlin.client.models.Int32RangeSelectorModel
import ru.testit.kotlin.client.models.Int64RangeSelectorModel
import ru.testit.kotlin.client.models.WorkItemEntityTypes
import ru.testit.kotlin.client.models.WorkItemLinkFilterModel
import ru.testit.kotlin.client.models.WorkItemPriorityModel
import ru.testit.kotlin.client.models.WorkItemStates

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param projectIds Collection of project identifiers
 * @param links Specifies a work item filter by its links
 * @param name Name of work item
 * @param ids Specifies a work item unique IDs to search for
 * @param globalIds Collection of global (integer) identifiers
 * @param attributes Custom attributes of work item
 * @param isDeleted Is result must consist of only actual/deleted work items
 * @param sectionIds Collection of section identifiers
 * @param createdByIds Collection of identifiers of users who created work item
 * @param modifiedByIds Collection of identifiers of users who applied last modification to work item
 * @param states Collection of states of work item
 * @param priorities Collection of priorities of work item
 * @param types Collection of types of work item
 * @param createdDate Specifies a work item range of creation date to search for
 * @param modifiedDate Specifies a work item range of last modification date to search for
 * @param duration Specifies a work item duration range to search for
 * @param medianDuration Specifies a work item median duration range to search for
 * @param isAutomated Is result must consist of only manual/automated work items
 * @param tags Collection of tags
 * @param autoTestIds Collection of identifiers of linked autotests
 * @param workItemVersionIds Collection of identifiers work items versions.
 */


data class WorkItemSearchQueryModel (

    /* Collection of project identifiers */
    @Json(name = "projectIds")
    val projectIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Specifies a work item filter by its links */
    @Json(name = "links")
    val links: WorkItemLinkFilterModel? = null,

    /* Name of work item */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Specifies a work item unique IDs to search for */
    @Json(name = "ids")
    val ids: kotlin.collections.Set<java.util.UUID>? = null,

    /* Collection of global (integer) identifiers */
    @Json(name = "globalIds")
    val globalIds: kotlin.collections.Set<kotlin.Long>? = null,

    /* Custom attributes of work item */
    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<kotlin.String>>? = null,

    /* Is result must consist of only actual/deleted work items */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Collection of section identifiers */
    @Json(name = "sectionIds")
    val sectionIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Collection of identifiers of users who created work item */
    @Json(name = "createdByIds")
    val createdByIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Collection of identifiers of users who applied last modification to work item */
    @Json(name = "modifiedByIds")
    val modifiedByIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Collection of states of work item */
    @Json(name = "states")
    val states: kotlin.collections.Set<WorkItemStates>? = null,

    /* Collection of priorities of work item */
    @Json(name = "priorities")
    val priorities: kotlin.collections.Set<WorkItemPriorityModel>? = null,

    /* Collection of types of work item */
    @Json(name = "types")
    val types: kotlin.collections.Set<WorkItemEntityTypes>? = null,

    /* Specifies a work item range of creation date to search for */
    @Json(name = "createdDate")
    val createdDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a work item range of last modification date to search for */
    @Json(name = "modifiedDate")
    val modifiedDate: DateTimeRangeSelectorModel? = null,

    /* Specifies a work item duration range to search for */
    @Json(name = "duration")
    val duration: Int32RangeSelectorModel? = null,

    /* Specifies a work item median duration range to search for */
    @Json(name = "medianDuration")
    val medianDuration: Int64RangeSelectorModel? = null,

    /* Is result must consist of only manual/automated work items */
    @Json(name = "isAutomated")
    val isAutomated: kotlin.Boolean? = null,

    /* Collection of tags */
    @Json(name = "tags")
    val tags: kotlin.collections.Set<kotlin.String>? = null,

    /* Collection of identifiers of linked autotests */
    @Json(name = "autoTestIds")
    val autoTestIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Collection of identifiers work items versions. */
    @Json(name = "workItemVersionIds")
    val workItemVersionIds: kotlin.collections.List<java.util.UUID>? = null

) {


}

