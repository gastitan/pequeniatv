package com.example.pequeniatv.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.leanback.widget.TitleViewAdapter;

import com.example.pequeniatv.R;

public class CustomTitleView extends RelativeLayout implements TitleViewAdapter.Provider {
    private final View mAnalogClockView;
    private final View mAnalogClockView2;

    private final TitleViewAdapter mTitleViewAdapter = new TitleViewAdapter() {
        @Override
        public View getSearchAffordanceView() {
            return null;
        }

        @Override
        public void setTitle(CharSequence titleText) {
            CustomTitleView.this.setTitle(titleText);
        }

        @Override
        public void setBadgeDrawable(Drawable drawable) {
        }

        @Override
        public void setOnSearchClickedListener(OnClickListener listener) {
        }

        @Override
        public void updateComponentsVisibility(int flags) {

        }

    };

    public CustomTitleView(Context context) {
        this(context, null);
    }

    public CustomTitleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomTitleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        View root  = LayoutInflater.from(context).inflate(R.layout.custom_titleview, this);
        mAnalogClockView2 = root.findViewById(R.id.title_tv);
        mAnalogClockView = root.findViewById(R.id.brianna_icon);
    }

    public void setTitle(CharSequence title) {
        if (title != null) {
            mAnalogClockView2.setVisibility(View.VISIBLE);
            mAnalogClockView.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public TitleViewAdapter getTitleViewAdapter() {
        return mTitleViewAdapter;
    }
}
