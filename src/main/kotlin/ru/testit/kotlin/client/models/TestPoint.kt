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

import ru.testit.kotlin.client.models.TestStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Unique ID of the entity
 * @param isDeleted Indicates if the entity is deleted
 * @param iterationId 
 * @param testSuiteId 
 * @param testerId 
 * @param workItemId 
 * @param configurationId 
 * @param status 
 * @param statusModel 
 * @param lastTestResultId 
 */


data class TestPoint (

    /* Unique ID of the entity */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Indicates if the entity is deleted */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean,

    @Json(name = "iterationId")
    val iterationId: java.util.UUID,

    @Json(name = "testSuiteId")
    val testSuiteId: java.util.UUID,

    @Json(name = "testerId")
    val testerId: java.util.UUID? = null,

    @Json(name = "workItemId")
    val workItemId: java.util.UUID? = null,

    @Json(name = "configurationId")
    val configurationId: java.util.UUID? = null,

    @Json(name = "status")
    @Deprecated(message = "This property is deprecated.")
    val status: kotlin.String? = null,

    @Json(name = "statusModel")
    val statusModel: TestStatus? = null,

    @Json(name = "lastTestResultId")
    val lastTestResultId: java.util.UUID? = null

) {


}
