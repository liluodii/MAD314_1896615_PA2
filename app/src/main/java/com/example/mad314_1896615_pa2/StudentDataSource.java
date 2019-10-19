package com.example.mad314_1896615_pa2;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentDataSource {
    private static StudentDataSource instance = null;
    private List<student> students = new ArrayList<>();

    private StudentDataSource() //constructor
    {
        student std = new student();
        std.name = "lilu";
        std.id = 1;
        std.Password = "abc";

        this.students.add(std);
        std.name = "krishna";
        std.id = 2;
        std.Password = "abc";

        this.students.add(std);

        std.name = "abhd";
        std.id = 3;
        std.Password = "abc";
        this.students.add(std);

        std.name = "jrhuirt";
        std.id = 4;
        std.Password = "abc";
        this.students.add(std);

        std.name = "kjgiudtg";
        std.id = 5;
        std.Password = "abc";
        this.students.add(std);

        std.name = "ifutiou";
        std.id = 6;
        std.Password = "abc";
        this.students.add(std);

        std.name = "rjtiou";
        std.id = 7;
        std.Password = "abc";
        this.students.add(std);

        std.name = "fldtio";
        std.id = 8;
        std.Password = "abc";
        this.students.add(std);

        std.name = "oriut9oeir";
        std.id = 9;
        std.Password = "abc";

        this.students.add(std);
        std.name = "jdhruiwyer";
        std.id = 10;
        std.Password = "abc";

        this.students.add(std);
    }


    public static StudentDataSource getInstance() //Method
    {
        if (instance == null) {
            instance = new StudentDataSource();
        }
        return instance;
    }

    public void addAnimal(student student) { this.students.add(student);
    }

    public List<student> getAnimals() {
        return this.students;
    }
}
