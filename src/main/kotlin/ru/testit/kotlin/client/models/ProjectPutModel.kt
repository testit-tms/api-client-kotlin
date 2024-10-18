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

import ru.testit.kotlin.client.models.ProjectTypeModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Unique ID of the project
 * @param name Name of the project
 * @param type Type of the project
 * @param description Description of the project
 * @param isFavorite Indicates if the project is marked as favorite
 * @param isFlakyAuto Indicates if the status \"Flaky/Stable\" sets automatically
 */


data class ProjectPutModel (

    /* Unique ID of the project */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Name of the project */
    @Json(name = "name")
    val name: kotlin.String,

    /* Type of the project */
    @Json(name = "type")
    val type: ProjectTypeModel,

    /* Description of the project */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Indicates if the project is marked as favorite */
    @Json(name = "isFavorite")
    val isFavorite: kotlin.Boolean? = null,

    /* Indicates if the status \"Flaky/Stable\" sets automatically */
    @Json(name = "isFlakyAuto")
    val isFlakyAuto: kotlin.Boolean? = null

) {


}

