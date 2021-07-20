package project.wgtech.dogcat.dog

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class V1ImagesSearchItem(
    @SerializedName("breeds")
    @Expose val breeds: List<Breed>,
    @SerializedName("height")
    @Expose val height: Int,
    @SerializedName("id")
    @Expose val id: String,
    @SerializedName("url")
    @Expose val url: String,
    @SerializedName("width")
    @Expose val width: Int
)