package com.example.googlemapv3_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	
	///===============================
	/*
	 zoomControl 啟用/停用「縮放」控制項。此控制項預設會顯示在靠近地圖的右下角。zoomControlOptions 欄位額外指定 ZoomControlOptions 供此控制項使用。
	 mapTypeControl 啟用/停用讓使用者切換地圖類型（例如「地圖」和「衛星」）的「地圖類型」控制項。此控制項預設會顯示在靠近地圖的左上角。mapTypeControlOptions 欄位額外指定 MapTypeControlOptions 供此控制項使用。
	 streetViewControl 啟用/停用讓使用者啟用「街景服務」全景功能的「小黃人」控制項。此控制項預設會顯示在靠近地圖的右下角。streetViewControlOptions 欄位額外指定 StreetViewControlOptions 供此控制項使用。
	 rotateControl 啟用/停用顯示控制 45° 影像方向的「旋轉」控制項。此控制項是否出現預設是由指定地圖類型在目前的縮放和地點是否有 45° 影像來決定。您可以設定地圖的 rotateControlOptions 指定要使用的 RotateControlOptions 來改變控制項的行為。如果目前沒有 45° 影像，就無法讓此控制項顯示。
	 scaleControl 啟用/停用提供簡單地圖比例的「比例」控制項。此控制項預設不會顯示。如果啟用，則一律顯示在地圖的右下角。scaleControlOptions 額外指定 ScaleControlOptions 供此控制項使用。
	 fullscreenControl 可啟用/停用以全螢幕模式開啟地圖的控制項。在預設情況下，此控制項在行動裝置上是可見的，但在電腦上則不可見。啟用時，此控制項會出現在地圖右上角附近。fullscreenControlOptions 會額外指定 FullscreenControlControlOptions 以針對此控制項使用。
	 
	 
	 
	 
	 
	 
	 */
	
}
