package com.example.amaze.network

import com.example.amaze.interfaces.EventService
import com.example.amaze.interfaces.UserService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// Création de l'instance Retrofit
class RetrofitClient {


    companion object {

        // URL to API
        val BASE_URL : String = "https://amaze-api.herokuapp.com/"


        // Retrofit instance declaration
        val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

        // Service declaration
        val userService = retrofit.create(UserService::class.java)
        val eventService = retrofit.create(EventService::class.java)



    }
}