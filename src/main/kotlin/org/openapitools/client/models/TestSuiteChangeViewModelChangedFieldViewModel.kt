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

import org.openapitools.client.models.TestSuiteChangeViewModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param oldValue 
 * @param newValue 
 */


data class TestSuiteChangeViewModelChangedFieldViewModel (

    @Json(name = "oldValue")
    val oldValue: TestSuiteChangeViewModel? = null,

    @Json(name = "newValue")
    val newValue: TestSuiteChangeViewModel? = null

) {


}

