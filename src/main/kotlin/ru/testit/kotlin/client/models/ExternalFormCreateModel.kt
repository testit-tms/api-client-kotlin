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

import ru.testit.kotlin.client.models.ExternalFormAllowedValueModel
import ru.testit.kotlin.client.models.ExternalFormFieldModel
import ru.testit.kotlin.client.models.ExternalFormLinkModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param possibleValues 
 * @param fields 
 * @param links 
 * @param propertyValues 
 */


data class ExternalFormCreateModel (

    @Json(name = "possibleValues")
    val possibleValues: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ExternalFormAllowedValueModel>>,

    @Json(name = "fields")
    val fields: kotlin.collections.List<ExternalFormFieldModel>,

    @Json(name = "links")
    val links: kotlin.collections.List<ExternalFormLinkModel>,

    @Json(name = "values")
    val propertyValues: kotlin.collections.Map<kotlin.String, kotlin.Any>

) {


}

