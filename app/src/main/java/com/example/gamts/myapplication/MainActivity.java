package com.example.gamts.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gamts.myapplication.models.Listbook;

import java.util.ArrayList;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    private static final String STACK_STATE  = "com.gamts.STACK_STATE";
    private Listbook stack;
    private ArrayAdapter<Integer> listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stack = new Listbook();

        setUpListView();
        updateStack();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putIntegerArrayList(STACK_STATE,stack.getIntegerArrayList());
    }

    private void setUpListView() {
        ListView listView  = (ListView) findViewById(R.id.listview_book);
        listAdapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,stack.getIntegerArrayList());

        listView.setAdapter(listAdapter);
    }


    public void showlist(View view){
        stack.addlist();
        updateStack();
    }

    public void updateStack(){

        TextView textView = (TextView) findViewById(R.id.textview_stack);
        textView.setText(stack.toString());

    }

}
