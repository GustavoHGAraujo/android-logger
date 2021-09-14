package com.example.sample

import android.content.Context
import android.widget.Toast
import com.gomagustavo.logger.Logger

class ToastLogger(private val context: Context) : Logger.Local {

    private fun toast(msg: String) = Toast
        .makeText(context, msg, Toast.LENGTH_SHORT)
        .show()

    override fun log(level: Logger.Level, tag: String, message: String) {
        toast("[$level] [$tag] $message")
    }

    override fun log(level: Logger.Level, tag: String, throwable: Throwable) {
        toast("[$level] [$tag] ${throwable.message}")
    }

    override fun log(level: Logger.Level, tag: String, message: String, throwable: Throwable) {
        toast("[$level] [$tag] $message | Error: ${throwable.message}")
    }
}