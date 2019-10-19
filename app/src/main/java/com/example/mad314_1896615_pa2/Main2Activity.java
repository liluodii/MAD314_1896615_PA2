package com.example.mad314_1896615_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    private StudentAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    RecyclerView rvstudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        rvstudent = findViewById(R.id.rvstudent);
        layoutManager = new LinearLayoutManager(this);
        rvstudent.setLayoutManager(layoutManager);

        mAdapter = new StudentAdapter(getApplicationContext());
        rvstudent.setAdapter(mAdapter);

        final StudentDataSource repository =StudentDataSource.getInstance();



    }
}
