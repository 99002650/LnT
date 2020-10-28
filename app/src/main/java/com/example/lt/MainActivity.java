package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;    //declaration
    public static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"activity created");
        nameEditText = findViewById(R.id.editTextTextPersonName);  //init
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"activity started");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"activity paused");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"activity resumed");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"activity stopped");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"activity destroyed");

    }

    public void clickHandler(View view) {
        Log.v(TAG,"button clicked");

        switch (view.getId()){
            case R.id.buttonlogin:
                Log.w(TAG,"logging in");

                String name = nameEditText.getText().toString(); //using
               // Toast.makeText(this, "welcome to android "+name, Toast.LENGTH_SHORT).show();
                Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
               homeIntent.putExtra("mykey",name);
                startActivity(homeIntent);
                break;
            case R.id.buttoncancel:
                Log.e(TAG,"cancelling");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));
                startActivity(dialIntent);
               // Toast.makeText(this, "cancelled ", Toast.LENGTH_SHORT).show();
                break;
        }
       }

       private  int addTwoNums(int firstno, int secondNo){
        return firstno+secondNo;
       }
}