package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DatastorageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastorage);
    }

    @Override
    protected void onPause() {
        super.onPause();
        savePreferences();
    }


    @Override
    protected void onResume() {
        super.onResume();
        restoreData();
    }
}