package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //github url button
    Button linkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkButton = findViewById(R.id.btn01);

        linkButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Uri link = Uri.parse("https://www.github.com/mutlueren/");
                Intent intent = new Intent(Intent.ACTION_VIEW,link);
                startActivity(intent);
            }
          }
        );
    }

    //play butonuna basıldıgında oyuna gecmesi
    public void startEvent(View view){
        //Intent farklı sınıflar arasındaki aktiviteleri birbirleri ile ilişkilendirir
        Intent intent = new Intent(this, StartEvent.class);
        startActivity(intent);
        finish();

    }
}
