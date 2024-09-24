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

import org.openapitools.client.apis.WebhooksLogsApi
import org.openapitools.client.models.ProblemDetails
import org.openapitools.client.models.ValidationProblemDetails
import org.openapitools.client.models.WebHookLogModel

class WebhooksLogsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WebhooksLogsApi
        //val apiInstance = WebhooksLogsApi()

        // to test apiV2WebhooksLogsGet
        should("test apiV2WebhooksLogsGet") {
            // uncomment below to test apiV2WebhooksLogsGet
            //val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Project unique ID
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val result : kotlin.collections.List<WebHookLogModel> = apiInstance.apiV2WebhooksLogsGet(projectId, skip, take, orderBy, searchField, searchValue)
            //result shouldBe ("TODO")
        }

        // to test apiV2WebhooksLogsIdDelete
        should("test apiV2WebhooksLogsIdDelete") {
            // uncomment below to test apiV2WebhooksLogsIdDelete
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook log unique ID
            //apiInstance.apiV2WebhooksLogsIdDelete(id)
        }

        // to test apiV2WebhooksLogsIdGet
        should("test apiV2WebhooksLogsIdGet") {
            // uncomment below to test apiV2WebhooksLogsIdGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Webhook log unique ID
            //val result : WebHookLogModel = apiInstance.apiV2WebhooksLogsIdGet(id)
            //result shouldBe ("TODO")
        }

    }
}
