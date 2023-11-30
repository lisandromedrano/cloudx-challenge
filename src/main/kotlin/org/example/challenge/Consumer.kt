package org.example.challenge

import org.example.challenge.domain.AppInfo
import org.example.challenge.dto.AppInfoMessage
import org.example.challenge.repository.AppInfoRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component


@Component
class Consumer(@Autowired val appInfoRepository: AppInfoRepository) {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = ["k8s-resources"], groupId = "kotlin-consumer")
    fun resourcesListener(@Payload message:AppInfoMessage ) {
        logger.info("Message received: [$message]")

        val appInfo=AppInfo(
            name = message.metadata?.name?: "",
            kind = message.kind?: "",
            apiVersion = message.apiVersion?: "",
            namespace = message.metadata?.namespace?: ""
        )

        appInfoRepository.save(appInfo)
    }

}