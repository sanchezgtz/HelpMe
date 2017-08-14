package com.example.sietebits.helpme.helpme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AcercaDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        WebView webView = (WebView) findViewById(R.id.webTexto);
        webView.getSettings().setJavaScriptEnabled(true);
        String customHtml = "<html><body><h2>HelpMe</h2><p><b>HelpMe</b> envía un mensaje a tus familiares y amigos cuando estés en peligro sin necesidad de tener el Smartphone en la mano </p></body></html>";
        //webView.loadUrl("http://www.google.com");
        webView.loadData(customHtml, "text/html", "UTF-8");
    }
}
