package com.example.pequeniatv.client;

import android.content.Context;

import androidx.annotation.NonNull;

import com.example.pequeniatv.session.SessionManager;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthInterceptor implements Interceptor {

    SessionManager sessionManager;

    public AuthInterceptor(final Context context) {
        sessionManager = new SessionManager(context);
    }

    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();

        builder.addHeader("Authorization", "Bearer " + sessionManager.getToken());

        return chain.proceed(builder.build());
    }
}
