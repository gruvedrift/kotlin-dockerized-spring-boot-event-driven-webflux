package com.example.ping.controller

import com.example.ping.client.PingClient
import org.springframework.web.bind.annotation.*
import com.example.ping.utils.*
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener

@RestController
@RequestMapping("/api")
class PingController(
    private val pingClient: PingClient
):Loggable {

    private val logger = fetchLogger()

    /* Start message interaction after application is running */
    @EventListener
    @PostMapping("/start")
    fun startMessageInteraction(event: ApplicationReadyEvent) {
        logger.info("Starting message interaction...")
        Thread.sleep(1500)
        pingClient.sendMessageToPong()
    }

    @PostMapping("/message")
    fun receiveMessage(
        @RequestBody message: String
    ) {
        logger.info("Received message: $message !")
        Thread.sleep(1500)
        pingClient.sendMessageToPong()
    }

}
