package com.example.lt.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.lt.database.FeedReaderContract.FeedEntry;


public class Dao {
SQLiteDatabase database;
FeedReaderDbHelper helper;

    public Dao(Context context) {
        helper = new FeedReaderDbHelper(context);
    }

    public  void openDb(){
        database = helper.getWritableDatabase();
    }
    public void closeDb(){
        database.close();
    }

    public void createNote(String title, String subTitle){
        ContentValues values = new ContentValues();
        values.put(FeedEntry.COLUMN_NAME_TITLE,title);
        values.put(FeedEntry.COLUMN_NAME_SUBTITLE,subTitle);
        database.insert(FeedEntry.TABLE_NAME,null,values);
    }
    public String readLastNote(){
       Cursor cursor = database.query(FeedEntry.TABLE_NAME,null,null,null
        ,null,null,null);
       cursor.moveToFirst();

       int titleIndex = cursor.getColumnIndexOrThrow(FeedEntry.COLUMN_NAME_TITLE);
       int subTitleIndex = cursor.getColumnIndexOrThrow(FeedEntry.COLUMN_NAME_SUBTITLE);

       String title = cursor.getString(titleIndex);
       String subTitle = cursor.getString(subTitleIndex);
        return title+"\n"+subTitle;
    }
    public void updateNote(){}
    public void deleteNote(){}
}
