package com.akuleshov7.dt.common.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Possible data output streams
 */
@Serializable
enum class OutputStreamType {
    @SerialName("file") FILE,
    @SerialName("stderr") STDERR,
    @SerialName("stdout") STDOUT,
    ;
}
