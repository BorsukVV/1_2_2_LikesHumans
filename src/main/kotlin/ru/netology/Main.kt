package ru.netology
fun main() {

    val likes = 1
    val singularPlural = singularPluralDetector(likes)
    println("Ваша запись понравилась $likes $singularPlural")
    println()
    val likes1 = 13
    val singularPlural1 = singularPluralDetector(likes1)
    println("Ваша запись понравилась $likes1 $singularPlural1")
    println()
    val likes2 = 15896
    val singularPlural2 = singularPluralDetector(likes2)
    println("Ваша запись понравилась $likes2 $singularPlural2")
    println()

}

fun singularPluralDetector(likes: Int): String {
    var result = likes
    if (result > 100) {
        result %= 100
    }
    if (result > 20) {
        result %= 10
    }

    return if (likes == 1 || result == 1) "человеку" else "людям"

}

