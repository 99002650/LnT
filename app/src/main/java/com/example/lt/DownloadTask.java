package com.example.lt;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;

public class DownloadTask extends AsyncTask<String,Integer,Void> {
    public static String TAG = DownloadTask.class.getSimpleName();
    ProgressBar progressBar;

    public DownloadTask(ProgressBar mProgressBar) {
        progressBar = mProgressBar;
    }

    @Override
    protected Void doInBackground(String... downloadUrl) {
        Log.i(TAG,"doInBackground --downloadUrl= "+downloadUrl[0]);
        publishProgress(50);
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        progressBar.setProgress(values[0]);
    }
}
