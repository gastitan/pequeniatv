package com.example.pequeniatv.service;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;

import com.example.pequeniatv.model.Channel;
import com.example.pequeniatv.presenter.CardPresenter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChannelsService {

    public void adaptChannels(final ApiChannelsService apiChannelsService, final String section,
                              final ArrayObjectAdapter rowsAdapter) {

        Call<List<Channel>> call = apiChannelsService.getChannelsBySection(section);

        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(@NonNull Call<List<Channel>> call, @NonNull Response<List<Channel>> response) {
                if (response.isSuccessful()) {
                    List<Channel> channelsResponse = response.body();
                    Log.d("API Channels", "quantity: " + (channelsResponse != null ? channelsResponse.size() : 0));

                    ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(new CardPresenter());
                    listRowAdapter.addAll(0, channelsResponse);

                    var header = new HeaderItem(1, section);
                    rowsAdapter.add(new ListRow(header, listRowAdapter));
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Channel>> call, @NonNull Throwable t) {
                Log.e("API Channels", "Error", t);
            }
        });
    }
}
