package com.example.imdbmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/imdbmvvm/data/ApiClient;", "", "()V", "API_BASE_URL", "", "servicesApiInterface", "Lcom/example/imdbmvvm/data/ApiClient$ServicesApiInterface;", "build", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "ServicesApiInterface", "app_debug"})
public final class ApiClient {
    private static final java.lang.String API_BASE_URL = "https://api.themoviedb.org";
    private static com.example.imdbmvvm.data.ApiClient.ServicesApiInterface servicesApiInterface;
    public static final com.example.imdbmvvm.data.ApiClient INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.imdbmvvm.data.ApiClient.ServicesApiInterface build() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor interceptor() {
        return null;
    }
    
    private ApiClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/imdbmvvm/data/ApiClient$ServicesApiInterface;", "", "movies", "Lretrofit2/Call;", "Lcom/example/imdbmvvm/data/MovieResponse;", "app_debug"})
    public static abstract interface ServicesApiInterface {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "/3/movie/popular?api_key=0de9947f74b0a13182547181e49a324b&language=en-US&page=1")
        public abstract retrofit2.Call<com.example.imdbmvvm.data.MovieResponse> movies();
    }
}