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

import ru.testit.kotlin.client.models.AutoTestStepModel
import ru.testit.kotlin.client.models.LabelPostModel
import ru.testit.kotlin.client.models.LinkPostModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*

/**
 * 
 *
 * @param externalId External ID of the autotest
 * @param projectId Unique ID of the autotest project
 * @param name Name of the autotest
 * @param workItemIdsForLinkWithAutoTest Specifies the IDs of work items to link your autotest to. You can specify several IDs.
 * @param LinkType Creates a test case linked to the autotest.
 * @param attributes Key value pair of custom work item attributes
 * @param links Collection of the autotest links
 * @param namespace Name of the autotest namespace
 * @param classname Name of the autotest class
 * @param steps Collection of the autotest steps
 * @param setup Collection of the autotest setup steps
 * @param teardown Collection of the autotest teardown steps
 * @param title Name of the autotest in autotest's card
 * @param description Description of the autotest in autotest's card
 * @param labels Collection of the autotest labels
 * @param isFlaky Indicates if the autotest is marked as flaky
 * @param externalKey External key of the autotest
 */


data class AutoTestPostModel (

    /* External ID of the autotest */
    @Json(name = "externalId")
    var externalId: kotlin.String,

    /* Unique ID of the autotest project */
    @Json(name = "projectId")
    var projectId: java.util.UUID,

    /* Name of the autotest */
    @Json(name = "name")
    var name: kotlin.String,

    /* Specifies the IDs of work items to link your autotest to. You can specify several IDs. */
    @Json(name = "workItemIdsForLinkWithAutoTest")
    var workItemIdsForLinkWithAutoTest: kotlin.collections.Set<java.util.UUID>? = null,

    /* Creates a test case linked to the autotest. */
    @Json(name = "shouldCreateWorkItem")
    var shouldCreateWorkItem: kotlin.Boolean? = null,

    /* Key value pair of custom work item attributes */
    @Json(name = "attributes")
    var attributes: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    /* Collection of the autotest links */
    @Json(name = "links")
    var links: kotlin.collections.List<LinkPostModel>? = null,

    /* Name of the autotest namespace */
    @Json(name = "namespace")
    var namespace: kotlin.String? = null,

    /* Name of the autotest class */
    @Json(name = "classname")
    var classname: kotlin.String? = null,

    /* Collection of the autotest steps */
    @Json(name = "steps")
    var steps: kotlin.collections.List<AutoTestStepModel>? = null,

    /* Collection of the autotest setup steps */
    @Json(name = "setup")
    var setup: kotlin.collections.List<AutoTestStepModel>? = null,

    /* Collection of the autotest teardown steps */
    @Json(name = "teardown")
    var teardown: kotlin.collections.List<AutoTestStepModel>? = null,

    /* Name of the autotest in autotest's card */
    @Json(name = "title")
    var title: kotlin.String? = null,

    /* Description of the autotest in autotest's card */
    @Json(name = "description")
    var description: kotlin.String? = null,

    /* Collection of the autotest labels */
    @Json(name = "labels")
    var labels: kotlin.collections.List<LabelPostModel>? = null,

    /* Indicates if the autotest is marked as flaky */
    @Json(name = "isFlaky")
    var isFlaky: kotlin.Boolean? = null,

    /* External key of the autotest */
    @Json(name = "externalKey")
    var externalKey: kotlin.String? = null

) {
    constructor() : this("", UUID.randomUUID(),
        "")

}

