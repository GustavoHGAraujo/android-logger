package com.gomagustavo.logger

import android.util.Log

object AndroidLogger : Logger.Local {

    private val levelsToSkip = mutableListOf<Logger.Level>()

    private fun shouldSkip(level: Logger.Level) = (level in levelsToSkip)

    override fun log(level: Logger.Level, tag: String, message: String) {
        if (shouldSkip(level = level)) {
            return
        }

        when (level) {
            Logger.Level.Info -> Log.i(tag, message)
            Logger.Level.Debug -> Log.d(tag, message)
            Logger.Level.Warning -> Log.w(tag, message)
            Logger.Level.Error -> Log.e(tag, message)
        }
    }

    override fun log(level: Logger.Level, tag: String, throwable: Throwable) =
        log(level, tag, message = "", throwable)

    override fun log(level: Logger.Level, tag: String, message: String, throwable: Throwable) {
        if (shouldSkip(level = level)) {
            return
        }

        when (level) {
            Logger.Level.Info -> Log.i(tag, message, throwable)
            Logger.Level.Debug -> Log.d(tag, message, throwable)
            Logger.Level.Warning -> Log.w(tag, message, throwable)
            Logger.Level.Error -> Log.e(tag, message, throwable)
        }
    }

    fun setSkipLogLevel(level: Logger.Level, skip: Boolean) {
        if (skip) {
            levelsToSkip.add(level)
        } else {
            levelsToSkip.remove(level)
        }
    }
}