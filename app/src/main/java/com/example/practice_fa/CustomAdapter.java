package com.example.practice_fa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter extends BaseAdapter {
    Context context;
    String animalList[];
    int animals[];
    LayoutInflater inflter;

    public CustomAdapter(Context context, String[] animalList, int[] animals) {
        this.context = context;
        this.animalList = animalList;
        this.animals = animals;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return animalList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_list_custom, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(animalList[i]);
        icon.setImageResource(animals[i]);
        return view;
    }
}
