package pe.idat.appmvvmrest.posts.domain

import pe.idat.appmvvmrest.posts.data.network.response.PostResponse
import pe.idat.appmvvmrest.posts.data.repository.PostRepository
import javax.inject.Inject

class GetPostUseCase @Inject constructor(private val postRepository: PostRepository) {

    suspend operator fun invoke(): List<PostResponse>{
        return postRepository.getPost()
    }
}