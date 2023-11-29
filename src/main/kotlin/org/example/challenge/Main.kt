package org.example.challenge

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application
private val logger = LoggerFactory.getLogger(Application::class.java)
fun main() {
    logger.info("Starting Challenge Application")

    runApplication<Application>()

}