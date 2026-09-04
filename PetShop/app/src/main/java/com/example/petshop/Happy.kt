package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun name(): String {
        return "The mood is happy"
    }
}