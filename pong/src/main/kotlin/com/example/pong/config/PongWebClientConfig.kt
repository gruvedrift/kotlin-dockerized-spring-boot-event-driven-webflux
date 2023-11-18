package com.example.pong.config

import com.example.pong.utils.Loggable
import com.example.pong.utils.fetchLogger
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class PongWebClientConfig(
    @Value("\${external-config.transmission-url}")
    private val transmissionUrl: String
):Loggable {

    private val logger = fetchLogger()

    @Bean
    fun createWebClient(): WebClient =
        logger.info("Setting up connection to $transmissionUrl")
            .let { WebClient.create(transmissionUrl) }

}
