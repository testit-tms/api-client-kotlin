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

import ru.testit.kotlin.client.models.WorkItemExtractionApiModel
import ru.testit.kotlin.client.models.WorkItemFilterApiModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param filter 
 * @param extractionModel 
 */


data class WorkItemSelectApiModel (

    @Json(name = "filter")
    val filter: WorkItemFilterApiModel,

    @Json(name = "extractionModel")
    val extractionModel: WorkItemExtractionApiModel? = null

) {


}

