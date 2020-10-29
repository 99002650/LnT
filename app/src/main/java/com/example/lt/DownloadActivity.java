package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class DownloadActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName();
    ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        Log.i(TAG,"activity created");
        mProgressBar = findViewById(R.id.progressBar);
    }

    public void downloadHandler(View view) {
        Log.i(TAG,"button clicked");

        DownloadTask downloadTask = new DownloadTask(mProgressBar);
        downloadTask.execute("http://lnt.com/imagetobedownloaded");

    }
}