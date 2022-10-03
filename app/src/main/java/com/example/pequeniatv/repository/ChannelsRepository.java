package com.example.pequeniatv.repository;

import android.content.Context;

import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.recyclerview.widget.SortedList;

import com.example.pequeniatv.client.ChannelsServiceClient;
import com.example.pequeniatv.model.Channel;
import com.example.pequeniatv.service.ApiChannelsService;
import com.example.pequeniatv.service.ChannelsService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class ChannelsRepository {

    private final ChannelsServiceClient client;
    private final ChannelsService channelsService;

    public ChannelsRepository() {
        client  = new ChannelsServiceClient();
        channelsService = new ChannelsService();
    }

    public ArrayObjectAdapter getChannels(final Context context) {
        Map<String, List<Channel>> map = new HashMap<>();
        List<String> sections = getEnabledSections();
        ApiChannelsService apiChannelsService = client.getChannelsService(context);

        ListRowPresenter listRowPresenter = new ListRowPresenter();
        ArrayObjectAdapter rowsAdapter = new ArrayObjectAdapter(listRowPresenter);

        for (String section : sections) {
            this.channelsService.adaptChannels(apiChannelsService, section, rowsAdapter);
        }

        return rowsAdapter;
    }

    private List<String> getEnabledSections() {
        return List.of("Musica", "Cartoons", "Entretenimientos", "Noticias");
    }

}
