package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DownloadActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName();
    ProgressBar mProgressBar;
    EditText mBookInput;
    TextView mTitleText,mAuthorText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        Log.i(TAG,"activity created");
         mBookInput = findViewById(R.id.bookInput);
        mProgressBar = findViewById(R.id.progressBar);
        mTitleText = findViewById(R.id.titleText);
        mAuthorText = findViewById(R.id.authorText);
    }

    public void downloadHandler(View view) {
        Log.i(TAG,"button clicked");
        searchBooks();

       /* DownloadTask downloadTask = new DownloadTask(mProgressBar);
        downloadTask.execute("http://lnt.com/imagetobedownloaded");*/

    }


    private void searchBooks() {
        String mQueryString = mBookInput.getText().toString();
        new FetchBook(mTitleText, mAuthorText).execute(mQueryString);
    }
}