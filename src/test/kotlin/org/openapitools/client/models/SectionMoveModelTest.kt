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

import org.openapitools.client.models.SectionMoveModel

class SectionMoveModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SectionMoveModel
        //val modelInstance = SectionMoveModel()

        // to test the property `id` - Unique ID of the section
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `oldParentId` - Unique ID of the section's current parent section
        should("test oldParentId") {
            // uncomment below to test the property
            //modelInstance.oldParentId shouldBe ("TODO")
        }

        // to test the property `parentId` - Unique ID of the section's target parent section
        should("test parentId") {
            // uncomment below to test the property
            //modelInstance.parentId shouldBe ("TODO")
        }

        // to test the property `nextSectionId` - Unique ID of the section's following section
        should("test nextSectionId") {
            // uncomment below to test the property
            //modelInstance.nextSectionId shouldBe ("TODO")
        }

    }
}
