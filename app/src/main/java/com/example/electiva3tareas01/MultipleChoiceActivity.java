package com.example.electiva3tareas01;

import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MultipleChoiceActivity extends AppCompatActivity {

    ListView lv;
    Button btn;
    String[]  Categorias;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        Categorias = getResources().getStringArray(R.array.categorias);
        lv=(ListView) findViewById(R.id.lvLista);
        btn=(Button) findViewById(R.id.btnSeleccion);

        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,Categorias);
        lv.setAdapter(adapter);
    }
    public void Seleccionar(View view)
    {
        SparseBooleanArray checked = lv.getCheckedItemPositions();

        ArrayList<String> itemSeleccionar = new ArrayList<String>();
        for (int i =0; i<checked.size(); i++)
        {
            int position = checked.keyAt(i);
            if (checked.valueAt(i))
            {
                itemSeleccionar.add(adapter.getItem(position));
            }
        }
String[] ShowValuesSelected = new String[itemSeleccionar.size()];
        for (int i=0; i<itemSeleccionar.size(); i++)
        {
            ShowValuesSelected[i] = itemSeleccionar.get(i);
        }

        Intent i = new Intent(getApplicationContext(), ResultListMultiplechoice.class);
        Bundle b = new Bundle();
        b.putStringArray("items_Selected",ShowValuesSelected);

        i.putExtras(b);
        startActivity(i);
    }

    public void Salir(View view) {finish();}
}