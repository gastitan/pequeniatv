package com.example.pequeniatv.utils;

public class BackgroundJob {

        /*
        BackgroundManager mBackgroundManager;
        DisplayMetrics mMetrics;


        private void prepareBackgroundManager() {
            mBackgroundManager = BackgroundManager.getInstance(requireActivity());
            mBackgroundManager.attach(getActivity().getWindow());
            mMetrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(mMetrics);
        }

        var onItemViewSelectedListener = new OnItemViewSelectedListener() {

            @Override
            public void onItemSelected(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder rowViewHolder, Row row) {
                if (item == null) {
                    return;
                }
                var card = (Card) item;
                if (card.getBackground() == null || getContext() == null) {
                    mBackgroundManager.setBitmap(null);
                } else {

                    Glide.with(getContext())
                            .asBitmap()
                            .centerCrop()
                            .load(card.getBackground())
                            .into(new CustomTarget<Bitmap>() {
                                @Override
                                public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                                    mBackgroundManager.setBitmap(resource);
                                }

                                @Override
                                public void onLoadCleared(@Nullable Drawable placeholder) {

                                }
                            });
                }
            }
        };

        setOnItemViewSelectedListener(onItemViewSelectedListener);
         */
}
