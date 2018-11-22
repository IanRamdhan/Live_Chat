package com.example.adni_gumilang.realtimechat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by Adni on 30/10/2018.
 */
public class Splash extends Activity {

    TextView realtime;
    Typeface product;

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        realtime =  (TextView)findViewById(R.id.lc);
        product = Typeface.createFromAsset(this.getAssets(),"fonts/productsansbold.ttf");
        realtime.setTypeface(product);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}