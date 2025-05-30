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

import ru.testit.kotlin.client.models.AttachmentModel
import ru.testit.kotlin.client.models.ImageResizeType
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

class AttachmentsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * DELETE /api/v2/attachments/{id}
     * Delete attachment file
     * 
     * @param id 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2AttachmentsIdDelete(id: java.util.UUID) : Unit {
        val localVarResponse = apiV2AttachmentsIdDeleteWithHttpInfo(id = id)

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
     * DELETE /api/v2/attachments/{id}
     * Delete attachment file
     * 
     * @param id 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2AttachmentsIdDeleteWithHttpInfo(id: java.util.UUID) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2AttachmentsIdDeleteRequestConfig(id = id)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2AttachmentsIdDelete
     *
     * @param id 
     * @return RequestConfig
     */
    fun apiV2AttachmentsIdDeleteRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/v2/attachments/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /api/v2/attachments/{id}
     * Download attachment file
     * 
     * @param id 
     * @param width Width of the result image (optional)
     * @param height Height of the result image (optional)
     * @param resizeType Type of resizing to apply to the result image (optional)
     * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
     * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2AttachmentsIdGet(id: java.util.UUID, width: kotlin.Int? = null, height: kotlin.Int? = null, resizeType: ImageResizeType? = null, backgroundColor: kotlin.String? = null, preview: kotlin.Boolean? = null) : Unit {
        val localVarResponse = apiV2AttachmentsIdGetWithHttpInfo(id = id, width = width, height = height, resizeType = resizeType, backgroundColor = backgroundColor, preview = preview)

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
     * GET /api/v2/attachments/{id}
     * Download attachment file
     * 
     * @param id 
     * @param width Width of the result image (optional)
     * @param height Height of the result image (optional)
     * @param resizeType Type of resizing to apply to the result image (optional)
     * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
     * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2AttachmentsIdGetWithHttpInfo(id: java.util.UUID, width: kotlin.Int?, height: kotlin.Int?, resizeType: ImageResizeType?, backgroundColor: kotlin.String?, preview: kotlin.Boolean?) : ApiResponse<Unit?> {
        val localVariableConfig = apiV2AttachmentsIdGetRequestConfig(id = id, width = width, height = height, resizeType = resizeType, backgroundColor = backgroundColor, preview = preview)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2AttachmentsIdGet
     *
     * @param id 
     * @param width Width of the result image (optional)
     * @param height Height of the result image (optional)
     * @param resizeType Type of resizing to apply to the result image (optional)
     * @param backgroundColor Color of the background if the &#x60;resizeType&#x60; is &#x60;AddBackgroundStripes&#x60; (optional)
     * @param preview If image must be converted to a preview (lower quality, no animation) (optional)
     * @return RequestConfig
     */
    fun apiV2AttachmentsIdGetRequestConfig(id: java.util.UUID, width: kotlin.Int?, height: kotlin.Int?, resizeType: ImageResizeType?, backgroundColor: kotlin.String?, preview: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (width != null) {
                    put("width", listOf(width.toString()))
                }
                if (height != null) {
                    put("height", listOf(height.toString()))
                }
                if (resizeType != null) {
                    put("resizeType", listOf(resizeType.toString()))
                }
                if (backgroundColor != null) {
                    put("backgroundColor", listOf(backgroundColor.toString()))
                }
                if (preview != null) {
                    put("preview", listOf(preview.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/attachments/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /api/v2/attachments/{id}/metadata
     * Get attachment metadata
     * 
     * @param id 
     * @return AttachmentModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2AttachmentsIdMetadataGet(id: java.util.UUID) : AttachmentModel {
        val localVarResponse = apiV2AttachmentsIdMetadataGetWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AttachmentModel
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
     * GET /api/v2/attachments/{id}/metadata
     * Get attachment metadata
     * 
     * @param id 
     * @return ApiResponse<AttachmentModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2AttachmentsIdMetadataGetWithHttpInfo(id: java.util.UUID) : ApiResponse<AttachmentModel?> {
        val localVariableConfig = apiV2AttachmentsIdMetadataGetRequestConfig(id = id)

        return request<Unit, AttachmentModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2AttachmentsIdMetadataGet
     *
     * @param id 
     * @return RequestConfig
     */
    fun apiV2AttachmentsIdMetadataGetRequestConfig(id: java.util.UUID) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/attachments/{id}/metadata".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /api/v2/attachments/occupiedFileStorageSize
     * Get size of attachments storage in bytes
     * 
     * @return kotlin.Long
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2AttachmentsOccupiedFileStorageSizeGet() : kotlin.Long {
        val localVarResponse = apiV2AttachmentsOccupiedFileStorageSizeGetWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Long
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
     * GET /api/v2/attachments/occupiedFileStorageSize
     * Get size of attachments storage in bytes
     * 
     * @return ApiResponse<kotlin.Long?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2AttachmentsOccupiedFileStorageSizeGetWithHttpInfo() : ApiResponse<kotlin.Long?> {
        val localVariableConfig = apiV2AttachmentsOccupiedFileStorageSizeGetRequestConfig()

        return request<Unit, kotlin.Long>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2AttachmentsOccupiedFileStorageSizeGet
     *
     * @return RequestConfig
     */
    fun apiV2AttachmentsOccupiedFileStorageSizeGetRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v2/attachments/occupiedFileStorageSize",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * POST /api/v2/attachments
     * Upload new attachment file
     * File size is restricted to 50 MB (52 428 800 bytes)
     * @param file  (optional)
     * @return AttachmentModel
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiV2AttachmentsPost(file: java.io.File? = null) : AttachmentModel {
        val localVarResponse = apiV2AttachmentsPostWithHttpInfo(file = file)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AttachmentModel
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
     * POST /api/v2/attachments
     * Upload new attachment file
     * File size is restricted to 50 MB (52 428 800 bytes)
     * @param file  (optional)
     * @return ApiResponse<AttachmentModel?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apiV2AttachmentsPostWithHttpInfo(file: java.io.File?) : ApiResponse<AttachmentModel?> {
        val localVariableConfig = apiV2AttachmentsPostRequestConfig(file = file)

        return request<Map<String, PartConfig<*>>, AttachmentModel>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apiV2AttachmentsPost
     *
     * @param file  (optional)
     * @return RequestConfig
     */
    fun apiV2AttachmentsPostRequestConfig(file: java.io.File?) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "file" to PartConfig(body = file, headers = mutableMapOf()),)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/v2/attachments",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
