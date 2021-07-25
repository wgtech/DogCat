package project.wgtech.dogcat.utilities

import android.util.Log

class Logger {
    companion object {
        fun i(message: String) = Log.i(LogTag, message)
        fun d(message: String) = Log.d(LogTag, message)
        fun w(message: String) = w(message, null)
        fun w(message: String, throwable: Throwable?) = Log.w(LogTag, message, throwable)
        fun e(message: String) = e(message, null)
        fun e(message: String, throwable: Throwable?) = Log.e(LogTag, message, throwable)
    }
}