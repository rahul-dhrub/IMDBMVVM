package com.example.imdbmvvm

import android.app.Application
import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.imdbmvvm.data.OperationCallback
import com.example.imdbmvvm.model.Movie
import com.example.imdbmvvm.model.movieDataSource
import com.example.imdbmvvm.viewmodel.movieViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mock
import org.mockito.*
import org.mockito.Mockito.*

//class MVVMUnitTest {
//
//    @Mock
//    private lateinit var repository: movieDataSource
//    @Mock private lateinit var context: Application
//
//    @Captor
//    private lateinit var operationCallbackCaptor: ArgumentCaptor<OperationCallback<Movie>>
//
//    private lateinit var viewModel:movieViewModel
//
//    private lateinit var isViewLoadingObserver:Observer<Boolean>
//    private lateinit var onMessageErrorObserver:Observer<Any>
//    private lateinit var emptyListObserver:Observer<Boolean>
//    private lateinit var onRendermoviesObserver:Observer<List<Movie>>
//
//    private lateinit var movieEmptyList:List<Movie>
//    private lateinit var movieList:List<Movie>
//
//    /**
//     //https://jeroenmols.com/blog/2019/01/17/livedatajunit5/
//     //Method getMainLooper in android.os.Looper not mocked
//
//     java.lang.IllegalStateException: operationCallbackCaptor.capture() must not be null
//     */
//    @get:Rule
//    val rule = InstantTaskExecutorRule()
//
//    @Before
//    fun setup() {
//        MockitoAnnotations.initMocks(this)
//        `when`<Context>(context.applicationContext).thenReturn(context)
//
//        viewModel= movieViewModel(repository)
//
//        mockData()
//        setupObservers()
//    }
//
//    @Test
//    fun `retrieve movies with ViewModel and Repository returns empty data`(){
//        with(viewModel){
//            loadmovies()
//            isViewLoading.observeForever(isViewLoadingObserver)
//            //onMessageError.observeForever(onMessageErrorObserver)
//            isEmptyList.observeForever(emptyListObserver)
//            movies.observeForever(onRendermoviesObserver)
//        }
//
//        verify(repository, times(1)).retrievemovies(capture(operationCallbackCaptor))
//        operationCallbackCaptor.value.onSuccess(movieEmptyList)
//
//        Assert.assertNotNull(viewModel.isViewLoading.value)
//        //Assert.assertNotNull(viewModel.onMessageError.value) //java.lang.AssertionError
//        //Assert.assertNotNull(viewModel.isEmptyList.value)
//        Assert.assertTrue(viewModel.isEmptyList.value==true)
//        Assert.assertTrue(viewModel.movies.value?.size==0)
//    }
//
//    @Test
//    fun `retrieve movies with ViewModel and Repository returns full data`(){
//        with(viewModel){
//            loadmovies()
//            isViewLoading.observeForever(isViewLoadingObserver)
//            movies.observeForever(onRendermoviesObserver)
//        }
//
//        verify(repository, times(1)).retrievemovies(capture(operationCallbackCaptor))
//        operationCallbackCaptor.value.onSuccess(movieList)
//
//        Assert.assertNotNull(viewModel.isViewLoading.value)
//        Assert.assertTrue(viewModel.movies.value?.size==3)
//    }
//
//    @Test
//    fun `retrieve movies with ViewModel and Repository returns an error`(){
//        with(viewModel){
//            loadmovies()
//            isViewLoading.observeForever(isViewLoadingObserver)
//            onMessageError.observeForever(onMessageErrorObserver)
//        }
//        verify(repository, times(1)).retrievemovies(capture(operationCallbackCaptor))
//        operationCallbackCaptor.value.onError("An error occurred")
//        Assert.assertNotNull(viewModel.isViewLoading.value)
//        Assert.assertNotNull(viewModel.onMessageError.value)
//    }
//
//    private fun setupObservers(){
//        isViewLoadingObserver= mock(Observer::class.java) as Observer<Boolean>
//        onMessageErrorObserver= mock(Observer::class.java) as Observer<Any>
//        emptyListObserver= mock(Observer::class.java) as Observer<Boolean>
//        onRendermoviesObserver= mock(Observer::class.java)as Observer<List<Movie>>
//    }
//
//    private fun mockData(){
//        movieEmptyList= emptyList()
//        val mockList:MutableList<Movie>  = mutableListOf()
//        mockList.add(Movie(0,"Museo Nacional de Arqueología, Antropología e Historia del Perú",""))
//        mockList.add(Movie(1,"Museo de Sitio Pachacamac",""))
//        mockList.add(Movie(2,"Casa Museo José Carlos Mariátegui",""))
//
//        movieList= mockList.toList()
//    }
//}