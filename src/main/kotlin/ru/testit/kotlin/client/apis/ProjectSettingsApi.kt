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

import ru.testit.kotlin.client.models.AutoTestProjectSettingsGetModel
import ru.testit.kotlin.client.models.AutoTestProjectSettingsPostModel
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

class ProjectSettingsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * POST /api/v2/projects/{projectId}/settings/autotests
     * Set autotest project settings.
     * 
     * @param projectId 
     * @param autoTestProjectSettingsPostModel  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsProjectIdSettingsAutotestsPost(projectId: kotlin.String, autoTestProjectSettingsPostModel: AutoTestProjectSettingsPostModel? = null) : Unit {
        val localVarResponse = apiV2ProjectsProjectIdSettingsAutotestsPostWithHttpInfo(projectId = projectId, autoTestProjectSettingsPostModel = autoTestProjectSettingsPostModel)

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
     * POST /api/v2/projects/{projectId}/settings/autotests
     * Set autotest project settings.
     * 
     * @param projectId 
     * @param autoTestProjectSettingsPostModel  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsProjectIdSettingsAutotestsPostWithHttpInfo(projectId: kotlin.String, autoTestProjectSettingsPostModel: AutoTestProjectSettingsPostModel?) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2ProjectsProjectIdSettingsAutotestsPostRequestConfig(projectId = projectId, autoTestProjectSettingsPostModel = autoTestProjectSettingsPostModel)

        return request<AutoTestProjectSettingsPostModel, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsProjectIdSettingsAutotestsPost
     *
     * @param projectId 
     * @param autoTestProjectSettingsPostModel  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsProjectIdSettingsAutotestsPostRequestConfig(projectId: kotlin.String, autoTestProjectSettingsPostModel: AutoTestProjectSettingsPostModel?) : RequestConfig<AutoTestProjectSettingsPostModel> {
        val localVariableBody = autoTestProjectSettingsPostModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/projects/{projectId}/settings/autotests".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /api/v2/projects/{projectId}/settings/autotests
     * Get autotest project settings.
     * 
     * @param projectId 
     * @return AutoTestProjectSettingsGetModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAutotestProjectSettings(projectId: kotlin.String) : AutoTestProjectSettingsGetModel {
        val localVarResponse = getAutotestProjectSettingsWithHttpInfo(projectId = projectId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AutoTestProjectSettingsGetModel
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
     * GET /api/v2/projects/{projectId}/settings/autotests
     * Get autotest project settings.
     * 
     * @param projectId 
     * @return ApiResponse<AutoTestProjectSettingsGetModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAutotestProjectSettingsWithHttpInfo(projectId: kotlin.String) : ApiResponse<AutoTestProjectSettingsGetModel?> {
        val localVariableConfig = getAutotestProjectSettingsRequestConfig(projectId = projectId)

        return request<Unit, AutoTestProjectSettingsGetModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAutotestProjectSettings
     *
     * @param projectId 
     * @return RequestConfig
     */
    fun getAutotestProjectSettingsRequestConfig(projectId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/projects/{projectId}/settings/autotests".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
