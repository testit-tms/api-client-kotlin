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

import ru.testit.kotlin.client.models.AutoTestChangeViewModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param oldValue 
 * @param newValue 
 */


data class AutoTestChangeViewModelArrayChangedFieldViewModel (

    @Json(name = "oldValue")
    val oldValue: kotlin.collections.List<AutoTestChangeViewModel>? = null,

    @Json(name = "newValue")
    val newValue: kotlin.collections.List<AutoTestChangeViewModel>? = null

) {


}

