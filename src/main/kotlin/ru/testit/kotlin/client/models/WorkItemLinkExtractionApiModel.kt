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

import ru.testit.kotlin.client.models.GuidExtractionModel
import ru.testit.kotlin.client.models.StringExtractionModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param projectIds 
 * @param workItemIds 
 * @param linkUrls 
 */


data class WorkItemLinkExtractionApiModel (

    @Json(name = "projectIds")
    val projectIds: GuidExtractionModel? = null,

    @Json(name = "workItemIds")
    val workItemIds: GuidExtractionModel? = null,

    @Json(name = "linkUrls")
    val linkUrls: StringExtractionModel? = null

) {


}

