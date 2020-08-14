package com.example.covidtracker

import okhttp3.OkHttpClient
import okhttp3.Request

object Client {
    private val client = OkHttpClient()

    private val request = Request.Builder()
        .url("https://api.covid19india.org/data.json")
        .build()

    val api = client.newCall(request)
}
