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
 * @param projectId This property is used to link configuration with project
 * @param parameterIds 
 */


data class ConfigurationByParametersModel (

    /* This property is used to link configuration with project */
    @Json(name = "projectId")
    val projectId: java.util.UUID,

    @Json(name = "parameterIds")
    val parameterIds: kotlin.collections.Set<java.util.UUID>

) {


}

