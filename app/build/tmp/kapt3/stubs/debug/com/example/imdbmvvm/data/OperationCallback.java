package com.example.imdbmvvm.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/imdbmvvm/data/OperationCallback;", "T", "", "onError", "", "error", "", "onSuccess", "data", "", "app_debug"})
public abstract interface OperationCallback<T extends java.lang.Object> {
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> data);
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    java.lang.String error);
}