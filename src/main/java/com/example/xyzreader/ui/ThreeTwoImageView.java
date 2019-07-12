package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class ThreeTwoImageView  extends android.support.v7.widget.AppCompatImageView {

    public ThreeTwoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int desiredHeight = width * 2 / 3;
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(desiredHeight, View.MeasureSpec.EXACTLY));

}
}
