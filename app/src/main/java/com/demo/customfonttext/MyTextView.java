package com.demo.customfonttext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by CIPL0382 on 3/16/2017.
 */

public class MyTextView extends TextView {

    public MyTextView(Context context) {
        super(context);
        init(null, 0);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs, int defStyleAttr) {
        TypedArray attrArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView, defStyleAttr, 0);
        initAttributes(attrArray);
    }

    protected void initAttributes(TypedArray attrArray) {
        String textStyle = attrArray.getString(R.styleable.MyTextView_myTextStyle);
        if(textStyle!=null) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), textStyle);
            setTypeface(tf);
        }

    }
}
