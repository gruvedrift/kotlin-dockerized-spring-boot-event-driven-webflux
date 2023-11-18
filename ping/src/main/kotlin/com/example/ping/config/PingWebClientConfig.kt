package com.example.ping.config

import com.example.ping.utils.Loggable
import com.example.ping.utils.fetchLogger
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class PingWebClientConfig (
    @Value("\${external-config.transmission-url}")
    private val transmissionUrl: String
):Loggable {

    private val logger = fetchLogger()

    @Bean
    fun createWebClient(): WebClient {
        logger.info("Setting up connection to :$transmissionUrl")
        return WebClient.create(transmissionUrl)
    }

}
