package com.example.imdbmvvm.model

import android.util.Log
import com.example.imdbmvvm.data.ApiClient
import com.example.imdbmvvm.data.MovieResponse
import com.example.imdbmvvm.data.OperationCallback
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val TAG="CONSOLE"

class movieRepository:movieDataSource {

    private var call:Call<MovieResponse>?=null

    override fun retrievemovies(callback: OperationCallback<Movie>) {
        call=ApiClient.build()?.movies()
        call?.enqueue(object :Callback<MovieResponse>{
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                callback.onError(t.message)
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                response.body()?.let {
                    if(response.isSuccessful && (it.isSuccess())){
                        Log.v(TAG, "data ${it.results}")
                        callback.onSuccess(it.results)
                    }else{
                        callback.onError("Error message")
                    }
                }
            }
        })
    }

    override fun cancel() {
        call?.let {
            it.cancel()
        }
    }
}