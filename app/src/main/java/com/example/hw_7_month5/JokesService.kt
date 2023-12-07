package com.example.hw_7_month5

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object JokesService {
   // https://rapidapi.com/KegenGuyll/api/dad-jokes/
    val retrofit = Retrofit.Builder().baseUrl("https://rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    val api = retrofit.create(JokesApi::class.java)
}