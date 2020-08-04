package com.example.interntraining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btnWinClick, btnOutClick;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWinClick = findViewById(R.id.button_win);
        btnOutClick = findViewById(R.id.button_out);



//        btnClick.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Clicked", Toast.LENGTH_LONG).show();
//                startActivity(intent);
//
//            }
//        });



    }

//    @Override
    public void WinClicked(View view) {
        intent = new Intent(this, ActivityPage2.class);
        intent.putExtra("buttonName",btnWinClick.getText());
        Toast.makeText(getApplicationContext(), "Win Clicked", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void OutClicked(View view) {
        intent = new Intent(this, ActivityPage2.class);
        intent.putExtra("buttonName", btnOutClick.getText());
        Toast.makeText(getApplicationContext(), "Out Clicked", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}