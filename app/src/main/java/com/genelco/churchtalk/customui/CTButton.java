package com.genelco.churchtalk.customui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class CTButton extends Button {
    String label;


    public CTButton(Context context) {
        super(context);
    }

    public CTButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CTButton(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);

        TypedArray array = context.obtainStyledAttributes(attrs, new int[]{R.style.PrimaryButtonTheme}, 0, 0);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
