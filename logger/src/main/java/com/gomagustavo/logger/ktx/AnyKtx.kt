package com.gomagustavo.logger.ktx

internal val <T : Any> T.defaultTag: String
    get() = this::class.java.simpleName

fun <T : Any> T.logd(message: String, locallyOnly: Boolean = false) =
    logd(tag = defaultTag, message = message, locallyOnly = locallyOnly)

fun <T : Any> T.logd(throwable: Throwable, locallyOnly: Boolean = false) =
    logd(tag = defaultTag, throwable = throwable, locallyOnly = locallyOnly)

fun <T : Any> T.logd(message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    logd(tag = defaultTag, message = message, throwable = throwable, locallyOnly = locallyOnly)


fun <T : Any> T.logi(message: String, locallyOnly: Boolean = false) =
    logi(tag = defaultTag, message = message, locallyOnly = locallyOnly)

fun <T : Any> T.logi(throwable: Throwable, locallyOnly: Boolean = false) =
    logi(tag = defaultTag, throwable = throwable, locallyOnly = locallyOnly)

fun <T : Any> T.logi(message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    logi(tag = defaultTag, message = message, throwable = throwable, locallyOnly = locallyOnly)


fun <T : Any> T.logw(message: String, locallyOnly: Boolean = false) =
    logw(tag = defaultTag, message = message, locallyOnly = locallyOnly)

fun <T : Any> T.logw(throwable: Throwable, locallyOnly: Boolean = false) =
    logw(tag = defaultTag, throwable = throwable, locallyOnly = locallyOnly)

fun <T : Any> T.logw(message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    logw(tag = defaultTag, message = message, throwable = throwable, locallyOnly = locallyOnly)


fun <T : Any> T.loge(message: String, locallyOnly: Boolean = false) =
    loge(tag = defaultTag, message = message, locallyOnly = locallyOnly)

fun <T : Any> T.loge(throwable: Throwable, locallyOnly: Boolean = false) =
    loge(tag = defaultTag, throwable = throwable, locallyOnly = locallyOnly)

fun <T : Any> T.loge(message: String, throwable: Throwable, locallyOnly: Boolean = false) =
    loge(tag = defaultTag, message = message, throwable = throwable, locallyOnly = locallyOnly)
