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

import org.openapitools.client.models.DateTimeRangeSelectorModel
import org.openapitools.client.models.NotificationTypeModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param types 
 * @param isRead 
 * @param createdDate 
 */


data class NotificationQueryFilterModel (

    @Json(name = "types")
    val types: kotlin.collections.Set<NotificationTypeModel>? = null,

    @Json(name = "isRead")
    val isRead: kotlin.Boolean? = null,

    @Json(name = "createdDate")
    val createdDate: DateTimeRangeSelectorModel? = null

) {


}
