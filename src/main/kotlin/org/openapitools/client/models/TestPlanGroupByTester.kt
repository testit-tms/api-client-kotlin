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
 * @param `value` 
 * @param userId 
 */


data class TestPlanGroupByTester (

    @Json(name = "value")
    val `value`: kotlin.Long,

    @Json(name = "userId")
    val userId: java.util.UUID? = null

) {


}

