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

import ru.testit.kotlin.client.models.ParameterIterationModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param parameters 
 * @param id 
 */


data class IterationPutModel (

    @Json(name = "parameters")
    val parameters: kotlin.collections.List<ParameterIterationModel>,

    @Json(name = "id")
    val id: java.util.UUID

) {


}
