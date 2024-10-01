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

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import ru.testit.kotlin.client.models.GlobalSearchRequest
import ru.testit.kotlin.client.models.GlobalSearchResponse

import ru.testit.kotlin.client.infrastructure.ApiClient
import ru.testit.kotlin.client.infrastructure.ApiResponse
import ru.testit.kotlin.client.infrastructure.ClientException
import ru.testit.kotlin.client.infrastructure.ClientError
import ru.testit.kotlin.client.infrastructure.ServerException
import ru.testit.kotlin.client.infrastructure.ServerError
import ru.testit.kotlin.client.infrastructure.MultiValueMap
import ru.testit.kotlin.client.infrastructure.RequestConfig
import ru.testit.kotlin.client.infrastructure.RequestMethod
import ru.testit.kotlin.client.infrastructure.ResponseType
import ru.testit.kotlin.client.infrastructure.Success

class SearchApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * 
     * 
     * @param globalSearchRequest  (optional)
     * @return GlobalSearchResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2SearchGlobalSearchPost(globalSearchRequest: GlobalSearchRequest? = null) : GlobalSearchResponse {
        val localVarResponse = apiV2SearchGlobalSearchPostWithHttpInfo(globalSearchRequest = globalSearchRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GlobalSearchResponse
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
     * @param globalSearchRequest  (optional)
     * @return ApiResponse<GlobalSearchResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2SearchGlobalSearchPostWithHttpInfo(globalSearchRequest: GlobalSearchRequest?) : ApiResponse<GlobalSearchResponse?> {
        val localVariableConfig = apiV2SearchGlobalSearchPostRequestConfig(globalSearchRequest = globalSearchRequest)

        return request<GlobalSearchRequest, GlobalSearchResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2SearchGlobalSearchPost
     *
     * @param globalSearchRequest  (optional)
     * @return RequestConfig
     */
    fun apiV2SearchGlobalSearchPostRequestConfig(globalSearchRequest: GlobalSearchRequest?) : RequestConfig<GlobalSearchRequest> {
        val localVariableBody = globalSearchRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/search/globalSearch",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}