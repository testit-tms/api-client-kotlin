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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ru.testit.kotlin.client.models.SearchWebhooksQueryModel
import ru.testit.kotlin.client.models.RequestTypeModel
import ru.testit.kotlin.client.models.WebHookEventTypeModel

class SearchWebhooksQueryModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SearchWebhooksQueryModel
        //val modelInstance = SearchWebhooksQueryModel()

        // to test the property `name` - Specifies a webhook name to search for
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `eventTypes` - Specifies a webhook event types to search for
        should("test eventTypes") {
            // uncomment below to test the property
            //modelInstance.eventTypes shouldBe ("TODO")
        }

        // to test the property `methods` - Specifies a webhook methods to search for
        should("test methods") {
            // uncomment below to test the property
            //modelInstance.methods shouldBe ("TODO")
        }

        // to test the property `projectIds` - Specifies a webhook project IDs to search for
        should("test projectIds") {
            // uncomment below to test the property
            //modelInstance.projectIds shouldBe ("TODO")
        }

        // to test the property `isEnabled` - Specifies a webhook deleted status to search for
        should("test isEnabled") {
            // uncomment below to test the property
            //modelInstance.isEnabled shouldBe ("TODO")
        }

    }
}
