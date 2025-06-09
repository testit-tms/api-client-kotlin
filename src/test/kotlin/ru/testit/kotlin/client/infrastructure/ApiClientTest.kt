package ru.testit.kotlin.client.infrastructure

import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.StringSpec

class ApiClientTest : StringSpec({

    "should have mutable public fields for authentication" {
        val apiClient = ApiClient("https://api.example.com")

        apiClient.apiKey shouldNotBe null
        apiClient.apiKeyPrefix shouldNotBe null
        apiClient.verifyingSsl shouldBe false
        apiClient.username shouldBe null
        apiClient.password shouldBe null
        apiClient.accessToken shouldBe null

        apiClient.apiKey["Authorization"] = "test-key"
        apiClient.apiKeyPrefix["Authorization"] = "Bearer"
        apiClient.verifyingSsl = true
        apiClient.username = "test-user"
        apiClient.password = "test-password"
        apiClient.accessToken = "test-token"

        apiClient.apiKey["Authorization"] shouldBe "test-key"
        apiClient.apiKeyPrefix["Authorization"] shouldBe "Bearer"
        apiClient.verifyingSsl shouldBe true
        apiClient.username shouldBe "test-user"
        apiClient.password shouldBe "test-password"
        apiClient.accessToken shouldBe "test-token"
    }

    "should allow multiple API keys configuration" {
        val apiClient = ApiClient("https://api.example.com")

        // Test map mutability for multiple authentication schemes
        apiClient.apiKey["X-API-Key"] = "key1"
        apiClient.apiKey["X-Custom-Auth"] = "key2"
        apiClient.apiKeyPrefix["X-API-Key"] = "ApiKey"
        apiClient.apiKeyPrefix["X-Custom-Auth"] = "Token"

        apiClient.apiKey.size shouldBe 2
        apiClient.apiKeyPrefix.size shouldBe 2
        apiClient.apiKey["X-API-Key"] shouldBe "key1"
        apiClient.apiKey["X-Custom-Auth"] shouldBe "key2"
        apiClient.apiKeyPrefix["X-API-Key"] shouldBe "ApiKey"
        apiClient.apiKeyPrefix["X-Custom-Auth"] shouldBe "Token"
    }

    "should allow clearing authentication data" {
        val apiClient = ApiClient("https://api.example.com")

        apiClient.apiKey["Authorization"] = "test-key"
        apiClient.verifyingSsl = true
        apiClient.username = "user"
        apiClient.password = "pass"
        apiClient.accessToken = "token"

        apiClient.apiKey.clear()
        apiClient.verifyingSsl = false
        apiClient.username = null
        apiClient.password = null
        apiClient.accessToken = null

        apiClient.apiKey.isEmpty() shouldBe true
        apiClient.verifyingSsl shouldBe false
        apiClient.username shouldBe null
        apiClient.password shouldBe null
        apiClient.accessToken shouldBe null
    }
}) 