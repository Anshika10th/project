package com.example.collectico;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void clickbtn(View view)
    {

        Log.i("tag:this", "clickbtn: You are logged in  ");
    }
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity2();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent=new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
