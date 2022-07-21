package com.business7days.shreefood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton:
                Intent inn1=getIntent();
                inn1=new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(inn1);
        }
    }
}