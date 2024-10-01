package com.example.programacionmovilej6.services;

import android.widget.Toast;

import com.example.programacionmovilej6.MainActivity;
import com.example.programacionmovilej6.listeners.MyListener;

public class MainService {
    private MyListener myListener;

    public void setMyListener(MyListener myListener) {
        this.myListener = myListener;
    }
    public void simulateMainAction(){
        if(myListener != null){
            myListener.mainAction();
        }
    }
    public void saludar(){
        Toast.makeText(MainActivity.getMyInstance(), "Holaa", Toast.LENGTH_SHORT).show();
    }

    public void obtener(){
        Toast.makeText(MainActivity.getMyInstance(), "Obtener", Toast.LENGTH_SHORT).show();
    }
    public void buscar(){
        Toast.makeText(MainActivity.getMyInstance(), "Buscar", Toast.LENGTH_SHORT).show();
    }
    public void detalles(){
        Toast.makeText(MainActivity.getMyInstance(), "Detalles", Toast.LENGTH_SHORT).show();
    }
}
