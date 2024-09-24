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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.WebHookPostModel
import org.openapitools.client.models.RequestTypeModel
import org.openapitools.client.models.WebHookEventTypeModel

class WebHookPostModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WebHookPostModel
        //val modelInstance = WebHookPostModel()

        // to test the property `projectId` - Unique ID of the webhook project
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `eventType` - Type of event which triggers the webhook
        should("test eventType") {
            // uncomment below to test the property
            //modelInstance.eventType shouldBe ("TODO")
        }

        // to test the property `url` - Request URL of the webhook
        should("test url") {
            // uncomment below to test the property
            //modelInstance.url shouldBe ("TODO")
        }

        // to test the property `requestType` - Request method of the webhook
        should("test requestType") {
            // uncomment below to test the property
            //modelInstance.requestType shouldBe ("TODO")
        }

        // to test the property `shouldSendBody` - Indicates if the webhook sends body
        should("test shouldSendBody") {
            // uncomment below to test the property
            //modelInstance.shouldSendBody shouldBe ("TODO")
        }

        // to test the property `headers` - Collection of the webhook headers
        should("test headers") {
            // uncomment below to test the property
            //modelInstance.headers shouldBe ("TODO")
        }

        // to test the property `queryParameters` - Collection of the webhook query parameters
        should("test queryParameters") {
            // uncomment below to test the property
            //modelInstance.queryParameters shouldBe ("TODO")
        }

        // to test the property `isEnabled` - Indicates if the webhook is active
        should("test isEnabled") {
            // uncomment below to test the property
            //modelInstance.isEnabled shouldBe ("TODO")
        }

        // to test the property `shouldSendCustomBody` - Indicates if the webhook sends custom body
        should("test shouldSendCustomBody") {
            // uncomment below to test the property
            //modelInstance.shouldSendCustomBody shouldBe ("TODO")
        }

        // to test the property `shouldReplaceParameters` - Indicates if the webhook injects parameters
        should("test shouldReplaceParameters") {
            // uncomment below to test the property
            //modelInstance.shouldReplaceParameters shouldBe ("TODO")
        }

        // to test the property `shouldEscapeParameters` - Indicates if the webhook escapes invalid characters in parameters
        should("test shouldEscapeParameters") {
            // uncomment below to test the property
            //modelInstance.shouldEscapeParameters shouldBe ("TODO")
        }

        // to test the property `name` - Name of the webhook
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `description` - Description of the webhook
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `customBody` - Custom body of the webhook
        should("test customBody") {
            // uncomment below to test the property
            //modelInstance.customBody shouldBe ("TODO")
        }

    }
}
