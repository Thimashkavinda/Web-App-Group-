package com.example.hansagiriwine;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hansagiriwine.R;
import com.example.hansagiriwine.activity.HomeActivity;
import com.example.hansagiriwine.utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.blackIconStatusBarColor(MainActivity.this ,R.color.splash_background);
        Utils.changeNavigationBarColor(MainActivity.this ,R.color.splash_background);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this , HomeActivity.class));
                finish();
            }
        }, 3000);
    }
    }
