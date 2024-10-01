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

import ru.testit.kotlin.client.models.CustomAttributeGetModel
import ru.testit.kotlin.client.models.CustomAttributeModel
import ru.testit.kotlin.client.models.CustomAttributePostModel
import ru.testit.kotlin.client.models.CustomAttributePutModel
import ru.testit.kotlin.client.models.DeletionState
import ru.testit.kotlin.client.models.ProjectAttributesFilterModel

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

class ProjectAttributesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Create project attribute
     *  Use case   User sets attribute parameters (listed in request example) and runs method execution   System search project   System creates attribute and relates it to the project   System returns project attribute properties (example listed in response parameters)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param customAttributePostModel  (optional)
     * @return CustomAttributeModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createProjectsAttribute(projectId: kotlin.String, customAttributePostModel: CustomAttributePostModel? = null) : CustomAttributeModel {
        val localVarResponse = createProjectsAttributeWithHttpInfo(projectId = projectId, customAttributePostModel = customAttributePostModel)

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
     * Create project attribute
     *  Use case   User sets attribute parameters (listed in request example) and runs method execution   System search project   System creates attribute and relates it to the project   System returns project attribute properties (example listed in response parameters)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param customAttributePostModel  (optional)
     * @return ApiResponse<CustomAttributeModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createProjectsAttributeWithHttpInfo(projectId: kotlin.String, customAttributePostModel: CustomAttributePostModel?) : ApiResponse<CustomAttributeModel?> {
        val localVariableConfig = createProjectsAttributeRequestConfig(projectId = projectId, customAttributePostModel = customAttributePostModel)

        return request<CustomAttributePostModel, CustomAttributeModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createProjectsAttribute
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param customAttributePostModel  (optional)
     * @return RequestConfig
     */
    fun createProjectsAttributeRequestConfig(projectId: kotlin.String, customAttributePostModel: CustomAttributePostModel?) : RequestConfig<CustomAttributePostModel> {
        val localVariableBody = customAttributePostModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/projects/{projectId}/attributes".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete project attribute
     *  Use case   User sets project identifier and runs method execution   User sets attribute identifier   User runs method execution   System search project   System search and delete attribute   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId Project attribute internal (UUID)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteProjectsAttribute(projectId: kotlin.String, attributeId: java.util.UUID) : Unit {
        val localVarResponse = deleteProjectsAttributeWithHttpInfo(projectId = projectId, attributeId = attributeId)

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
     * Delete project attribute
     *  Use case   User sets project identifier and runs method execution   User sets attribute identifier   User runs method execution   System search project   System search and delete attribute   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId Project attribute internal (UUID)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteProjectsAttributeWithHttpInfo(projectId: kotlin.String, attributeId: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = deleteProjectsAttributeRequestConfig(projectId = projectId, attributeId = attributeId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteProjectsAttribute
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId Project attribute internal (UUID)
     * @return RequestConfig
     */
    fun deleteProjectsAttributeRequestConfig(projectId: kotlin.String, attributeId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/projects/{projectId}/attributes/{attributeId}".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())).replace("{"+"attributeId"+"}", encodeURIComponent(attributeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get project attribute
     *  Use case   User sets project internal or global identifier   User sets project attribute identifier   User runs method execution   System search project   System search project attribute    System returns project attribute (listed in response model)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId Project attribute internal (UUID) or global (integer) identifier
     * @return CustomAttributeModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAttributeByProjectId(projectId: kotlin.String, attributeId: java.util.UUID) : CustomAttributeModel {
        val localVarResponse = getAttributeByProjectIdWithHttpInfo(projectId = projectId, attributeId = attributeId)

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
     * Get project attribute
     *  Use case   User sets project internal or global identifier   User sets project attribute identifier   User runs method execution   System search project   System search project attribute    System returns project attribute (listed in response model)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId Project attribute internal (UUID) or global (integer) identifier
     * @return ApiResponse<CustomAttributeModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAttributeByProjectIdWithHttpInfo(projectId: kotlin.String, attributeId: java.util.UUID) : ApiResponse<CustomAttributeModel?> {
        val localVariableConfig = getAttributeByProjectIdRequestConfig(projectId = projectId, attributeId = attributeId)

        return request<Unit, CustomAttributeModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAttributeByProjectId
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId Project attribute internal (UUID) or global (integer) identifier
     * @return RequestConfig
     */
    fun getAttributeByProjectIdRequestConfig(projectId: kotlin.String, attributeId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/projects/{projectId}/attributes/{attributeId}".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())).replace("{"+"attributeId"+"}", encodeURIComponent(attributeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get project attributes
     *  Use case   User sets project internal or global identifier   [Optional] User sets isDeleted field value   User runs method execution   System search project   [Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project   [Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted   [Optional] If User did not set isDeleted field value, System search all attributes related to project   System returns array of found attributes (listed in response model)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param isDeleted  (optional)
     * @return kotlin.collections.List<CustomAttributeModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAttributesByProjectId(projectId: kotlin.String, isDeleted: DeletionState? = null) : kotlin.collections.List<CustomAttributeModel> {
        val localVarResponse = getAttributesByProjectIdWithHttpInfo(projectId = projectId, isDeleted = isDeleted)

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
     * Get project attributes
     *  Use case   User sets project internal or global identifier   [Optional] User sets isDeleted field value   User runs method execution   System search project   [Optional] If User sets isDeleted field value as true, System search all deleted attributes related to project   [Optional] If User sets isDeleted field value as false, System search all attributes related to project which are not deleted   [Optional] If User did not set isDeleted field value, System search all attributes related to project   System returns array of found attributes (listed in response model)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param isDeleted  (optional)
     * @return ApiResponse<kotlin.collections.List<CustomAttributeModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAttributesByProjectIdWithHttpInfo(projectId: kotlin.String, isDeleted: DeletionState?) : ApiResponse<kotlin.collections.List<CustomAttributeModel>?> {
        val localVariableConfig = getAttributesByProjectIdRequestConfig(projectId = projectId, isDeleted = isDeleted)

        return request<Unit, kotlin.collections.List<CustomAttributeModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAttributesByProjectId
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param isDeleted  (optional)
     * @return RequestConfig
     */
    fun getAttributesByProjectIdRequestConfig(projectId: kotlin.String, isDeleted: DeletionState?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (isDeleted != null) {
                    put("isDeleted", listOf(isDeleted.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/projects/{projectId}/attributes".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search for attributes used in the project
     * 
     * @param projectId Unique or global project ID
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param projectAttributesFilterModel  (optional)
     * @return kotlin.collections.List<CustomAttributeGetModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun searchAttributesInProject(projectId: kotlin.String, skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, projectAttributesFilterModel: ProjectAttributesFilterModel? = null) : kotlin.collections.List<CustomAttributeGetModel> {
        val localVarResponse = searchAttributesInProjectWithHttpInfo(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, projectAttributesFilterModel = projectAttributesFilterModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<CustomAttributeGetModel>
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
     * Search for attributes used in the project
     * 
     * @param projectId Unique or global project ID
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param projectAttributesFilterModel  (optional)
     * @return ApiResponse<kotlin.collections.List<CustomAttributeGetModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun searchAttributesInProjectWithHttpInfo(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, projectAttributesFilterModel: ProjectAttributesFilterModel?) : ApiResponse<kotlin.collections.List<CustomAttributeGetModel>?> {
        val localVariableConfig = searchAttributesInProjectRequestConfig(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, projectAttributesFilterModel = projectAttributesFilterModel)

        return request<ProjectAttributesFilterModel, kotlin.collections.List<CustomAttributeGetModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation searchAttributesInProject
     *
     * @param projectId Unique or global project ID
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param projectAttributesFilterModel  (optional)
     * @return RequestConfig
     */
    fun searchAttributesInProjectRequestConfig(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, projectAttributesFilterModel: ProjectAttributesFilterModel?) : RequestConfig<ProjectAttributesFilterModel> {
        val localVariableBody = projectAttributesFilterModel
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
            path = "/api/v2/projects/{projectId}/attributes/search".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit attribute of the project
     * 
     * @param projectId Unique or global project ID
     * @param customAttributePutModel  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateProjectsAttribute(projectId: kotlin.String, customAttributePutModel: CustomAttributePutModel? = null) : Unit {
        val localVarResponse = updateProjectsAttributeWithHttpInfo(projectId = projectId, customAttributePutModel = customAttributePutModel)

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
     * Edit attribute of the project
     * 
     * @param projectId Unique or global project ID
     * @param customAttributePutModel  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun updateProjectsAttributeWithHttpInfo(projectId: kotlin.String, customAttributePutModel: CustomAttributePutModel?) : ApiResponse<Unit?> {
        val localVariableConfig = updateProjectsAttributeRequestConfig(projectId = projectId, customAttributePutModel = customAttributePutModel)

        return request<CustomAttributePutModel, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateProjectsAttribute
     *
     * @param projectId Unique or global project ID
     * @param customAttributePutModel  (optional)
     * @return RequestConfig
     */
    fun updateProjectsAttributeRequestConfig(projectId: kotlin.String, customAttributePutModel: CustomAttributePutModel?) : RequestConfig<CustomAttributePutModel> {
        val localVariableBody = customAttributePutModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v2/projects/{projectId}/attributes".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}