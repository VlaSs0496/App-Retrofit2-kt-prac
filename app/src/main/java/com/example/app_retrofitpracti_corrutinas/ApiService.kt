package com.example.app_retrofitpracti_corrutinas

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getDogsByBreeds(@Url url:String):retrofit2.Response<DogsResponse>
}