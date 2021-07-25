package project.wgtech.dogcat

import android.graphics.Bitmap
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import project.wgtech.dogcat.utilities.ImageLoader
import project.wgtech.dogcat.utilities.Logger
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

@RunWith(AndroidJUnit4::class)
class ImageLoaderTest {
    val appContext = InstrumentationRegistry.getInstrumentation().targetContext

    private fun startTest() = Logger.d("=== Now starting the test ===")
    private fun endTest() = Logger.d("=== Test finished ===")

    private val countDownLatch = CountDownLatch(1)

    @Test
    fun loadTest() {
        startTest()

        val width = 760
        var bitmap : Bitmap? = null

        ImageLoader.load(
            "https://lh3.googleusercontent.com/JNyXgkoAa9Ec_WTFWCg8tXo_aalgWVTffOv9Fn5zv8Y6fIoFWA70u4PAmiGhOISfc5iyG9xNcuPPABjAhlRKH_ZM3ydzseWfk_zK=w760-h360",
            completed = {
                bitmap = it
                countDownLatch.countDown()
            })

        countDownLatch.await(3000, TimeUnit.SECONDS)

        assertEquals(width, bitmap?.width)
        endTest()
    }
}