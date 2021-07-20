package project.wgtech.dogcat.util.network

import androidx.annotation.VisibleForTesting
import project.wgtech.dogcat.dog.V1ImagesSearch
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface NetworkServices {

    @VisibleForTesting
    @Headers("x-api-key: /* ENTER KEY HERE */")
    @GET("/v1/images/search")
    fun theDogApiTest() : Call<V1ImagesSearch>

    @VisibleForTesting
    @Headers("x-api-key: /* ENTER KEY HERE */")
    @GET("/v1/images/search")
    fun theCatApiTest()
}