package com.example.hit_test;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        // 加载指定的 HTML 页面
        webView.loadUrl("https://flowus.cn/hitsz"); // 替换成你想要加载的网页地址
    }
}