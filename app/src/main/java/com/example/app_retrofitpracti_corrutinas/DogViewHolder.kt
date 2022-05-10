package com.example.app_retrofitpracti_corrutinas

import android.provider.MediaStore
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.app_retrofitpracti_corrutinas.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder (view:View):RecyclerView.ViewHolder(view){

    private val bindind = ItemDogBinding.bind(view)
    fun bind(image: String){
        Picasso.get().load(image).into(bindind.ivDog)
        bindind.ivDog
    }
}