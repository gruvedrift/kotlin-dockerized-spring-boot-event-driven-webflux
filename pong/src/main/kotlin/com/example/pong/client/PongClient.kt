package com.example.pong.client

import com.example.pong.utils.Loggable
import com.example.pong.utils.fetchLogger
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class PongClient(
    private val webClient: WebClient
):Loggable {

    private val logger = fetchLogger()

    fun sendMessageToPing() {
        logger.info("Attempting to send message to ping...").also {
            Thread.sleep(500)
            webClient
                .post()
                .bodyValue("Hello, this is a greeting from Pong! >:)")
                .retrieve()
                .bodyToMono(String.javaClass)
                .subscribe()
        }
    }
}
