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

import ru.testit.kotlin.client.models.AutotestResultOutcome
import ru.testit.kotlin.client.models.DateTimeRangeSelectorModel
import ru.testit.kotlin.client.models.Int64RangeSelectorModel

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param projectIds Specifies an autotest projects IDs to search for
 * @param externalIds Specifies an autotest external IDs to search for
 * @param globalIds Specifies an autotest global IDs to search for
 * @param name Specifies an autotest name to search for
 * @param isFlaky Specifies an autotest flaky status to search for
 * @param mustBeApproved Specifies an autotest unapproved changes status to search for
 * @param stabilityPercentage Specifies an autotest range of stability percentage to search for
 * @param createdDate Specifies an autotest range of creation date to search for
 * @param createdByIds Specifies an autotest creator IDs to search for
 * @param modifiedDate Specifies an autotest range of last modification date to search for
 * @param modifiedByIds Specifies an autotest last editor IDs to search for
 * @param isDeleted Specifies an autotest deleted status to search for
 * @param namespace Specifies an autotest namespace to search for
 * @param isEmptyNamespace Specifies an autotest namespace name presence status to search for
 * @param className Specifies an autotest class name to search for
 * @param isEmptyClassName Specifies an autotest class name presence status to search for
 * @param lastTestResultOutcome Specifies an autotest outcome of the last test result to search for
 * @param lastTestResultStatusCode Specifies an autotest status code of the last test result to search for
 * @param externalKey Specifies an autotest external key to search for
 * @param lastTestResultConfigurationIds Specifies an autotest configuration IDs of the last test result to search for
 */


data class AutoTestFilterApiModel (

    /* Specifies an autotest projects IDs to search for */
    @Json(name = "projectIds")
    val projectIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Specifies an autotest external IDs to search for */
    @Json(name = "externalIds")
    val externalIds: kotlin.collections.Set<kotlin.String>? = null,

    /* Specifies an autotest global IDs to search for */
    @Json(name = "globalIds")
    val globalIds: kotlin.collections.Set<kotlin.Long>? = null,

    /* Specifies an autotest name to search for */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Specifies an autotest flaky status to search for */
    @Json(name = "isFlaky")
    val isFlaky: kotlin.Boolean? = null,

    /* Specifies an autotest unapproved changes status to search for */
    @Json(name = "mustBeApproved")
    val mustBeApproved: kotlin.Boolean? = null,

    /* Specifies an autotest range of stability percentage to search for */
    @Json(name = "stabilityPercentage")
    val stabilityPercentage: Int64RangeSelectorModel? = null,

    /* Specifies an autotest range of creation date to search for */
    @Json(name = "createdDate")
    val createdDate: DateTimeRangeSelectorModel? = null,

    /* Specifies an autotest creator IDs to search for */
    @Json(name = "createdByIds")
    val createdByIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Specifies an autotest range of last modification date to search for */
    @Json(name = "modifiedDate")
    val modifiedDate: DateTimeRangeSelectorModel? = null,

    /* Specifies an autotest last editor IDs to search for */
    @Json(name = "modifiedByIds")
    val modifiedByIds: kotlin.collections.Set<java.util.UUID>? = null,

    /* Specifies an autotest deleted status to search for */
    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    /* Specifies an autotest namespace to search for */
    @Json(name = "namespace")
    val namespace: kotlin.String? = null,

    /* Specifies an autotest namespace name presence status to search for */
    @Json(name = "isEmptyNamespace")
    val isEmptyNamespace: kotlin.Boolean? = null,

    /* Specifies an autotest class name to search for */
    @Json(name = "className")
    val className: kotlin.String? = null,

    /* Specifies an autotest class name presence status to search for */
    @Json(name = "isEmptyClassName")
    val isEmptyClassName: kotlin.Boolean? = null,

    /* Specifies an autotest outcome of the last test result to search for */
    @Json(name = "lastTestResultOutcome")
    val lastTestResultOutcome: AutotestResultOutcome? = null,

    /* Specifies an autotest status code of the last test result to search for */
    @Json(name = "lastTestResultStatusCode")
    val lastTestResultStatusCode: kotlin.String? = null,

    /* Specifies an autotest external key to search for */
    @Json(name = "externalKey")
    val externalKey: kotlin.String? = null,

    /* Specifies an autotest configuration IDs of the last test result to search for */
    @Json(name = "lastTestResultConfigurationIds")
    val lastTestResultConfigurationIds: kotlin.collections.Set<java.util.UUID>? = null

) {


}

