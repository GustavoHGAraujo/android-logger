package com.gomagustavo.logger

import com.gomagustavo.logger.ktx.addIfAbsent

sealed interface Logger {
    enum class Level {
        Info, Debug, Warning, Error
    }

    fun log(level: Level, tag: String, message: String)
    fun log(level: Level, tag: String, throwable: Throwable)
    fun log(level: Level, tag: String, message: String, throwable: Throwable);

    interface Local : Logger
    interface Remote : Logger
}

private val loggerList = mutableListOf<Logger>(AndroidLogger)

internal fun forEachLogger(locallyOnly: Boolean, action: (logger: Logger) -> Unit) = loggerList
    .filter { !locallyOnly || it is Logger.Local }
    .forEach(action)

fun isLoggerRegistered(logger: Logger) = logger in loggerList

fun registerLogger(logger: Logger) = loggerList.addIfAbsent(logger)

fun unregisterLogger(logger: Logger) = loggerList.remove(logger)
