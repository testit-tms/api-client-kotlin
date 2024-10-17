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
 * @param includeName 
 * @param includeSection 
 * @param includePriority 
 * @param includeAutomated 
 * @param includeStatus 
 * @param includeDuration 
 * @param includeCreationDate 
 * @param includeAuthor 
 * @param includeModificationDate 
 * @param includeModifiedBy 
 * @param includeTags 
 * @param includeIterations 
 * @param customAttributesIds 
 * @param configurationIds 
 */


data class GetXlsxTestPointsByTestPlanModel (

    @Json(name = "includeName")
    val includeName: kotlin.Boolean,

    @Json(name = "includeSection")
    val includeSection: kotlin.Boolean,

    @Json(name = "includePriority")
    val includePriority: kotlin.Boolean,

    @Json(name = "includeAutomated")
    val includeAutomated: kotlin.Boolean,

    @Json(name = "includeStatus")
    val includeStatus: kotlin.Boolean,

    @Json(name = "includeDuration")
    val includeDuration: kotlin.Boolean,

    @Json(name = "includeCreationDate")
    val includeCreationDate: kotlin.Boolean,

    @Json(name = "includeAuthor")
    val includeAuthor: kotlin.Boolean,

    @Json(name = "includeModificationDate")
    val includeModificationDate: kotlin.Boolean,

    @Json(name = "includeModifiedBy")
    val includeModifiedBy: kotlin.Boolean,

    @Json(name = "includeTags")
    val includeTags: kotlin.Boolean,

    @Json(name = "includeIterations")
    val includeIterations: kotlin.Boolean,

    @Json(name = "customAttributesIds")
    val customAttributesIds: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "configurationIds")
    val configurationIds: kotlin.collections.List<java.util.UUID>? = null

) {


}

