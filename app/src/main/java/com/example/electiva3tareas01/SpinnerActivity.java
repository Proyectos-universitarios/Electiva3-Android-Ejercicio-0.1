package com.example.electiva3tareas01;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SpinnerActivity extends AppCompatActivity {

    //spinnerid
    String[] Categorias;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Categorias = getResources().getStringArray(R.array.categorias);
        sp = (Spinner) findViewById(R.id.spinnerid);

    }
}