package com.example.pequeniatv.presenter;

import android.view.View;
import android.view.ViewGroup;

import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;

import com.bumptech.glide.Glide;
import com.example.pequeniatv.model.Card;
import com.example.pequeniatv.model.Channel;

public class CardPresenter extends Presenter {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        var cardView = new ImageCardView(parent.getContext());
        cardView.setFocusable(true);
        cardView.setFocusableInTouchMode(true);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        var channel = (Channel) item;
        var cardView = (ImageCardView) viewHolder.view;
        cardView.setTitleText(channel.getName());
        cardView.setMainImageDimensions(176, 250);

        var mainImageView = cardView.getMainImageView();
        Glide.with(mainImageView).load(channel.getLogo()).into(mainImageView);
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {

    }

    @Override
    public void setOnClickListener(ViewHolder holder, View.OnClickListener listener) {
        super.setOnClickListener(holder, listener);

    }
}
