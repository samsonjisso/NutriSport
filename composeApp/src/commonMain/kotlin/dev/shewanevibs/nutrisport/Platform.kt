package dev.shewanevibs.nutrisport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform