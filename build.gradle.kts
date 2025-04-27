plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass = "org.example.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework:spring-context:6.1.6")
    implementation("org.springframework:spring-beans:6.1.6")
    implementation("org.springframework:spring-core:6.1.6")
}

tasks.test {
    useJUnitPlatform()
}