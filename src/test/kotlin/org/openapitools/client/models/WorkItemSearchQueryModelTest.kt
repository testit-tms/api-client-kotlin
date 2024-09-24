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

import org.openapitools.client.models.WorkItemSearchQueryModel
import org.openapitools.client.models.DateTimeRangeSelectorModel
import org.openapitools.client.models.Int32RangeSelectorModel
import org.openapitools.client.models.Int64RangeSelectorModel
import org.openapitools.client.models.WorkItemEntityTypes
import org.openapitools.client.models.WorkItemPriorityModel
import org.openapitools.client.models.WorkItemStates

class WorkItemSearchQueryModelTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemSearchQueryModel
        //val modelInstance = WorkItemSearchQueryModel()

        // to test the property `projectIds` - Collection of project identifiers
        should("test projectIds") {
            // uncomment below to test the property
            //modelInstance.projectIds shouldBe ("TODO")
        }

        // to test the property `name` - Name of work item
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `ids` - Specifies a work item unique IDs to search for
        should("test ids") {
            // uncomment below to test the property
            //modelInstance.ids shouldBe ("TODO")
        }

        // to test the property `globalIds` - Collection of global (integer) identifiers
        should("test globalIds") {
            // uncomment below to test the property
            //modelInstance.globalIds shouldBe ("TODO")
        }

        // to test the property `attributes` - Custom attributes of work item
        should("test attributes") {
            // uncomment below to test the property
            //modelInstance.attributes shouldBe ("TODO")
        }

        // to test the property `isDeleted` - Is result must consist of only actual/deleted work items
        should("test isDeleted") {
            // uncomment below to test the property
            //modelInstance.isDeleted shouldBe ("TODO")
        }

        // to test the property `sectionIds` - Collection of section identifiers
        should("test sectionIds") {
            // uncomment below to test the property
            //modelInstance.sectionIds shouldBe ("TODO")
        }

        // to test the property `createdByIds` - Collection of identifiers of users who created work item
        should("test createdByIds") {
            // uncomment below to test the property
            //modelInstance.createdByIds shouldBe ("TODO")
        }

        // to test the property `modifiedByIds` - Collection of identifiers of users who applied last modification to work item
        should("test modifiedByIds") {
            // uncomment below to test the property
            //modelInstance.modifiedByIds shouldBe ("TODO")
        }

        // to test the property `states` - Collection of states of work item
        should("test states") {
            // uncomment below to test the property
            //modelInstance.states shouldBe ("TODO")
        }

        // to test the property `priorities` - Collection of priorities of work item
        should("test priorities") {
            // uncomment below to test the property
            //modelInstance.priorities shouldBe ("TODO")
        }

        // to test the property `types` - Collection of types of work item
        should("test types") {
            // uncomment below to test the property
            //modelInstance.types shouldBe ("TODO")
        }

        // to test the property `createdDate` - Specifies a work item range of creation date to search for
        should("test createdDate") {
            // uncomment below to test the property
            //modelInstance.createdDate shouldBe ("TODO")
        }

        // to test the property `modifiedDate` - Specifies a work item range of last modification date to search for
        should("test modifiedDate") {
            // uncomment below to test the property
            //modelInstance.modifiedDate shouldBe ("TODO")
        }

        // to test the property `duration` - Specifies a work item duration range to search for
        should("test duration") {
            // uncomment below to test the property
            //modelInstance.duration shouldBe ("TODO")
        }

        // to test the property `medianDuration` - Specifies a work item median duration range to search for
        should("test medianDuration") {
            // uncomment below to test the property
            //modelInstance.medianDuration shouldBe ("TODO")
        }

        // to test the property `isAutomated` - Is result must consist of only manual/automated work items
        should("test isAutomated") {
            // uncomment below to test the property
            //modelInstance.isAutomated shouldBe ("TODO")
        }

        // to test the property `tags` - Collection of tags
        should("test tags") {
            // uncomment below to test the property
            //modelInstance.tags shouldBe ("TODO")
        }

        // to test the property `autoTestIds` - Collection of identifiers of linked autotests
        should("test autoTestIds") {
            // uncomment below to test the property
            //modelInstance.autoTestIds shouldBe ("TODO")
        }

        // to test the property `workItemVersionIds` - Collection of identifiers work items versions.
        should("test workItemVersionIds") {
            // uncomment below to test the property
            //modelInstance.workItemVersionIds shouldBe ("TODO")
        }

    }
}
