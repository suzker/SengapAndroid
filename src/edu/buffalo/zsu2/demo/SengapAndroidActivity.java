package edu.buffalo.zsu2.demo;

import org.apache.cordova.*;
import android.os.Bundle;

public class SengapAndroidActivity extends DroidGap{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}