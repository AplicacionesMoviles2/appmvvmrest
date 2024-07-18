package pe.idat.appmvvmrest.posts.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import pe.idat.appmvvmrest.posts.domain.GetPostUseCase
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private val getPostUseCase: GetPostUseCase)
    : ViewModel() {

    private val _postList = MutableLiveData<String>()
    val postList: LiveData<String> = _postList

    fun getPosts(){
        viewModelScope.launch {
            Log.i("POSTLIST", getPostUseCase().toString())
        }
    }


}