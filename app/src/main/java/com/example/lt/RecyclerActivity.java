package com.example.lt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    ArrayList<Note> noteArrayList;//declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        noteArrayList = new ArrayList<>(); //initialization

        createData();
        NotesAdapter adapter = new NotesAdapter(this,noteArrayList);
        RecyclerView notesRecyclerView = findViewById(R.id.notes_recyclerview);
        notesRecyclerView.setAdapter(adapter);
        notesRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
    }

    private void createData() {
        noteArrayList.add(new Note("title1","subtitle1"));
        noteArrayList.add(new Note("title2","subtitle1"));
        noteArrayList.add(new Note("title13","subtitle1"));
        noteArrayList.add(new Note("title14","subtitle1"));
        noteArrayList.add(new Note("title15","subtitle1"));
        noteArrayList.add(new Note("title16","subtitle1"));
        noteArrayList.add(new Note("title17","subtitle1"));
        noteArrayList.add(new Note("title18","subtitle1"));

    }
}