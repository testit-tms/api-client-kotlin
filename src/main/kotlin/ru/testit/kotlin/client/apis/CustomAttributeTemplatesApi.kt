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

import ru.testit.kotlin.client.models.CustomAttributeTemplateModel
import ru.testit.kotlin.client.models.CustomAttributeTemplatePostModel
import ru.testit.kotlin.client.models.CustomAttributeTemplatePutModel
import ru.testit.kotlin.client.models.CustomAttributeTemplateSearchQueryModel
import ru.testit.kotlin.client.models.ProblemDetails
import ru.testit.kotlin.client.models.SearchCustomAttributeTemplateGetModel
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

class CustomAttributeTemplatesApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Exclude CustomAttributes from CustomAttributeTemplate
     *  Use case   User sets attribute template internal identifier   User sets attribute internal identifiers    User runs method execution   System delete attributes from attributes tempalte
     * @param id Attribute template internal (UUID) identifier
     * @param javaUtilUUID  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost(id: java.util.UUID, javaUtilUUID: kotlin.collections.Set<java.util.UUID>? = null) : Unit {
        val localVarResponse = apiV2CustomAttributesTemplatesIdCustomAttributesExcludePostWithHttpInfo(id = id, javaUtilUUID = javaUtilUUID)

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
     * Exclude CustomAttributes from CustomAttributeTemplate
     *  Use case   User sets attribute template internal identifier   User sets attribute internal identifiers    User runs method execution   System delete attributes from attributes tempalte
     * @param id Attribute template internal (UUID) identifier
     * @param javaUtilUUID  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesIdCustomAttributesExcludePostWithHttpInfo(id: java.util.UUID, javaUtilUUID: kotlin.collections.Set<java.util.UUID>?) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesIdCustomAttributesExcludePostRequestConfig(id = id, javaUtilUUID = javaUtilUUID)

        return request<kotlin.collections.Set<java.util.UUID>, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesIdCustomAttributesExcludePost
     *
     * @param id Attribute template internal (UUID) identifier
     * @param javaUtilUUID  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesIdCustomAttributesExcludePostRequestConfig(id: java.util.UUID, javaUtilUUID: kotlin.collections.Set<java.util.UUID>?) : RequestConfig<kotlin.collections.Set<java.util.UUID>> {
        val localVariableBody = javaUtilUUID
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/customAttributes/templates/{id}/customAttributes/exclude".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Include CustomAttributes to CustomAttributeTemplate
     *  Use case   User sets attribute template internal identifier   User sets attribute internal identifiers    User runs method execution   System add attributes to attributes tempalte
     * @param id Attribute template internal (UUID) identifier
     * @param javaUtilUUID  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost(id: java.util.UUID, javaUtilUUID: kotlin.collections.Set<java.util.UUID>? = null) : Unit {
        val localVarResponse = apiV2CustomAttributesTemplatesIdCustomAttributesIncludePostWithHttpInfo(id = id, javaUtilUUID = javaUtilUUID)

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
     * Include CustomAttributes to CustomAttributeTemplate
     *  Use case   User sets attribute template internal identifier   User sets attribute internal identifiers    User runs method execution   System add attributes to attributes tempalte
     * @param id Attribute template internal (UUID) identifier
     * @param javaUtilUUID  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesIdCustomAttributesIncludePostWithHttpInfo(id: java.util.UUID, javaUtilUUID: kotlin.collections.Set<java.util.UUID>?) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesIdCustomAttributesIncludePostRequestConfig(id = id, javaUtilUUID = javaUtilUUID)

        return request<kotlin.collections.Set<java.util.UUID>, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesIdCustomAttributesIncludePost
     *
     * @param id Attribute template internal (UUID) identifier
     * @param javaUtilUUID  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesIdCustomAttributesIncludePostRequestConfig(id: java.util.UUID, javaUtilUUID: kotlin.collections.Set<java.util.UUID>?) : RequestConfig<kotlin.collections.Set<java.util.UUID>> {
        val localVariableBody = javaUtilUUID
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/customAttributes/templates/{id}/customAttributes/include".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete CustomAttributeTemplate
     *  Use case   User sets attribute template internal identifier   User runs method execution   System search and delete attribute template   System returns no content response
     * @param id Attribute template internal (UUID) identifier
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesIdDelete(id: java.util.UUID) : Unit {
        val localVarResponse = apiV2CustomAttributesTemplatesIdDeleteWithHttpInfo(id = id)

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
     * Delete CustomAttributeTemplate
     *  Use case   User sets attribute template internal identifier   User runs method execution   System search and delete attribute template   System returns no content response
     * @param id Attribute template internal (UUID) identifier
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesIdDeleteWithHttpInfo(id: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesIdDeleteRequestConfig(id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesIdDelete
     *
     * @param id Attribute template internal (UUID) identifier
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesIdDeleteRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/customAttributes/templates/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get CustomAttributeTemplate by ID
     *  Use case   User sets attribute template internal identifier    User runs method execution   System return attribute template (listed in response example)
     * @param id CustomAttributeTemplate internal (UUID) identifier
     * @return CustomAttributeTemplateModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesIdGet(id: java.util.UUID) : CustomAttributeTemplateModel {
        val localVarResponse = apiV2CustomAttributesTemplatesIdGetWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CustomAttributeTemplateModel
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
     * Get CustomAttributeTemplate by ID
     *  Use case   User sets attribute template internal identifier    User runs method execution   System return attribute template (listed in response example)
     * @param id CustomAttributeTemplate internal (UUID) identifier
     * @return ApiResponse<CustomAttributeTemplateModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesIdGetWithHttpInfo(id: java.util.UUID) : ApiResponse<CustomAttributeTemplateModel?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesIdGetRequestConfig(id = id)

        return request<Unit, CustomAttributeTemplateModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesIdGet
     *
     * @param id CustomAttributeTemplate internal (UUID) identifier
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesIdGetRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/customAttributes/templates/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get CustomAttributeTemplate by name
     *  Use case   User sets attribute template name   User runs method execution   System search and return list of attribute templates (listed in response example)
     * @param name CustomAttributeTemplate name for search
     * @return CustomAttributeTemplateModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesNameGet(name: kotlin.String) : CustomAttributeTemplateModel {
        val localVarResponse = apiV2CustomAttributesTemplatesNameGetWithHttpInfo(name = name)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CustomAttributeTemplateModel
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
     * Get CustomAttributeTemplate by name
     *  Use case   User sets attribute template name   User runs method execution   System search and return list of attribute templates (listed in response example)
     * @param name CustomAttributeTemplate name for search
     * @return ApiResponse<CustomAttributeTemplateModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesNameGetWithHttpInfo(name: kotlin.String) : ApiResponse<CustomAttributeTemplateModel?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesNameGetRequestConfig(name = name)

        return request<Unit, CustomAttributeTemplateModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesNameGet
     *
     * @param name CustomAttributeTemplate name for search
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesNameGetRequestConfig(name: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/customAttributes/templates/{name}".replace("{"+"name"+"}", encodeURIComponent(name.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Create CustomAttributeTemplate
     *  Use case   User sets attribute template parameters (listed in request example)   User runs method execution   System creates attribute template   System returns attribute template model (example listed in response parameters)
     * @param customAttributeTemplatePostModel  (optional)
     * @return CustomAttributeTemplateModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesPost(customAttributeTemplatePostModel: CustomAttributeTemplatePostModel? = null) : CustomAttributeTemplateModel {
        val localVarResponse = apiV2CustomAttributesTemplatesPostWithHttpInfo(customAttributeTemplatePostModel = customAttributeTemplatePostModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CustomAttributeTemplateModel
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
     * Create CustomAttributeTemplate
     *  Use case   User sets attribute template parameters (listed in request example)   User runs method execution   System creates attribute template   System returns attribute template model (example listed in response parameters)
     * @param customAttributeTemplatePostModel  (optional)
     * @return ApiResponse<CustomAttributeTemplateModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesPostWithHttpInfo(customAttributeTemplatePostModel: CustomAttributeTemplatePostModel?) : ApiResponse<CustomAttributeTemplateModel?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesPostRequestConfig(customAttributeTemplatePostModel = customAttributeTemplatePostModel)

        return request<CustomAttributeTemplatePostModel, CustomAttributeTemplateModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesPost
     *
     * @param customAttributeTemplatePostModel  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesPostRequestConfig(customAttributeTemplatePostModel: CustomAttributeTemplatePostModel?) : RequestConfig<CustomAttributeTemplatePostModel> {
        val localVariableBody = customAttributeTemplatePostModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/customAttributes/templates",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Update custom attributes template
     * 
     * @param customAttributeTemplatePutModel  (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesPut(customAttributeTemplatePutModel: CustomAttributeTemplatePutModel? = null) : Unit {
        val localVarResponse = apiV2CustomAttributesTemplatesPutWithHttpInfo(customAttributeTemplatePutModel = customAttributeTemplatePutModel)

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
     * Update custom attributes template
     * 
     * @param customAttributeTemplatePutModel  (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesPutWithHttpInfo(customAttributeTemplatePutModel: CustomAttributeTemplatePutModel?) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesPutRequestConfig(customAttributeTemplatePutModel = customAttributeTemplatePutModel)

        return request<CustomAttributeTemplatePutModel, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesPut
     *
     * @param customAttributeTemplatePutModel  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesPutRequestConfig(customAttributeTemplatePutModel: CustomAttributeTemplatePutModel?) : RequestConfig<CustomAttributeTemplatePutModel> {
        val localVariableBody = customAttributeTemplatePutModel
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/api/v2/customAttributes/templates",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search CustomAttributeTemplates
     *  Use case   User sets search params model (listed in request example)   User runs method execution   System return attribute templates (listed in response example)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param customAttributeTemplateSearchQueryModel  (optional)
     * @return kotlin.collections.List<SearchCustomAttributeTemplateGetModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2CustomAttributesTemplatesSearchPost(skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, customAttributeTemplateSearchQueryModel: CustomAttributeTemplateSearchQueryModel? = null) : kotlin.collections.List<SearchCustomAttributeTemplateGetModel> {
        val localVarResponse = apiV2CustomAttributesTemplatesSearchPostWithHttpInfo(skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, customAttributeTemplateSearchQueryModel = customAttributeTemplateSearchQueryModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<SearchCustomAttributeTemplateGetModel>
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
     * Search CustomAttributeTemplates
     *  Use case   User sets search params model (listed in request example)   User runs method execution   System return attribute templates (listed in response example)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param customAttributeTemplateSearchQueryModel  (optional)
     * @return ApiResponse<kotlin.collections.List<SearchCustomAttributeTemplateGetModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2CustomAttributesTemplatesSearchPostWithHttpInfo(skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, customAttributeTemplateSearchQueryModel: CustomAttributeTemplateSearchQueryModel?) : ApiResponse<kotlin.collections.List<SearchCustomAttributeTemplateGetModel>?> {
        val localVariableConfig = apiV2CustomAttributesTemplatesSearchPostRequestConfig(skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, customAttributeTemplateSearchQueryModel = customAttributeTemplateSearchQueryModel)

        return request<CustomAttributeTemplateSearchQueryModel, kotlin.collections.List<SearchCustomAttributeTemplateGetModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2CustomAttributesTemplatesSearchPost
     *
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param customAttributeTemplateSearchQueryModel  (optional)
     * @return RequestConfig
     */
    fun apiV2CustomAttributesTemplatesSearchPostRequestConfig(skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, customAttributeTemplateSearchQueryModel: CustomAttributeTemplateSearchQueryModel?) : RequestConfig<CustomAttributeTemplateSearchQueryModel> {
        val localVariableBody = customAttributeTemplateSearchQueryModel
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
            path = "/api/v2/customAttributes/templates/search",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
