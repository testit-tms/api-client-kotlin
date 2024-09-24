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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.NotificationsApi
import org.openapitools.client.models.NotificationModel
import org.openapitools.client.models.NotificationQueryFilterModel
import org.openapitools.client.models.NotificationTypeModel
import org.openapitools.client.models.ProblemDetails
import org.openapitools.client.models.ValidationProblemDetails

class NotificationsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of NotificationsApi
        //val apiInstance = NotificationsApi()

        // to test apiV2NotificationsCountGet
        should("test apiV2NotificationsCountGet") {
            // uncomment below to test apiV2NotificationsCountGet
            //val isRead : kotlin.Boolean = true // kotlin.Boolean | 
            //val result : kotlin.Int = apiInstance.apiV2NotificationsCountGet(isRead)
            //result shouldBe ("TODO")
        }

        // to test apiV2NotificationsGet
        should("test apiV2NotificationsGet") {
            // uncomment below to test apiV2NotificationsGet
            //val notificationType : NotificationTypeModel =  // NotificationTypeModel | 
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val result : kotlin.collections.List<NotificationModel> = apiInstance.apiV2NotificationsGet(notificationType, skip, take, orderBy, searchField, searchValue)
            //result shouldBe ("TODO")
        }

        // to test apiV2NotificationsIdReadPost
        should("test apiV2NotificationsIdReadPost") {
            // uncomment below to test apiV2NotificationsIdReadPost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
            //apiInstance.apiV2NotificationsIdReadPost(id)
        }

        // to test apiV2NotificationsReadPost
        should("test apiV2NotificationsReadPost") {
            // uncomment below to test apiV2NotificationsReadPost
            //apiInstance.apiV2NotificationsReadPost()
        }

        // to test apiV2NotificationsSearchPost
        should("test apiV2NotificationsSearchPost") {
            // uncomment below to test apiV2NotificationsSearchPost
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val notificationQueryFilterModel : NotificationQueryFilterModel =  // NotificationQueryFilterModel | 
            //val result : kotlin.collections.List<NotificationModel> = apiInstance.apiV2NotificationsSearchPost(skip, take, orderBy, searchField, searchValue, notificationQueryFilterModel)
            //result shouldBe ("TODO")
        }

    }
}
