package com.example.electiva3tareas01;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

 ListView lv;
 String[] Categorias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Categorias = getResources().getStringArray(R.array.categorias);

        lv = (ListView) findViewById(R.id.ListViewid);
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Categorias);
        lv.setAdapter(itemsAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "USTED A SELECCIONADO LA CATEGORIA "+ Categorias[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}