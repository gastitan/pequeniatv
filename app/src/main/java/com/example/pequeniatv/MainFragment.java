package com.example.pequeniatv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.example.pequeniatv.model.Channel;
import com.example.pequeniatv.presenter.CardPresenter;
import com.example.pequeniatv.repository.ChannelsRepository;

public class MainFragment extends BrowseSupportFragment {

    ChannelsRepository repository;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        repository = new ChannelsRepository();
        ArrayObjectAdapter rowsAdapter = repository.getChannels(getContext());

        var onItemViewClickedListener = new OnItemViewClickedListener() {

            @Override
            public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row) {
                var card = (Channel) item;
                Intent intent;
                if (card.getSource().equals("iptv")) {
                    intent = new Intent(getContext(), IptvActivity.class);
                } else {
                    intent = new Intent(getContext(), LiveVideoActivity.class);
                }

                intent.putExtra("channel", ((Channel) item).getChannel());
                startActivity(intent);
            }
        };

        setOnItemViewClickedListener(onItemViewClickedListener);

        setAdapter(rowsAdapter);
    }

}
