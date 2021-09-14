package com.gomagustavo.logger.ktx

internal fun <T> MutableList<T>.addIfAbsent(element: T) {
    if (element in this) {
        return
    }

    add(element)
}