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

import org.openapitools.client.apis.WorkItemsCommentsApi
import org.openapitools.client.models.ProblemDetails
import org.openapitools.client.models.ValidationProblemDetails
import org.openapitools.client.models.WorkItemCommentModel
import org.openapitools.client.models.WorkItemCommentPostModel
import org.openapitools.client.models.WorkItemCommentPutModel

class WorkItemsCommentsApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkItemsCommentsApi
        //val apiInstance = WorkItemsCommentsApi()

        // to test apiV2WorkItemsCommentsCommentIdDelete
        should("test apiV2WorkItemsCommentsCommentIdDelete") {
            // uncomment below to test apiV2WorkItemsCommentsCommentIdDelete
            //val commentId : java.util.UUID = 3fa85f64-5717-4562-b3fc-2c963f66afa6 // java.util.UUID | Comment internal (guid format) identifier
            //apiInstance.apiV2WorkItemsCommentsCommentIdDelete(commentId)
        }

        // to test apiV2WorkItemsCommentsPost
        should("test apiV2WorkItemsCommentsPost") {
            // uncomment below to test apiV2WorkItemsCommentsPost
            //val workItemCommentPostModel : WorkItemCommentPostModel =  // WorkItemCommentPostModel | 
            //val result : WorkItemCommentModel = apiInstance.apiV2WorkItemsCommentsPost(workItemCommentPostModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2WorkItemsCommentsPut
        should("test apiV2WorkItemsCommentsPut") {
            // uncomment below to test apiV2WorkItemsCommentsPut
            //val workItemCommentPutModel : WorkItemCommentPutModel =  // WorkItemCommentPutModel | 
            //apiInstance.apiV2WorkItemsCommentsPut(workItemCommentPutModel)
        }

        // to test apiV2WorkItemsIdCommentsGet
        should("test apiV2WorkItemsIdCommentsGet") {
            // uncomment below to test apiV2WorkItemsIdCommentsGet
            //val id : kotlin.String = id_example // kotlin.String | Unique or global ID of the work item
            //val result : kotlin.collections.List<WorkItemCommentModel> = apiInstance.apiV2WorkItemsIdCommentsGet(id)
            //result shouldBe ("TODO")
        }

    }
}