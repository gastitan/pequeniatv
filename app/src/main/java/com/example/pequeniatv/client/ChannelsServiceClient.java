package com.example.pequeniatv.client;

import android.content.Context;

import com.example.pequeniatv.service.ApiChannelsService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChannelsServiceClient {

    private ApiChannelsService channelsService;

    private static final String BASE_URL = "https://stormy-savannah-90287.herokuapp.com/";

    public ApiChannelsService getChannelsService(final Context context) {
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if (channelsService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okhttpClient(context))
                    .build();

            channelsService = retrofit.create(ApiChannelsService.class);
        }

        return channelsService;
    }

    private OkHttpClient okhttpClient(Context context)  {
        return new OkHttpClient.Builder()
                .addInterceptor(new AuthInterceptor(context))
                .build();
    }
}
