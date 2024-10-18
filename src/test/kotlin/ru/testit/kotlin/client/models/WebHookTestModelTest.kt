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

import ru.testit.kotlin.client.models.WebHookTestModel
import ru.testit.kotlin.client.models.RequestTypeModel

class WebHookTestModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WebHookTestModel
        //val modelInstance = WebHookTestModel()

        // to test the property `requestType` - Request method of the webhook
        should("test requestType") {
            // uncomment below to test the property
            //modelInstance.requestType shouldBe ("TODO")
        }

        // to test the property `url` - Request URL of the webhook
        should("test url") {
            // uncomment below to test the property
            //modelInstance.url shouldBe ("TODO")
        }

    }
}
