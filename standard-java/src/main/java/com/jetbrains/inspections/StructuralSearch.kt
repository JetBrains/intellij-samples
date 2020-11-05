package com.jetbrains.inspections

import java.util.logging.Level.*
import java.util.logging.Logger

@Suppress("unused")
class StructuralSearch {
    private val logger = Logger.getLogger("StructuralSearch")
    fun logInfoWithinCheck() {
        if (logger.isLoggable(INFO)) {
            logger.log(INFO, "A log message")
        }
    }

    fun logInfo() {
        logger.log(INFO, "A log message")
    }

    fun logWarningWithException() {
        logger.log(WARNING, "Another log message",
                RuntimeException("Something went wrong"))
    }

    fun logFineWithLazyMessage() {
        logger.log(FINE) { "Reached this point" }
    }
}