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

import ru.testit.kotlin.client.models.ExternalFormCreateModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param testResultIds Linked test result IDs
 * @param form External form definition
 */


data class CreateDefectApiModel (

    /* Linked test result IDs */
    @Json(name = "testResultIds")
    val testResultIds: kotlin.collections.List<java.util.UUID>,

    /* External form definition */
    @Json(name = "form")
    val form: ExternalFormCreateModel

) {


}

