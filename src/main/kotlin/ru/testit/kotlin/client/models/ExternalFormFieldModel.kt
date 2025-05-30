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
 * @param isCustomValueAllowed 
 * @param fieldId 
 * @param fieldName 
 * @param helpText 
 * @param type 
 * @param arrayValuesType 
 * @param defaultValue 
 * @param autoCompleteUrl 
 * @param controlType 
 * @param minLength 
 * @param maxLength 
 * @param isRequired 
 * @param min 
 * @param max 
 */


data class ExternalFormFieldModel (

    @Json(name = "isCustomValueAllowed")
    val isCustomValueAllowed: kotlin.Boolean,

    @Json(name = "fieldId")
    val fieldId: kotlin.String? = null,

    @Json(name = "fieldName")
    val fieldName: kotlin.String? = null,

    @Json(name = "helpText")
    val helpText: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "arrayValuesType")
    val arrayValuesType: kotlin.String? = null,

    @Json(name = "defaultValue")
    val defaultValue: kotlin.Any? = null,

    @Json(name = "autoCompleteUrl")
    val autoCompleteUrl: kotlin.String? = null,

    @Json(name = "controlType")
    val controlType: kotlin.String? = null,

    @Json(name = "minLength")
    val minLength: kotlin.Int? = null,

    @Json(name = "maxLength")
    val maxLength: kotlin.Int? = null,

    @Json(name = "isRequired")
    val isRequired: kotlin.Boolean? = null,

    @Json(name = "min")
    val min: kotlin.Any? = null,

    @Json(name = "max")
    val max: kotlin.Any? = null

) {


}

