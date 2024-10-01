package com.example.programacionmovilej6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.programacionmovilej6.services.MainService;

public class MainActivity extends AppCompatActivity {
    static MainActivity myInstance;

    public static MainActivity getMyInstance(){
        return myInstance;
    }

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Código inicial
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Singleton
        myInstance = this;

        MainService mainService = new MainService();

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

//        Toast.makeText(MainActivity.this, "Hola", Toast.LENGTH_SHORT).show();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainService.obtener();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainService.buscar();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainService.detalles();
            }
        });

//        mainService.setMyListener(new MyListener() {
//            @Override
//            public void mainAction() {
//                Toast.makeText(MainActivity.this, "Hola", Toast.LENGTH_SHORT).show();
//            }
//        });

//        mainService.simulateMainAction();
    }
}