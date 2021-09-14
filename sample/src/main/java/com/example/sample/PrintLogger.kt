package com.example.sample

import com.gomagustavo.logger.Logger

object PrintLogger : Logger.Local {

    override fun log(level: Logger.Level, tag: String, message: String) {
        println("[$level] [$tag] $message")
    }

    override fun log(level: Logger.Level, tag: String, throwable: Throwable) {
        println("[$level] [$tag] ${throwable.message}")
    }

    override fun log(level: Logger.Level, tag: String, message: String, throwable: Throwable) {
        println("[$level] [$tag] $message | Error: ${throwable.message}")
    }
}