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
 * @param id 
 * @param globalId 
 * @param externalId 
 * @param projectId 
 * @param name 
 */


data class AutoTestShortModel (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "globalId")
    val globalId: kotlin.Long,

    @Json(name = "externalId")
    val externalId: kotlin.String,

    @Json(name = "projectId")
    val projectId: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String

) {


}

