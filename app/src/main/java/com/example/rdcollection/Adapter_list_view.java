package com.example.rdcollection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter_list_view extends ArrayAdapter<rec_model> {

    private List<rec_model> arr;
    private Context context;


    public Adapter_list_view(@NonNull Context context, int resource, @NonNull List<rec_model> arr) {
        super(context, resource, arr);
        this.arr = arr;
        this.context = context;
    }

    @Nullable
    @Override
    public rec_model getItem(int position) {
        return arr.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.rec_model,parent,false);
        TextView customerName = convertView.findViewById(R.id.CustomerName_txt);
        customerName.setText(arr.get(position).getCustomername());
        TextView customerAmount = convertView.findViewById(R.id.amount_txt);
        customerAmount.setText(arr.get(position).getAmount());
        TextView dueAmount = convertView.findViewById(R.id.dueAmount_txt);
        dueAmount.setText(arr.get(position).getDueAmount());
        TextView previous1_txt = convertView.findViewById(R.id.previous1_txt);
        previous1_txt.setText(arr.get(position).getPrev1());
        TextView previous2_txt = convertView.findViewById(R.id.previous2_txt);
        previous2_txt.setText(arr.get(position).getPrev2());
        TextView previous3_txt = convertView.findViewById(R.id.previous3_txt);
        previous3_txt.setText(arr.get(position).getPrev3());
        TextView present1_txt = convertView.findViewById(R.id.present1_txt);
        present1_txt.setText(arr.get(position).getPres1());
        TextView present2_txt = convertView.findViewById(R.id.present2_txt);
        present2_txt.setText(arr.get(position).getPres2());
        TextView present3_txt = convertView.findViewById(R.id.present3_txt);
        present3_txt.setText(arr.get(position).getPres3());
        return convertView;
    }


}
