package com.example.paz.pazquiz1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class CustomAdapter extends BaseAdapter{
    Context context;
    List<Names> names;
    ImageView logo;
    TextView name;

    public CustomAdapter(Context context, List<Names> names) {
        this.context = context;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int i) {
        return names.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.row_layout, null);
        logo = (ImageView) v.findViewById(R.id.logo);
        name = (TextView) v.findViewById(R.id.name);

        name.setText(names.get(i).getname());
        logo.setImageResource(names.get(i).getLogo());

        return v;
    }
}
