package com.example.imdbmvvm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/imdbmvvm/model/movieRepository;", "Lcom/example/imdbmvvm/model/movieDataSource;", "()V", "call", "Lretrofit2/Call;", "Lcom/example/imdbmvvm/data/MovieResponse;", "cancel", "", "retrievemovies", "callback", "Lcom/example/imdbmvvm/data/OperationCallback;", "Lcom/example/imdbmvvm/model/Movie;", "app_debug"})
public final class movieRepository implements com.example.imdbmvvm.model.movieDataSource {
    private retrofit2.Call<com.example.imdbmvvm.data.MovieResponse> call;
    
    @java.lang.Override()
    public void retrievemovies(@org.jetbrains.annotations.NotNull()
    com.example.imdbmvvm.data.OperationCallback<com.example.imdbmvvm.model.Movie> callback) {
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    public movieRepository() {
        super();
    }
}