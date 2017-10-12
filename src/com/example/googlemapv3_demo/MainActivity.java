package com.example.googlemapv3_demo;

import java.util.ArrayList;

import com.google.gson.Gson;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

	
	public WebView webView;
	
	//-預設座標
	public String lat = "22.549193";
	public String lon = "114.071583";
	
	//-預設座標陣列
	public ArrayList<Item> marr;
	public String[][] a = {
            {"A", "22.548802", "114.067747"},
            {"B", "22.544526","114.083781"},
            {"C", "22.5483557", "114.063093"},
            {"D", "22.535056", "114.068064"},
            {"E", "22.547366", "114.066340"},
            {"F", "22.542912", "114.057919"},
            {"G", "22.540552", "114.071669"},
            {"H", "22.543446", "114.067849"}};
	@SuppressLint({"JavascriptInterface"})
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		webView = (WebView)findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		
		
		marr =new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			Item item = new Item();
			item.title = a[i][0];
			item.lat = a[i][1];
			item.lon = a[i][2];
			marr.add(item);
		}
		
		webView.setWebViewClient(new WebViewClient(){
			//-onPageStarted(網頁開始載入)
			@Override
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				super.onPageStarted(view, url, favicon);
			}
			//--onPageFinished(網頁載入完畢)
			@Override
			public void onPageFinished(WebView view, String url) {
				super.onPageFinished(view, url);
				//-此處載入起點座標
				Log.i("載入", "載入");
				webView.loadUrl("javascript:initmap('"+ lat + "','"+ lon+"')"); 
				//webView.loadUrl("javascript:callFromActivity('"+ lat + "','"+ lon+"')");
				//--傳入列表資料
				String str = new Gson().toJson(marr);
				webView.loadUrl("javascript:setMarker('" + str + "')");	
			}
		});
		
		webView.setWebChromeClient(new WebChromeClient());
		
		
		webView.loadUrl("file:///android_asset/Map3.html");//webView.loadUrl("file:///android_asset/text.html");
		
	}

	
	///===============================
	class Item {
		public String title;
		public String lat;
		public String lon;
	}
	
}
