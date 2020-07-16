package com.example.imdbmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.imdbmvvm.data.OperationCallback
import com.example.imdbmvvm.model.Movie
import com.example.imdbmvvm.model.movieDataSource

class movieViewModel(private val repository: movieDataSource):ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>().apply { value = emptyList() }
    val movies: LiveData<List<Movie>> = _movies

    private val _isViewLoading=MutableLiveData<Boolean>()
    val isViewLoading:LiveData<Boolean> = _isViewLoading

    private val _onMessageError=MutableLiveData<Any>()
    val onMessageError:LiveData<Any> = _onMessageError

    private val _isEmptyList=MutableLiveData<Boolean>()
    val isEmptyList:LiveData<Boolean> = _isEmptyList


    fun loadmovies(){
        _isViewLoading.postValue(true)
        repository.retrievemovies(object:OperationCallback<Movie>{
            override fun onError(error: String?) {
                _isViewLoading.postValue(false)
                _onMessageError.postValue( error)
            }

            override fun onSuccess(data: List<Movie>?) {
                _isViewLoading.postValue(false)

                if(data!=null){
                    if(data.isEmpty()){
                        _isEmptyList.postValue(true)
                    }else{
                        _movies.value= data
                    }
                }
            }
        })
    }

}