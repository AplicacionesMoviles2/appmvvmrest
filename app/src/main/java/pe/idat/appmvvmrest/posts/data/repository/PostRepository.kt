package pe.idat.appmvvmrest.posts.data.repository

import pe.idat.appmvvmrest.posts.data.network.response.PostResponse
import pe.idat.appmvvmrest.posts.data.network.service.PostService
import javax.inject.Inject

class PostRepository @Inject constructor(private val postService: PostService) {

    suspend fun getPost(): List<PostResponse>{
        return postService.getPost()
    }

}