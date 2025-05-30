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
 * @param name 
 * @param hasThisSharedStepAsPrecondition 
 * @param hasThisSharedStepAsPostcondition 
 * @param createdById 
 * @param isDeleted 
 * @param modifiedById 
 * @param createdDate 
 * @param modifiedDate 
 */


data class SharedStepReferenceSectionModel (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "hasThisSharedStepAsPrecondition")
    val hasThisSharedStepAsPrecondition: kotlin.Boolean,

    @Json(name = "hasThisSharedStepAsPostcondition")
    val hasThisSharedStepAsPostcondition: kotlin.Boolean,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "modifiedById")
    val modifiedById: java.util.UUID? = null,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime? = null,

    @Json(name = "modifiedDate")
    val modifiedDate: java.time.OffsetDateTime? = null

) {


}

