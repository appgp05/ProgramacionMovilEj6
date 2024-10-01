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
    public void action(){
        Toast.makeText(MainActivity.getMyInstance(), "Hola", Toast.LENGTH_SHORT);
    }
}
