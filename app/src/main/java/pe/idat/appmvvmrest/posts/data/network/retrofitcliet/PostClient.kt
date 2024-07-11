package pe.idat.appmvvmrest.posts.data.network.retrofitcliet

import pe.idat.appmvvmrest.posts.data.network.response.PostResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface PostClient {
    @GET("/posts")
    suspend fun getPost(): Response<List<PostResponse>>

}