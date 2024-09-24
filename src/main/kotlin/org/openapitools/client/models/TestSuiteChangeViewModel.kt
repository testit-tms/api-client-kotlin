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

import org.openapitools.client.models.ShortConfiguration

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param workItemCount 
 * @param configurations 
 */


data class TestSuiteChangeViewModel (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "workItemCount")
    val workItemCount: kotlin.Long,

    @Json(name = "configurations")
    val configurations: kotlin.collections.List<ShortConfiguration>? = null

) {


}

