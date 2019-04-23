package com.example.msgshareapp

data class Hobby(var title: String)

object Suppiler {
    val hobbies = listOf<Hobby>(
        Hobby("Swimming"),
        Hobby("Reading"),
        Hobby("Walking"),
        Hobby("Sleeping"),
        Hobby("Programming"),
        Hobby("Gaming"),
        Hobby("Talking"),
        Hobby("Net Surfing"),
        Hobby("Roaming"),
        Hobby("Travelling"),
        Hobby("Listening Music"),
        Hobby("Chilling")
    )
}