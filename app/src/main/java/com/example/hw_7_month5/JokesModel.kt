package com.example.hw_7_month5



data class JokesModel(
    val joke: ArrayList<Joke>
)

data class Joke(
    val setup: String,
    val punchline: String
)

