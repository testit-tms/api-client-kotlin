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

import ru.testit.kotlin.client.models.TestPointChangeViewModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param oldValue 
 * @param newValue 
 */


data class TestPointChangeViewModelChangedFieldViewModel (

    @Json(name = "oldValue")
    val oldValue: TestPointChangeViewModel? = null,

    @Json(name = "newValue")
    val newValue: TestPointChangeViewModel? = null

) {


}
