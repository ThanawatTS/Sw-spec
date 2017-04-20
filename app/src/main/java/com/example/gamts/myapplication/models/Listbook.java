package com.example.gamts.myapplication.models;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by GamTS on 20/4/2560.
 */

public class Listbook {
    private ArrayList<Integer> stack;

    public Listbook(){
        stack = new ArrayList<Integer>();
    }

    public void addlist(){
        int a = 5;
        stack.add(0,a);
    }

    public String toString(){
        String str = "";

        if(stack.isEmpty()){
            str = "empty";
        }
        else{
            for(int x: stack){
                str += "" + x + "\n";
            }
        }
        return str;
    }


    public ArrayList<Integer> getIntegerArrayList() {
        return stack;

    }
}
