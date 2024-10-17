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
 * @param id Unique ID of project
 * @param isDeleted Indicates whether the project is deleted
 * @param globalId Global ID of project
 * @param name Name of project
 * @param type Type of the project
 */


data class ProjectShortestModel (

    /* Unique ID of project */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Indicates whether the project is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    /* Global ID of project */
    @Json(name = "globalId")
    val globalId: kotlin.Long,

    /* Name of project */
    @Json(name = "name")
    val name: kotlin.String,

    /* Type of the project */
    @Json(name = "type")
    val type: ProjectTypeModel

) {


}

