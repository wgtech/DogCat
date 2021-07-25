package project.wgtech.dogcat.data.dog

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Breed(
    @SerializedName("bred_for")
    @Expose val bredFor: String,
    @SerializedName("breed_group")
    @Expose val breedGroup: String,
    @SerializedName("height")
    @Expose val height: Height,
    @SerializedName("id")
    @Expose val id: Int,
    @SerializedName("life_span")
    @Expose val lifeSpan: String,
    @SerializedName("name")
    @Expose val name: String,
    @SerializedName("reference_image_id")
    @Expose val referenceImageId: String,
    @SerializedName("temperament")
    @Expose val temperament: String,
    @SerializedName("weight")
    @Expose val weight: Weight
)