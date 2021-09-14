package com.gomagustavo.logger.ktx

import com.gomagustavo.logger.Logger
import com.gomagustavo.logger.forEachLogger

fun logd(tag: String, message: String, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Debug, tag, message) }

fun logd(tag: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Debug, tag, throwable) }

fun logd(tag: String, message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Debug, tag, message, throwable) }


fun logi(tag: String, message: String, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Info, tag, message) }

fun logi(tag: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Info, tag, throwable) }

fun logi(tag: String, message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Info, tag, message, throwable) }


fun logw(tag: String, message: String, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Warning, tag, message) }

fun logw(tag: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Warning, tag, throwable) }

fun logw(tag: String, message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Warning, tag, message, throwable) }


fun loge(tag: String, message: String, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Error, tag, message) }

fun loge(tag: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Error, tag, throwable) }

fun loge(tag: String, message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    forEachLogger(locallyOnly) { it.log(Logger.Level.Error, tag, message, throwable) }
