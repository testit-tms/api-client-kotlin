package ru.testit.kotlin.client.infrastructure


/**
 * ApiException class.
 */
@SuppressWarnings("serial")
class ApiException(
    message: String? = null,
    cause: Throwable? = null,
    code: Int = 0,
    responseHeaders: Map<String, List<String>>? = null,
    responseBody: String? = null
) : Exception(message ?: if (cause != null) cause.message else "", cause) {
//) : Exception() {

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    val code: Int
        get() = this.code

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    var responseHeaders: Map<String, List<String>>? = null
        get() = this.responseHeaders!!

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    val responseBody: String?
        get() = this.responseBody

    /**
     * Get the exception message including HTTP response data.
     *
     * @return The exception message
     */
    fun getFullMessage(): String {
        return """
            Message: ${this.message ?: ""}
            HTTP response code: $code
            HTTP response body: $responseBody
            HTTP response headers: $responseHeaders
            """.trimIndent()
    }
}