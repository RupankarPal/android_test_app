package com.example.rdcollection;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button all, due, search, add_new;
    private ListView listView;
    private ArrayList<rec_model> arr_recModel = new ArrayList<>();
    private String default1 = "1000000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons and ListView
        all = findViewById(R.id.all_btn);
        due = findViewById(R.id.due_btn);
        search = findViewById(R.id.serch_btn);
        add_new = findViewById(R.id.add_new_btn);
        listView = findViewById(R.id.listView);

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You are already in All Customer page", Toast.LENGTH_SHORT).show();
            }
        });
        due.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, due_Activity.class);
                startActivity(intent);

            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, search_Activity.class);
                startActivity(intent);
            }
        });
        add_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = inflater.inflate(R.layout.add_popup_window, null);
                PopupWindow popupWindow = new PopupWindow(popupView, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,
                        android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);
                EditText customerName = popupView.findViewById(R.id.Customername_edt_txt);
                EditText Amount = popupView.findViewById(R.id.amount_edt_txt);
                Button cancell = popupView.findViewById(R.id.cancell_add_btn);
                cancell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss();
                    }
                });
                Button submit = popupView.findViewById(R.id.Submit_add_btn);
                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Your data has been added", Toast.LENGTH_SHORT).show();
                        popupWindow.dismiss();
                    }
                });
                popupWindow.showAtLocation(v, android.view.Gravity.CENTER, 0, 0);
            }
        });
        // Add data to the ArrayList
        arr_recModel.add(new rec_model("gcyrsdrt", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("bbbbbb", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("cgdyrd", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("vuyf", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("jhhhhhhh", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("ghtyd", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("jhcfyr", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("crt", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("gcyrsdrt", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("jhvhtr", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("aaaaaaa", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("oi", default1, default1, default1, default1, default1, default1, default1, default1));
        arr_recModel.add(new rec_model("uyurf5", default1, default1, default1, default1, default1, default1, default1, default1));

        // Set the adapter for the ListView
        Adapter_list_view lv = new Adapter_list_view(this, R.layout.rec_model, arr_recModel);
        listView.setAdapter(lv);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You clicked on " + arr_recModel.get(position).getCustomername(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
