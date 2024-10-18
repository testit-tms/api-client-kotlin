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
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import ru.testit.kotlin.client.models.ProblemDetails
import ru.testit.kotlin.client.models.TagShortModel
import ru.testit.kotlin.client.models.ValidationProblemDetails
import ru.testit.kotlin.client.models.WorkItemGroupGetModel
import ru.testit.kotlin.client.models.WorkItemGroupModel
import ru.testit.kotlin.client.models.WorkItemSelectModel
import ru.testit.kotlin.client.models.WorkItemShortModel

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

class ProjectWorkItemsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Search for work items and group results by attribute
     * 
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemGroupGetModel  (optional)
     * @return kotlin.collections.List<WorkItemGroupModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsProjectIdWorkItemsSearchGroupedPost(projectId: kotlin.String, skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, workItemGroupGetModel: WorkItemGroupGetModel? = null) : kotlin.collections.List<WorkItemGroupModel> {
        val localVarResponse = apiV2ProjectsProjectIdWorkItemsSearchGroupedPostWithHttpInfo(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, workItemGroupGetModel = workItemGroupGetModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<WorkItemGroupModel>
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
     * Search for work items and group results by attribute
     * 
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemGroupGetModel  (optional)
     * @return ApiResponse<kotlin.collections.List<WorkItemGroupModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsProjectIdWorkItemsSearchGroupedPostWithHttpInfo(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, workItemGroupGetModel: WorkItemGroupGetModel?) : ApiResponse<kotlin.collections.List<WorkItemGroupModel>?> {
        val localVariableConfig = apiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequestConfig(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, workItemGroupGetModel = workItemGroupGetModel)

        return request<WorkItemGroupGetModel, kotlin.collections.List<WorkItemGroupModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsProjectIdWorkItemsSearchGroupedPost
     *
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemGroupGetModel  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsProjectIdWorkItemsSearchGroupedPostRequestConfig(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, workItemGroupGetModel: WorkItemGroupGetModel?) : RequestConfig<WorkItemGroupGetModel> {
        val localVariableBody = workItemGroupGetModel
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
            path = "/api/v2/projects/{projectId}/workItems/search/grouped".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search for work items and extract IDs only
     * 
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemSelectModel  (optional)
     * @return kotlin.collections.List<java.util.UUID>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsProjectIdWorkItemsSearchIdPost(projectId: kotlin.String, skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, workItemSelectModel: WorkItemSelectModel? = null) : kotlin.collections.List<java.util.UUID> {
        val localVarResponse = apiV2ProjectsProjectIdWorkItemsSearchIdPostWithHttpInfo(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, workItemSelectModel = workItemSelectModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<java.util.UUID>
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
     * Search for work items and extract IDs only
     * 
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemSelectModel  (optional)
     * @return ApiResponse<kotlin.collections.List<java.util.UUID>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsProjectIdWorkItemsSearchIdPostWithHttpInfo(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, workItemSelectModel: WorkItemSelectModel?) : ApiResponse<kotlin.collections.List<java.util.UUID>?> {
        val localVariableConfig = apiV2ProjectsProjectIdWorkItemsSearchIdPostRequestConfig(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, workItemSelectModel = workItemSelectModel)

        return request<WorkItemSelectModel, kotlin.collections.List<java.util.UUID>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsProjectIdWorkItemsSearchIdPost
     *
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemSelectModel  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsProjectIdWorkItemsSearchIdPostRequestConfig(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, workItemSelectModel: WorkItemSelectModel?) : RequestConfig<WorkItemSelectModel> {
        val localVariableBody = workItemSelectModel
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
            path = "/api/v2/projects/{projectId}/workItems/search/id".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search for work items
     * 
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemSelectModel  (optional)
     * @return kotlin.collections.List<WorkItemShortModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsProjectIdWorkItemsSearchPost(projectId: kotlin.String, skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, workItemSelectModel: WorkItemSelectModel? = null) : kotlin.collections.List<WorkItemShortModel> {
        val localVarResponse = apiV2ProjectsProjectIdWorkItemsSearchPostWithHttpInfo(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, workItemSelectModel = workItemSelectModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<WorkItemShortModel>
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
     * Search for work items
     * 
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemSelectModel  (optional)
     * @return ApiResponse<kotlin.collections.List<WorkItemShortModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsProjectIdWorkItemsSearchPostWithHttpInfo(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, workItemSelectModel: WorkItemSelectModel?) : ApiResponse<kotlin.collections.List<WorkItemShortModel>?> {
        val localVariableConfig = apiV2ProjectsProjectIdWorkItemsSearchPostRequestConfig(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, workItemSelectModel = workItemSelectModel)

        return request<WorkItemSelectModel, kotlin.collections.List<WorkItemShortModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsProjectIdWorkItemsSearchPost
     *
     * @param projectId Unique or global ID of the project
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param workItemSelectModel  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsProjectIdWorkItemsSearchPostRequestConfig(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, workItemSelectModel: WorkItemSelectModel?) : RequestConfig<WorkItemSelectModel> {
        val localVariableBody = workItemSelectModel
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
            path = "/api/v2/projects/{projectId}/workItems/search".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get WorkItems Tags
     *  Use case   User sets project internal identifier    User runs method execution   System returns work items tags
     * @param projectId Project internal (UUID) identifier
     * @param isDeleted  (optional)
     * @return kotlin.collections.List<TagShortModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2ProjectsProjectIdWorkItemsTagsGet(projectId: java.util.UUID, isDeleted: kotlin.Boolean? = null) : kotlin.collections.List<TagShortModel> {
        val localVarResponse = apiV2ProjectsProjectIdWorkItemsTagsGetWithHttpInfo(projectId = projectId, isDeleted = isDeleted)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<TagShortModel>
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
     * Get WorkItems Tags
     *  Use case   User sets project internal identifier    User runs method execution   System returns work items tags
     * @param projectId Project internal (UUID) identifier
     * @param isDeleted  (optional)
     * @return ApiResponse<kotlin.collections.List<TagShortModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2ProjectsProjectIdWorkItemsTagsGetWithHttpInfo(projectId: java.util.UUID, isDeleted: kotlin.Boolean?) : ApiResponse<kotlin.collections.List<TagShortModel>?> {
        val localVariableConfig = apiV2ProjectsProjectIdWorkItemsTagsGetRequestConfig(projectId = projectId, isDeleted = isDeleted)

        return request<Unit, kotlin.collections.List<TagShortModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2ProjectsProjectIdWorkItemsTagsGet
     *
     * @param projectId Project internal (UUID) identifier
     * @param isDeleted  (optional)
     * @return RequestConfig
     */
    fun apiV2ProjectsProjectIdWorkItemsTagsGetRequestConfig(projectId: java.util.UUID, isDeleted: kotlin.Boolean?) : RequestConfig<Unit> {
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
            path = "/api/v2/projects/{projectId}/workItems/tags".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get project work items
     *  Use case   User sets project internal or global identifier   [Optional] User sets isDeleted field value   User runs method execution   System search project   [Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project   [Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted   If User did not set isDeleted field value, System search all  workitems related to project   System returns array of found workitems (listed in response model)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
     * @param tagNames List of tags to filter by (optional)
     * @param includeIterations  (optional, default to true)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return kotlin.collections.List<WorkItemShortModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun getWorkItemsByProjectId(projectId: kotlin.String, isDeleted: kotlin.Boolean? = false, tagNames: kotlin.collections.List<kotlin.String>? = null, includeIterations: kotlin.Boolean? = true, skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null) : kotlin.collections.List<WorkItemShortModel> {
        @Suppress("DEPRECATION")
        val localVarResponse = getWorkItemsByProjectIdWithHttpInfo(projectId = projectId, isDeleted = isDeleted, tagNames = tagNames, includeIterations = includeIterations, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<WorkItemShortModel>
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
     * Get project work items
     *  Use case   User sets project internal or global identifier   [Optional] User sets isDeleted field value   User runs method execution   System search project   [Optional] If User sets isDeleted field value as true, System search all deleted workitems related to project   [Optional] If User sets isDeleted field value as false, System search all workitems related to project which are not deleted   If User did not set isDeleted field value, System search all  workitems related to project   System returns array of found workitems (listed in response model)
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
     * @param tagNames List of tags to filter by (optional)
     * @param includeIterations  (optional, default to true)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return ApiResponse<kotlin.collections.List<WorkItemShortModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun getWorkItemsByProjectIdWithHttpInfo(projectId: kotlin.String, isDeleted: kotlin.Boolean?, tagNames: kotlin.collections.List<kotlin.String>?, includeIterations: kotlin.Boolean?, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?) : ApiResponse<kotlin.collections.List<WorkItemShortModel>?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = getWorkItemsByProjectIdRequestConfig(projectId = projectId, isDeleted = isDeleted, tagNames = tagNames, includeIterations = includeIterations, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue)

        return request<Unit, kotlin.collections.List<WorkItemShortModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getWorkItemsByProjectId
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param isDeleted If result must consist of only actual/deleted work items (optional, default to false)
     * @param tagNames List of tags to filter by (optional)
     * @param includeIterations  (optional, default to true)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun getWorkItemsByProjectIdRequestConfig(projectId: kotlin.String, isDeleted: kotlin.Boolean?, tagNames: kotlin.collections.List<kotlin.String>?, includeIterations: kotlin.Boolean?, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (isDeleted != null) {
                    put("isDeleted", listOf(isDeleted.toString()))
                }
                if (tagNames != null) {
                    put("tagNames", toMultiValue(tagNames.toList(), "multi"))
                }
                if (includeIterations != null) {
                    put("includeIterations", listOf(includeIterations.toString()))
                }
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
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/projects/{projectId}/workItems".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
