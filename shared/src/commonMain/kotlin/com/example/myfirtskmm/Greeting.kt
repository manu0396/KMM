package com.example.myfirtskmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}