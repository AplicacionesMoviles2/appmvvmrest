package pe.idat.appmvvmrest.posts.data.network.response

data class PostResponse(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)