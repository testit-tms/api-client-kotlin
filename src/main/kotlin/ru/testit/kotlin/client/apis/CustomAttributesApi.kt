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

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

import ru.testit.kotlin.client.models.CustomAttributeModel
import ru.testit.kotlin.client.models.CustomAttributeSearchQueryModel
import ru.testit.kotlin.client.models.CustomAttributeValidationResult
import ru.testit.kotlin.client.models.GlobalCustomAttributePostModel
import ru.testit.kotlin.client.models.GlobalCustomAttributeUpdateModel
import ru.testit.kotlin.client.models.ProblemDetails
import ru.testit.kotlin.client.models.ValidationProblemDetails

import com.squareup.moshi.Json

import ru.testit.kotlin.client.infrastructure.ApiClient
import ru.testit.kotlin.client.infrastructure.ApiResponse
import ru.testit.kotlin.client.infrastructure.ClientException
import ru.testit.kotlin.client.infrastructure.ClientError
import ru.testit.kotlin.client.infrastructure.ServerException
import ru.testit.kotlin.client.infrastructure.ServerError
import ru.testit.kotlin.client.infrastructure.MultiValueMap
import ru.testit.kotlin.client.infrastructure.PartConfig
import ru.testit.kotlin.client.infrastructure.RequestConfig
import ru.testit.kotlin.client.infrastructure.RequestMethod
import ru.testit.kotlin.client.infrastructure.ResponseType
import ru.testit.kotlin.client.infrastructure.Success
import ru.testit.kotlin.client.infrastructure.toMultiValue

class CustomAttributesApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * 
     * 
     * @param name  (optional)
     * @param isGlobal  (optional)
     * @return CustomAttributeValidationResult
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesExistsGet(name: kotlin.String? = null, isGlobal: kotlin.Boolean? = null) : CustomAttributeValidationResult {
        val localVarResponse = apiV2CustomAttributesExistsGetWithHttpInfo(name = name, isGlobal = isGlobal)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CustomAttributeValidationResult
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param name  (optional)
     * @param isGlobal  (optional)
     * @return ApiResponse<CustomAttributeValidationResult?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesExistsGetWithHttpInfo(name: kotlin.String?, isGlobal: kotlin.Boolean?) : ApiResponse<CustomAttributeValidationResult?> {
        val localVariableConfig = apiV2CustomAttributesExistsGetRequestConfig(name = name, isGlobal = isGlobal)

        return request<Unit, CustomAttributeValidationResult>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesExistsGet
     *
     * @param name  (optional)
     * @param isGlobal  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesExistsGetRequestConfig(name: kotlin.String?, isGlobal: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (name != null) {
                    put("name", listOf(name.toString()))
                }
                if (isGlobal != null) {
                    put("isGlobal", listOf(isGlobal.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/customAttributes/exists",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete global attribute
     * 
     * @param id Unique ID of attribute
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesGlobalIdDelete(id: java.util.UUID) : Unit {
        val localVarResponse = apiV2CustomAttributesGlobalIdDeleteWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Delete global attribute
     * 
     * @param id Unique ID of attribute
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesGlobalIdDeleteWithHttpInfo(id: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2CustomAttributesGlobalIdDeleteRequestConfig(id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesGlobalIdDelete
     *
     * @param id Unique ID of attribute
     * @return RequestConfig
     */
    fun apiV2CustomAttributesGlobalIdDeleteRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/customAttributes/global/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit global attribute
     * 
     * @param id Unique ID of attribute
     * @param globalCustomAttributeUpdateModel  (optional)
     * @return CustomAttributeModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesGlobalIdPut(id: java.util.UUID, globalCustomAttributeUpdateModel: GlobalCustomAttributeUpdateModel? = null) : CustomAttributeModel {
        val localVarResponse = apiV2CustomAttributesGlobalIdPutWithHttpInfo(id = id, globalCustomAttributeUpdateModel = globalCustomAttributeUpdateModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CustomAttributeModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Edit global attribute
     * 
     * @param id Unique ID of attribute
     * @param globalCustomAttributeUpdateModel  (optional)
     * @return ApiResponse<CustomAttributeModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesGlobalIdPutWithHttpInfo(id: java.util.UUID, globalCustomAttributeUpdateModel: GlobalCustomAttributeUpdateModel?) : ApiResponse<CustomAttributeModel?> {
        val localVariableConfig = apiV2CustomAttributesGlobalIdPutRequestConfig(id = id, globalCustomAttributeUpdateModel = globalCustomAttributeUpdateModel)

        return request<GlobalCustomAttributeUpdateModel, CustomAttributeModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesGlobalIdPut
     *
     * @param id Unique ID of attribute
     * @param globalCustomAttributeUpdateModel  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesGlobalIdPutRequestConfig(id: java.util.UUID, globalCustomAttributeUpdateModel: GlobalCustomAttributeUpdateModel?) : RequestConfig<GlobalCustomAttributeUpdateModel> {
        val localVariableBody = globalCustomAttributeUpdateModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v2/customAttributes/global/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Create global attribute
     * 
     * @param globalCustomAttributePostModel  (optional)
     * @return CustomAttributeModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesGlobalPost(globalCustomAttributePostModel: GlobalCustomAttributePostModel? = null) : CustomAttributeModel {
        val localVarResponse = apiV2CustomAttributesGlobalPostWithHttpInfo(globalCustomAttributePostModel = globalCustomAttributePostModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CustomAttributeModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Create global attribute
     * 
     * @param globalCustomAttributePostModel  (optional)
     * @return ApiResponse<CustomAttributeModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesGlobalPostWithHttpInfo(globalCustomAttributePostModel: GlobalCustomAttributePostModel?) : ApiResponse<CustomAttributeModel?> {
        val localVariableConfig = apiV2CustomAttributesGlobalPostRequestConfig(globalCustomAttributePostModel = globalCustomAttributePostModel)

        return request<GlobalCustomAttributePostModel, CustomAttributeModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesGlobalPost
     *
     * @param globalCustomAttributePostModel  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesGlobalPostRequestConfig(globalCustomAttributePostModel: GlobalCustomAttributePostModel?) : RequestConfig<GlobalCustomAttributePostModel> {
        val localVariableBody = globalCustomAttributePostModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/customAttributes/global",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get attribute
     * 
     * @param id Unique ID of attribute
     * @return CustomAttributeModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesIdGet(id: java.util.UUID) : CustomAttributeModel {
        val localVarResponse = apiV2CustomAttributesIdGetWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CustomAttributeModel
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get attribute
     * 
     * @param id Unique ID of attribute
     * @return ApiResponse<CustomAttributeModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesIdGetWithHttpInfo(id: java.util.UUID) : ApiResponse<CustomAttributeModel?> {
        val localVariableConfig = apiV2CustomAttributesIdGetRequestConfig(id = id)

        return request<Unit, CustomAttributeModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesIdGet
     *
     * @param id Unique ID of attribute
     * @return RequestConfig
     */
    fun apiV2CustomAttributesIdGetRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/customAttributes/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search for attributes
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param customAttributeSearchQueryModel  (optional)
     * @return kotlin.collections.List<CustomAttributeModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesSearchPost(skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, customAttributeSearchQueryModel: CustomAttributeSearchQueryModel? = null) : kotlin.collections.List<CustomAttributeModel> {
        val localVarResponse = apiV2CustomAttributesSearchPostWithHttpInfo(skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, customAttributeSearchQueryModel = customAttributeSearchQueryModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<CustomAttributeModel>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Search for attributes
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param customAttributeSearchQueryModel  (optional)
     * @return ApiResponse<kotlin.collections.List<CustomAttributeModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesSearchPostWithHttpInfo(skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, customAttributeSearchQueryModel: CustomAttributeSearchQueryModel?) : ApiResponse<kotlin.collections.List<CustomAttributeModel>?> {
        val localVariableConfig = apiV2CustomAttributesSearchPostRequestConfig(skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, customAttributeSearchQueryModel = customAttributeSearchQueryModel)

        return request<CustomAttributeSearchQueryModel, kotlin.collections.List<CustomAttributeModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesSearchPost
     *
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param customAttributeSearchQueryModel  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesSearchPostRequestConfig(skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, customAttributeSearchQueryModel: CustomAttributeSearchQueryModel?) : RequestConfig<CustomAttributeSearchQueryModel> {
        val localVariableBody = customAttributeSearchQueryModel
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (skip != null) {
                    put("Skip", listOf(skip.toString()))
                }
                if (take != null) {
                    put("Take", listOf(take.toString()))
                }
                if (orderBy != null) {
                    put("OrderBy", listOf(orderBy.toString()))
                }
                if (searchField != null) {
                    put("SearchField", listOf(searchField.toString()))
                }
                if (searchValue != null) {
                    put("SearchValue", listOf(searchValue.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/customAttributes/search",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
