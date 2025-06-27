group = "ru.testit"


plugins {
    kotlin("jvm") version "2.0.20"
    `maven-publish`
    signing
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
}


java {
    withJavadocJar()
    withSourcesJar()
}

repositories {
    mavenLocal()
    mavenCentral()
}


val kotlin_version = "1.9.23"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlin_version")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.1")
    implementation("com.squareup.moshi:moshi-adapters:1.15.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}



publishing {
    repositories {
        // JReleaser staging repository
        maven {
            name = "staging"
            url = uri(layout.buildDirectory.dir("staging-deploy"))
        }
        mavenLocal()
        mavenCentral()
    }
    publications {
        create<MavenPublication>("maven") {
            versionMapping {
                allVariants {
                    fromResolutionResult()
                }
            }
            pom {
                name.set(project.name)
                description.set("Kotlin API client for TestIT.")
                url.set("https://github.com/testit-tms/api-client-kotlin")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("integration")
                        name.set("Integration team")
                        email.set("integrations@testit.software")
                    }
                }
                scm {
                    developerConnection.set("scm:git:git://github.com/testit-tms/api-client-kotlin")
                    connection.set("scm:git:git://github.com/testit-tms/api-client-kotlin")
                    url.set("https://github.com/testit-tms/api-client-kotlin")
                }
                issueManagement {
                    system.set("GitHub Issues")
                    url.set("https://github.com/testit-tms/api-client-kotlin/issues")
                }
            }
        }
    }
}

tasks.withType<Sign>().configureEach {
    onlyIf { !version.toString().endsWith("-SNAPSHOT") }
}


tasks.jar {
    manifest {
        attributes(
            mapOf(
                "Specification-Title" to project.name,
                "Implementation-Title" to project.name,
                "Implementation-Version" to version
            )
        )
    }
}

publishing.publications.named<MavenPublication>("maven") {
    pom {
        from(components["java"])
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

// JReleaser helper tasks
tasks.register("jreleaserStage") {
    group = "publishing"
    description = "Stages all modules for JReleaser deployment"

    // Depend on publishing tasks from all subprojects
    dependsOn(":publishMavenPublicationToStagingRepository")

    doLast {
        println("✅ All modules staged for JReleaser deployment")
        println("📁 Staging directories:")
        val stagingDir = project.layout.buildDirectory.dir("staging-deploy").get().asFile
        if (stagingDir.exists()) {
            println("   ${project.name}: ${stagingDir.absolutePath}")
        }
        println("🚀 Run 'jreleaser deploy' to publish to Maven Central")
    }
}
