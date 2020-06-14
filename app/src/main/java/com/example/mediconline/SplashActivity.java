package com.example.mediconline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    private final int msDuration = 3000; // 3 segundos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Este andler permite manejar un delay o "setTimeOut", y generar un callback para que se ejecute al terminar el tiempo
        new Handler().postDelayed(new Runnable() {
            public void run() {
                // Al pasar msDuration se ejecutará el siguiente código
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

            ;
        }, msDuration);
    }
}
