package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    public  static String TAG = HomeActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG,"created");
        int c = subTwoNos(30,20);

        String data = getIntent().getExtras().getString("mykey");
        TextView greetingTextView =  findViewById(R.id.textView_greeting);
        greetingTextView.setText(data);
    }

    private int subTwoNos(int i, int i1) {
        return i1-i;
    }
}