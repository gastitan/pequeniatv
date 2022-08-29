package com.example.pequeniatv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;

import com.example.pequeniatv.model.Card;
import com.example.pequeniatv.presenter.CardPresenter;
import com.example.pequeniatv.utils.ChannelSources;

public class MainFragment extends BrowseSupportFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setTitle("Pequeña TV");
        setIcon();

        ListRowPresenter listRowPresenter = new ListRowPresenter();
        ArrayObjectAdapter rowsAdapter = new ArrayObjectAdapter(listRowPresenter);

        var channels = ChannelSources.getChannels();

        for (String channelTitle : channels.keySet()) {
            ArrayObjectAdapter listRowAdapter = new ArrayObjectAdapter(new CardPresenter());
            listRowAdapter.addAll(0, channels.get(channelTitle));

            var header = new HeaderItem(1, channelTitle);
            rowsAdapter.add(new ListRow(header, listRowAdapter));
        }

        var onItemViewClickedListener = new OnItemViewClickedListener() {

            @Override
            public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row) {
                var card = (Card) item;
                Intent intent;
                if (card.getSource().equals("iptv")) {
                    intent = new Intent(getContext(), IptvActivity.class);
                } else {
                    intent = new Intent(getContext(), LiveVideoActivity.class);
                }

                intent.putExtra("channel", ((Card) item).getChannel());
                startActivity(intent);
            }
        };

        setOnItemViewClickedListener(onItemViewClickedListener);

        setAdapter(rowsAdapter);
    }

    private void setIcon() {
        var activity = getActivity();
        if (activity != null && activity.getResources() != null) {
            setBadgeDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.logo3,null));
        }
    }
}
