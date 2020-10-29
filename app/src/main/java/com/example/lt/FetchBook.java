package com.example.lt;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

public class FetchBook  extends AsyncTask<String,Void,String> {
    private static final String TAG = FetchBook.class.getSimpleName();
    private TextView mTitleText;
    private TextView mAuthorText;

    public FetchBook(TextView mTitleText, TextView mAuthorText) {
        this.mTitleText = mTitleText;
        this.mAuthorText = mAuthorText;
    }




    @Override
    protected String doInBackground(String... strings) {
        return NetworkUtils.getBookInfo(strings[0]);    }

    @Override
    protected void onPostExecute(String jsonString) {
        super.onPostExecute(jsonString);
        Log.d(TAG, "json string = "+jsonString);

    }
}
