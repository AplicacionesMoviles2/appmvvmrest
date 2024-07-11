package pe.idat.appmvvmrest.posts.data.network.service

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import pe.idat.appmvvmrest.posts.data.network.response.PostResponse
import pe.idat.appmvvmrest.posts.data.network.retrofitcliet.PostClient
import javax.inject.Inject

class PostService @Inject constructor(private val postClient: PostClient) {

    suspend fun getPost(): List<PostResponse>{
        return withContext(Dispatchers.IO){
            val response = postClient.getPost()
            response.body()!!
        }
    }

}