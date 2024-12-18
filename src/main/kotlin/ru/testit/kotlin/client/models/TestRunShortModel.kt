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

import ru.testit.kotlin.client.models.TestRunState

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param stateName 
 * @param projectId 
 * @param id Unique ID of the entity
 * @param isDeleted Indicates if the entity is deleted
 * @param testPlanId 
 * @param name 
 * @param description 
 */


data class TestRunShortModel (

    @Json(name = "stateName")
    val stateName: TestRunState,

    @Json(name = "projectId")
    val projectId: java.util.UUID,

    /* Unique ID of the entity */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Indicates if the entity is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "testPlanId")
    val testPlanId: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null

) {


}

