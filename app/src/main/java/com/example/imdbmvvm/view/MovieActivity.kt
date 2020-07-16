package com.example.imdbmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imdbmvvm.R
import com.example.imdbmvvm.di.Injection
import com.example.imdbmvvm.model.Movie
import com.example.imdbmvvm.viewmodel.movieViewModel
import kotlinx.android.synthetic.main.activity_movie.*
import kotlinx.android.synthetic.main.layout_error.*

class movieActivity : AppCompatActivity() {

    private lateinit var viewModel: movieViewModel
    private lateinit var adapter: movieAdapter

    companion object {
        const val TAG= "CONSOLE"
    }

    /**
     //Consider this, if you need to call the service once when activity was created.
        Log.v(TAG,"savedInstanceState $savedInstanceState")
        if(savedInstanceState==null){
            viewModel.loadmovies()
        }
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        setupViewModel()
        setupUI()
    }

    //ui
    private fun setupUI(){
        adapter= movieAdapter(viewModel.movies.value?: emptyList())
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= adapter
    }

    //viewmodel
    /**
        //Consider this if ViewModel class don't require parameters.
        viewModel = ViewModelProviders.of(this).get(movieViewModel::class.java)

        //if you require any parameters to  the ViewModel consider use a ViewModel Factory
        //viewModel = ViewModelProviders.of(this,ViewModelFactory(Injection.providerRepository())).get(movieViewModel::class.java)
        viewModel = ViewModelProvider(this,Injection.provideViewModelFactory()).get(movieViewModel::class.java)

        //Anonymous observer implementation
        viewModel.movies.observe(this,Observer<List<movie>> {
            Log.v("CONSOLE", "data updated $it")
            adapter.update(it)
        })
     */
    private fun setupViewModel(){
        viewModel = ViewModelProvider(this,Injection.provideViewModelFactory()).get(movieViewModel::class.java)
        //viewModel = ViewModelProvider(this,ViewModelFactory(Injection.providerRepository())).get(movieViewModel::class.java)
        //viewModel = ViewModelProviders.of(this,ViewModelFactory(Injection.providerRepository())).get(movieViewModel::class.java)
        viewModel.movies.observe(this,rendermovies)

        viewModel.isViewLoading.observe(this,isViewLoadingObserver)
        viewModel.onMessageError.observe(this,onMessageErrorObserver)
        viewModel.isEmptyList.observe(this,emptyListObserver)
    }

    //observers
    private val rendermovies= Observer<List<Movie>> {
        Log.v(TAG, "data updated $it")
        layoutError.visibility=View.GONE
        layoutEmpty.visibility=View.GONE
        adapter.update(it)
    }

    private val isViewLoadingObserver= Observer<Boolean> {
        Log.v(TAG, "isViewLoading $it")
        val visibility=if(it)View.VISIBLE else View.GONE
        progressBar.visibility= visibility
    }

    private val onMessageErrorObserver= Observer<Any> {
        Log.v(TAG, "onMessageError $it")
        layoutError.visibility=View.VISIBLE
        layoutEmpty.visibility=View.GONE
        textViewError.text= "Error $it"
    }

    private val emptyListObserver= Observer<Boolean> {
        Log.v(TAG, "emptyListObserver $it")
        layoutEmpty.visibility=View.VISIBLE
        layoutError.visibility=View.GONE
    }

     //If you require updated data, you can call the method "loadmovie" here
     override fun onResume() {
        super.onResume()
        viewModel.loadmovies()
     }

}
