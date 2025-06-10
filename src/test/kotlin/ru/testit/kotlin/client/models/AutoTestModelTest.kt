package ru.testit.kotlin.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import java.time.OffsetDateTime
import java.util.UUID

class AutoTestModelTest : StringSpec({

    "lastTestResultStatus can be null" {
        val autoTest = AutoTestModel(
            globalId = 123L,
            isDeleted = false,
            mustBeApproved = false,
            id = UUID.randomUUID(),
            createdDate = OffsetDateTime.now(),
            createdById = UUID.randomUUID(),
            lastTestResultStatus = null,
            externalId = "test-id",
            projectId = UUID.randomUUID(),
            name = "Test AutoTest"
        )

        autoTest.lastTestResultStatus shouldBe null
    }

    "lastTestResultStatus can be set to TestStatusModel" {
        val testStatus = TestStatusModel(
            id = UUID.randomUUID(),
            name = "Succeeded",
            type = TestStatusType.Succeeded,
            isSystem = true,
            code = "SUCCEEDED"
        )

        val autoTest = AutoTestModel(
            globalId = 123L,
            isDeleted = false,
            mustBeApproved = false,
            id = UUID.randomUUID(),
            createdDate = OffsetDateTime.now(),
            createdById = UUID.randomUUID(),
            lastTestResultStatus = testStatus,
            externalId = "test-id",
            projectId = UUID.randomUUID(),
            name = "Test AutoTest"
        )

        autoTest.lastTestResultStatus shouldBe testStatus
    }
}) 