package com.example.myplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ucsd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd);

        WebView ucsdView = (WebView) findViewById(R.id.webView);
        ucsdView.loadUrl("https://jujutsu-kaisen.fandom.com/wiki/Satoru_Gojo");
    }
}