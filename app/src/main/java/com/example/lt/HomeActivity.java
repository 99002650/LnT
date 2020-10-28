package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    public  static String TAG = HomeActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG,"created");
        int c = subTwoNos(30,20);

        /*String data = getIntent().getExtras().getString("mykey");
        TextView greetingTextView =  findViewById(R.id.textView_greeting);
        greetingTextView.setText(data);*/

        ListView languagesListView = findViewById(R.id.languages_listview);
        String[] languages = new String[]{"english","hindi","urdu","kannada"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
               // android.R.layout.simple_list_item_1,//layout of each row in the listview
                R.layout.row_layout_listview,
                R.id.textViewTitle,
                languages);
        languagesListView.setAdapter(adapter);
    }

    private int subTwoNos(int i, int i1) {
        return i1-i;
    }
}