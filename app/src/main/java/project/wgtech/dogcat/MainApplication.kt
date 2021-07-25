package project.wgtech.dogcat

import android.app.Application
import android.util.Log
import androidx.work.Configuration

class MainApplication : Application(), Configuration.Provider {

    override fun getWorkManagerConfiguration(): Configuration =
        Configuration.Builder()
            .setMinimumLoggingLevel(if (BuildConfig.DEBUG) Log.VERBOSE else Log.ERROR)
            .build()
}