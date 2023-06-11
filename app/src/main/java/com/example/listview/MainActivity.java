package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.thelist);

        Person Raheel = new Person("Raheel","November","Male");
        Person Awais = new Person("Awais","October","Male");
        Person Saleeha = new Person("Saleeha","July","Female");
        Person Tayyaba = new Person("Tayyaba","September","Female");
        Person Talha = new Person("Talha","December","Male");
        Person Moeez = new Person("Moeez","June","Male");

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(Raheel);
        peopleList.add(Awais);
        peopleList.add(Saleeha);
        peopleList.add(Tayyaba);
        peopleList.add(Talha);
        peopleList.add(Moeez);

        PersonAdapter adapter = new PersonAdapter(this, R.layout.custom_list_view,peopleList);
        lv.setAdapter(adapter);

    }
}