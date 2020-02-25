package com.hashedin.mainassignment

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroClass
{
    private val BASE_URL="http://tradenapp-env.us-east-1.elasticbeanstalk.com/"

    private fun getRetroInnstance():Retrofit
    {
        val gson = GsonBuilder().setLenient().create()

        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build()
    }

    fun getAPIInstance() : APIservice
    {
        return getRetroInnstance().create(APIservice::class.java)
    }
}
