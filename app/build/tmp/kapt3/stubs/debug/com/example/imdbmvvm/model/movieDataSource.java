package com.example.imdbmvvm.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/imdbmvvm/model/movieDataSource;", "", "cancel", "", "retrievemovies", "callback", "Lcom/example/imdbmvvm/data/OperationCallback;", "Lcom/example/imdbmvvm/model/Movie;", "app_debug"})
public abstract interface movieDataSource {
    
    public abstract void retrievemovies(@org.jetbrains.annotations.NotNull()
    com.example.imdbmvvm.data.OperationCallback<com.example.imdbmvvm.model.Movie> callback);
    
    public abstract void cancel();
}