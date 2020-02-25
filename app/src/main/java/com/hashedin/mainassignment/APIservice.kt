package com.hashedin.mainassignment

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIservice
{
    @FormUrlEncoded
    @POST("/api/v1/generate-otp/")
    fun usersignup(@Field("type")type:String, @Field("username")username:String) : Call<String>

    @FormUrlEncoded
    @POST("api/v1/verify-otp/")
    fun verifyotp(@Field("otp")otp:String, @Field("username")username:String) : Call<String>

    @FormUrlEncoded
    @POST("/api/v1/api-token-auth/")
    fun userlogin(@Field("otp")type:String, @Field("username")username:String) : Call<String>
}