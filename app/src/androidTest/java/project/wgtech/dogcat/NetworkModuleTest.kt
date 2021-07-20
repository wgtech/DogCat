package project.wgtech.dogcat

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import project.wgtech.dogcat.dog.V1ImagesSearch
import project.wgtech.dogcat.util.network.NetworkModule
import project.wgtech.dogcat.util.network.NetworkServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class NetworkModuleTest {
    @Test
    fun theDogApiTest() {
        NetworkModule.theDogApiClient.create(NetworkServices::class.java).theDogApiTest().enqueue(
            object : Callback<V1ImagesSearch> {
                override fun onResponse(
                    call: Call<V1ImagesSearch>,
                    response: Response<V1ImagesSearch>
                ) {
                    assert(true)
                }

                override fun onFailure(call: Call<V1ImagesSearch>, t: Throwable) {
                    assert(false)
                }

            }
        )
    }
}