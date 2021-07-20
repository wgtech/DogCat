package project.wgtech.dogcat.dog

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Height(
    @SerializedName("imperial")
    @Expose val imperial: String,
    @SerializedName("metric")
    @Expose val metric: String
)