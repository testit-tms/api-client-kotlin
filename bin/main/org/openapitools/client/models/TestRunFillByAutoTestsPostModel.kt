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
import org.openapitools.client.models.LinkPostModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param projectId Specifies the GUID of the project, in which a test run will be created.
 * @param configurationIds Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs.
 * @param autoTestExternalIds Specifies the external ID of the autotest. You can specify several IDs.
 * @param name Specifies the name of the test run.
 * @param description Specifies the test run description.
 * @param launchSource Specifies the test run launch source.
 * @param attachments Collection of attachment ids to relate to the test run
 * @param links Collection of links to relate to the test run
 */


data class TestRunFillByAutoTestsPostModel (

    /* Specifies the GUID of the project, in which a test run will be created. */
    @Json(name = "projectId")
    val projectId: java.util.UUID,

    /* Specifies the configuration GUIDs, from which test points are created. You can specify several GUIDs. */
    @Json(name = "configurationIds")
    val configurationIds: kotlin.collections.List<java.util.UUID>,

    /* Specifies the external ID of the autotest. You can specify several IDs. */
    @Json(name = "autoTestExternalIds")
    val autoTestExternalIds: kotlin.collections.List<kotlin.String>,

    /* Specifies the name of the test run. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Specifies the test run description. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Specifies the test run launch source. */
    @Json(name = "launchSource")
    val launchSource: kotlin.String? = null,

    /* Collection of attachment ids to relate to the test run */
    @Json(name = "attachments")
    val attachments: kotlin.collections.List<AttachmentPutModel>? = null,

    /* Collection of links to relate to the test run */
    @Json(name = "links")
    val links: kotlin.collections.List<LinkPostModel>? = null

) {


}

