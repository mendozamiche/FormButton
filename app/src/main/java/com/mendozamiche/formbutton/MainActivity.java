package com.mendozamiche.formbutton;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private FormButton formButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main_activity);

        this.formButton = (FormButton) this.findViewById(R.id.main_button);

        this.formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Logging you in", Toast.LENGTH_SHORT).show();

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        MainActivity.this.formButton.showButtonView();
                    }
                }, 4000);
            }
        });
    }

    private void createAndAddNewButton() {
        final LinearLayout linearLayout = (LinearLayout) this.findViewById(R.id.main_activity_linear_layout);
        final FormButtonNoXml formButtonNoXml = new FormButtonNoXml(this);
        formButtonNoXml.setText("Dynamic Button");

        formButtonNoXml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Dynamic button was clicked", Toast.LENGTH_SHORT).show();

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        formButtonNoXml.showButtonView();
                    }
                }, 3000);
            }
        });

        linearLayout.addView(formButtonNoXml);
    }
}
