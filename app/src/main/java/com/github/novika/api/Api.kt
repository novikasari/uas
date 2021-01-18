package com.github.novika.api

import com.github.novika.data.model.DetailUserResponse
import com.github.novika.data.model.User
import com.github.novika.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 41476a65f44abcbd84614788e8c3b975db092044")
    fun getSearchUsers(
        @Query("q")query : String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 41476a65f44abcbd84614788e8c3b975db092044")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 41476a65f44abcbd84614788e8c3b975db092044")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 41476a65f44abcbd84614788e8c3b975db092044")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>
}