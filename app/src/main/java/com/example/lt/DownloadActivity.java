package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class DownloadActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        Log.i(TAG,"activity created");
    }

    public void downloadHandler(View view) {
        Log.i(TAG,"button clicked");

        DownloadTask downloadTask = new DownloadTask();
        downloadTask.execute("http://lnt.com/imagetobedownloaded");

    }
}