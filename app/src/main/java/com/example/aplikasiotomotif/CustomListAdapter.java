package com.example.aplikasiotomotif;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<otomotif> movieItems;

    public CustomListAdapter(Activity activity, List<otomotif> movieItems) {
        this.activity = activity;
        this.movieItems = movieItems;
    }
    @Override
    public int getCount() {
        return movieItems.size();
    }

    @Override
    public Object getItem(int location) {
        return  movieItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.custom_list, null);
        TextView nama = (TextView) convertView.findViewById(R.id.text_nama);
        TextView pabrikan = (TextView) convertView.findViewById(R.id.text_pab);
        TextView cc = (TextView) convertView.findViewById(R.id.text_cc);
        otomotif o = movieItems.get(position);
        nama.setText("Nama : "+ o.get_nama());
        pabrikan.setText("Pabrikan : "+ o.get_pabrik());
        cc.setText("cc : "+ o.get_cc());
        return convertView;
    }
}

