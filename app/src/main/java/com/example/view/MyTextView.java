package com.example.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.app.R;

public class MyTextView extends TextView {

    private static final int UNDEFINED = -1;

    private int mAttrEnum = UNDEFINED;

    public MyTextView(Context context) {
        this(context, null);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.MyTextViewStyle);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);


        final TypedArray a = context.obtainStyledAttributes(
                attrs,
                R.styleable.MyTextView,
                defStyle,
                0);
        try {
            mAttrEnum = a.getInt(R.styleable.MyTextView_attrEnum, UNDEFINED);
        } finally {
            a.recycle();
        }

        setText(Integer.toString(mAttrEnum));
    }
}
