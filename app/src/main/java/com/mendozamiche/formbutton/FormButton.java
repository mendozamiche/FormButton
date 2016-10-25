package com.mendozamiche.formbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/**
 * Created by Michelle Mendoza on 2016-10-22.
 * Copyright (c) 2016
 */
public class FormButton extends FrameLayout {
    private String buttonText;
    private Button button;
    private ProgressBar progressBar;

    public FormButton(Context context) {
        super(context);
        this.init();
    }

    public FormButton(Context context, AttributeSet attrs) {
        super(context, attrs);

//        final TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FormButton);
//        this.buttonText = typedArray.getString(R.styleable.FormButton_buttonText);
//
//        typedArray.recycle();

        this.init();
    }

    private void init() {
        // TODO 1. Inflate layout
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        // TODO 2. Initialize child views

        // TODO 3. If custom attributes are used, set them here
    }

    public void showProgressView() {
        // TODO 4. Show the user that something is happening
    }

    public void showButtonView() {
        // TODO 4. Show the button
    }

    // TODO 5. Override OnClickListener: show progress view and append listener
}
