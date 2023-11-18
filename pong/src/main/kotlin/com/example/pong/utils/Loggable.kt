package com.example.pong.utils

import org.slf4j.Logger
import org.slf4j.LoggerFactory

interface Loggable

/**
 * Considerations:
 * Each call of fetchLogger() creates a new instance of. Could be performance hit if GIGA-frequent logging
 * operations
 * */

inline fun <reified T: Loggable> T.fetchLogger(): Logger = LoggerFactory.getLogger(T::class.java)
