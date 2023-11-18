package com.example.ping.client

import com.example.ping.utils.Loggable
import com.example.ping.utils.fetchLogger
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class PingClient(
    private val webClient: WebClient
): Loggable {

    private val logger = fetchLogger()

    fun sendMessageToPong() {
        logger.info("Attempting to send message to pong...")
        Thread.sleep(500)
        webClient
            .post()
            .bodyValue("Hello, this is a greeting from Ping! :)")
            .retrieve()
            .bodyToMono(String.javaClass)
            .subscribe()
    }
}
