package com.example.myapp2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform