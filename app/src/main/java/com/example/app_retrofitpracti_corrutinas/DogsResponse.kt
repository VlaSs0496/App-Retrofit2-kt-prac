package com.example.app_retrofitpracti_corrutinas

import com.google.gson.annotations.SerializedName

data class DogsResponse(@SerializedName("status") var status:String,
                        @SerializedName("messege") var images:List<String>) {

}