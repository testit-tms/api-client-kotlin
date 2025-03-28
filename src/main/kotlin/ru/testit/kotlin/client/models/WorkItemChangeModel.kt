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

import ru.testit.kotlin.client.models.WorkItemChangedFieldsViewModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param workItemId 
 * @param oldVersionId 
 * @param newVersionId 
 * @param workItemChangedFields 
 * @param createdById 
 * @param createdDate 
 */


data class WorkItemChangeModel (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "workItemId")
    val workItemId: java.util.UUID,

    @Json(name = "oldVersionId")
    val oldVersionId: java.util.UUID,

    @Json(name = "newVersionId")
    val newVersionId: java.util.UUID,

    @Json(name = "workItemChangedFields")
    val workItemChangedFields: WorkItemChangedFieldsViewModel,

    @Json(name = "createdById")
    val createdById: java.util.UUID,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime? = null

) {


}

