package project.wgtech.dogcat.utilities.network

import androidx.annotation.VisibleForTesting
import project.wgtech.dogcat.data.dog.V1ImagesSearch
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface NetworkServices {

    @VisibleForTesting
    @Headers("x-api-key: 4fb20853-503a-4acc-8c5d-8ad0a9e43eea")
    @GET("/v1/images/search")
    fun theDogApiTest() : Call<V1ImagesSearch>

    @VisibleForTesting
    @Headers("x-api-key: /* ENTER KEY HERE */")
    @GET("/v1/images/search")
    fun theCatApiTest()
}