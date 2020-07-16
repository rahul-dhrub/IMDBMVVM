package com.example.imdbmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/imdbmvvm/data/MovieResponse;", "", "()V", "page", "", "getPage", "()I", "setPage", "(I)V", "results", "", "Lcom/example/imdbmvvm/model/Movie;", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "total_pages", "getTotal_pages", "setTotal_pages", "total_results", "getTotal_results", "setTotal_results", "isSuccess", "", "app_debug"})
public final class MovieResponse {
    private int page;
    private int total_results;
    private int total_pages;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.imdbmvvm.model.Movie> results;
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getTotal_results() {
        return 0;
    }
    
    public final void setTotal_results(int p0) {
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    public final void setTotal_pages(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.imdbmvvm.model.Movie> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.imdbmvvm.model.Movie> p0) {
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public MovieResponse() {
        super();
    }
}