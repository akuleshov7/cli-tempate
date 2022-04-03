package com.akuleshov7.dt.common.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Possible log mode
 */
@Serializable
enum class LogType {
    @SerialName("all") ALL,
    @SerialName("debug") DEBUG,
    @SerialName("results_only") RESULTS_ONLY,
    @SerialName("warnings") WARN,
    ;
}
