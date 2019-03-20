package com.genelco.churchtalk.customui;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;

public class CTEditText extends TextInputEditText {


    public CTEditText(Context context) {
        super(context);
        init();

    }

    public CTEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        applyAttributes(attrs);

    }


    public CTEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        applyAttributes(attrs);

    }

    private void applyAttributes(AttributeSet attrs) {

    }

    private void init() {

    }

    TextWatcher addremark_text_watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            // write your logic here

        }

        @Override
        public void afterTextChanged(Editable s) {

        }

    };


}
