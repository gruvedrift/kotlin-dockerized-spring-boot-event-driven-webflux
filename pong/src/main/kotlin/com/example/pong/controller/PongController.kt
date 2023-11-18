package com.example.pong.controller

import com.example.pong.client.PongClient
import org.springframework.web.bind.annotation.*
import com.example.pong.utils.*

@RestController
@RequestMapping("/api")
class PongController (
    private val pongClient: PongClient
): Loggable {

    private val logger = fetchLogger()

    @PostMapping("/message")
    fun receiveMessage(
        @RequestBody message: String
    ) {
        logger.info("Received message: $message").also {
            Thread.sleep(1500)
            pongClient.sendMessageToPing()
        }
    }
}
