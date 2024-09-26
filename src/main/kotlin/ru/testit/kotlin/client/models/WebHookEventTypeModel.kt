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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * Values: AutomatedTestRunCreated,TestPlansStatusChanged,TestRunStopped,TestPointAssigned,TestResultJiraIssueCreated,AutoTestFinished,UserMentionedInComment,UserSelectedInWorkItemAttribute,AllTestPointsFinished,AllAutoTestsFinished,AutoTestChanged,WorkItemAutoTestRelationChanged,WorkItemAttributeChanged,WorkItemChanged,ConfigurationChanged,ProjectChanged,TestPlanChanged
 */

@JsonClass(generateAdapter = false)
enum class WebHookEventTypeModel(val value: kotlin.String) {

    @Json(name = "AutomatedTestRunCreated")
    AutomatedTestRunCreated("AutomatedTestRunCreated"),

    @Json(name = "TestPlansStatusChanged")
    TestPlansStatusChanged("TestPlansStatusChanged"),

    @Json(name = "TestRunStopped")
    TestRunStopped("TestRunStopped"),

    @Json(name = "TestPointAssigned")
    TestPointAssigned("TestPointAssigned"),

    @Json(name = "TestResultJiraIssueCreated")
    TestResultJiraIssueCreated("TestResultJiraIssueCreated"),

    @Json(name = "AutoTestFinished")
    AutoTestFinished("AutoTestFinished"),

    @Json(name = "UserMentionedInComment")
    UserMentionedInComment("UserMentionedInComment"),

    @Json(name = "UserSelectedInWorkItemAttribute")
    UserSelectedInWorkItemAttribute("UserSelectedInWorkItemAttribute"),

    @Json(name = "AllTestPointsFinished")
    AllTestPointsFinished("AllTestPointsFinished"),

    @Json(name = "AllAutoTestsFinished")
    AllAutoTestsFinished("AllAutoTestsFinished"),

    @Json(name = "AutoTestChanged")
    AutoTestChanged("AutoTestChanged"),

    @Json(name = "WorkItemAutoTestRelationChanged")
    WorkItemAutoTestRelationChanged("WorkItemAutoTestRelationChanged"),

    @Json(name = "WorkItemAttributeChanged")
    WorkItemAttributeChanged("WorkItemAttributeChanged"),

    @Json(name = "WorkItemChanged")
    WorkItemChanged("WorkItemChanged"),

    @Json(name = "ConfigurationChanged")
    ConfigurationChanged("ConfigurationChanged"),

    @Json(name = "ProjectChanged")
    ProjectChanged("ProjectChanged"),

    @Json(name = "TestPlanChanged")
    TestPlanChanged("TestPlanChanged");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is WebHookEventTypeModel) "$data" else null

        /**
         * Returns a valid [WebHookEventTypeModel] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): WebHookEventTypeModel? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
