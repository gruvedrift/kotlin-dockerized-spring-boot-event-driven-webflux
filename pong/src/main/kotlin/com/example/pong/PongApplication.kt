package com.example.pong

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PongApplication

// Ping should be the first to send message, that means that PONG must be built and ready first

fun main(args: Array<String>) {
    runApplication<PongApplication>(*args)
}
