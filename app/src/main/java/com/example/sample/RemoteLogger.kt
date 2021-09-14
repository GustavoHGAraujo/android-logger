package com.example.sample

import android.content.Context
import com.gomagustavo.logger.Logger

class RemoteLogger(context: Context) : Logger.Remote {

    private val toastLogger by lazy { ToastLogger(context) }

    override fun log(level: Logger.Level, tag: String, message: String) =
        toastLogger.log(level, tag, message)

    override fun log(level: Logger.Level, tag: String, throwable: Throwable) =
        toastLogger.log(level, tag, throwable)

    override fun log(level: Logger.Level, tag: String, message: String, throwable: Throwable) =
        toastLogger.log(level, tag, message, throwable)
}