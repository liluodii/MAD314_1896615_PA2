package com.example.mad314_1896615_pa2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    EditText etid, etpassword;
    Button btAdd;

    RecyclerView rvstudent;
    private StudentAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvstudent = findViewById(R.id.rvstudent);
        layoutManager = new LinearLayoutManager(this);
        rvstudent.setLayoutManager(layoutManager);


        final StudentDataSource repository =StudentDataSource.getInstance();
        layoutManager = new LinearLayoutManager(this);
        rvstudent.setLayoutManager(layoutManager);

        mAdapter = new StudentAdapter(getApplicationContext());
        rvstudent.setAdapter(mAdapter);


        etid = findViewById(R.id.ID);
        etpassword = findViewById(R.id.PASSWORD);
       // etSex = findViewById(R.id.etSex);
      //  etAge = findViewById(R.id.etAge);
       // btAdd = findViewById(R.id.btAdd);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get field values
               int id = Integer.parseInt(etid.getText().toString());
               String password =etpassword .getText().toString();

               
               // String sex = etSex.getText().toString();
               // int age = Integer.parseInt(etAge.getText().toString());

                // create animal
               // Animal animal = new Animal();
              //  animal.type = type;
               // animal.name = name;
               // animal.sex = sex;
               // animal.age = age;

                // add animal to repo
                //repository.addAnimal(animal);

                //mAdapter.update();

                // clear the fields
                //etAge.getText().clear();
               // etType.getText().clear();
               // etName.getText().clear();
               // etSex.getText().clear();
            }
        });
    }
}
