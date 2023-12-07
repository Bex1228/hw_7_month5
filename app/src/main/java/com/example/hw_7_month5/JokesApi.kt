package com.example.hw_7_month5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface JokesApi {
    @GET("random/joke")
    fun getJokes(
        @Header("X-RapidAPI-Key") key: String = "61c3c88164msh3f8c2d2c14c4e13p1cf2d0jsn9e9577da29a7",
        @Header("X-RapidAPI-Host") host: String = "dad-jokes.p.rapidapi.com"
    ): Call<JokesModel>

}
