package com.example.app_retrofitpracti_corrutinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_retrofitpracti_corrutinas.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.time.temporal.TemporalQuery

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {

    }

    //retrofit
    private fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breeds/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    //Corrutina
    private fun searchByName(query: String){
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(ApiService::class.java).getDogsByBreeds("$query/image")
            val puppies = call.body()
            if (call.isSuccessful){
                //show recyclerview
            }else{
                //show error
            }
        }
    }
}