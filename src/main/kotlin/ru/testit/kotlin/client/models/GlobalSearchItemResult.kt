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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param resourceType 
 * @param resourceId 
 * @param name 
 * @param projectGlobalId 
 * @param globalId 
 */


data class GlobalSearchItemResult (

    @Json(name = "resourceType")
    val resourceType: kotlin.String,

    @Json(name = "resourceId")
    val resourceId: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "projectGlobalId")
    val projectGlobalId: kotlin.Long,

    @Json(name = "globalId")
    val globalId: kotlin.Long? = null

) {


}
