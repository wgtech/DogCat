package project.wgtech.dogcat

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import project.wgtech.dogcat.data.dog.V1ImagesSearch
import project.wgtech.dogcat.utilities.Logger
import project.wgtech.dogcat.utilities.network.NetworkModule
import project.wgtech.dogcat.utilities.network.NetworkServices
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
                    val dogId : String = response.body()?.get(0)?.id!!
                    Logger.d("dogId: $dogId")
                    assert(dogId.isNotEmpty())
                }

                override fun onFailure(call: Call<V1ImagesSearch>, t: Throwable) {
                    assert(false)
                }

            }
        )
    }
}