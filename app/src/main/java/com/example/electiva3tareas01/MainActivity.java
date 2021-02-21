package com.example.electiva3tareas01;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

 ListView lv;
 String[] Categorias = {"CARNE", "VERDURAS", "POLLO", "ARROZ", "TOMATES", "GUTAS", "PASTELES", "MASCOTAS", "MASCOTAS 2 ", "DULCERIAS", "BEBES"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.ListViewid);
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Categorias);


        lv.setAdapter(itemsAdapter);

    }
}