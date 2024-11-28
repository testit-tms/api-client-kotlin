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

import ru.testit.kotlin.client.models.NotificationModel
import ru.testit.kotlin.client.models.NotificationQueryFilterModel
import ru.testit.kotlin.client.models.NotificationTypeModel
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

class NotificationsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * Get unread Notifications total in last 7 days
     *  Use case   User runs method execution   System returns unread notifications total (listed in the response example)
     * @param isRead  (optional)
     * @return kotlin.Int
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2NotificationsCountGet(isRead: kotlin.Boolean? = null) : kotlin.Int {
        val localVarResponse = apiV2NotificationsCountGetWithHttpInfo(isRead = isRead)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Int
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
     * Get unread Notifications total in last 7 days
     *  Use case   User runs method execution   System returns unread notifications total (listed in the response example)
     * @param isRead  (optional)
     * @return ApiResponse<kotlin.Int?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2NotificationsCountGetWithHttpInfo(isRead: kotlin.Boolean?) : ApiResponse<kotlin.Int?> {
        val localVariableConfig = apiV2NotificationsCountGetRequestConfig(isRead = isRead)

        return request<Unit, kotlin.Int>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2NotificationsCountGet
     *
     * @param isRead  (optional)
     * @return RequestConfig
     */
    fun apiV2NotificationsCountGetRequestConfig(isRead: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (isRead != null) {
                    put("isRead", listOf(isRead.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/notifications/count",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get all Notifications for current User
     *  Use case   User runs method execution   System returns notifications (listed in the response example)
     * @param notificationType  (optional)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return kotlin.collections.List<NotificationModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2NotificationsGet(notificationType: NotificationTypeModel? = null, skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null) : kotlin.collections.List<NotificationModel> {
        val localVarResponse = apiV2NotificationsGetWithHttpInfo(notificationType = notificationType, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<NotificationModel>
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
     * Get all Notifications for current User
     *  Use case   User runs method execution   System returns notifications (listed in the response example)
     * @param notificationType  (optional)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return ApiResponse<kotlin.collections.List<NotificationModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2NotificationsGetWithHttpInfo(notificationType: NotificationTypeModel?, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?) : ApiResponse<kotlin.collections.List<NotificationModel>?> {
        val localVariableConfig = apiV2NotificationsGetRequestConfig(notificationType = notificationType, skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue)

        return request<Unit, kotlin.collections.List<NotificationModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2NotificationsGet
     *
     * @param notificationType  (optional)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @return RequestConfig
     */
    fun apiV2NotificationsGetRequestConfig(notificationType: NotificationTypeModel?, skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (notificationType != null) {
                    put("notificationType", listOf(notificationType.toString()))
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
            path = "/api/v2/notifications",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Set Notification as read
     *  Use case   User sets notification internal (guid format) identifier   User runs method execution   System set notification as read
     * @param id 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2NotificationsIdReadPost(id: java.util.UUID) : Unit {
        val localVarResponse = apiV2NotificationsIdReadPostWithHttpInfo(id = id)

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
     * Set Notification as read
     *  Use case   User sets notification internal (guid format) identifier   User runs method execution   System set notification as read
     * @param id 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2NotificationsIdReadPostWithHttpInfo(id: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2NotificationsIdReadPostRequestConfig(id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2NotificationsIdReadPost
     *
     * @param id 
     * @return RequestConfig
     */
    fun apiV2NotificationsIdReadPostRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/notifications/{id}/read".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Set all Notifications as read
     *  Use case   User runs method execution   System set all notifications as read
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2NotificationsReadPost() : Unit {
        val localVarResponse = apiV2NotificationsReadPostWithHttpInfo()

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
     * Set all Notifications as read
     *  Use case   User runs method execution   System set all notifications as read
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2NotificationsReadPostWithHttpInfo() : ApiResponse<Unit?> {
        val localVariableConfig = apiV2NotificationsReadPostRequestConfig()

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2NotificationsReadPost
     *
     * @return RequestConfig
     */
    fun apiV2NotificationsReadPostRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/notifications/read",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search Notifications for current User
     *  Use case   User set filter and runs method execution   System returns notifications (listed in the response example)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param notificationQueryFilterModel  (optional)
     * @return kotlin.collections.List<NotificationModel>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2NotificationsSearchPost(skip: kotlin.Int? = null, take: kotlin.Int? = null, orderBy: kotlin.String? = null, searchField: kotlin.String? = null, searchValue: kotlin.String? = null, notificationQueryFilterModel: NotificationQueryFilterModel? = null) : kotlin.collections.List<NotificationModel> {
        val localVarResponse = apiV2NotificationsSearchPostWithHttpInfo(skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, notificationQueryFilterModel = notificationQueryFilterModel)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<NotificationModel>
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
     * Search Notifications for current User
     *  Use case   User set filter and runs method execution   System returns notifications (listed in the response example)
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param notificationQueryFilterModel  (optional)
     * @return ApiResponse<kotlin.collections.List<NotificationModel>?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2NotificationsSearchPostWithHttpInfo(skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, notificationQueryFilterModel: NotificationQueryFilterModel?) : ApiResponse<kotlin.collections.List<NotificationModel>?> {
        val localVariableConfig = apiV2NotificationsSearchPostRequestConfig(skip = skip, take = take, orderBy = orderBy, searchField = searchField, searchValue = searchValue, notificationQueryFilterModel = notificationQueryFilterModel)

        return request<NotificationQueryFilterModel, kotlin.collections.List<NotificationModel>>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2NotificationsSearchPost
     *
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param notificationQueryFilterModel  (optional)
     * @return RequestConfig
     */
    fun apiV2NotificationsSearchPostRequestConfig(skip: kotlin.Int?, take: kotlin.Int?, orderBy: kotlin.String?, searchField: kotlin.String?, searchValue: kotlin.String?, notificationQueryFilterModel: NotificationQueryFilterModel?) : RequestConfig<NotificationQueryFilterModel> {
        val localVariableBody = notificationQueryFilterModel
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
            path = "/api/v2/notifications/search",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
