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

import org.openapitools.client.models.ProjectCustomAttributeTemplateGetModel
import org.openapitools.client.models.CustomAttributeModel

class ProjectCustomAttributeTemplateGetModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProjectCustomAttributeTemplateGetModel
        //val modelInstance = ProjectCustomAttributeTemplateGetModel()

        // to test the property `id` - Unique ID of the custom attributes template
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `isDeleted` - Indicates if the custom attribute template is deleted
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `name` - Name of the custom attribute template
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `customAttributeModels` - Attributes of the template
        should("test customAttributeModels") {
            // uncomment below to test the property
            //modelInstance.customAttributeModels shouldBe ("TODO")
        }

    }
}