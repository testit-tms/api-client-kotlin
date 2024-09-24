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

import org.openapitools.client.models.ProjectExtractionModel
import org.openapitools.client.models.ProjectsFilterModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param filter 
 * @param extractionModel 
 */


data class ProjectSelectModel (

    @Json(name = "filter")
    val filter: ProjectsFilterModel? = null,

    @Json(name = "extractionModel")
    val extractionModel: ProjectExtractionModel? = null

) {


}

