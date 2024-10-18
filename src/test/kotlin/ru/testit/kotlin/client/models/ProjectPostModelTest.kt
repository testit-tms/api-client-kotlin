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

import ru.testit.kotlin.client.models.ProjectPostModel

class ProjectPostModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProjectPostModel
        //val modelInstance = ProjectPostModel()

        // to test the property `name` - Name of the project
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `description` - Description of the project
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `isFavorite` - Indicates if the project is marked as favorite
        should("test isFavorite") {
            // uncomment below to test the property
            //modelInstance.isFavorite shouldBe ("TODO")
        }

        // to test the property `isFlakyAuto` - Indicates if the status \"Flaky/Stable\" sets automatically
        should("test isFlakyAuto") {
            // uncomment below to test the property
            //modelInstance.isFlakyAuto shouldBe ("TODO")
        }

    }
}
