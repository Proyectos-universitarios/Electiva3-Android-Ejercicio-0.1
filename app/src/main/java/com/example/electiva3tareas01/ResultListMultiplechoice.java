package com.example.electiva3tareas01;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ResultListMultiplechoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_list_multiplechoice);

        Bundle b= getIntent().getExtras();
        String[] resultadoArreglo = b.getStringArray("items_Selected");
        ListView ListViewResult = (ListView) findViewById(R.id.lvResultado);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,resultadoArreglo);
        ListViewResult.setAdapter(arrayAdapter);
    }

    public void Regresar(View view) {finish();}
}