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

import ru.testit.kotlin.client.models.AutoTestNamespaceCountApiModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param namespaces 
 */


data class AutoTestNamespacesCountResponse (

    @Json(name = "namespaces")
    val namespaces: kotlin.collections.List<AutoTestNamespaceCountApiModel>

) {


}

