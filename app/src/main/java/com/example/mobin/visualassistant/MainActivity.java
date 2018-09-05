package com.example.mobin.visualassistant;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnDetect, btnRead, btnFind, btnEmergency;
    private static final int CAMERA_PIC_REQUEST = 1337;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDetect=findViewById(R.id.idDetect);
        btnRead=findViewById(R.id.idRead);
        btnFind=findViewById(R.id.idFind);
        btnEmergency=findViewById(R.id.idEmergency);


        btnDetect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent3=new   Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(Intent3);
 //               Intent i = new Intent(getApplicationContext(), DetectObject.class);
 //               startActivity(i);
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ocr_read.class);
                startActivity(i);
            }
        });

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FindObject.class);
                startActivity(i);
            }
        });

        btnEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Emergency.class);
                startActivity(i);
            }
        });

    }
}
