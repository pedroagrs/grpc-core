import com.google.protobuf.gradle.id

plugins {
    id("java")
    id("idea")
    id("com.google.protobuf") version "0.9.1"
}

group = "io.pedroagrs.github"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    project(":common")
}

idea {
    module {
        sourceDirs.plusAssign(file("src/main/generated"))
    }
}

sourceSets {
    main {
        java {
            srcDirs("build/generated/source/proto/main/grpc")
            srcDirs("build/generated/source/proto/main/java")
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.21.7"
    }

    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.54.1"
        }
        id("java") {
            artifact = "com.google.protobuf:protoc-gen-java:3.21.7"
        }
    }

    generateProtoTasks {
        all().forEach { task ->
            task.plugins {
                id("grpc") {
                    option("lite")
                }
            }
        }
    }
}



