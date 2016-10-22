package com.mendozamiche.formbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
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

        final TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FormButton);
        this.buttonText = typedArray.getString(R.styleable.FormButton_buttonText);

        typedArray.recycle();

        this.init();
    }

    private void init() {
        View.inflate(this.getContext(), R.layout.form_button, this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        this.button = (Button) this.findViewById(R.id.button);
        this.progressBar = (ProgressBar) this.findViewById(R.id.progressBar);

        if (!TextUtils.isEmpty(this.buttonText)) {
            this.button.setText(this.buttonText);
        }
    }

    public void showProgressView() {
        this.progressBar.setVisibility(VISIBLE);
        this.button.setVisibility(INVISIBLE);
    }

    public void showButtonView() {
        this.progressBar.setVisibility(INVISIBLE);
        this.button.setVisibility(VISIBLE);
    }

    @Override
    public void setOnClickListener(final OnClickListener listener) {
        this.button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressView();
                listener.onClick(v);
            }
        });
    }
}
