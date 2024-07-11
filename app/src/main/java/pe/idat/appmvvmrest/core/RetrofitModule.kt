package pe.idat.appmvvmrest.core

import pe.idat.appmvvmrest.posts.data.network.retrofitcliet.PostClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitModule {

    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun providePostClient(retrofit: Retrofit):PostClient{
        return retrofit.create(PostClient::class.java)
    }

}