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

import org.openapitools.client.models.AutoTestStepModel
import org.openapitools.client.models.LabelPostModel
import org.openapitools.client.models.LinkPutModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param externalId External ID of the autotest
 * @param projectId Unique ID of the autotest project
 * @param name Name of the autotest
 * @param id Used for search autotest. If value is null or equals Guid mask filled with zeros, search will be executed using ExternalId
 * @param workItemIdsForLinkWithAutoTest 
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


data class AutoTestPutModel (

    /* External ID of the autotest */
    @Json(name = "externalId")
    val externalId: kotlin.String,

    /* Unique ID of the autotest project */
    @Json(name = "projectId")
    val projectId: java.util.UUID,

    /* Name of the autotest */
    @Json(name = "name")
    val name: kotlin.String,

    /* Used for search autotest. If value is null or equals Guid mask filled with zeros, search will be executed using ExternalId */
    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "workItemIdsForLinkWithAutoTest")
    val workItemIdsForLinkWithAutoTest: kotlin.collections.Set<java.util.UUID>? = null,

    /* Collection of the autotest links */
    @Json(name = "links")
    val links: kotlin.collections.List<LinkPutModel>? = null,

    /* Name of the autotest namespace */
    @Json(name = "namespace")
    val namespace: kotlin.String? = null,

    /* Name of the autotest class */
    @Json(name = "classname")
    val classname: kotlin.String? = null,

    /* Collection of the autotest steps */
    @Json(name = "steps")
    val steps: kotlin.collections.List<AutoTestStepModel>? = null,

    /* Collection of the autotest setup steps */
    @Json(name = "setup")
    val setup: kotlin.collections.List<AutoTestStepModel>? = null,

    /* Collection of the autotest teardown steps */
    @Json(name = "teardown")
    val teardown: kotlin.collections.List<AutoTestStepModel>? = null,

    /* Name of the autotest in autotest's card */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Description of the autotest in autotest's card */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Collection of the autotest labels */
    @Json(name = "labels")
    val labels: kotlin.collections.List<LabelPostModel>? = null,

    /* Indicates if the autotest is marked as flaky */
    @Json(name = "isFlaky")
    val isFlaky: kotlin.Boolean? = null,

    /* External key of the autotest */
    @Json(name = "externalKey")
    val externalKey: kotlin.String? = null

) {


}

