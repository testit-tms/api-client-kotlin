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

package ru.testit.kotlin.client.api

import io.kotlintest.specs.ShouldSpec

class CustomAttributesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomAttributesApi
        //val apiInstance = CustomAttributesApi()

        // to test apiV2CustomAttributesGlobalIdDelete
        should("test apiV2CustomAttributesGlobalIdDelete") {
            // uncomment below to test apiV2CustomAttributesGlobalIdDelete
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of attribute
            //apiInstance.apiV2CustomAttributesGlobalIdDelete(id)
        }

        // to test apiV2CustomAttributesGlobalIdPut
        should("test apiV2CustomAttributesGlobalIdPut") {
            // uncomment below to test apiV2CustomAttributesGlobalIdPut
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of attribute
            //val globalCustomAttributeUpdateModel : GlobalCustomAttributeUpdateModel =  // GlobalCustomAttributeUpdateModel | 
            //val result : CustomAttributeModel = apiInstance.apiV2CustomAttributesGlobalIdPut(id, globalCustomAttributeUpdateModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2CustomAttributesGlobalPost
        should("test apiV2CustomAttributesGlobalPost") {
            // uncomment below to test apiV2CustomAttributesGlobalPost
            //val globalCustomAttributePostModel : GlobalCustomAttributePostModel =  // GlobalCustomAttributePostModel | 
            //val result : CustomAttributeModel = apiInstance.apiV2CustomAttributesGlobalPost(globalCustomAttributePostModel)
            //result shouldBe ("TODO")
        }

        // to test apiV2CustomAttributesIdGet
        should("test apiV2CustomAttributesIdGet") {
            // uncomment below to test apiV2CustomAttributesIdGet
            //val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | Unique ID of attribute
            //val result : CustomAttributeModel = apiInstance.apiV2CustomAttributesIdGet(id)
            //result shouldBe ("TODO")
        }

        // to test apiV2CustomAttributesSearchPost
        should("test apiV2CustomAttributesSearchPost") {
            // uncomment below to test apiV2CustomAttributesSearchPost
            //val skip : kotlin.Int = 56 // kotlin.Int | Amount of items to be skipped (offset)
            //val take : kotlin.Int = 56 // kotlin.Int | Amount of items to be taken (limit)
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC)
            //val searchField : kotlin.String = searchField_example // kotlin.String | Property name for searching
            //val searchValue : kotlin.String = searchValue_example // kotlin.String | Value for searching
            //val customAttributeSearchQueryModel : CustomAttributeSearchQueryModel =  // CustomAttributeSearchQueryModel | 
            //val result : kotlin.collections.List<CustomAttributeModel> = apiInstance.apiV2CustomAttributesSearchPost(skip, take, orderBy, searchField, searchValue, customAttributeSearchQueryModel)
            //result shouldBe ("TODO")
        }

    }
}