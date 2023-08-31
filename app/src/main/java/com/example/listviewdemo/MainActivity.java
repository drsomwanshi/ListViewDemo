package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String c[]={"Abujar\n9876095750","Omkar\n46945654",
                "Swati\n459675496","Abujar\n9876095750",
                "Omkar\n46945654","Swati\n459675496","Abujar\n9876095750",
                "Omkar\n46945654","Swati\n459675496"};
        ArrayAdapter <String> adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,c);

        ListView lst=findViewById(R.id.lst1);
        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name=lst.getItemAtPosition(position).toString();
                String c1[]=name.split("\n");
                String cont=c1[1];
                Toast.makeText(MainActivity.this, "Contact=" + cont, Toast.LENGTH_SHORT).show();

            }
        });



    }
}