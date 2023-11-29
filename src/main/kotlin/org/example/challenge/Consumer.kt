package org.example.challenge

import org.example.challenge.dto.AppInfo
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component


@Component
class Consumer {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = ["k8s-resources"], groupId = "kotlin-consumer")
    fun resourcesListener(@Payload message:AppInfo ) {
        logger.trace("Message received: [$message]")
    }

}