package com.example.pequeniatv.service;

import com.example.pequeniatv.model.AuthRequest;
import com.example.pequeniatv.model.AuthResponse;
import com.example.pequeniatv.model.Channel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiChannelsService {

    @GET("channels")
    Call<List<Channel>> getChannels();

    @GET("channels")
    Call<List<Channel>> getChannelsBySection(@Query("section") String section);

    @POST("auth")
    Call<AuthResponse> getLogin(@Body AuthRequest request);

}
