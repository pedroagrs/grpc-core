plugins {
    id("java")
}

group = "io.pedroagrs.github"
version = "1.0-SNAPSHOT"


allprojects {
    apply(plugin = "java-library")

    repositories {
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        runtimeOnly("io.grpc:grpc-netty-shaded:1.54.1")

        implementation("io.grpc:grpc-protobuf:1.54.1")
        implementation("io.grpc:grpc-stub:1.54.1")
        implementation("io.grpc:grpc-services:1.54.1")

        compileOnly("org.apache.tomcat:annotations-api:6.0.53")

        testCompileOnly("org.junit.jupiter:junit-jupiter-api:5.9.2")
        testCompileOnly("org.junit.jupiter:junit-jupiter-params:5.9.2")
    }

}