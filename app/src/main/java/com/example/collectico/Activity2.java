package com.example.collectico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    public void clickbtn(View view)
    {

        Log.i("tag:this", "clickbtn: You are logged in  ");
    }
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity3();
            }
        });
        button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity4();
            }
        });
        button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity5();
            }
        });
    }
    public void openActivity3()
    {
        Intent intent=new Intent(this, Activity3.class);
        startActivity(intent);
    }
    public void openActivity4()
    {
        Intent intent=new Intent(this, Activity4.class);
        startActivity(intent);
    }
    public void openActivity5()
    {
        Intent intent=new Intent(this, Activity5.class);
        startActivity(intent);
    }
    }


