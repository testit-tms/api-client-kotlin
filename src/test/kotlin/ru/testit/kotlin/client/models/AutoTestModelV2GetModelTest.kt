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

import ru.testit.kotlin.client.models.AutoTestModelV2GetModel
import ru.testit.kotlin.client.models.AutoTestStepModel
import ru.testit.kotlin.client.models.LabelShortModel
import ru.testit.kotlin.client.models.LinkModel

class AutoTestModelV2GetModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AutoTestModelV2GetModel
        //val modelInstance = AutoTestModelV2GetModel()

        // to test the property `externalId` - This property is used to set autotest identifier from client system
        should("test externalId") {
            // uncomment below to test the property
            //modelInstance.externalId shouldBe ("TODO")
        }

        // to test the property `projectId` - This property is used to link autotest with project
        should("test projectId") {
            // uncomment below to test the property
            //modelInstance.projectId shouldBe ("TODO")
        }

        // to test the property `name`
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `globalId`
        should("test globalId") {
            // uncomment below to test the property
            //modelInstance.globalId shouldBe ("TODO")
        }

        // to test the property `createdById`
        should("test createdById") {
            // uncomment below to test the property
            //modelInstance.createdById shouldBe ("TODO")
        }

        // to test the property `id` - Unique ID of the entity
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `isDeleted` - Indicates if the entity is deleted
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `links`
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

        // to test the property `namespace`
        should("test namespace") {
            // uncomment below to test the property
            //modelInstance.namespace shouldBe ("TODO")
        }

        // to test the property `classname`
        should("test classname") {
            // uncomment below to test the property
            //modelInstance.classname shouldBe ("TODO")
        }

        // to test the property `steps`
        should("test steps") {
            // uncomment below to test the property
            //modelInstance.steps shouldBe ("TODO")
        }

        // to test the property `setup`
        should("test setup") {
            // uncomment below to test the property
            //modelInstance.setup shouldBe ("TODO")
        }

        // to test the property `teardown`
        should("test teardown") {
            // uncomment below to test the property
            //modelInstance.teardown shouldBe ("TODO")
        }

        // to test the property `createdDate`
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `modifiedDate`
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `modifiedById`
        should("test modifiedById") {
            // uncomment below to test the property
            //modelInstance.modifiedById shouldBe ("TODO")
        }

        // to test the property `labels`
        should("test labels") {
            // uncomment below to test the property
            //modelInstance.labels shouldBe ("TODO")
        }

        // to test the property `externalKey`
        should("test externalKey") {
            // uncomment below to test the property
            //modelInstance.externalKey shouldBe ("TODO")
        }

    }
}
