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

import ru.testit.kotlin.client.apis.CustomAttributeTemplatesApi
import ru.testit.kotlin.client.models.CustomAttributeTemplateModel
import ru.testit.kotlin.client.models.CustomAttributeTemplatePostModel
import ru.testit.kotlin.client.models.CustomAttributeTemplatePutModel
import ru.testit.kotlin.client.models.CustomAttributeTemplateSearchQueryModel
import ru.testit.kotlin.client.models.ProblemDetails
import ru.testit.kotlin.client.models.SearchCustomAttributeTemplateGetModel
import ru.testit.kotlin.client.models.ValidationProblemDetails

class CustomAttributeTemplatesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomAttributeTemplatesApi
        //val apiInstance = CustomAttributeTemplatesApi()

        // to test apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost
        should("test apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost") {
            // uncomment below to test apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Attribute template internal (UUID) identifier
            //val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
            //apiInstance.apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost(id, javaUtilUUID)
        }

        // to test apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost
        should("test apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost") {
            // uncomment below to test apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Attribute template internal (UUID) identifier
            //val javaUtilUUID : kotlin.collections.Set<java.util.UUID> =  // kotlin.collections.Set<java.util.UUID> | 
            //apiInstance.apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost(id, javaUtilUUID)
        }

        // to test apiV2CustomAttributesTemplatesIdDelete
        should("test apiV2CustomAttributesTemplatesIdDelete") {
            // uncomment below to test apiV2CustomAttributesTemplatesIdDelete
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Attribute template internal (UUID) identifier
            //apiInstance.apiV2CustomAttributesTemplatesIdDelete(id)
        }

        // to test apiV2CustomAttributesTemplatesIdGet
        should("test apiV2CustomAttributesTemplatesIdGet") {
            // uncomment below to test apiV2CustomAttributesTemplatesIdGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | CustomAttributeTemplate internal (UUID) identifier
            //val result : CustomAttributeTemplateModel = apiInstance.apiV2CustomAttributesTemplatesIdGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiV2CustomAttributesTemplatesNameGet
        should("test apiV2CustomAttributesTemplatesNameGet") {
            // uncomment below to test apiV2CustomAttributesTemplatesNameGet
            //val name : kotlin.String = name_example // kotlin.String | CustomAttributeTemplate name for search
            //val result : CustomAttributeTemplateModel = apiInstance.apiV2CustomAttributesTemplatesNameGet(name)
            //result shouldBe ("TODO")
        }

        // to test apiV2CustomAttributesTemplatesPost
        should("test apiV2CustomAttributesTemplatesPost") {
            // uncomment below to test apiV2CustomAttributesTemplatesPost
            //val customAttributeTemplatePostModel : CustomAttributeTemplatePostModel =  // CustomAttributeTemplatePostModel | 
            //val result : CustomAttributeTemplateModel = apiInstance.apiV2CustomAttributesTemplatesPost(customAttributeTemplatePostModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2CustomAttributesTemplatesPut
        should("test apiV2CustomAttributesTemplatesPut") {
            // uncomment below to test apiV2CustomAttributesTemplatesPut
            //val customAttributeTemplatePutModel : CustomAttributeTemplatePutModel =  // CustomAttributeTemplatePutModel | 
            //apiInstance.apiV2CustomAttributesTemplatesPut(customAttributeTemplatePutModel)
        }

        // to test apiV2CustomAttributesTemplatesSearchPost
        should("test apiV2CustomAttributesTemplatesSearchPost") {
            // uncomment below to test apiV2CustomAttributesTemplatesSearchPost
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val customAttributeTemplateSearchQueryModel : CustomAttributeTemplateSearchQueryModel =  // CustomAttributeTemplateSearchQueryModel | 
            //val result : kotlin.collections.List<SearchCustomAttributeTemplateGetModel> = apiInstance.apiV2CustomAttributesTemplatesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeTemplateSearchQueryModel)
            //result shouldBe ("TODO")
        }

    }
}
