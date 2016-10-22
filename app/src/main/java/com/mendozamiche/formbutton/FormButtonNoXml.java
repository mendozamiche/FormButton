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
public class FormButtonNoXml extends FrameLayout {
    private Button button;
    private ProgressBar progressBar;

    public FormButtonNoXml(Context context) {
        super(context);
        this.init();
    }

    public FormButtonNoXml(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init();
    }

    private void init() {
        this.button = new Button(this.getContext());
        this.progressBar = new ProgressBar(this.getContext());
        this.progressBar.setIndeterminate(true);
        this.progressBar.setVisibility(INVISIBLE);

        this.addView(this.button);
        this.addView(this.progressBar);
    }

    void setText(String text) {
        this.button.setText(text);
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
        super.setOnClickListener(listener);
    }
}
