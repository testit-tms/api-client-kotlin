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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param query 
 * @param take 
 * @param skip 
 * @param resourceType 
 */


data class GlobalSearchRequest (

    @Json(name = "query")
    val query: kotlin.String,

    @Json(name = "take")
    val take: kotlin.Int,

    @Json(name = "skip")
    val skip: kotlin.Int,

    @Json(name = "resourceType")
    val resourceType: kotlin.String? = null

) {


}

