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

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.openapitools.client.models.CustomAttributeGetModel
import org.openapitools.client.models.CustomAttributeModel
import org.openapitools.client.models.CustomAttributeTestPlanProjectRelationPutModel
import org.openapitools.client.models.ProblemDetails
import org.openapitools.client.models.ProjectAttributesFilterModel
import org.openapitools.client.models.ValidationProblemDetails

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class ProjectTestPlanAttributesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Add attributes to project&#39;s test plans
     *  Use case   User sets project internal or global identifier and attributes identifiers   User runs method execution   System updates project and add attributes to project for test plans   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param javaUtilUUID  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createCustomAttributeTestPlanProjectRelations(projectId: kotlin.String, javaUtilUUID: kotlin.collections.Set<java.util.UUID>? = null) : Unit {
        val localVarResponse = createCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId = projectId, javaUtilUUID = javaUtilUUID)

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
     * Add attributes to project&#39;s test plans
     *  Use case   User sets project internal or global identifier and attributes identifiers   User runs method execution   System updates project and add attributes to project for test plans   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param javaUtilUUID  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun createCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId: kotlin.String, javaUtilUUID: kotlin.collections.Set<java.util.UUID>?) : ApiResponse<Unit?> {
        val localVariableConfig = createCustomAttributeTestPlanProjectRelationsRequestConfig(projectId = projectId, javaUtilUUID = javaUtilUUID)

        return request<kotlin.collections.Set<java.util.UUID>, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createCustomAttributeTestPlanProjectRelations
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param javaUtilUUID  (optional)
     * @return RequestConfig
     */
    fun createCustomAttributeTestPlanProjectRelationsRequestConfig(projectId: kotlin.String, javaUtilUUID: kotlin.collections.Set<java.util.UUID>?) : RequestConfig<kotlin.collections.Set<java.util.UUID>> {
        val localVariableBody = javaUtilUUID
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/projects/{projectId}/testPlans/attributes".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete attribute from project&#39;s test plans
     *  Use case   User sets project internal or global identifier and attribute identifier   User runs method execution   System updates project and delete attribute from project for test plans   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteCustomAttributeTestPlanProjectRelations(projectId: kotlin.String, attributeId: java.util.UUID) : Unit {
        val localVarResponse = deleteCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId = projectId, attributeId = attributeId)

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
     * Delete attribute from project&#39;s test plans
     *  Use case   User sets project internal or global identifier and attribute identifier   User runs method execution   System updates project and delete attribute from project for test plans   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun deleteCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId: kotlin.String, attributeId: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = deleteCustomAttributeTestPlanProjectRelationsRequestConfig(projectId = projectId, attributeId = attributeId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation deleteCustomAttributeTestPlanProjectRelations
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param attributeId 
     * @return RequestConfig
     */
    fun deleteCustomAttributeTestPlanProjectRelationsRequestConfig(projectId: kotlin.String, attributeId: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/projects/{projectId}/testPlans/attributes/{attributeId}".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())).replace("{"+"attributeId"+"}", encodeURIComponent(attributeId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get project&#39;s test plan attributes
     *  Use case   User runs method execution   System returns project for test plans attributes by project identifier
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @return kotlin.collections.List<CustomAttributeModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCustomAttributeTestPlanProjectRelations(projectId: kotlin.String) : kotlin.collections.List<CustomAttributeModel> {
        val localVarResponse = getCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId = projectId)

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
     * Get project&#39;s test plan attributes
     *  Use case   User runs method execution   System returns project for test plans attributes by project identifier
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @return ApiResponse<kotlin.collections.List<CustomAttributeModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId: kotlin.String) : ApiResponse<kotlin.collections.List<CustomAttributeModel>?> {
        val localVariableConfig = getCustomAttributeTestPlanProjectRelationsRequestConfig(projectId = projectId)

        return request<Unit, kotlin.collections.List<CustomAttributeModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getCustomAttributeTestPlanProjectRelations
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @return RequestConfig
     */
    fun getCustomAttributeTestPlanProjectRelationsRequestConfig(projectId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/projects/{projectId}/testPlans/attributes".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search for attributes used in the project test plans
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
    fun searchTestPlanAttributesInProject(projectId: kotlin.String, skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, projectAttributesFilterModel: ProjectAttributesFilterModel? = null) : kotlin.collections.List<CustomAttributeGetModel> {
        val localVarResponse = searchTestPlanAttributesInProjectWithHttpInfo(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, projectAttributesFilterModel = projectAttributesFilterModel)

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
     * Search for attributes used in the project test plans
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
    fun searchTestPlanAttributesInProjectWithHttpInfo(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, projectAttributesFilterModel: ProjectAttributesFilterModel?) : ApiResponse<kotlin.collections.List<CustomAttributeGetModel>?> {
        val localVariableConfig = searchTestPlanAttributesInProjectRequestConfig(projectId = projectId, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, projectAttributesFilterModel = projectAttributesFilterModel)

        return request<ProjectAttributesFilterModel, kotlin.collections.List<CustomAttributeGetModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation searchTestPlanAttributesInProject
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
    fun searchTestPlanAttributesInProjectRequestConfig(projectId: kotlin.String, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, projectAttributesFilterModel: ProjectAttributesFilterModel?) : RequestConfig<ProjectAttributesFilterModel> {
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
            path = "/api/v2/projects/{projectId}/testPlans/attributes/search".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update attribute of project&#39;s test plans
     *  Use case   User sets project internal or global identifier and attribute model   User runs method execution   System updates project and project attribute for test plan   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param customAttributeTestPlanProjectRelationPutModel  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateCustomAttributeTestPlanProjectRelations(projectId: kotlin.String, customAttributeTestPlanProjectRelationPutModel: CustomAttributeTestPlanProjectRelationPutModel? = null) : Unit {
        val localVarResponse = updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId = projectId, customAttributeTestPlanProjectRelationPutModel = customAttributeTestPlanProjectRelationPutModel)

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
     * Update attribute of project&#39;s test plans
     *  Use case   User sets project internal or global identifier and attribute model   User runs method execution   System updates project and project attribute for test plan   System returns no content response
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param customAttributeTestPlanProjectRelationPutModel  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun updateCustomAttributeTestPlanProjectRelationsWithHttpInfo(projectId: kotlin.String, customAttributeTestPlanProjectRelationPutModel: CustomAttributeTestPlanProjectRelationPutModel?) : ApiResponse<Unit?> {
        val localVariableConfig = updateCustomAttributeTestPlanProjectRelationsRequestConfig(projectId = projectId, customAttributeTestPlanProjectRelationPutModel = customAttributeTestPlanProjectRelationPutModel)

        return request<CustomAttributeTestPlanProjectRelationPutModel, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation updateCustomAttributeTestPlanProjectRelations
     *
     * @param projectId Project internal (UUID) or global (integer) identifier
     * @param customAttributeTestPlanProjectRelationPutModel  (optional)
     * @return RequestConfig
     */
    fun updateCustomAttributeTestPlanProjectRelationsRequestConfig(projectId: kotlin.String, customAttributeTestPlanProjectRelationPutModel: CustomAttributeTestPlanProjectRelationPutModel?) : RequestConfig<CustomAttributeTestPlanProjectRelationPutModel> {
        val localVariableBody = customAttributeTestPlanProjectRelationPutModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v2/projects/{projectId}/testPlans/attributes".replace("{"+"projectId"+"}", encodeURIComponent(projectId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
