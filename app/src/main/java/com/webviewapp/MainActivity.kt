package com.webviewapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // ساخت مستقیم WebView بدون هیچ صفحه واسط
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        
        // جلوگیری از باز شدن لینک‌ها در مرورگر بیرونی
        webView.webViewClient = WebViewClient()
        
        setContentView(webView)
        
        // لود کردن مستقیم آدرس سایت
        webView.loadUrl("{{APP_URL}}")
    }
}
