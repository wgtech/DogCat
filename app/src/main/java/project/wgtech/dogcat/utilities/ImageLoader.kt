package project.wgtech.dogcat.utilities

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.annotation.VisibleForTesting
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.IOException
import java.net.URL

object ImageLoader {

    @VisibleForTesting
    private val cache = mutableMapOf<String, Bitmap>()

    fun load(urlString: String, completed: (Bitmap?) -> Unit) {
        if (urlString.isEmpty()) {
            completed(null)
            return
        }

        if (cache.contains(urlString)) {
            completed(cache[urlString])
            return
        }

        GlobalScope.launch(Dispatchers.IO) { // 인터넷을 통한 다운로드는 IO 작업이므로 IO
            try {
                val bitmap = BitmapFactory.decodeStream(URL(urlString).openStream())
                cache[urlString] = bitmap
                withContext(Dispatchers.Main) { // 실제로 이미지 반영하는 것은 UI 쓰레드가 처리
                    completed(bitmap)
                }

            } catch (e: IOException) {
                e.printStackTrace()
                withContext(Dispatchers.Main) {
                    completed(null)
                }
            }
        }
    }

}