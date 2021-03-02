package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Pet(
    val name: String,
    val breed: String,
    val location: String,
    val age: String,
    val gender: String,
    val size: String,
    @DrawableRes val picture: Int,
)