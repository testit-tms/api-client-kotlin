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

package ru.testit.kotlin.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ru.testit.kotlin.client.apis.ProjectAttributeTemplatesApi
import ru.testit.kotlin.client.models.ProblemDetails
import ru.testit.kotlin.client.models.ProjectCustomAttributeTemplateGetModel
import ru.testit.kotlin.client.models.ProjectCustomAttributesTemplatesFilterModel
import ru.testit.kotlin.client.models.ValidationProblemDetails

class ProjectAttributeTemplatesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProjectAttributeTemplatesApi
        //val apiInstance = ProjectAttributeTemplatesApi()

        // to test apiV2ProjectsProjectIdAttributesTemplatesSearchPost
        should("test apiV2ProjectsProjectIdAttributesTemplatesSearchPost") {
            // uncomment below to test apiV2ProjectsProjectIdAttributesTemplatesSearchPost
            //val projectId : kotlin.String = projectId_example // kotlin.String | 
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val projectCustomAttributesTemplatesFilterModel : ProjectCustomAttributesTemplatesFilterModel =  // ProjectCustomAttributesTemplatesFilterModel | 
            //val result : kotlin.collections.List<ProjectCustomAttributeTemplateGetModel> = apiInstance.apiV2ProjectsProjectIdAttributesTemplatesSearchPost(projectId, skip, take, orderBy, searchField, searchValue, projectCustomAttributesTemplatesFilterModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete
        should("test apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete") {
            // uncomment below to test apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete
            //val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
            //val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | CustomAttributeTemplate internal (UUID) identifier
            //apiInstance.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdDelete(projectId, templateId)
        }

        // to test apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost
        should("test apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost") {
            // uncomment below to test apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost
            //val projectId : kotlin.String = projectId_example // kotlin.String | Project internal (UUID) or global (integer) identifier
            //val templateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | CustomAttributeTemplate internal (UUID) identifier
            //apiInstance.apiV2ProjectsProjectIdAttributesTemplatesTemplateIdPost(projectId, templateId)
        }

    }
}
