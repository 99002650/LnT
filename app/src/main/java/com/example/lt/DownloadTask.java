package com.example.lt;

import android.os.AsyncTask;
import android.util.Log;

public class DownloadTask extends AsyncTask<String,Integer,Void> {
    public static String TAG = DownloadTask.class.getSimpleName();

    @Override
    protected Void doInBackground(String... downloadUrl) {
        Log.i(TAG,"doInBackground --downloadUrl= "+downloadUrl[0]);

        return null;
    }
}
