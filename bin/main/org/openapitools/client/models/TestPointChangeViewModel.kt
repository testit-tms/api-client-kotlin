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
 * @param userId 
 * @param testPointCount 
 * @param userName 
 */


data class TestPointChangeViewModel (

    @Json(name = "userId")
    val userId: java.util.UUID,

    @Json(name = "testPointCount")
    val testPointCount: kotlin.Long,

    @Json(name = "userName")
    val userName: kotlin.String? = null

) {


}

