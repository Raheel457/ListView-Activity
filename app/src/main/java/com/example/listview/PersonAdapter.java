package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {

    private Context pContext;
    private int pResource;

    public PersonAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        pContext = context;
        pResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      String name = getItem(position).getName();
      String birthday = getItem(position).getBirthday();
      String sex = getItem(position).getSex();

      Person person = new Person(name,birthday,sex);

        LayoutInflater inflator = LayoutInflater.from(pContext);
        convertView = inflator.inflate(pResource, parent , false);

        TextView textview1 = (TextView) convertView.findViewById(R.id.textView1);
        TextView textview2 = (TextView) convertView.findViewById(R.id.textView2);
        TextView textview3 = (TextView) convertView.findViewById(R.id.textView3);
        textview1.setText(name);
        textview2.setText(birthday);
        textview3.setText(sex);

        return convertView;

    }
}
