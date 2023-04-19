package com.example.multiscreeen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_name;
    TextView tv_mail;
    TextView tv_phno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_name=findViewById(R.id.textView);
        tv_mail=findViewById(R.id.textView2);
        tv_phno=findViewById(R.id.textView3);
        Intent intent=getIntent();
        String st_name=intent.getStringExtra(MainActivity.EXTRA_NAME);
        tv_name.setText(st_name);

        String st_mail=intent.getStringExtra(MainActivity.EXTRA_MAIL);
        tv_mail.setText(st_mail);
        String st_phno=intent.getStringExtra(MainActivity.EXTRA_PHONE);
        tv_phno.setText(st_phno);

    }
}